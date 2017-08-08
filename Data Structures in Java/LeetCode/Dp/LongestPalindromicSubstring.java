public class LongestPalindromicSubstring{



  /**
     * Linear time Manacher's algorithm to find longest palindromic substring.
     * There are 4 cases to handle
     * Case 1 : Right side palindrome is totally contained under current palindrome. In this case do not consider this as center.
     * Case 2 : Current palindrome is proper suffix of input. Terminate the loop in this case. No better palindrome will be found on right.
     * Case 3 : Right side palindrome is proper suffix and its corresponding left side palindrome is proper prefix of current palindrome. Make largest such point as
     * next center.
     * Case 4 : Right side palindrome is proper suffix but its left corresponding palindrome is be beyond current palindrome. Do not consider this
     * as center because it will not extend at all.
     *
     * To handle even size palindromes replace input string with one containing $ between every input character and in start and end.
  */


  private static int longestPalindrome(char[] input){
    int index = 0;
    //preprocess the input to convert it into type abc -> $a$b$c$ to handle even length case.
    //Total size will be 2*n + 1 of this new array.
    char preprocessedInput[] = new char[2*input.length + 1];

    // Preprocess step
    for(int i=0;i<preprocessedInput.length;i++){
      if(i%2 != 0){
        preprocessedInput[i] = input[index++];
      }else{
        preprocessedInput[i] = '$';
      }
    }

    //create temporary array for holding largest palindrome at every point. //There are 2*n + 1 such points.
    int T[] = new int[preprocessedInput.length];
    int start = 0;
    int end = 0;
    // i is the center
    for(int i=0;i<preprocessedInput.length;){

      // Expand around i and see how far we can go
      while(start > 0 && end<preprocessedInput.length-1 && preprocessedInput[start-1] == preprocessedInput[end+1]){
        start--;
        end++;
      }

      // set the longest value of palindrome around center i at T[i]
      T[i] = end - start + 1;

      // Case 2: Current palindrome is proper suffix of input. No need to proceed. Just break out of loop.
      if(end == T.length-1){
        break;
      }

      //Mark newCenter to be either end or end + 1 depending on if we dealing with even or odd number input.
      int newCenter = end + (i%2 == 0 ? 1:0);

      for(int j=i+1;j<=end;j++){
        //i - (j - i) is left mirror. Its possible left mirror might go beyond current center palindrome. So take minimum of either left side palindrome or distance of j to end.

        T[j] = Math.min(T[i-(j-i)], 2*(end-j)+1);
        //Only proceed if we get case 3. This check is to make sure we do not pick j as new center for case 1 or case 4
        //As soon as we find a center lets break out of this inner while loop.
        if(j+T[i-(j-i)]/2 == end){
          newCenter = j;
          break;
        }
      }

      i = newCenter;
      end = i+T[i]/2;
      start = i-T[i]/2;
  }

  int max = Integer.MIN_VALUE;
  for(int i=0;i<T.length;i++){
    int val;
    val = T[i]/2;
    if(max < val){
      max = val;
    }
  }

  return max;

} // End of longestPalindrome







  // Manacher's Algorithm
  // Run time: O(n)
  // Extra Space: O(n)
  public static void main(String args[]){

    java.util.Scanner scan = new java.util.Scanner(System.in);
    System.out.println("Enter the string: ");
    String input = scan.nextLine();
    int len = longestPalindrome(input.toCharArray());
    System.out.println("Longest palindromic substring is of length: "+len);



  }


}
