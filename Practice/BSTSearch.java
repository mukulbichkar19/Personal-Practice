public class BSTSearch{


  private static boolean search(TreeNode root, int elem){


    if(root.val == elem){
      return true;
    }

    if(root.val > elem){
      if(root.left != null){
          return search(root.left, elem);
      }
    }

    if(root.val < elem){
      if(root.right != null){
        return search(root.right, elem);
      }
    }

    return false;
  }

  private static TreeNode insertRec(TreeNode root, int key){

    if(root == null){
        root = new TreeNode(key);
        return root;
    }

    if(root.val < key){
      root.right = insertRec(root.right, key);
    }else if(root.val > key){
      root.left = insertRec(root.left, key);
    }

    return root;
  }

  private static void inOrder(TreeNode root){
    if(root!=null){
      inOrder(root.left);
      System.out.print(root.val + " ");
      inOrder(root.right);
    }
  }

  private static TreeNode deleteNode(TreeNode root, int key){

    if(root == null){
      return root;
    }

    if(root.val > key){
      root.left = deleteNode(root.left, key);
    }else if(root.val < key){
      root.right = deleteNode(root.right, key);
    }else{

      // Node with single child
      if(root.left == null){
        return root.right;
      }else if(root.right == null){
        return root.left;
      }

      root.val = minValue(root.right);

      root.right = deleteNode(root.right, root.val);
    }
    return root;
  }

  private static int minValue(TreeNode root){

    int min = root.val;
    while(root.left != null){
      min = root.left.val;
      root = root.left;
    }
    return min;
  }




  public static void main(String args[]){

    /*
                  5
                /  \
               3    8
             /  \  / \
            2   4 7  9
                     \
                     89
    */



    TreeNode root = new TreeNode(5);
    TreeNode left = new TreeNode(3);
    TreeNode right = new TreeNode(8);
    TreeNode left1 = new TreeNode(2);
    TreeNode right1 = new TreeNode(4);
    TreeNode left2 = new TreeNode(7);
    TreeNode right2 = new TreeNode(9);

    root.left = left;
    root.right = right;

    left.left = left1;
    left.right = right1;

    right.left = left2;
    right.right = right2;

    if(search(root, 1)){
      System.out.println("Element present.");
    }else{
      System.out.println("Element not present.");
    }

    // TreeNode node = insertRec(root, 89);
      inOrder(root);
      System.out.println();
    deleteNode(root,2);
    inOrder(root);
    System.out.println();



  }

}
