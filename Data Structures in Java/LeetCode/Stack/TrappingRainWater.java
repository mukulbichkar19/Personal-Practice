public class TrappingRainWater{

  // Approach 1
  private static int findStore(int[] w){
      int acc_sum = 0;
      for(int i=0;i<w.length;i++){
        int left_max = findMaxLeft(w,i);
        int right_max = findMaxRight(w,i);
        int min = Math.min(left_max, right_max);
        acc_sum += min-w[i];
      }
      return acc_sum;
  }

  private static int findMaxLeft(int[] w, int i){
    int max = 0;
    for(int j=i;j>=0;j--){
      if(w[j] > max){
        max = w[j];
      }
    }
    return max;
  }

  private static int findMaxRight(int[] w, int i){
    int max = 0;
    for(int j=i;j<w.length;j++){
      if(w[j] > max){
        max = w[j];
      }
    }
    return max;
  }

  // Approach 2
  private static int findStorage(int[] w){

      int water_stored = 0;

      int n = w.length;

      int[] left_max = new int[w.length];

      int[] right_max = new int[w.length];

      left_max[0] = w[0];
      for(int i=1;i<n;i++){
        left_max[i] = Math.max(left_max[i-1],w[i]);
      }

      right_max[n-1] = w[n-1];
      for(int j=n-2;j>=0;j--){
        right_max[j] = Math.max(right_max[j+1],w[j]);
      }

      for(int i=0;i<n;i++){
        int min = Math.min(left_max[i],right_max[i]);
        water_stored += min-w[i];
      }

      return water_stored;
  }

  // Approach 3
  private static int findStorageNoSpace(int[] w){

    int water_stored = 0;
    int left_max = 0;
    int right_max = 0;

    int lo = 0;
    int hi = w.length-1;

    while(lo <= hi){
      if(w[lo] < w[hi]){
        if(w[lo] > left_max){
          left_max = w[lo];
        }else{
          water_stored += left_max-w[lo];
        }
        lo++;
      }else{
        if(w[hi] > right_max){
          right_max = w[hi];
        }else{
          water_stored += right_max-w[hi];
        }
        hi--;
      }
    }
    return water_stored;
  }

  public static void main(String args[]){

    int[] water = {0,1,0,2,1,0,1,3,2,1,2,1};

    // Approach 1: O(n^2)
    int water_stored = findStore(water);
    System.out.println("Water stored in O(n^2) is: "+water_stored);

    // Approach 2: Using Extra Space O(n), time complexity: O(n)
    int water_str = findStorage(water);
    System.out.println("Water stored using extra space is: "+water_str);

    // Approach 3: Using Space O(1), time complexity: O(n)
    int water_sr = findStorageNoSpace(water);
    System.out.println("Water stored without extra space is: "+water_sr);

  }

}
