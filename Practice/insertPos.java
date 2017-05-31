
public class insertPos{


  // searchInsert O(n)
  private static int searchInsert(int[] nums, int target) {

    if(nums.length==0 || target < nums[0]){
      return 0;
    }else if(target > nums[nums.length-1]){
      return nums.length;
    }else{
      for(int i=0;i<nums.length;i++){
        if(nums[i] == target){
          return i;
        }
        else if(nums[i] < target && nums[i+1]>=target){
          return i+1;
        }
      }
    }
    return -1;
  }

  private static int binarySearch(int[] arr, int target){
    int low = 0;
    int high = arr.length-1;
    int mid = 0;
    while(low <= high){
      mid = (low+high)/2;
      if(arr[mid] == target){
        return mid;
      }else if(arr[mid] > target){
        high = mid-1;
      }else{
        low = mid+1;
      }
    }
    return low;
  }


  public static void main(String args[]) {

    int num = Integer.parseInt(args[0]);
    int[] arr = {1,4,5,7};
    //int pos = searchInsert(arr, num);
    int pos = binarySearch(arr, num);
    System.out.println("position found: "+pos);



  }

}
