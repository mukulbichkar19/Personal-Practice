public class BST{


	// Insertion in BST (Iterative)
	
	


	public static void main(String args[]){


		BinaryTreeNode root = new BinaryTreeNode(4);
		BinaryTreeNode leftchild1 = new BinaryTreeNode(2);
		BinaryTreeNode leftchild2 = new BinaryTreeNode(1);
		BinaryTreeNode leftchild3 = new BinaryTreeNode(3);
		BinaryTreeNode leftchild4 = new BinaryTreeNode(4);
		BinaryTreeNode rightchild1 = new BinaryTreeNode(8);

		root.setLeft(leftchild1);
		root.setRight(rightchild1);

		leftchild1.setLeft(leftchild2);
		leftchild1.setRight(leftchild4);

		leftchild2.setLeft(leftchild3);

		BST tree = new BST();

		java.util.Scanner scan = new java.util.Scanner(System.in);
		System.out.println("Enter the data to be inserted: ");
		int data = scan.nextInt();
		tree.insertElement(root,data);



	}
}