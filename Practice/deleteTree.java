public class deleteTree{

  private static TreeNode root;


  private static void deleteTree(TreeNode node){

      if(node == null){
        return;
      }

      deleteTree(node.left);
      deleteTree(node.right);
      System.out.println("The node deleted is: "+node.val);
      node = null;

  }

  private static void display(TreeNode node){

    if(node != null){
      display(node.left);
      System.out.println(node.val);
      display(node.right);
    }
  }



  private static int findMaxHeight(TreeNode root){
    if(root == null){
      return 0;
    }

    int left = findMaxHeight(root.left);
    int right = findMaxHeight(root.right);

    return Math.max(left, right) + 1;

  }


  private static int heightOfTree(TreeNode node){

    if(node == null){
      return 0;
    }

    return 1+heightOfTree(node.left)+heightOfTree(node.right);
  }

  public static void main(String args[]){

    root = new TreeNode(1);
    TreeNode left = new TreeNode(2);
    TreeNode right = new TreeNode(3);
    TreeNode left1 = new TreeNode(4);
    TreeNode right1 = new TreeNode(5);
    TreeNode left2 = new TreeNode(6);
    TreeNode right2 = new TreeNode(7);
    TreeNode left3 = new TreeNode(9);
    TreeNode right3 = new TreeNode(10);

    root.left = left;
    root.right = right;

    left.left = left1;
    left.right = right1;

    right.left = left2;
    right.right = right2;

    right2.left = left3;
    right2.right = right3;

    System.out.println("Before deleting: ");
    display(root);

    System.out.println("Maximum height is: "+findMaxHeight(root));
    System.out.println("Height of tree is: "+heightOfTree(root));

    // deleteTree(root);
    // System.out.println("After deleting: ");
    // root = null;
    // display(root);




  }


}
