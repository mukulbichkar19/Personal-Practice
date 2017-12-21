public class isBST{

  private static int count = 0;

  private static boolean checkForBST(TreeNode root){
    return isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
  }

  private static boolean isBST(TreeNode root, int min, int max){

    if(root == null){
      return true;
    }

    if(root.val < min || root.val > max){
      return false;
    }

    return isBST(root.left, min, root.val) && isBST(root.right, root.val, max);

  }

  private static void secondMax(TreeNode node){
    if(node != null){
      secondMax(node.right);
      count++;
      if(count == 2){
        System.out.println("The second maximum is: "+node.val);
        return;
      }
      secondMax(node.left);
    }
  }



  public static void main(String args[]){

    TreeNode root = new TreeNode(4);
    TreeNode left = new TreeNode(2);
    TreeNode right = new TreeNode(15);
    TreeNode left1 = new TreeNode(1);
    TreeNode right1 = new TreeNode(3);
    TreeNode left2 = new TreeNode(12);

    root.left = left;
    root.right = right;

    left.left = left1;
    left.right = right1;

    right.left = left2;


    if(checkForBST(root)){
      System.out.println("Is a BST");
    }else{
      System.out.println("Not a BST");
    }


    secondMax(root);



  }


}
