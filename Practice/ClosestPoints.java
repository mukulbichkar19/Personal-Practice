import java.util.*;

public class ClosestPoints{

  private static List<Point> findClosestPairBruteForce(List<Point> points){

      List<Point> result = new ArrayList<>();
      double min_dist = Double.MAX_VALUE;
      // Brute force approach
      for(int i=0;i<points.size();i++){
        Point selectedPoint = points.get(i);
        for(int j=i+1;j<points.size();j++){
           double dis = distance(selectedPoint, points.get(j));
           if(min_dist > dis){
             min_dist = dis;
             result.clear();
             result.add(selectedPoint);
             result.add(points.get(j));
           }
        }
      }
      return result;
  }

  private static double bruteForce(List<Point> points, int n){
    double min = Double.MAX_VALUE;
    for(int i=0;i<n;i++){
      for(int j=i+1;j<n;j++){
        min = Math.min(min, distance(points.get(i), points.get(j)));
      }
    }
    return min;
  }

  private static double findClosestPair(List<Point> points, int n){

      if(n  <= 3){
        return bruteForce(points,n);
      }
      // 1. Sort listof points based on x co-ordinates
      points.sort((a,b) -> Integer.compare(a.x,b.x));

      // Find mid point
      int mid = n/2;
      Point mid_point = points.get(mid);

      // Consider the vertical line passing through the middle point
      // calculate the smallest distance dl on left of middle point and
      // dr on right side
      double dl = findClosestPair(points, mid);
      double dr = findClosestPair(points, n-mid);

      //find smaller of the two
      double d = Math.min(dl,dr);

      List<Point> strip = new ArrayList<>(n);
      for(int i=0;i<n;i++){
        if(Math.abs(points.get(i).x-mid_point.x) < d){
          strip.add(points.get(i));
        }
      }

      return Math.min(d, stripClosest(strip, d));
  }

  private static double stripClosest(List<Point> strip, double d){
    double min = d;
    strip.sort((p1,p2) -> Integer.compare(p1.y, p2.y));
    for(int i=0;i<strip.size();i++){
      for(int j=i+1;j<strip.size() && (strip.get(j).y-strip.get(i).y) < min; j++){
        min = distance(strip.get(i), strip.get(j));
      }
    }
    return min;
  }


  private static double distance(Point a, Point b){
      int fac1 = (a.x-b.x);
      int fac2 = (a.y-b.y);
      return Math.sqrt(Math.pow(fac1, 2) + Math.pow(fac2, 2));
  }


  public static void main(String args[]){

      List<Point> points = new ArrayList<>();

      points.add(new Point(2,3));
      points.add(new Point(12,30));
      points.add(new Point(40,50));
      points.add(new Point(5,1));
      points.add(new Point(12,10));
      points.add(new Point(3,4));


      List<Point> pair = findClosestPairBruteForce(points);

      System.out.println("Closest Pair: ");
      for(Point p:pair){
         p.display();
      }
      System.out.println("Closest distance: "+distance(pair.get(0), pair.get(1)));


      double distance2 = findClosestPair(points, points.size());
      System.out.println("Closest distance optimized is: "+distance2);





  }


}
