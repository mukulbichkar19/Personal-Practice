import java.util.*;
public class UglyNos{

  private static int GCDremain(int a, int b){
    while(a%b == 0){
      a = a/b;
    }
    return a;
  }

  private static boolean isUgly(int no){
    no = GCDremain(no,2);
    no = GCDremain(no,3);
    no = GCDremain(no,5);
    return no == 1 ? true:false;
  }



  private static int findNUgly(int n){

     List<Integer> uglyNos = new ArrayList<>();
     int i = 1;
     while(uglyNos.size() != n){
       if(isUgly(i)){
         uglyNos.add(i);
       }
       i++;
     }
     return uglyNos.get(n-1);

  }


  private static int findUgly(int n){
    int i2 = 0;
    int i3 = 0;
    int i5 = 0;
    ArrayList<Integer> ugly = new ArrayList<>();
    ugly.add(1);

    int next_multiple_2 = ugly.get(i2)*2;
    int next_multiple_3 = ugly.get(i3)*3;
    int next_multiple_5 = ugly.get(i5)*5;
    for(int i=0;i<1690;i++){

      int min = Math.min(next_multiple_2,
                         Math.min(next_multiple_3, next_multiple_5));

      ugly.add(min);

      if(ugly.size() == n){
        break;
      }

      if(min == next_multiple_2){
        i2+=1;
        next_multiple_2 = ugly.get(i2)*2;
      }

      if(min == next_multiple_3){
        i3+=1;
        next_multiple_3 = ugly.get(i3)*3;
      }

      if(min == next_multiple_5){
        i5+=1;
        next_multiple_5 = ugly.get(i5)*5;
      }
    }

    return ugly.get(n-1);



  }


  private static int findUglyPQ(int n){

    if(n == 1){ return 1; }
    PriorityQueue<Long> pq = new PriorityQueue<>();
    pq.add(1l);

    for(int i=1;i<n;i++){
      long tmp = pq.poll();
      while(!pq.isEmpty() && pq.peek()==tmp){
        tmp = pq.poll();
      }
      pq.add(tmp*2);
      pq.add(tmp*3);
      pq.add(tmp*5);

    }

      return pq.poll().intValue();


  }


  public static void main(String args[]){

    // Find nth ugly number
    // Method 1: Generate first n ugly nos and return nth Ugly
    int n = findNUgly(1352);
    System.out.println("nth ugly no is: "+n);

    // Using Dynamic Programming
    int n1 = findUgly(1352);
    System.out.println("nth ugly using DP: "+n1);

    int n2 = findUglyPQ(1352);
    System.out.println("nth ugly using PQ: "+n2);



  }

}
