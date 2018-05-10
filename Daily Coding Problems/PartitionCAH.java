public class PartitionCAH{


  private static void display(int[] nums){
    for(int i=0;i<nums.length;i++){
      System.out.print(nums[i] + " ");
    }
    System.out.println();
  }

  private static void partition(int[] nums, int pivot_value){

    int low = 0;
    int high = nums.length-1;

    while(low < high){
      while(nums[low] <= pivot_value){
        low++;
      }

      while(nums[high] > pivot_value){
        high--;
      }

      if(low < high){
        int temp = nums[low];
        nums[low] = nums[high];
        nums[high] = temp;
      }
    }
  }


  public static void main(String args[]){
    int[] nums = {2,3,1,9,33,21,8,15,4};
    System.out.println("Before partioning:");
    display(nums);
    partition(nums,8);
    System.out.println("After partioning:");
    display(nums);
  }

}
