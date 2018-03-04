public class MagicVowels{


  private static int subString(String s){

    if(s.length() == 0 || s.length()==1){
      return 0;
    }

    int n = s.length();

    boolean[][] isPalin = new boolean[n][n];

    int palindromeCount = 0;

    // Check for substrings of length 2
    for(int i=0;i<n-1;i++){
      isPalin[i][i] = true;
      if(s.charAt(i) == s.charAt(i+1)){
        palindromeCount++;
        isPalin[i][i+1] = true;
      }
    }
    isPalin[n-1][n-1] = true;


    // Now starting for substrings of length 3 or more
    for(int k=2;k<n;k++){
      for(int j=n-k-1;j>=0;j--){
          if(s.charAt(j) == s.charAt(j+k) && isPalin[j+1][j+k-1] == true){
            palindromeCount++;
            isPalin[j][j+k] = true;
          }
      }
    }

    System.out.println("Total possible palindromic substrings starting length: "
                        +(palindromeCount + s.length()));
    return palindromeCount;
  }

  private static void print(boolean[][] b){

    for(int i=0;i<b.length;i++){
      for(int j=0;j<b[i].length;j++){
        System.out.print(b[i][j] + " ");
      }
      System.out.println();
    }

  }


  public static void main(String args[]){

    String s = "abaab";

    int n = subString(s);
    System.out.println("No of substrings are: "+n);



  }

}
