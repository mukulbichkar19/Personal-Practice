public class removeElement{


  private static int remove(int[] nums, int val) {

    int len  = 0;
    // Empty array case
    if(nums.length == 0){
      return 0;
    }else if(nums.length == 1){
      if(nums[0] == val){
        return 0;
      }else{
        return 1;
      }
    }
    else{
      for(int i=0 ;i<nums.length;i++){
        if(nums[i] == val){
          nums[i] = Integer.MIN_VALUE;
        }
      }


      for(int i=0, j=nums.length-1 ; i < j;){
        if(nums[i]==Integer.MIN_VALUE && nums[j]!=Integer.MIN_VALUE){
          nums[i++] = nums[j];
          nums[j--] = Integer.MIN_VALUE;
        }else if(nums[i]==Integer.MIN_VALUE && nums[j]==Integer.MIN_VALUE){
          j--;
        }else{
          i++;
        }
      }

      // for(int i=0,j=i+1;i<nums.length && j<nums.length;){
      //   if(nums[i]==Integer.MIN_VALUE && nums[j]!=Integer.MIN_VALUE) {
      //     nums[i++] = nums[j];
      //     nums[j++] = Integer.MIN_VALUE;
      //   }else{
      //     j++;
      //   }
      // }

      System.out.println("Output");
      for(int i=0;i<nums.length;i++){
        System.out.print(nums[i] + " --> ");
      }


      for(int i=0;i<nums.length;i++){

        if(nums[i] != Integer.MIN_VALUE){
          len++;
        }

      }

    }

    return len;


  }


  private static int removeEl(int[] nums, int val) {
    int m = 0;
    for(int i=0;i<nums.length;i++){
      if(nums[i] != val){
        nums[m++] = nums[i];
      }
    }
    return m;
  }


  public static void main(String args[]){

    // int[] arr = {1,2,3};
    int[] arr = {1,2,3,4};
    int num = Integer.valueOf(args[0]);
    int len = removeEl(arr, num);
    System.out.println("The final length is: " +len);



  }

}
