/*
  Refer CLRS for algorithm
 */
public class lcs{

  private static int[][] c;
  private static int[][] b;

  private static char[] process(String n){
    char[] temp = new char[n.toCharArray().length+1];
    temp[0] = '0';
    for(int i=1;i<temp.length;i++){
      temp[i] = n.charAt(i-1);
    }
    return temp;
  }

  private static int lcsDynamic(String x, String y){
    int m = x.toCharArray().length;
    int n = y.toCharArray().length;
    c = new int[m+1][n+1];
    b = new int[m+1][n+1];
    for(int i=0;i<=m;i++){
      c[i][0] = 0;
    }
    for(int j=0;j<=n;j++){
      c[0][j] = 0;
    }
    char[] x1 = process(x);
    char[] y1 = process(y);


    for(int i=1;i<=m;i++){
      for(int j=1;j<=n;j++){
        if(x1[i] == y1[j]){
          c[i][j] = 1+c[i-1][j-1];
          b[i][j] = 2;
        }
        else if(c[i-1][j] >= c[i][j-1]){
          c[i][j] = c[i-1][j];
          b[i][j] = 1;
        }else{
          c[i][j] = c[i][j-1];
          b[i][j] = -1;
        }
      }
    }
    return c[m][n];
  }

  private static void printLCS(String x, String y, int i, int j){

    if(i==0 || j==0){
      return;
    }
    if(x.charAt(i-1) == y.charAt(j-1)){
      printLCS(x,y,i-1,j-1);
      System.out.print(x.charAt(i-1) + " ");
    }else if(c[i-1][j] >= c[i][j-1]){
      printLCS(x,y,i-1,j);
    }else{
      printLCS(x,y,i,j-1);
    }
  }

  private static void print(String x, int i, int j){
    if(i==0 || j==0){
      return;
    }
    if(b[i][j]==2){
      print(x, i-1,j-1);
      System.out.print(x.charAt(i-1)+ " ");
    }else if(b[i][j] == 1){
      print(x,i-1,j);
    }else{
      print(x,i,j-1);
    }
  }


  public static void main(String args[]) {
    java.util.Scanner scan  = new java.util.Scanner(System.in);
    System.out.println("Enter the first string: ");
    String x = scan.next();
    System.out.println("Enter the second string: ");
    String y = scan.next();
    int len = lcsDynamic(x,y);
    System.out.println("The length of longest common subsequence is: "+len);
    // print(x,x.toCharArray().length, y.toCharArray().length);
    // System.out.println();
    printLCS(x,y,x.toCharArray().length, y.toCharArray().length);
    System.out.println();

  }

}
