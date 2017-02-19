public class productArray{


  private static void findProductusingAuxArrays(int[] arr){

    int[] leftArray = new int[arr.length];
    int[] rightArray = new int[arr.length];
    int[] product = new int[arr.length];

    leftArray[0] = 1;
    rightArray[arr.length-1] = 1;

    for(int i=1;i<arr.length;i++){
      leftArray[i] = leftArray[i-1]*arr[i-1];
    }


    for(int i=arr.length-2;i>=0;i--){
      rightArray[i] = rightArray[i+1]*arr[i+1];
    }

    for(int i=0;i<arr.length;i++){
      product[i] = leftArray[i]*rightArray[i];
    }

    System.out.println("Final Product Array");
    for(int i=0;i<product.length;i++){
      System.out.print(product[i] + " ");
    }
    System.out.println();
  }


  private static void usingNoextraSpace(int[] arr){

    int[] productArray = new int[arr.length];
    productArray[0] = 1;
    productArray[arr.length-1] = 1;
    for(int i=1;i<arr.length;i++){
      productArray[i] = productArray[i-1]*arr[i-1];
    }
    int temp = 1;
    for(int i=arr.length-2;i>=0;i--){
      productArray[i] = productArray[i]*arr[i+1]*temp;
     temp = temp * arr[i+1];
    }
    System.out.println("Final Product Array");
    for(int i=0;i<productArray.length;i++){
      System.out.print(productArray[i] + " ");
    }



  }


  public static void main(String args[]){

    int[] array = {10, 3, 5, 6, 2};

    // O(n) and extra space as O(n)
    findProductusingAuxArrays(array);

    // O(n) and no extra space
    usingNoextraSpace(array);


  }

}
