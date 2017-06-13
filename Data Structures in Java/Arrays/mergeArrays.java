public class mergeArrays{


  private void moveToEnd(int[] arr){

    int j = arr.length-1;
    for(int i=arr.length-1;i>=0;i--){
      if(arr[i] != -1){

          arr[j] = arr[i];
          j--;


      }
    }
  }


  public static void main(String args[]){

    mergeArrays a = new mergeArrays();
    int[] big = {2, 8, -1, -1, -1, 13, -1, 15, 20};
    int[] small = {5, 7, 9, 25};

    // Move elements of big to end
    a.moveToEnd(big);
    for(int i=0;i<big.length;i++){
      System.out.println(big[i]);
    }
  }

}
