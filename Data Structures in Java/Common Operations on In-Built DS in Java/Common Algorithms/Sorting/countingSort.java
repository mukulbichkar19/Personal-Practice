public class countingSort{


  public static void main(String args[]){

    int[] arr = {1, 4, 1, 2, 7, 5, 2};

    int n = arr.length;

    // Store the output
    int[] output = new int[n];
    // Store the count
    int[] count = new int[10];
    for(int i=0;i<n;i++){
      count[arr[i]]++;
    }

    for(int i=1;i<count.length;i++){
      count[i] += count[i-1];
    }

    for(int i=0;i<n;i++){
      output[count[arr[i]]-1] = arr[i];
      --count[arr[i]];
    }





    System.out.println("The count array is: ");
    for(int i=0;i<n;i++){
      System.out.print(output[i] + " ");
    }
    System.out.println();




  }




}
