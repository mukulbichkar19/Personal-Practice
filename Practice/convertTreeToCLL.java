public class convertTreeToCLL{

  private static TreeNode root;
  private static TreeNode prev = null;
  private static TreeNode head;

  private static void convertDLL(TreeNode root){

    if(root == null){
      return;
    }

    convertDLL(root.left);

    if(prev == null){
      head = root;
    }else{
      root.left = prev;
      prev.right = root;
    }
    prev = root;

    convertDLL(root.right);

  }

  private static void display(){
    TreeNode temp = head;
    while(temp.right != head){
      System.out.println(temp.val);
      temp = temp.right;
    }
    System.out.println(temp.val);
  }

  private static void inorder(TreeNode node){
    if(node != null){
      inorder(node.left);
      System.out.println(node.val);
      inorder(node.right);
    }
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


    convertDLL(root);
    // Change the pointers of last linked list node
    head.left = prev;
    prev.right = head;
    display();



  }


}
