public class maxSubArray{
  // Brute Force Approach O(n^2)

  public static void main(String args[]){
    int[] array = {13,-3,-25,20,-3,-16,-23,18,20,-7,12,-5,-22,15,-4,7};
    int max_start = 0;
    int max_end = 0;
    int max_sum = 0;
    int n = array.length;
    for(int i=0;i<n;i++){
      int sum = array[i];
      for(int j=i+1;j<n;j++){
        sum += array[j];
        if(sum > max_sum){
          max_start = i;
          max_end = j;
          max_sum = sum;
        }
      }
    }


    System.out.println("Max Sum is: "+max_sum+" and start is: "+(max_start+1)+" and end is: "+(max_end+1));





  }



}
