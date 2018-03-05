#!/usr/bin/env python
from BaseHTTPServer import BaseHTTPRequestHandler, HTTPServer
import SocketServer
import json
import math
from sys import float_info

data = []
combined = {}
with open('./server/states.json') as f:
     for line in f:
          rec = json.loads(line)
          state = ''
          for key,value in rec.iteritems():
               if key == "state":
                    state = value
               else:
                    combined[state] = value

possible_state = {}

def predictPossibleStates(lat, target_dest_long):
    for k,v in combined.iteritems():
        boundaries = v
        for b in boundaries:
            longitude = b[0]
            latitude = b[1]
            if(abs(latitude)-abs(lat) < 1.0 and
               abs(longitude)-abs(target_dest_long) < 1.0):
                possible_state[k] = boundaries

def areCollinear(point, line):

	a,b = line

	ax,ay = a
	bx,by = b
	cx,cy = point

	crossProduct = (cy - ay) * (bx - ax) - (cx - ax) * (by - ay)
	if abs(crossProduct) <= float_info.epsilon:
		if min(ax, bx) <= cx <= max(ax, bx) and min(ay, by) <= cy <= max(ay, by):
			return True

	return False


def isInsidePOlygon(point, polygon):
	if point in polygon:
		return True

	inside = False
	numVertices = len(polygon)
	for i in range(numVertices-1):
		p1 = polygon[i]
		p2 = polygon[i+1]

		edge = [p1, p2]
		if areCollinear(point, edge):
			return True

		x,y = point
		p1x,p1y = p1
		p2x,p2y = p2

		if y > min(p1y,p2y) and y <= max(p1y,p2y):
			if x <= max(p1x,p2x):
				if p1y != p2y:
					xIntersect = (y-p1y)*(p2x-p1x)/(p2y-p1y)+p1x
					if p1x == p2x or x <= xIntersect:
						inside = not inside
	return inside

def checkPolygon(target_lat,target_long):
	predictPossibleStates(target_lat, target_long)
	stateName = 'Not found'
	for k,v in possible_state.iteritems():
		state = k
		res = isInsidePOlygon([target_long, target_lat], v)
		if(res):
			stateName = state
	return stateName


class WebServer(BaseHTTPRequestHandler):
    def _set_headers(self):
        self.send_response(200)
        self.send_header('Content-type', 'text/html')
        self.end_headers()

    def do_GET(self):
        self._set_headers()
        self.wfile.write("<html><body><h1>'Vistar Media Take home'</h1></body></html>")

    def do_HEAD(self):
        self._set_headers()

    def do_POST(self):
        content_length = int(self.headers['Content-Length']) # <--- Gets the size of data
        post_data = self.rfile.read(content_length) # <--- Gets the data itself
        latlong = post_data.split('&')
        d = {}
        for arg in latlong:
            names = arg.split('=')
            d[names[0]] = float(names[1])

	state = checkPolygon(d['latitude'], d['longitude'])
	response = "[\""+state	+"\"] \n"
	responseUnicode = response.encode('utf-8')
	self.wfile.write(responseUnicode)


def run(server_class=HTTPServer, handler_class=WebServer, port=8080):
    server_address = ('', port)
    httpd = server_class(server_address, handler_class)
    print 'Starting server'
    httpd.serve_forever()

if __name__ == "__main__":
    run(port=8080)

run()
