import java.util.HashSet;
public class isUgly{

  static HashSet<Integer> primes = new HashSet<Integer>();

  private static int find(int n){
    int start = 2;
    int count = 1;
    while(count != n){
      if(isUgly(start)){
        ++count;
      }
      ++start;
    }
    return start-1;
  }

  private static int factoriseAndCheck(int n, int factor){
    while(n%factor == 0){
      n = n/factor;
    }
    return n;
  }



  // Dp method time complexity of O(n) and extra space of O(n)
  private static int uglyDP(int target){
    int[] ugly = new int[target];
    ugly[0] = 1;
    int i2=0,i3=0,i5=0;
    int next_multiple_of_2 = ugly[i2]*2;
    int next_multiple_of_3 = ugly[i3]*3;
    int next_multiple_of_5 = ugly[i5]*5;
    int next_ugly_no = Integer.MAX_VALUE;
    for(int i=1;i<target;i++){
      next_ugly_no = Math.min(next_multiple_of_2,Math.min(next_multiple_of_3,next_multiple_of_5));
      ugly[i] = next_ugly_no;
      if(next_ugly_no == next_multiple_of_2){
        i2 = i2+1;
        next_multiple_of_2 = ugly[i2]*2;
      }
      if(next_ugly_no == next_multiple_of_3){
        i3 = i3+1;
        next_multiple_of_3 = ugly[i3]*3;
      }
      if(next_ugly_no == next_multiple_of_5){
        i5 = i5+1;
        next_multiple_of_5 = ugly[i5]*5;
      }

    }
    //System.out.println("Next ugly number: "+next_ugly_no);
    for(int i=0;i<ugly.length;i++){
      System.out.print(ugly[i] + " ");
    }
    return next_ugly_no;







  }


  private static boolean isUgly(int n){

     n = factoriseAndCheck(n,2);
     n = factoriseAndCheck(n,3);
     n = factoriseAndCheck(n,5);
     return n==1?true:false;
  }

  public static void main(String args[]){
    java.util.Scanner scan = new java.util.Scanner(System.in);
    System.out.println("Enter the number: ");
    int n = scan.nextInt();
    // int ugly = find(n);
    int ugly = uglyDP(n);
    System.out.println("Ugly nth number is: "+ugly);
  }

}
