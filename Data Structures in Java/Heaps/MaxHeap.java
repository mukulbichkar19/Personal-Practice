/*
  Reference:- https://www.hackerearth.com/practice/data-structures/trees/heapspriority-queues/tutorial/
*/
/*
  1. In max heap parent node value is greater than its children
  2. Root index starts from 1.
  3. Parent = i/2;
  4. Left_child = 2*i
  5. Right_child = 2*i + 1
  6. The nodes from n/2 onwards are leaf nodes i.e. heaps with 1 element
    so we can buid max heap in a bottom up manner
*/
public class MaxHeap{

   private static int[] array = new int[]{0};

   private static void max_heapify(int[] a, int i, int n){
     int left = 2*i;
     int right = 2*i + 1;
     int largest = Integer.MIN_VALUE;
     // Find Max between i and left child
     if(left<=n && a[left] > a[i]){
       largest = left;
     }else{
       largest = i;
     }

     // Now compare the max till now with right child
     if(right<=n && a[right] > a[largest]){
       largest = right;
     }

     // Now if largest is not i then swap i and largest
     if(largest != i){
       // Swap logic
       int temp = a[i];
       a[i] = a[largest];
       a[largest] = temp;
       // recursively call max_heapify with largest element as
       // the current element
       max_heapify(a, largest, n);
     }
   }


  public static void main(String args[]){

      array = new int[8];
      array[0] = -1;
      array[1] = 1;
      array[2] = 4;
      array[3] = 3;
      array[4] = 7;
      array[5] = 8;
      array[6] = 9;
      array[7] = 10;
      int n = array.length-1;
      //System.out.println("n is: "+n);
      for(int i=n/2;i>=1;i--){
        max_heapify(array,i,n);
      }


      for(int i=1;i<array.length;i++){
        System.out.print(array[i] + " ");
      }

      System.out.println();



  }


}
