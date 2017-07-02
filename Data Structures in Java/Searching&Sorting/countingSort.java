public class countingSort{


  private static int[] countingSort(int[] a, int[] b, int k){
    int[] c = new int[k+1];

    for(int j=0;j<a.length;j++){
      c[a[j]] = c[a[j]] + 1;
    }

    for(int i=1;i<c.length;i++){
      c[i] += c[i-1];
    }

    for(int j=a.length-1;j>=0;j--){
      b[c[a[j]]] = a[j];
      c[a[j]] = c[a[j]]-1;
    }
    return b;

  }


  public static void main(String args[]){
    int[] a = {2,5,3,0,2,3,0,3};
    int[] b = new int[a.length+1];
    java.util.Scanner scan = new java.util.Scanner(System.in);
    System.out.println("Enter the value of k: ");
    int k = scan.nextInt();
    b = countingSort(a, b, k);
    System.out.println("Sorted Array: ");
    for(int i=0;i<b.length;i++){
      System.out.print(b[i] + " ");
    }
    System.out.println();


  }

}
