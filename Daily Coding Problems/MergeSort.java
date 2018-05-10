public class MergeSort{

  private static void merge(int[] nums, int start, int end, int mid){

    int[] left = new int[mid-start+1];
    int[] right = new int[end-mid];
    int i=0,j=0,k=0;
    for(int p=start;p<=mid;p++){
      left[i++] = nums[p];
    }

    for(int p=mid+1;p<=end;p++){
      right[j++] = nums[p];
    }

    i=0; j=0; k=start;
    while(i<left.length && j<right.length){
      if(left[i] <= right[j]){
        nums[k++] = left[i++];
      }else{
        nums[k++] = right[j++];
      }
    }


    while(i<left.length){
      nums[k++] = left[i++];
    }

    while(j<right.length){
      nums[k++] = right[j++];
    }
  }



  private static void mergeSort(int[] nums, int start, int end){

    if(start == end || start > end){
      return;
    }

    int mid = start + (end-start)/2;
    mergeSort(nums,start, mid);
    mergeSort(nums, mid+1, end);
    merge(nums, start, end, mid);
  }


  public static void main(String args[]){

    int[] nums = {2,5,11,31,18,45,0};

    mergeSort(nums, 0, nums.length-1);
    for(int i=0;i<nums.length;i++){
      System.out.print(nums[i] + " ");
    }
    System.out.println();
  }

}
