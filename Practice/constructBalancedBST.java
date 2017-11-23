import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;

public class constructBalancedBST{

  private static TreeNode root;

  private static  ArrayList<Integer> in = new ArrayList<>();
  private static void inOrder(TreeNode root){
    if(root != null){
      inOrder(root.left);
      in.add(root.val);
      inOrder(root.right);
    }
  }


  private static TreeNode constructTree(int start, int end){

      if(start > end){
        return null;
      }
      int mid = (start+end)/2;
      TreeNode root = new TreeNode(in.get(mid));
      root.left = constructTree(start, mid-1);
      root.right = constructTree(mid+1, end);
      return root;
  }

  private static void display(){
    Queue<TreeNode> q = new LinkedList<>();
    q.add(root);
    while(!q.isEmpty()){
      TreeNode curr = q.poll();
      System.out.println(curr.val + " ");
      if(curr.left != null){
        q.add(curr.left);
      }
      if(curr.right != null){
        q.add(curr.right);
      }
    }
  }

  public static void main(String args[]){

    root = new TreeNode(4);
    TreeNode left1 = new TreeNode(3);
    TreeNode left2 = new TreeNode(2);
    TreeNode left3 = new TreeNode(1);
    TreeNode right1 = new TreeNode(5);
    TreeNode right2 = new TreeNode(6);
    TreeNode right3 = new TreeNode(7);

    root.left = left1;
    left1.left = left2;
    left2.left = left3;

    root.right = right1;
    right1.right = right2;
    right2.right = right3;

    // 1. Do inorder traversal
    inOrder(root);

    root = constructTree(0, in.size()-1);

    display();

  }

}
