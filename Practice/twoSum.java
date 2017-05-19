public class twoSum{


  private static int[] twoSum(int[] nums, int target){
    int[] result = new int[2];
    // O(n^2)
    // for(int i=0;i<nums.length;i++){
    //   int lt = target - nums[i];
    //   for(int j=i+1;j<nums.length;j++){
    //     if(nums[j] == lt){
    //       result[0] = i;
    //       result[1] = j;
    //       break;
    //     }
    //   }
    // }

    // Using Hashmap but uses extra space
    // O(n)
    java.util.Map<Integer, Integer> hashmap = new java.util.HashMap<>();
    for(int i=0;i<nums.length;i++){
      hashmap.put(nums[i], i);
    }

    for(int i=0;i<nums.length;i++){
      int lt = target - nums[i];
      System.out.println(i + " and " +lt);
      if(hashmap.containsKey(lt)){
        result[0] = hashmap.get(nums[i]);
        result[1] = hashmap.get(lt);
        break;
      }
    }


    // Alternate using hashmap
    // for(int i=0;i<nums.length;i++){
    //   if(hashmap.containsKey(nums[i])){
    //     result[0] = hashmap.get(nums[i]);
    //     result[1] = i;
    //   }else{
    //     hashmap.put(target-nums[i], i);
    //   }
    // }


    return result;
  }

  public static void main(String args[]) {
    //int[] array = {2, 7, 11, 15};
    int[] array = {3,2,4};
    int target = 6;
    int[] result = twoSum(array, target);
    System.out.println("the output is: ");
    for(int i=0; i<result.length;i++){
      System.out.println(result[i]);
    }

  }

}
