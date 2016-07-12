public class BinaryTreeNode{

	public int data;
	public BinaryTreeNode right;
	public BinaryTreeNode left;

	public BinaryTreeNode(int data){
		this.data = data;
		right = null;
		left = null;
	}

	//Setter
	public void setData(int data){
		this.data = data;
	}

	public void setLeft(BinaryTreeNode left){
		this.left = left;
	}

	public void setRight(BinaryTreeNode right){
		this.right = right;
	}



	// Getters
	public int getData(){
		return this.data;
	}

	public BinaryTreeNode getLeft(){
		return this.left;
	}

	public BinaryTreeNode getRight(){
		return  this.right;
	}



	



}