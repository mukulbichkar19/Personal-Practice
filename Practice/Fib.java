public class Fib{

  private static void fibonacci(int n){

    int a = 1;
    int b = 1;
    int res = 0;
    for(int i=2;i<n;i++){
        res = a+b;
        a = b;
        b = res;
    }

    System.out.println(res);


  }

  private static int recursive(int n){

    if(n<=0){
      return 0;
    }

    if(n == 1){
      return 1;
    }
    return recursive(n-1) + recursive(n-2);


  }



  public static void main(String args[]){

      int n = 8;
      //fibonacci(n);
      System.out.println(recursive(n));

  }

}
