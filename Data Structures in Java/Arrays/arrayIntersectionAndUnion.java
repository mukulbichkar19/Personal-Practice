// Given two sorted arrays, find their union and intersection.
//
// For example, if the input arrays are:
// arr1[] = {1, 3, 4, 5, 7}
// arr2[] = {2, 3, 5, 6}
// Then your program should print Union as {1, 2, 3, 4, 5, 6, 7} and Intersection as {3, 5}.

public class arrayIntersectionAndUnion{



  public static void main(String args[]){

    int[] arr1 = {1, 3, 4, 5, 7};
    int[] arr2 = {2, 3, 5, 6};

    int i=0;
    int j=0;
    for(i=0,j=0;i<arr1.length && j<arr2.length;){

        if(arr1[i] < arr2[j]){
          System.out.print(arr1[i] + " ");
          i++;
        }else if(arr1[i] > arr2[j]){
          System.out.print(arr2[j] + " ");
          j++;
        }else{
          // Intersect Condition here
          System.out.print(arr1[i]+ " ");
          i++;
          j++;
        }
      }
      if(j < arr2.length){
        while(j < arr2.length){
          System.out.println(arr2[j] + " ");
          j++;
        }
      }else if(i < arr1.length){
        while(i < arr1.length){
          System.out.println(arr1[i] + " ");
          i++;
        }
      }
      System.out.println();
    }

}
