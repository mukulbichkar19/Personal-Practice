import java.util.LinkedList;
import java.util.Stack;
public class TernaryExpToTree{


  private static TreeNode convertToTree(String exp){

    char[] array = exp.toCharArray();

    TreeNode root = new TreeNode(array[0]);
    Stack<TreeNode> stack = new Stack<>();
    stack.push(root);
    for(int i=1;i<array.length;i=i+2){

      TreeNode node = new TreeNode(array[i+1]);

      if(array[i] == '?'){
        stack.peek().left = node;
      }

      if(array[i] == ':'){
        stack.pop(); // Pop the current element and find it's ancestor
                     // that has no right child
        while(stack.peek().right != null){
          stack.pop();
        }
        stack.peek().right = node;
      }

      stack.push(node);

    }
    return root;
  }

  private static void display(TreeNode root){
    if(root != null){
      System.out.println((char)root.val);
      display(root.left);
      display(root.right);
    }
  }

  public static void main(String args[]){

    String exp = "a?b:c?d:e";

    display(convertToTree(exp));



  }


}
