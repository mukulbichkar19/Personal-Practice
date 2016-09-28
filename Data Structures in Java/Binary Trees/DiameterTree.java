// Diameter in a Binary Tree are the number of maximum nodes between leaves
// including the leaves

// Algorithm
// 1. Find height of tree recursively
// 2.
public class DiameterTree{

    BinaryTreeNode root;


    public int diameter(BinaryTreeNode root){

      // base case
      if(root == null){
        return 0;
      }
      // get height of left and right subtrees
      int lheight = height(root.left);
      int rheight = height(root.right);

      // get diameter of left and right subtrees
      int ldiameter = diameter(root.left);
      int rdiameter = diameter(root.right);

      // Return max amongst
      // 1. Diameter of left subtree
      // 2. Diameter of right subtree
      // 3. Height of left subtree + height of right subtree + 1

      return Math.max(lheight+rheight+1,Math.max(ldiameter,rdiameter));

    }

    // height
    static int height(BinaryTreeNode node){

          if(node == null){
            return 0;
          }
          return (1+Math.max(height(node.left),height(node.right)));
    }


    public int calculateDiamater(){

        return diameter(root);

    }



  public static void main(String args[]){

    DiameterTree t = new DiameterTree();
    t.root = new BinaryTreeNode(7);
		BinaryTreeNode leftchild1 = new BinaryTreeNode(1);
		BinaryTreeNode leftchild2 = new BinaryTreeNode(0);
		BinaryTreeNode leftchild3 = new BinaryTreeNode(3);
		BinaryTreeNode leftchild4 = new BinaryTreeNode(2);
		BinaryTreeNode leftchild5 = new BinaryTreeNode(5);
		BinaryTreeNode leftchild6 = new BinaryTreeNode(4);
		BinaryTreeNode leftchild7 = new BinaryTreeNode(6);
		BinaryTreeNode rightchild1 = new BinaryTreeNode(9);
		BinaryTreeNode rightchild2 = new BinaryTreeNode(8);
		BinaryTreeNode rightchild3 = new BinaryTreeNode(10);

    t.root.setLeft(leftchild1);
		t.root.setRight(rightchild1);

    t.root.left.setLeft(leftchild2);
    t.root.right.setRight(leftchild3);

		//t.root.leftchild1.setLeft(leftchild2);
		//t.root.leftchild1.setRight(leftchild3);

		t.root.left.left.setLeft(leftchild4);
		t.root.left.left.setRight(leftchild5);

		t.root.left.left.left.setLeft(leftchild6);
		t.root.left.left.left.setRight(leftchild7);

		t.root.left.left.left.left.setLeft(rightchild2);
		t.root.left.left.left.right.setRight(rightchild3);


    System.out.println("The diameter of the tree is: " + t.calculateDiamater());
    System.out.println("height of tree is "+t.height(t.root));

  }

}
