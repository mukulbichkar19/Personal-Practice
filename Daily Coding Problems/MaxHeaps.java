public class MaxHeaps{


  private static void buildMaxHeap(int[] nums){
    int n = nums.length;
    for(int i=n/2-1;i>=0;i--){
        maxHeapify(nums, n-1, i);
    }
  }

  private static void maxHeapify(int[] nums,int n, int i){

      int largest = i;
      int l = 2*i+1;
      int r = 2*i+2;

      if(l<=n && nums[l]>=nums[largest]){
        largest = l;
      }

      if(r<=n && nums[r]>=nums[largest]){
        largest = r;
      }

      if(largest != i){
        //swap i and largest
        int temp = nums[i];
        nums[i] = nums[largest];
        nums[largest] = temp;
        maxHeapify(nums, n, largest);
      }
  }


  private static void heapsort(int[] nums){

    int n = nums.length;

    for(int i=n-1;i>=0;i--){
      int temp = nums[0];
      nums[0] = nums[i];
      nums[i] = temp;
      maxHeapify(nums, i-1, 0);
    }

  }

  private static void insertHeap(int[] nums, int n){
      nums[nums.length-1] = n;
      for(int i=nums.length-1;i>=0;i=i/2){
          if(nums[i] > nums[i/2]){
            int temp = nums[i];
            nums[i] = nums[i/2];
            nums[i/2] = temp;
          }
      }
  }



  private static void display(int[] nums){
    for(int i=0;i<nums.length;i++){
      System.out.print(nums[i] + " ");
    }
    System.out.println();
  }

  public static void main(String args[]){

      int[] nums = {4,10,3,5,1,9,12,Integer.MIN_VALUE};
      buildMaxHeap(nums);
      System.out.println("Max Heap: ");
      display(nums);

      // heapsort(nums);
      // System.out.println("Sorted: ");
      // display(nums);

      System.out.println("After insertion: ");
      //insertHeap(nums, 45);

      //display(nums);

  }

}
