public class medianTwoArray{



  public static void main(String args[]){
    int[] nums1 = {1, 2};
    int[] nums2 = {3, 4};
    int[] result = new int[nums1.length + nums2.length];
    int k = 0;
    // O(m)
    for(int i=0 ; i<nums1.length ; i++){
      result[k++] = nums1[i];
    }

    // O(n)
    for(int j=0 ; j<nums2.length ; j++){
      result[k++] = nums2[j];
    }

    // O((n+m)log(m+n))
    java.util.Arrays.sort(result);
    //O(1)
    if(result.length%2 == 1){
      System.out.println("median for odd: "+result[result.length/2]);
    }else{
      System.out.println("median for even: "+(result[result.length/2] + result[(result.length/2)-1])/2);
    }

    // Overall time = O((n+m)log(m+n))




  }
}
