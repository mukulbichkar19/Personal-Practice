public class PartitionLomatus{

  private static void display(int[] nums){
    for(int i=0;i<nums.length;i++){
      System.out.print(nums[i] + " ");
    }
    System.out.println();
  }

  private static void partition(int[] nums, int pivot){

    int pivot_value = nums[pivot];
    int i = 0;
    // swap pivot with last
    int temp = nums[pivot];
    nums[pivot] = nums[nums.length-1];
    nums[nums.length-1] = temp;
    for(int k=0;k<nums.length-1;k++){
      if(nums[k] <= pivot_value){
        // swap with i and increment i
        temp = nums[i];
        nums[i] = nums[k];
        nums[k] = temp;
        i++;
      }
    }
    // Swap last with i
    temp = nums[nums.length-1];
    nums[nums.length-1] = nums[i];
    nums[i] = temp;
  }

  public static void main(String args[]){

    int[] nums = {2,3,1,9,33,21,8,15,4};
    int pivot = nums.length-3;
    System.out.println("Before partioning: ");
    display(nums);
    partition(nums, pivot);
    System.out.println("After partioning: ");
    display(nums);

  }
}
