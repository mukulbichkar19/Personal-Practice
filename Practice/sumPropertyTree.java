import java.util.Queue;
import java.util.LinkedList;
public class sumPropertyTree{

  private static TreeNode root;


  private static void inOrderDisplay(TreeNode root){

    if(root != null){
      inOrderDisplay(root.left);
      System.out.println(root.val);
      inOrderDisplay(root.right);
    }
  }

  private static int findSum(TreeNode root){

    int left_sum = 0;
    int right_sum = 0;
    if(root==null || (root.left!=null && root.right!=null)){
      return 1;
    }else{

      if(root.left != null){
        left_sum += root.left.val;
      }

      if(root.right != null){
        right_sum += root.right.val;
      }

      if((root.val == left_sum+right_sum) &&
                (findSum(root.left)!=0) &&
                (findSum(root.right)!=0)){
        return 1;
      }else{
        return 0;
      }
    }
  }


  private static int countLeafNodes(TreeNode root){

    if(root == null){
      return 0;
    }else if(root.left == null && root.right == null){
      return 1;
    }
    return countLeafNodes(root.left) + countLeafNodes(root.right);



  }




  public static void main(String args[]){

        root = new TreeNode(10);

        TreeNode left = new TreeNode(8);
        TreeNode right = new TreeNode(2);

        TreeNode left1 = new TreeNode(3);
        TreeNode right1 = new TreeNode(5);

        TreeNode left2 = new TreeNode(2);

        root.left = left;
        root.right = right;

        left.left = left1;
        left.right = right1;

        right.left = left2;


        inOrderDisplay(root);
        if(findSum(root) == 1){
          System.out.println("Follows the sum property");
        }else{
          System.out.println("Does not follow the sum property");
        }


        int leafNodes = countLeafNodes(root);
        System.out.println("The number of leaf nodes are: "+leafNodes);




  }

}
