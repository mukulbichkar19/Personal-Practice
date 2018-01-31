public class binSearch{

  private static int findIndex(int[] arr){

    if(arr.length == 0){
      return 0;
    }

    int low = 0;
    int high = arr.length-1;

    while(low <= high){
      int mid = low+(high-low)/2;
      System.out.println("Mid is: "+mid);
      if(arr[mid] == mid){
        return mid;
      }else if(arr[mid] > mid){
        high = mid-1;
      }else{
        low = mid+1;
      }
    }
    return -1;
  }



  public static void main(String args[]){

    int[] sorted_arr = {-8,0,2,5};
    int n = findIndex(sorted_arr);
    System.out.println("The matching index is: "+n);

  }


}
