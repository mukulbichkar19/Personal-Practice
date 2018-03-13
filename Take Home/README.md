# State Determinaton based on Latitude and Longitude

Instructions to run this project

Platform: Linux
1. Open this project in terminal
2. run command `make` - This will install latest version of Python, if not already installed, it may ask for user password
3. run `make state-server` to start the state server
4. open another terminal and enter the command `curl  -d "longitude=-77.036133&latitude=40.513799" http://localhost:8080/` to
   get the resultant state. If no state for a given co-ordinate is found then "Not found" is returned as resultant state
