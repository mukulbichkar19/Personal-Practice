public class LCAInBST{


  private static TreeNode LCA(TreeNode root, TreeNode p, TreeNode q){

    if(root.val > p.val && root.val > q.val){
      return LCA(root.left, p,q);
    }else if(root.val < p.val && root.val < q.val){
      return LCA(root.right, p,q);
    }
    return root;
  }



  public static void main(String args[]){

    TreeNode root = new TreeNode(6);
    TreeNode left = new TreeNode(2);
    TreeNode right = new TreeNode(8);

    TreeNode left1 = new TreeNode(0);
    TreeNode right1 = new TreeNode(4);

    TreeNode left2 = new TreeNode(3);
    TreeNode right2 = new TreeNode(5);

    TreeNode left3 = new TreeNode(7);
    TreeNode right3 = new TreeNode(9);

    root.left = left;
    root.right = right;

    left.left = left1;
    left.right = right1;

    right.left = left3;
    right.right = right3;

    right1.left = left2;
    right1.right = right2;

    TreeNode lca = LCA(root, left, right1);
    System.out.println("The LCA is: "+lca.val);




  }


}
