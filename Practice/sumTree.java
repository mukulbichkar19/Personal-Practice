public class sumTree{

  private static TreeNode root;


  private static int dosumTree(TreeNode root){

    if(root == null){
      return 0;
    }

    int new_val = dosumTree(root.left) + dosumTree(root.right);
    int orig_val = root.val;
    root.val = new_val;
    return new_val + orig_val;
  }

  private static void display(TreeNode root){
    if(root !=  null){
      display(root.left);
      System.out.println(root.val);
      display(root.right);
    }
  }


  public static void main(String args[]){

    root = new TreeNode(10);

    TreeNode left1 = new TreeNode(-2);
    TreeNode right1 = new TreeNode(6);
    TreeNode left2 = new TreeNode(8);
    TreeNode right2 = new TreeNode(-4);
    TreeNode left3 = new TreeNode(7);
    TreeNode right3 = new TreeNode(5);

    root.left = left1;
    root.right = right1;

    left1.left = left2;
    left1.right = right2;

    right1.left = left3;
    right1.right = right3;

    dosumTree(root);
    display(root);

  }

}
