public class printCommonNodesFromRoot{

  private static int count = 0;
  private static boolean printAncestors(TreeNode root, int value){

    if(root == null){
      return false;
    }

    if(root.val == value){
      return true;
    }

    if(printAncestors(root.left, value) || printAncestors(root.right, value)){
      System.out.println(root.val);
      return true;
    }

    return false;
  }


  private static TreeNode LCA(TreeNode root, int n1, int n2){

    if(root == null){
      return root;
    }

    if(root.val == n1 || root.val == n2){
      return root;
    }

    TreeNode left = LCA(root.left, n1, n2);
    TreeNode right = LCA(root.right, n1, n2);

    if(left != null && right!=null){
      return root;
    }

    if(left==null && right==null){
      return null;
    }

    return left!=null?left:right;
  }


  private static void countLeaves(TreeNode root){

    if(root != null){
      countLeaves(root.left);
      countLeaves(root.right);
    }else{
      count++;
    }

  }


  public static void main(String args[]){

    TreeNode root = new TreeNode(1);
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

    TreeNode ancestor = LCA(root, 4,7);
    printAncestors(root,ancestor.val);
    System.out.println(ancestor.val);
    countLeaves(root);
    System.out.println("count of leaves is: "+count/2);

  }


}
