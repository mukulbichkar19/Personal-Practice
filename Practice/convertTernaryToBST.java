import java.util.Stack;
public class convertTernaryToBST{

  private static TreeNode convert(char[] charArray){

    if(charArray.length == 0){
      return null;
    }
    TreeNode root = new TreeNode(charArray[0]);
    Stack<TreeNode> stack = new Stack<>();
    stack.push(root);
          for(int i=1;i<charArray.length;i+=2){

              TreeNode next_node = new TreeNode(charArray[i+1]);

              if(charArray[i] == '?'){
                stack.peek().left = next_node;
              }

              if(charArray[i] == ':'){
                stack.pop();
                while(stack.peek().right != null){
                  stack.pop();
                }
                stack.peek().right = next_node;
              }
              stack.push(next_node);
          }

          return root;
    }




    private static void printPreorder(TreeNode root){
      if(root != null){
        System.out.println(root.val);
        printPreorder(root.left);
        printPreorder(root.right);
      }
    }





  public static void main(String args[]){

      char[] s = {'1','?','2',':','3'};
      TreeNode root = convert(s);
      printPreorder(root);

  }

}
