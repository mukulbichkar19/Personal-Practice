public class convertTreeToDLL2{

  private static TreeNode root;
  private static TreeNode curr = null;
  private static TreeNode head = null;
  private static void convert(TreeNode root){

    if(root != null){
        convert(root.left);
        if(curr == null){
          curr = root;
          head = root;
        }else{
          curr.right = root;
          root.left = curr;
          curr = root;
        }
        convert(root.right);
    }
  }

  private static void display(){
    TreeNode temp = head;
    while(temp != null){
      System.out.print(temp.val + " --> ");
      temp = temp.right;
    }
    System.out.print("null" + "\n");
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

    convert(root);

    display();





  }


}
