public class MinHeap{


  private static void buildMinHeap(int[] nums){
      int n = nums.length;
      for(int i=n/2-1;i>=0;i--){
        minHeapify(nums, i);
      }
  }

  private static void minHeapify(int[] nums, int i){

      int l = 2*i+1;
      int r = 2*i+2;
      int smallest = i;
      int n = nums.length-1;

      if(l <= n && nums[l] <= nums[smallest]){
        smallest = l;
      }

      if(r <= n && nums[r] <= nums[smallest]){
        smallest = r;
      }

      if(smallest != i){
        // swap i and smallest
        int temp = nums[smallest];
        nums[smallest] = nums[i];
        nums[i] = temp;
        minHeapify(nums, smallest);
      }
  }

  public static void main(String args[]){

      int[] nums = {4,10,3,5,1};
      buildMinHeap(nums);
      System.out.println("Min Heap is: ");
      for(int i=0;i<nums.length;i++){
        System.out.print(nums[i] + " ");
      }
      System.out.println();
  }

}
