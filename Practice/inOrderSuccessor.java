public class inOrderSuccessor{


  private static void printRange(TreeNode root, int k1, int k2){

    if(root == null){
      return;
    }

    if(root.val > k1){
      printRange(root.left, k1,k2);
    }

    if(root.val > k1 && root.val < k2){
      System.out.println(root.val);
    }

    if(root.val < k2){
      printRange(root.right, k1,k2);
    }

  }



  public static void main(String args[]){
    TreeNode root = new TreeNode(20);
    TreeNode left = new TreeNode(8);
    TreeNode right = new TreeNode(22);

    TreeNode left1 = new TreeNode(4);
    TreeNode right1 = new TreeNode(12);

    TreeNode left2 = new TreeNode(10);
    TreeNode right2 = new TreeNode(14);

    root.left = left;
    root.right = right;

    left.left = left1;
    left.right = right1;

    right1.left = left2;
    right1.right = right2;

    int k1 = 10;
    int k2 = 22;
    printRange(root, k1, k2);



  }


}
