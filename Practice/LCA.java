import java.util.List;
import java.util.ArrayList;
public class LCA{

  private static List<TreeNode> path = new ArrayList<>();

  private static void display(TreeNode root){
    if(root != null){
      display(root.left);
      System.out.println(root.val);
      display(root.right);
    }
  }


  /*
             1
          2     3
        4  5   6  7

  */

  private static TreeNode findPath(TreeNode root, int n1, int n2){

    if(root == null){
      return root;
    }

    if(root.val == n1 || root.val == n2){
      return root;
    }

    TreeNode left = findPath(root.left, n1, n2);
    TreeNode right = findPath(root.right, n1, n2);

    if(left!=null && right!=null){
      return root;
    }

    if(left==null && right==null){
      return null;
    }

    return left!=null?left:right;
  }

  private static int findLevel(TreeNode root, int n1, int level){

    if(root == null){
      return -1;
    }

    if(root.val == n1){
      return level;
    }

    int left = findLevel(root.left, n1, level+1);
    if(left == -1){
      return findLevel(root.right, n1, level+1);
    }
    return left;
  }


  private static int findDistance(TreeNode root, int n1, int n2){

    // Find the LCA
    TreeNode lca = findPath(root, n1,n2);

    int d1 = findLevel(lca, n1, 0);
    int d2 = findLevel(lca, n2, 0);
    return d1+d2;

  }

  public static void main(String args[]){


    TreeNode root = new TreeNode(1);
    TreeNode left = new TreeNode(2);
    TreeNode right = new TreeNode(3);
    TreeNode left1 = new TreeNode(4);
    TreeNode right1 = new TreeNode(5);
    TreeNode left2 = new TreeNode(6);
    TreeNode right2 = new TreeNode(7);

    root.left = left;
    root.right = right;

    left.left = left1;
    left.right = right1;

    right.left = left2;
    right.right = right2;

    //display(root);
    TreeNode res = findPath(root, 2,4);
    System.out.println("The LCA is: "+res.val);
    int d = findDistance(root, 3,5);
    System.out.println("The distance is: "+d);



  }

}
