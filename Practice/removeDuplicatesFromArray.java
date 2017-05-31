public class removeDuplicatesFromArray{


  public static void main(String args[]){
    //int[] arr = {1,2,3,4,5};
    int[] arr = {1,1,2,3,3,3,3,4,5,5,5,6};
    int i = 0;
    int j = 1;
    int m = j;
    for(i=0,j=i+1;i<arr.length && j<arr.length;){
      if(arr[j]==arr[i]){
        System.out.println("match for "+arr[i]+" and "+arr[j]);
        arr[j] = Integer.MIN_VALUE;
        j++;
      }else if(arr[j]!=arr[i]){
        arr[m++] = arr[j];
        i++;
        j++;
      }

    }
    System.out.println(m);

    // After iteration
    for(int k=0;k<arr.length;k++){

      System.out.print(arr[k] + " -- ");
    }
    System.out.println();
  }

}
