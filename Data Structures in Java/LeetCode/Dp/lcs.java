public class lcs {

  private static int[][] mem;

  private static void findLCS(String s, String t) {
    StringBuilder str = new StringBuilder();

    for(int i=1;i<s.length()+1;i++){
      for(int j=1;j<t.length()+1;j++){
        if(s.charAt(i-1) == (t.charAt(j-1))) {
          mem[i][j] = mem[i-1][j-1]+1;
        }else{
          mem[i][j] = Math.max(mem[i][j-1],mem[i-1][j]);
        }

      }
    }
    System.out.println("Max length is: "+mem[s.length()][t.length()]);
      for(int i=0;i<s.length()+1;i++){
      for(int j=0;j<t.length()+1;j++){
        System.out.print(mem[i][j] + " ");
      }
      System.out.println();
    }

    // System.out.println(str);

  }



  public static void main(String args[]) {
   java.util.Scanner scan = new java.util.Scanner(System.in);
   System.out.println("Enter the first string: ");
   String s = scan.nextLine();
   System.out.println("Enter the second string: ");
   String t = scan.nextLine();
   mem = new int[s.length()+1][t.length()+1];
   for(int i=0;i<t.length()+1;i++){
     mem[0][i] = 0;
   }
   for(int j=0;j<s.length()+1;j++){
     mem[j][0] = 0;
   }


   findLCS(s,t);



 }

}
