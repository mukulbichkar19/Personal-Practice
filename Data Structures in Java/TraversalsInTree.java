import java.util.*;

public class TraversalsInTree{

// Recursive Version

	// PreOrder Traversal takes place in the order DLR
	// Firstly the root or current node is visited and then
	// the left and right children or subtrees are traversed.
	// For the given tree the output should be 
	// 7 1 0 3 2 5 4 6 9 8 10
	public void PreOrderTraversal(BinaryTreeNode root){
		
		if(root!=null){
			System.out.print(root.data+" ");
			PreOrderTraversal(root.left);
			PreOrderTraversal(root.right);
		}
	}

	// InOrder Traversal takes place in the order LDR
	// Firstly the left child or subtree is visited and then
	// the parent and then the right children or subtrees are traversed.
	// For the given tree the output should be 
	// 0 1 2 3 4 5 6 7 8 9 10
	public void inOrderTraversal(BinaryTreeNode root){
		
		if(root!=null){
			
			inOrderTraversal(root.left);
			System.out.print(root.data+" ");
			inOrderTraversal(root.right);
		}
	}

	// PostOrder Traversal takes place in the order LRD
	// Firstly the left child or subtree is visited and then
	// then the right children or subtrees are traversed and lastly the parent
	// For the given tree the output should be 
	// 0 2 4 6 5 3 1 8 10 9
	public void PostOrderTraversal(BinaryTreeNode root){
		
		if(root!=null){
			
			PostOrderTraversal(root.left);
			PostOrderTraversal(root.right);
			System.out.print(root.data+" ");
		}
	}

///////////////// End of Recursive version /////////////////////

// Iterativ Version

public ArrayList<Integer> preOrderIterative(BinaryTreeNode root){

	ArrayList<Integer> sequence = new ArrayList<Integer>();

	if(root == null){
		return sequence;
	}

	Stack<BinaryTreeNode> s = new Stack<BinaryTreeNode>();
	s.push(root);

	while(!s.isEmpty()){

		BinaryTreeNode temp = s.pop();
		sequence.add(temp.data);

		// this order is important
		if(temp.right != null){
			s.push(temp.right);
		}
		if(temp.left != null){
			s.push(temp.left);
		}

	}
	return sequence;

}	


public ArrayList<Integer> inOrderIterative(BinaryTreeNode root){

	ArrayList<Integer> sequence = new ArrayList<Integer>();
	Stack<BinaryTreeNode> s = new Stack<BinaryTreeNode>();
	BinaryTreeNode currentNode = root;
	boolean done = false;
	while(!done){

		if(currentNode != null){
			s.push(currentNode);
			currentNode = currentNode.left;
		}else{
			if(s.isEmpty())
				done = true;
			else{
				currentNode = s.pop();
				sequence.add(currentNode.data);
				currentNode = currentNode.right;
			}
		}
	}
	return sequence;

}	


/*  PostOrder     
1.1 Create an empty stack
2.1 Do following while root is not NULL
    a) Push root's right child and then root to stack.
    b) Set root as root's left child.
2.2 Pop an item from stack and set it as root.
    a) If the popped item has a right child and the right child 
       is at top of stack, then remove the right child from stack,
       push the root back and set root as root's right child.
    b) Else print root's data and set root as NULL.
2.3 Repeat steps 2.1 and 2.2 while stack is not empty.
*/

public ArrayList<Integer> postOrderIterative(BinaryTreeNode root){

	ArrayList<Integer> sequence = new ArrayList<Integer>();
	if(root == null){
		return sequence;
	}
	Stack<BinaryTreeNode> s = new Stack<BinaryTreeNode>();
	s.push(root);
	BinaryTreeNode prev = null;
	
	while(!s.isEmpty()){

		BinaryTreeNode current = s.peek();

		if(prev == null || prev.left == current || prev.right == current){
			//travers from top to bottom and if current has left or right child
			// push it into stack;otherwise pop out
			if(current.left != null){
				s.push(current.left);
			}
			else if(current.right != null){
				s.push(current.left);
			}
		}
		else if(current.left == prev){
			if(current.right!=null)
				s.push(current.right);
		}else{
			sequence.add(current.data);
			s.pop();
		}
		prev = current;
		
	}
	return sequence;

}	


	




	public static void main(String args[]){

		TraversalsInTree tree = new TraversalsInTree();
		BinaryTreeNode root = new BinaryTreeNode(7);
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
		root.setLeft(leftchild1);
		root.setRight(rightchild1);

		leftchild1.setLeft(leftchild2);
		leftchild1.setRight(leftchild3);

		leftchild3.setLeft(leftchild4);
		leftchild3.setRight(leftchild5);

		leftchild5.setLeft(leftchild6);
		leftchild5.setRight(leftchild7);

		rightchild1.setLeft(rightchild2);
		rightchild1.setRight(rightchild3);

		System.out.println("Pre-Order Traversal: ");
		tree.PreOrderTraversal(root);
		System.out.println();

		System.out.println("InOrder Traversal: ");
		tree.inOrderTraversal(root);
		System.out.println();

		System.out.println("PostOrder Traversal: ");
		tree.PostOrderTraversal(root);
		System.out.println();

		System.out.println("Pre Order Traversal (Iteratively): ");
		ArrayList<Integer> res = tree.preOrderIterative(root);
		for(Integer s:res){
			System.out.print(s+" ");
		}
		System.out.println();

		System.out.println("In Order Traversal (Iteratively): ");
		ArrayList<Integer> res1 = tree.inOrderIterative(root);
		for(Integer s:res1){
			System.out.print(s+" ");
		}
		System.out.println();

		System.out.println("PostOrder Traversal (Iteratively): ");
		ArrayList<Integer> res2 = tree.postOrderIterative(root);
		for(Integer s:res2){
			System.out.print(s+" ");
		}
		System.out.println ();















	}
}