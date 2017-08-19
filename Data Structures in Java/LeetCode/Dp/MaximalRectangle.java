import java.util.Stack;
public class MaximalRectangle{

  // Run time: O(n)
  // Space: O(n)
  private static int findMaxAreaInHistogram(int[] hist){
    Stack<Integer> s = new Stack<>();
    int tp = 0;
    int max_area = 0;
    int area_from_tp = 0;
    int i = 0;
    while(i < hist.length){
      if(s.isEmpty() || hist[s.peek()] <= hist[i]){
        s.push(i++);
      }else{
        tp = s.peek();
        s.pop();
        area_from_tp = hist[tp]*(s.isEmpty()?i:(i-s.peek()-1));
        if(area_from_tp > max_area){
          max_area = area_from_tp;
        }
      }
    }

    while(s.isEmpty() == false){
      tp = s.peek();
      s.pop();
      area_from_tp = hist[tp]*(s.isEmpty()?i:(i-s.peek()-1));
      if(area_from_tp > max_area){
        max_area = area_from_tp;
      }
    }
    return max_area;
  }



  private static int findArea(int[][] mat){

    int row = mat.length;
    int col = mat[0].length;
    int[] rowMatrix = new int[col];
    int max_area = 0;
    for(int i=0;i<row;i++){
      for(int j=0;j<col;j++){
        if(mat[i][j] != 0){
          rowMatrix[j] += mat[i][j];
          max_area = Math.max(max_area, findMaxAreaInHistogram(rowMatrix));
        }else if(mat[i][j] == 0){
          rowMatrix[j] = 0;
        }
      }
    }



    return max_area;

  }



  public static void main(String args[]){

      int[][] mat = {{0,1},{1,0}};
      int max_area = findArea(mat);
      //int[] hist = {6,2,5,4,5,1,6};
      System.out.println("Max area is: "+max_area);




  }


}
