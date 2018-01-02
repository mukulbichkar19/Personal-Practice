import java.util.*;
public class binSearch{

  private static int search(int[] nums, int x){

    int lo = 0;
    int hi = nums.length-1;
    int mid = (lo+hi)/2;
    while(lo <= hi){

      mid = (lo+hi)/2;

      if(nums[mid] == x){
        return mid;
      }else if(x < nums[mid]){
        hi--;
      }else{
        lo++;
      }
    }
    return -1;
  }


  public static void main(String args[]){

      int[] nums = {12,1,3,2,11,90};
      // Arrays.sort(nums);
      //
      // int x = 12;
      // int index = search(nums, x);
      // if(index != -1){
      //   System.out.println("The element "+x+" is present at: "+index);
      // }else{
      //   System.out.println("Element "+x+" is not present.");
      // }

      List<Integer> numbers = new ArrayList<Integer>();
      numbers.add(0);
      numbers.add(-1);
      numbers.add(2);
      numbers.add(-3);
      numbers.add(4);
      //numbers.add(90);
      Collections.sort(numbers);
      int lo = 0;
      int hi = numbers.size()-1;
      int target = -4;
      while(lo < hi){
          int val = numbers.get(lo) + numbers.get(hi);
          if(val == target){
            System.out.println(numbers.get(lo) + " :: " + numbers.get(hi));
            break;
          }else if(val > target){
            hi--;
          }else{
            lo++;
          }
      }




  }

}
