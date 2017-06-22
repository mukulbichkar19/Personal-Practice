public class rectangleInHistogram{

  private static int largestRectangleArea(int[] heights){
    int max_area = 0;
    int n = heights.length;
    if(heights == null || heights.length==0){
      return max_area;
    }
    // Declare a stack
    java.util.Stack<Integer> stack = new java.util.Stack<>();
    for(int i=0;i<=n;i++){
      int val = (i==n ? 0:heights[i]);
      if(stack.isEmpty() || val >= heights[stack.peek()]){
        stack.push(i);
      }else{
        int tp = stack.pop();
        max_area = Math.max(max_area, heights[tp]*(stack.isEmpty()?i:(i-stack.peek()-1)));
        i--;
      }
  }
  return max_area;
}

  public static void main(String args[]){
    int[] heights = {2,4,0,3,2,5};
    int max_area = largestRectangleArea(heights);
    System.out.println("Max Area is: "+max_area);
  }

}
