/* Video link - https://youtu.be/RORuwHiblPc
 *
 * Given a sequence of words, and a limit on the number of characters that can be put
 * in one line (line width). Put line breaks in the given sequence such that the
 * lines are printed neatly
 *
 * Solution:
 * Badness - We define badness has square of empty spaces in every line. So 2 empty space
 * on one line gets penalized as 4 (2^2) while 1 each empty space on 2 lines gets
 * penalized as 2(1 + 1). So we prefer 1 empty space on different lines over 2 empty space on
 * one line.
 *
 * For every range i,j(words from i to j) find the cost of putting them on one line. If words
 * from i to j cannot fit in one line cost will be infinite. Cost is calculated as square of
 * empty space left in line after fitting words from i to j.
 *
 * Then apply this formula to get places where words need to be going on new line.
 * minCost[i] = minCost[j] + cost[i][j-1]
 * Above formula will try every value of j from i to len and see which one gives minimum
 * cost to split words from i to len.
 *
 * Space complexity is O(n^2)
 * Time complexity is O(n^2)
 * */
public class TextJustification{


  private static void display(int[][] cost){
    for(int i=0;i<cost.length;i++){
      for(int j=0;j<cost[i].length;j++){
        System.out.print(cost[i][j] + " ");
      }
      System.out.println();
    }
  }


  private static int textJustify(String[] words, int width){

    int[][] cost = new int[words.length][words.length];
    //next 2 for loop is used to calculate cost of putting words from
    //i to j in one line. If words don't fit in one line then we put
    //Integer.MAX_VALUE there.
    for(int i=0;i<words.length;i++){
      cost[i][i] = width - words[i].length();
      for(int j=i+1;j<words.length;j++){
          cost[i][j] = cost[i][j-1] - words[j].length() - 1;
      }
    }

    // Badness factor is square of the distance
    for(int i=0;i<words.length;i++){
      for(int j=i;j<words.length;j++){
        if(cost[i][j] < 0){
          cost[i][j] = Integer.MAX_VALUE;
        }else{
          cost[i][j] = (int)Math.pow(cost[i][j],2);
        }
      }
    }

    int[] minCost = new int[words.length];
    int[] solution = new int[words.length];
    for(int i=words.length-1;i>=0;i--){
      minCost[i] = cost[i][words.length-1];
      solution[i] = words.length;
      for(int j=words.length-1;j > i;j--){
        if(cost[i][j-1] == Integer.MAX_VALUE){
          continue;
        }
        if(minCost[i] > minCost[j]+cost[i][j-1]){
          minCost[i] = minCost[j]+cost[i][j-1];
          solution[i] = j;
        }
      }
    }

    int i = 0;
    int j;
    StringBuilder s = new StringBuilder();
    do{
      j = solution[i];
      for(int k=i;k<j;k++){
        s.append(words[k]+" ");
      }
      s.append("\n");
      i=j;
    }while(j < words.length);
    System.out.println(s);


    return minCost[0];
  }


  public static void main(String args[]){
    java.util.Scanner scan = new java.util.Scanner(System.in);
    System.out.println("Enter the line width: ");
    int width = scan.nextInt();
    String[] words = {"Tushar", "Roy", "likes", "to", "code"};
    int len = textJustify(words, width);
    System.out.println("The minimum cost of text justification is: "+len);

  }




}
