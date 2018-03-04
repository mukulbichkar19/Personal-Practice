public class GettingDifferentNumber{

  static int getDifferentNumber(int[] arr) {

      int n = arr.length;
      for(int i=0;i<n;i++){
        int temp = arr[i];
        while(temp < n && arr[temp] != temp){
          int swap = arr[temp];
          arr[temp] = arr[i];
          arr[i] = swap;
        }
      }

      for(int i=0;i<n;i++){
        if(i != arr[i]){
          return i;
        }
      }

      return arr[n-1]+1;
  }


  public static void main(String args[]){

    int[] arr = {1,2,0,55};

    int num = getDifferentNumber(arr);

    System.out.println("the num is: "+num);


  }


}
