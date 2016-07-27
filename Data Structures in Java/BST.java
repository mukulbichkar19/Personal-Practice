public class BST{


	// Insertion in BST (Iterative)
	public BinaryTreeNode insertElement(BinaryTreeNode root, int data){


		BinaryTreeNode current = root;
		

		while(current.getLeft() != null || current.getRight() != null){
			if(current.getData() > data){
				current = current.getLeft();
			}
			else if(current.getData() < data){
				current = current.getRight();
			}
		}
		if(data > current.getData()){
			current.setRight(new BinaryTreeNode(data));
		}
		else if(data < current.getData()){
			current.setLeft(new BinaryTreeNode(data));
		}
		return root;

	}


	// public BinaryTreeNode delete(BinaryTreeNode root, int data){

	// 	if(root == null){
	// 		return root;
	// 	}
	// 	else if(root.getData() < data){
	// 		root.getLeft() = delete(root.getRight(),data);
	// 	}
	// 	else if(root.getData() > data ){
	// 		root.getRight() = delete(root.getLeft(),data);
	// 	}
	// 	else{
	// 		// Element Found
	// 		// Case 1 : leaf node to be deleted.
	// 		if(root.getLeft()==null && root.getRight()==null){
	// 			root = null;
				
	// 		}
	// 		// Case 2 : Only one child
	// 		else if(root.getLeft()==null){
	// 			BinaryTreeNode temp = root;
	// 			root = root.getRight();
	// 			temp = null;
				
	// 		}
	// 		else if(root.getRight()==null){
	// 			BinaryTreeNode temp = root;
	// 			root = root.getLeft();
	// 			temp = null;
				
	// 		}
	// 		// Case 3: With 2 Children
	// 		else{
	// 			BinaryTreeNode temp = FindMin(root.getRight());
	// 			root.data = temp.data;
	// 			root.right = delete(root.right,temp);
	// 		}
	// 	}

	// 	return root;
	// }


	public void inOrderTraversal(BinaryTreeNode root){
		
		if(root!=null){
			
			inOrderTraversal(root.left);
			System.out.print(root.data+" ");
			inOrderTraversal(root.right);
		}
	}

	public BinaryTreeNode LCA(BinaryTreeNode root, BinaryTreeNode a, BinaryTreeNode b){

		if(root == null){
			return root;
		}
		if(root == a || root == b){
			return root;
		}
		if(Math.max(a.getData(),b.getData()) < root.getData()){
			return LCA(root.left,a,b);
		}
		else if(Math.min(a.getData(),b.getData()) > root.getData()){
			return LCA(root.right,a,b);
		}
		else{
			return root;
		}

	}

	public boolean isBST(BinaryTreeNode root,int min,int max){

		if(root == null){
			return true;
		}
		return (root.data > min && root.data < max &&
			     isBST(root.left,min,root.data) && isBST(root.right,root.data,max));



	}
	


	public static void main(String args[]){


		BinaryTreeNode root = new BinaryTreeNode(4);
		BinaryTreeNode leftchild1 = new BinaryTreeNode(2);
		BinaryTreeNode rightchild1 = new BinaryTreeNode(8);
		BinaryTreeNode rightchild2 = new BinaryTreeNode(5);
		BinaryTreeNode rightchild3 = new BinaryTreeNode(7);
		BinaryTreeNode rightchild4 = new BinaryTreeNode(6);
		BinaryTreeNode rightchild5 = new BinaryTreeNode(9);

		root.setLeft(leftchild1);
		root.setRight(rightchild1);

		rightchild1.setLeft(rightchild2);
		rightchild1.setRight(rightchild5);

		rightchild2.setRight(rightchild3);

		rightchild3.setLeft(rightchild4);
		BST tree = new BST();

		/*java.util.Scanner scan = new java.util.Scanner(System.in);
		System.out.println("Enter the data to be inserted: ");
		int data = scan.nextInt();
		tree.insertElement(root,data);
		tree.inOrderTraversal(root);*/

		// Operation Deleting a node in  a tree


		// Finding the LCA
		System.out.println("The LCA is: "); 
		System.out.print(tree.LCA(root,rightchild4,rightchild5).getData());
		System.out.println();
		// Check whether its a BST using O(n) time complex algorithm
		System.out.println(tree.isBST(root,Integer.MIN_VALUE,Integer.MAX_VALUE));





	}
}