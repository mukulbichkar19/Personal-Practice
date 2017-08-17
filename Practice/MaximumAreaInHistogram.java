import java.util.*;

public class MaximumAreaInHistogram{


  // Brute Force
  // Time Complexity: O(n^2)
  // Space: O(1)
  private static int findArea(int[] hist){
    int max_area = -1;
    int n = hist.length;
    for(int i=0;i<n;i++){
      int local_area = hist[i];
      int j = i+1;
      int k = i-1;
      int min = hist[i];
      // Iterate forward till you encounter something greater
      while(j<n && hist[j] > hist[i]){
        j++;
      }
      // Iterate backwards till you encounter something smaller
      while(k>=0 && hist[k] > hist[i]){
        k--;
      }
      local_area = min*(j-k-1);
      if(local_area > max_area){
        max_area = local_area;
      }
    }
    return max_area;
  }

  // Stack Based Solution
  // Time Complexity: O(n)
  // Space: O(n)
  private static int findAreaUsingStack(int[] hist){

    int top = 0;
    int max_area = 0;
    int i = 0;
    int n = hist.length;
    int area_with_top = 0;
    Stack<Integer> s = new Stack<>();
    while(i < n){
      if(s.isEmpty() || hist[i] >= hist[s.peek()]){
        s.push(i++);
      }else{
        top = s.peek();
        s.pop();
        area_with_top = hist[top]*(s.isEmpty()?i:(i-s.peek()-1));
        if(area_with_top > max_area){
          max_area = area_with_top;
        }
      }
    }

    while(s.isEmpty() == false){
      top = s.peek();
      s.pop();
      area_with_top = hist[top]*(s.isEmpty()?i:(i-s.peek()-1));
      if(area_with_top > max_area){
        max_area = area_with_top;
      }
    }

    return max_area;


  }


  public static void main(String args[]){

    int[] hist = {6,2,5,4,5,1,6};
    // Brute Force Solution
    int area = findArea(hist);
    System.out.println("Maximum area in a rectangle is: "+area);
    // Optimized Using Stack
    int max_area = findAreaUsingStack(hist);
    System.out.println("Maximum area in a rectangle using stack is: "+max_area);





  }



}
