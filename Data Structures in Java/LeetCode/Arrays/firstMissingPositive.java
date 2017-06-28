public class firstMissingPositive{



  private static int segregate(int[] nums){
    int n = nums.length;
    int q = -1;
    for(int i=0;i<n;i++){
      if(nums[i] > 0){
        q++;
        // swap q and i
        int temp = nums[q];
        nums[q] = nums[i];
        nums[i] = temp;
      }
    }

    return q;

  }


  private static int findMissing(int[] nums){
    int n = nums.length;
    if(n==0){
      return 1;
    }
    // Step 1 segregate the positive and negative numbers
    int negative_index = segregate(nums) + 1; //Get the start of negative
    // Now negate the positive numbers
    int temp = 0;
    int first_missing_index = negative_index;
    for(int i=0;i<negative_index;i++){
      temp = Math.abs(nums[i]);
      if(temp <= negative_index){
        nums[temp-1] = (nums[temp-1]<0) ? nums[temp-1] : -nums[temp-1];
      }
    }
    // Now check for positive numbers in the positive partition
    for(int i=0;i<negative_index;i++){
      if(nums[i] > 0){
        first_missing_index = i;
        break;
      }
    }
    return first_missing_index + 1;

  }




  public static void main(String args[]){
    int[] nums = {2,3,0};
    int missing = findMissing(nums);
    System.out.println("Missing number is: "+missing);
  }

}
