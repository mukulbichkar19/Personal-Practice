public class MorrisTraversals{


  private static void inorder(TreeNode root, int k){

    if(root == null){
      return;
    }

    TreeNode curr = root;
    int count = 0;
    while(curr != null){
      if(curr.left == null){
        System.out.print(curr.val + " ");
        // count++;
        // if(count == k){
        //   System.out.print("k th smallest element found: "+curr.val);
        // }
        curr = curr.right;
      }else{
        TreeNode pre = curr.left;
        while(pre.right != null && pre.right != curr){
          pre = pre.right;
        }
        if(pre.right == null){
          pre.right = curr;
          curr = curr.left;
        }else{
          pre.right = null;
          // count++;
          // if(count == k){
          //   System.out.print("k th smallest element found: "+curr.val);
          // }
          System.out.print(curr.val + " ");
          curr = curr.right;
        }
      }
    }
  }


  private static void preorder(TreeNode root){
    if(root == null){
      return;
    }

    TreeNode curr = root;
    while(curr != null){
      if(curr.left == null){
        System.out.print(curr.val + " ");
        curr = curr.right;
      }else{
        TreeNode pre = curr.left;
        while(pre.right != null && pre.right != curr){
          pre = pre.right;
        }
        if(pre.right == null){
          pre.right = curr;
          System.out.print(curr.val + " ");
          curr = curr.left;
        }else{
          pre.right = null;
          curr = curr.right;
        }
      }
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

    inorder(root,5);
    System.out.println();
    preorder(root);
    System.out.println();

  }


}
