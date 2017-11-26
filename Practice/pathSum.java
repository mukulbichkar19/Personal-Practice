public class pathSum{

  private static TreeNode root;

  private static boolean isPossible(TreeNode node, int target){

    //System.out.println(node.val + " and target is: "+target);
    if(node == null){
      return false;
    }else {

        boolean ans = false;
        int subSum = target-node.val;
        if(subSum == 0 && node.left == null && node.right==null){
          return true;
        }

        if(node.left != null){
          ans = ans || isPossible(node.left, subSum);
        }

        if(node.right != null){
          ans = ans || isPossible(node.right, subSum);
        }

        return ans;
    }

  }

  private static void inOrder(TreeNode root){
    if(root != null){
      inOrder(root.left);
      System.out.println(root.val);
      inOrder(root.right);
    }
  }

  private static int heightOfTree(TreeNode root){

    if(root == null){
      return 0;
    }
    return 1+ Math.max(heightOfTree(root.left),heightOfTree(root.right));
  }

  private static boolean isBalanced(TreeNode node){

    int lh;
    int rh;

    if(node == null){
      return true;
    }

    lh = heightOfTree(root.left);
    rh = heightOfTree(root.right);

    if(Math.abs(lh-rh)<=1 && isBalanced(node.left) && isBalanced(node.right)){
      return true;
    }


    return false;

  }



  public static void main(String args[]){

      root = new TreeNode(1);
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

      left1.left = right2;

      int target = 14;
      inOrder(root);
      // Height Balanced Tree
      // if
      //System.out.println(heightOfTree(root.right));
      if(isBalanced(root)){
        System.out.println("Is height balanced tree");
      }else{
        System.out.println("Not a height balanced tree");
      }
      // inOrder(root);
      // if(isPossible(root, target)){
      //   System.out.println("Path exists");
      // }else{
      //   System.out.println("Path does not exist");
      // }

  }

}
