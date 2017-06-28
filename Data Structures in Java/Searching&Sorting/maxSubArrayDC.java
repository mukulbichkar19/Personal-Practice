public class maxSubArrayDC{

  private static maxSubArrayTuple findCrossingSum(int[] a, int low, int mid, int high){
    int left_sum = Integer.MIN_VALUE;
    int max_left = 0;
    int sum1 = 0;
    for(int i=mid;i>=0;i--){
      sum1 += a[i];
      if(sum1 > left_sum){
        left_sum = sum1;
        max_left = i;
      }
    }

    int right_sum = Integer.MIN_VALUE;
    int max_right = 0;
    int sum2 = 0;
    for(int j=mid+1;j<=high;j++){
      sum2 += a[j];
      if(sum2 > right_sum){
        right_sum = sum2;
        max_right = j;
      }
    }
    maxSubArrayTuple n = new maxSubArrayTuple(max_left, max_right, left_sum+right_sum);
    return n;

  }



  private maxSubArrayTuple findMax(int[] a, int low, int high){
    if(low == high){
      maxSubArrayTuple m = new maxSubArrayTuple(low, high, a[low]);
      return m;
    }

    int mid = (low+high)/2;
    maxSubArrayTuple left = findMax(a, low, mid);
    maxSubArrayTuple right = findMax(a, mid+1, high);
    maxSubArrayTuple cross = findCrossingSum(a, low, mid, high);

    if(left.sum >= right.sum && left.sum >= cross.sum){
      return left;
    }else if(right.sum >= left.sum && right.sum >= cross.sum){
      return right;
    }
    return cross;
  }


  public static void main(String args[]){


    //int[] array = {13,-3,-25,20,-3,-16,-23,18,20,-7,12,-5,-22,15,-4,7};
    int[] array = {1,-4,3,-4};
    maxSubArrayDC a = new maxSubArrayDC();
    maxSubArrayTuple t = a.findMax(array, 0, array.length-1);
    System.out.println("The left is: "+t.left_limit+" right: "+t.right_limit+" and sum is: "+t.sum);





  }

}
