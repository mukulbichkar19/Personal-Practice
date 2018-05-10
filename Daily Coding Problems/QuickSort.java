import java.util.Random;

public class QuickSort{

  public static int choosePivot(int start, int end){
      Random rand = new Random();
      int pi = start + (int)(Math.random()*((end-start)+1));
      return pi;
  }



  public static int partition(int[] nums, int start, int end, int pivot){

      // Lomatou's Method.
      int pivot_value = nums[pivot];
      swap(nums, pivot, end);
      int i = start;
      for(int k=start;k<end;k++){
          if(nums[k] <=pivot_value){
            swap(nums, i, k);
            i = i+1;
          }
      }
      swap(nums, i, end);
      return i;
  }

  protected static void swap(int[] nums, int i, int j){
    int temp = nums[i];
    nums[i] = nums[j];
    nums[j] = temp;
  }




  public static void quickSort(int[] nums, int start, int end){

    if(start == end || start > end){
      return;
    }

    int pivot = choosePivot(start, end);
    int position = partition(nums, start, end, pivot);
    quickSort(nums, start, position-1);
    quickSort(nums, position+1, end);

  }

  public static void main(String args[]){
      int[] nums = {5,18,20,4,2,51,30};
      quickSort(nums, 0, nums.length-1);
  }

}
