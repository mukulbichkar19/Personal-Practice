import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Test;

public class QuickSortTest{



    @Test
    public void testRandom(){

        int lo = 0;
        int hi = 0;
        QuickSort q = new QuickSort();
        int pivot = q.choosePivot(lo, hi);
        if(pivot < lo || pivot > hi){
            fail("Random number not in the range.");
        }
    }

    @Test
    public void checkQS(){
        int[] nums = {5,18,20,4,2,51,30};
        QuickSort q = new QuickSort();
        q.quickSort(nums, 0, nums.length-1);
        int[] res = {2,4,5,18,20,30,51};
        for(int i=0;i<res.length;i++){
            if(res[i] != nums[i]){
                fail("Not sorted");
            }
        }
    }

    // @Test
    // public void checkParititon(){
    //     int[] nums = {1,18,2,4};
    //     QuickSort q = new QuickSort();
    //     int pivot = q.choosePivot(0, nums.length-1);
    //     int res_pos = q.partition(nums, 0, nums.length-1, pivot);
    //     assertEquals(2, res_pos);
    // }


}
