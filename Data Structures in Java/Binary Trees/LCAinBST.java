public class LCAinBST{

  private static BinaryTreeNode lca(BinaryTreeNode node, int n1, int n2){
    if(node == null){
      return null;
    }
    if(node.data > n1 && node.data > n2){
      return lca(node.left,n1,n2);
    }
    if(node.data < n1 && node.data < n2){
      return lca(node.right,n1,n2);
    }
    return node;
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

    java.util.Scanner scan = new java.util.Scanner(System.in);
    System.out.println("Enter the first number: ");
    int n1 = scan.nextInt();
    System.out.println("Enter the second number: ");
    int n2 = scan.nextInt();
    BinaryTreeNode t = lca(root,n1,n2);
    System.out.println("LCA of " + n1 + " and " + n2 + " is " + t.data);







  }
}
