import java.util.Queue;
import java.util.LinkedList;

public class mirrorTree{

  private static TreeNode root;

  private static void display(TreeNode root){
    if(root != null){
      display(root.left);
      System.out.println(root.val);
      display(root.right);
    }
  }

  private static void createMirror(TreeNode root){
    Queue<TreeNode> q = new LinkedList<>();
    q.add(root);
    while(!q.isEmpty()){
      TreeNode curr = q.poll();
      TreeNode left=null, right = null;
      if(curr.left != null){
        left = curr.left;
        q.add(left);
      }
      if(curr.right != null){
        right = curr.right;
        q.add(right);
      }
      curr.left = right;
      curr.right = left;
    }
  }



  public static void main(String args[]){
    root = new TreeNode(1);
    TreeNode left = new TreeNode(3);
    TreeNode right = new TreeNode(2);

    root.left = left;
    root.right = right;

    right.left = new TreeNode(5);
    right.right = new TreeNode(4);
    display(root);
    System.out.println("After swapping: ");
    createMirror(root);
    display(root);



  }

}
