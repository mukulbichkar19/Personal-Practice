public class LCABST2{

  private static TreeNode root;

  private static TreeNode findLCA(TreeNode root, TreeNode p, TreeNode q){

      if(root.val > p.val && root.val < q.val){
        return root;
      }

      if(root.val > p.val && root.val > q.val){
        return findLCA(root.left, p,q);
      }

      if(root.val < p.val && root.val < q.val){
        return findLCA(root.right, p,q);
      }
      return null;
  }


  public static void main(String args[]){

    root = new TreeNode(10);

    TreeNode left1 = new TreeNode(12);
    TreeNode right1 = new TreeNode(15);
    TreeNode left2 = new TreeNode(25);
    TreeNode right2 = new TreeNode(30);
    TreeNode left3 = new TreeNode(36);

    root.left = left1;
    root.right = right1;

    left1.left = left2;
    left1.right = right2;

    right1.left = left3;
    TreeNode bst = findLCA(root, left2, left3);
    System.out.println("LCA is : "+bst.val);



  }

}
