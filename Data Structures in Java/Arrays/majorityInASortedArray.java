public class majorityInASortedArray{


  private static void findMajority(int[] arr){
    int current_major_count = 0;
    int temp = 0;
    boolean flag = false;
    int i = 0;
    for(int i=0;i<arr.length-1;i++){
      current_major_count = 1;
      temp = arr[i];
      while(temp == arr[i+1]){
        current_major_count++;
      }
    }



  }
  System.out.println("The majority element is: "+prev_major);

}

  public static void main(String args[]){

    int[] sortedArray = {1, 2, 3, 3, 3, 3, 10};

    findMajority(sortedArray);


  }

}
