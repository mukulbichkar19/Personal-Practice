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
      while(low < nums.length && nums[low] <= pivot_value){
        low++;
      }

      while(high >=0 && nums[high] > pivot_value){
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
    int[] nums = {3,5};
    System.out.println("Before partioning:");
    display(nums);
    partition(nums,8);
    System.out.println("After partioning:");
    display(nums);
  }

}
