public class LCABST{


  private static TreeNode findLCA(TreeNode root, int n1, int n2){
    if(root.val >= n1 && root.val <=n2){
      return root;
    }
    if(root.val < n1 && root.val < n2){
      return findLCA(root.right, n1,n2);
    }else{
      return findLCA(root.left, n1, n2);
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

    TreeNode node = findLCA(root, 10,22);
    System.out.println("Lowest Common Ancestor in BST is: "+node.val);

  }

}
