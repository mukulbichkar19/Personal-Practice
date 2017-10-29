public class TreeTraversals{

  static TreeNode root = null;

  private static void inOrder(TreeNode root){
    if(root == null){
      return;
    }
    inOrder(root.left);
    System.out.print(root.data + " ");
    inOrder(root.right);


  }


  private static void preOrder(TreeNode root){
      if(root != null){
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
      }

  }

  private static void postOrder(TreeNode root){
    if(root != null){
      postOrder(root.left);
      postOrder(root.right);
      System.out.print(root.data + " ");
    }
  }

  private static void insert(TreeNode root, TreeNode to_be_inserted){

    TreeNode y = null;
    TreeNode x = root;
    while(x != null){
      y = x;
      if(to_be_inserted.data > x.data){
        x = x.right;
      }else{
        x = x.left;
      }
    }
    // Tree absent
    if(y == null){
      root = to_be_inserted;
    }else if(to_be_inserted.data > y.data){
      y.right = to_be_inserted;
    }else {
      y.left = to_be_inserted;
    }
  }


  public static void main(String args[]){

    root = new TreeNode(5);
    TreeNode left_root = new TreeNode(2);
    TreeNode left_left_child = new TreeNode(1);
    TreeNode left_right_child = new TreeNode(3);

    TreeNode right_root = new TreeNode(9);
    TreeNode right_left_child = new TreeNode(7);
    TreeNode right_right_child = new TreeNode(11);

    root.left = left_root;
    root.right = right_root;

    left_root.left = left_left_child;
    left_root.right = left_right_child;

    right_root.left = right_left_child;
    right_root.right = right_right_child;
/*
    // InOrder TreeTraversals
    // LDR
    inOrder(root);
    System.out.println("End of InOrder");
    // PreOrder Tree TreeTraversals
    // DLR
    //preOrder(root);
    System.out.println("End of preOrder");
    // PostOrder Tree TreeTraversals
    // LRD
    postOrder(root);
    System.out.println("End of postOrder");*/

    // Insert into a Tree
    TreeNode new_right = new TreeNode(8);
    TreeNode new_left = new TreeNode(4);
    insert(root, new_left);
    System.out.println("After insertion");
    inOrder(root);



  }


}
