public class maxAndMinInMinComp{

  private static void findMinAndMax(int[] arr){
    // Initialize variables to store min and max
    int min = arr[0];
    int max = arr[0];

    for(int i=1;i<arr.length;i++){
      if(arr[i] > max){
        max = arr[i];
      }else if(arr[i] < min){
        min = arr[i];
      }
    }
    System.out.println("The max is: "+max+" and min is: "+min);
  }

  private static void findMinAndMaxOptimized(int[] arr){

    // Here we compare in pairs
    int min = 0;
    int max = 0;
    int pos = 0; // Counter to track and start position
    int n = arr.length;
    if((n%2)==0){
      // Check and assign the max and min numbers
      if(arr[0] > arr[1]){
        max = arr[0];
        min = arr[1];
      }else
      {
        max = arr[1];
        min = arr[0];
      }
      pos = 2;
    }
    else{
      max = arr[0];
      min = arr[0];
      pos = 1;
    }

    //System.out.println("Max and min are: "+max+" "+min + " "+ pos);
    while(pos < n-1){

      // Check and operate in pairs
      if(arr[pos] > arr[pos+1]){
        if(arr[pos] > max){
          max = arr[pos];
        }
        if(arr[pos+1] < min){
          min = arr[pos+1];
        }
      }else{
        if(arr[pos+1] > max){
          max = arr[pos+1];
        }
        if(arr[pos] < min){
          min = arr[pos];
        }
      }

      pos = pos+2; //increment by 2

    }

    System.out.println("The max is: "+max+" and min is: "+min);


  }



  public static void main(String args[]){

      int[] array = {1000, 11, 445, 1, 330, 3000};
      // this approach uses O(n) comparisons
      findMinAndMax(array);
      // Approach two uses 3*(n/2)-1 comparisons
      findMinAndMaxOptimized(array);

  }

}
