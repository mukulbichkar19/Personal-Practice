public class LowestInBST{

  public static void findMinimum(BinaryTreeNode root){

    if(root.left == null){
      System.out.println(root.data);
      return;
    }

    findMinimum(root.left);

  }

  public static void findMaximum(BinaryTreeNode root){

    if(root.right == null){
      System.out.println(root.data);
      return;
    }

    findMaximum(root.right);

  }

  public static void main(String args[]){

    BinaryTreeNode root = new BinaryTreeNode(20);
    BinaryTreeNode left1 = new BinaryTreeNode(8);
    BinaryTreeNode left2 = new BinaryTreeNode(4);
    BinaryTreeNode left1right1 = new BinaryTreeNode(12);
    BinaryTreeNode left1right1left1 = new BinaryTreeNode(10);
    BinaryTreeNode left1right1right2 = new BinaryTreeNode(14);
    BinaryTreeNode right1 = new BinaryTreeNode(22);
    root.setLeft(left1);
    root.setRight(right1);
    left1.setLeft(left2);
    left1.setRight(left1right1);
    left1right1.setLeft(left1right1left1);
    left1right1.setRight(left1right1right2);

    findMinimum(root);
    findMaximum(root);




  }
}
