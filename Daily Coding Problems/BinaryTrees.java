public class BinaryTrees{





  private static int noTrees(int n){

      int[] arr = new int[n];

      int count = 0;
      for(int i=0;i<arr.length;i++){
        arr[i] = i+1;
      }

      for(int i=0;i<arr.length;i++){
          int left_count = findCount(arr, 0, i-1);
          int right_count = findCount(arr, i+1, arr.length-1);
          if (left_count > 0 && right_count > 0){
            count += (left_count*right_count);
          }else{
              count += Math.max(left_count, right_count);
          }
      }
      return count;
  }

  private static int findCount(int[] arr, int st, int end){

    if(st > end){
      return 0;
    }

    if(st == end){
      return 1;
    }
    int count = 0;

    for(int i=st;i<=end;i++){
      int left = findCount(arr, st, i-1);
      int right = findCount(arr, i+1, end);
      if (left > 0 && right > 0){
        count += (left*right);
      }else{
          count += Math.max(left, right);
      }
    }
    return count;

  }





  public static void main(String args[]){

    int n = 2;
    int p = 3;
    int q = 4;

    int trees = noTrees(7);

    System.out.println("The number of binary trees for n: " + q + " is: " +trees);


  }

}
