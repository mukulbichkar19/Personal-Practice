public class subarrayOfSumK{

  // O(n^2)
  private static int findSub(int[] arr, int k){

    int sub = 0;

    for(int i=0;i<arr.length;i++){
      int sum = arr[i];
      if(sum == k){
        sub++;
      }
      for(int j=i+1;j<arr.length;j++){
        sum += arr[j];
        if(sum == k){
          sub++;
        }
      }
    }

    System.out.println("sub is: "+sub);

    return -1;
  }

  private static int findSubOp(int[] arr, int k){
    java.util.HashMap<Integer, Integer> preSum = new java.util.HashMap<>();
    preSum.put(0,1);
    int sum = 0;
    int sub = 0;
    for(int i=0;i<arr.length;i++){
      sum += arr[i];
      if(preSum.containsKey(sum-k)){
        sub += preSum.get(sum-k);
      }
      preSum.put(sum, preSum.getOrDefault(sum, 0)+1);
    }
    System.out.println("sub count is: "+sub);
    return sub;
  }




  public static void main(String args[]){
    int[] arr = {1,1,1};
    java.util.Scanner scan = new java.util.Scanner(System.in);
    System.out.println("Enter the sum: ");
    int k = scan.nextInt();
    //int res = findSub(arr, k);
    int res = findSubOp(arr, k);


  }

}
