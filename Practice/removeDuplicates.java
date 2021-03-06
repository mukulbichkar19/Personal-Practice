public class removeDuplicates{

  private static java.util.HashSet<Integer> hashset = new java.util.HashSet<>();
  private static int[] remove(int[] arr){


    for(int i=0 ; i < arr.length;i++){
      hashset.add(arr[i]); // Add only the non-duplicate elements
    }

    int[] processed = new int[hashset.size()];
    int j = 0;

    for(Integer i:hashset){
      processed[j++] = i;
    }

    return processed;

  }

  private static boolean runTest(int[] arr, int length){
    //int[] sol = {1,2,3,4,5,6,7};
    int[] sol = {1};
    boolean test = false;
    for(int i=0;i<length;i++){
      if(arr[i] == sol[i]){
        test = true;
      }
    }
    return test;
  }


  public static void main(String args[]){

    int length = 0;
    boolean test = false;
    int[] array = {1,1,1,2,3,4,4,4,4,5};
    //int[] array = {1,1,1,1,1,1,1};
    //int[] array = {1,1,2,3,4,4,4,5,6,7,7,7,7};
    for(int i=0, j=i+1, k=0; i<array.length && j<array.length ; ) {

        if(array[i] == array[j]){
          while(j <= array.length-1 && array[i] == array[j]) {
              array[j] = Integer.MIN_VALUE;
              j++;
          }
          array[k+1] = array[j];
          array[j++] = Integer.MIN_VALUE;
        }
        else{
          i = j;
          j = j+1;
          array[k+1] = array[i];
          array[i] = Integer.MIN_VALUE;

        }
    }
    for(int i=0;i<array.length;i++){
      // if(array[i] != Integer.MIN_VALUE){
      //   length++;
      // }
      System.out.println(array[i]);
    }
    //System.out.println(length);


    if(runTest(array, length)){
      System.out.println("Success");
    }else{
      System.out.println("Failed");
    }





  }

}
