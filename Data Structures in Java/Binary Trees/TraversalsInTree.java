import java.util.*;

public class TraversalsInTree{


	/*
			   			Tree Structure

			  root -->	  7
			   			  |
		       ------------------------
		       |	   			      |
		       1                      9
               |                      |
		--------------            ----------
		|            |            |        |
        0            3            8        10
                     |
                -----------
                |         |
				2         5
                          |
                    --------------
                    |            |
                    4            6

	*/

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

// Iterative Version

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

// Level Order Traversal
public ArrayList<ArrayList<Integer>> levelOrderIterative(BinaryTreeNode root){
	ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
	if(root == null){
		return res;
	}
	Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();
	q.offer(root);
	q.offer(null);

	ArrayList<Integer> curr = new ArrayList<Integer>();
	while(!q.isEmpty()){
		BinaryTreeNode tmp = q.poll();
		if(tmp!=null){
			curr.add(tmp.data);
			if(tmp.left != null){
				q.offer(tmp.left);
			}
			if(tmp.right != null){
				q.offer(tmp.right);
			}
		}else{
			ArrayList<Integer> c_curr = new ArrayList<Integer>(curr);
			res.add(c_curr);
			curr.clear();
			if(!q.isEmpty()){
				q.offer(null);
			}
		}
	}
	return res;
}


// Level Order Easy Way Using Queue
public void levleOrderUsingQueue(BinaryTreeNode root){


		Queue<BinaryTreeNode> queue = new LinkedList<BinaryTreeNode>();
		queue.offer(root);
		while(!queue.isEmpty()){
			BinaryTreeNode tempNode = queue.poll();
			System.out.print(tempNode.data+" ");

			if(tempNode.left != null){
				queue.add(tempNode.left);
			}

			if(tempNode.right!=null){
				queue.add(tempNode.right);
			}
		}
	}

// Maximum in a tree recursion

	 public int MaxValue(BinaryTreeNode root){

	 	int maxValue = Integer.MIN_VALUE;

	 	if(root!=null){
	 		int leftMax = MaxValue(root.left);
	 		int rightMax = MaxValue(root.right);

	 		if(leftMax > rightMax){
	 			maxValue = leftMax;
	 		}
	 		else{
	 			maxValue = rightMax;
	 		}
	 		if(root.data > maxValue)
	 			maxValue = root.data;
	 	}
	 	return maxValue;





	 }

	 // Finding Max Iterative
	 public int MaxValueIterative(BinaryTreeNode root){

	 		if(root==null){
	 			return -1;
	 		}
	 		int max = Integer.MIN_VALUE;
	 		Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();
	 		q.offer(root);
	 		while(!q.isEmpty()){

	 			BinaryTreeNode temp2 = q.poll();
	 			if(temp2.data > max){
	 				max = temp2.getData();
	 			}
	 			if(temp2.left != null){
	 				q.offer(temp2.getLeft());
	 			}
	 			if(temp2.right != null){
	 				q.offer(temp2.getRight());
	 			}
	 		}

	 		return max;




	 }

	 // Search Recursive
	 public static boolean searchRecursive(BinaryTreeNode root, int data){

	 	if(root == null){
	 		return false;
	 	}
	 	if(root.getData() == data){
	 		return true;
	 	}
	 	return searchRecursive(root.left,data) || searchRecursive(root.right,data);
	 }

	 // Search Iterative
	 public boolean searchIterative(BinaryTreeNode root,int data){

	 	Queue<BinaryTreeNode> queue = new LinkedList<BinaryTreeNode>();
	 	queue.offer(root);
	 	while(!queue.isEmpty()){

	 		BinaryTreeNode temp3 = queue.poll();
	 		if(temp3.data == data){
	 			return true;
	 		}
	 		if(temp3.right != null){
	 			queue.offer(temp3.right);
	 		}
	 		if(temp3.left != null){
	 			queue.offer(temp3.left);
	 		}

	 	}

	 	return false;
	 }

	 public BinaryTreeNode insertIteratively(BinaryTreeNode root,int data){


	 	BinaryTreeNode node = new BinaryTreeNode(data);
	 	if(root == null){
	 		return node;
	 	}
	 	BinaryTreeNode parent = null, current = root;
	 	while(current != null){
	 		parent = current;
	 		if(current.getData() < data){
	 			current = current.right;
	 		}
	 		else
	 		{
	 			current = current.left;
	 		}
	 	}

	 	if(data > parent.data){
	 		parent.right = node;
	 	}else{
	 		parent.left = node;
	 	}

	 	return root;



	 }

	 // Insert in a BST Recursive
	 public static void insertRecursively(BinaryTreeNode root,int data){
	 	/*return insertRecurseHelper(root,new BinaryTreeNode(data));*/
	 	if(data < root.data){
	 		if(root.left!=null){
	 			insertRecursively(root.left,data);
	 		}
	 		else{
	 			root.left = new BinaryTreeNode(data);
	 		}
	 	}
	 	else if(data > root.data){
	 		if(root.right!=null){
	 			insertRecursively(root.right,data);
	 		}
	 		else{
	 			root.right = new BinaryTreeNode(data);
	 		}
	 	}





	 }

	 /*public BinaryTreeNode insertRecurseHelper(BinaryTreeNode root,BinaryTreeNode newNode){

	 	if(root == null){
	 		return newNode;
	 	}
	 	else if(newNode.data < root.getData()){
	 		root.left = insertRecurseHelper(root.left,newNode);
	 	}
	 	else if(newNode.data > root.getData()){
	 		root.right = insertRecurseHelper(root.right,newNode);
	 	}

	 	return root;



	 }

*/
	 // Recursive Size
	 public int size(BinaryTreeNode root){
	 	int leftCount = root.left==null ? 0 : size(root.left);
	 	int rightCount = root.right == null ? 0 : size(root.right);
	 	return leftCount+rightCount+1;
	 }

	 public int sizeIterative(BinaryTreeNode root){
	 	int count = 0;
	 	Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();
	 	q.offer(root);
	 	while(!q.isEmpty()){
	 		BinaryTreeNode temp4 = q.poll();
	 		count++;
	 		if(temp4.right!=null){
	 			q.offer(temp4.right);
	 		}
	 		if(temp4.left!=null){
	 			q.offer(temp4.left);
	 		}
	 	}
	 	return count;

	}

	public void reverseTree(BinaryTreeNode root){

		Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();
		Stack<BinaryTreeNode> stack = new Stack<BinaryTreeNode>();
		q.offer(root);
		while(!q.isEmpty()){
			BinaryTreeNode temp5 = q.poll();

			if(temp5.right != null)
			{
				q.offer(temp5.right);
			}

			if(temp5.left != null){
				q.offer(temp5.left);
			}
			stack.push(temp5);
		}
		while(!stack.isEmpty()){

			System.out.print(stack.pop().getData()+" ");
		}
	}

	// Height of a Tree Recursive
	public static int heightOfTree(BinaryTreeNode root){

		if(root == null){
			return 0;
		}

		int leftDepth = heightOfTree(root.left);
		int rightDepth = heightOfTree(root.right);
		return (leftDepth>rightDepth) ? leftDepth+1:rightDepth+1;


	}

	// Height of a Tree Iterative (Maximum)
	public int heightOfTreeIterative(BinaryTreeNode root){

		Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();
		q.offer(root);
		q.offer(null);
		int count = 1;
		while(!q.isEmpty()){

			BinaryTreeNode current = q.poll();
			if(current!=null){

				// Use this condition for Minimum Depth
				/*if(current.left==null && current.right==null){
					return count;
				}*/
				if(current.right != null){
					q.offer(current.right);
				}
				if(current.left != null){
					q.offer(current.left);
				}

			}
			else{
				if(!q.isEmpty()){
					count++;
					q.offer(null);

				}
			}


		}


		return count;
	}

	// Leaf Nodes are the one which do not have a left or right child is null
	public int noOfLeafNodes(BinaryTreeNode root){
		int count = 0;
		Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();
		if(root == null){
			return count;
		}
		q.offer(root);
		while(!q.isEmpty()){
			BinaryTreeNode t = q.poll();
			if(t.left == null && t.right == null){
				count++;
			}
			if(t.left != null){
				q.offer(t.left);
			}
			if(t.right != null){
				q.offer(t.right);
			}
		}
		return count;

	}


	// Full Nodes are the one which have both left or right children
	public int noOfFullNodes(BinaryTreeNode root){
		int count = 0;
		Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();
		if(root == null){
			return count;
		}
		q.offer(root);
		while(!q.isEmpty()){
			BinaryTreeNode t = q.poll();
			if(t.left != null && t.right != null){
				count++;
			}
			if(t.left != null){
				q.offer(t.left);
			}
			if(t.right != null){
				q.offer(t.right);
			}
		}
		return count;

	}


	public int levelWithMaxSum(BinaryTreeNode root){

		int count = 1;
		int sum = 0;
		int max = 0;
		int level = 0;
		Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();
		q.offer(root);
		q.offer(null);
		while(!q.isEmpty()){

			BinaryTreeNode current = q.poll();

			if(current != null){

				sum+=current.getData();
				if(current.left != null){
					q.offer(current.left);
				}
				if(current.right != null){
					q.offer(current.right);
				}
			}
			else{

				if(sum > max){
					max = sum;
					level = count;
				}
				sum = 0;
				if(!q.isEmpty()){
					count++;
					q.offer(null);
				}
			}
		}
		//System.out.println(level);
		return max;

	}

	// To check if path exists with given value
	public boolean isPath(BinaryTreeNode root,int sum){

		if(root == null){
			return false;
		}
		if(root.left==null && root.right==null && root.data == sum){
			return true;
		}
		else{
			return isPath(root.left,sum-root.data) || isPath(root.right,sum-root.data);
		}


	}


	// Mirroring a Binary tree

	public BinaryTreeNode getMirror(BinaryTreeNode root){

		BinaryTreeNode temp;
		if(root != null){

			getMirror(root.left);
			getMirror(root.right);
			temp = root.left;
			root.left = root.right;
			root.right = temp;


		}
		return root;
	}

	// LCA
	public static BinaryTreeNode lca(BinaryTreeNode root,int n1,int n2){

		BinaryTreeNode left,right;
		if(root == null){
			return root;
		}
		if(root.getData() == n1 || root.getData() == n2 ){
			return root;
		}
		left = lca(root.left,n1,n2);
		right = lca(root.right,n1,n2);
		if(left!=null && right!=null){
			return root;
		}else{
			return (left != null ? left:right);
		}

	}










	/*public BinaryTreeNode getPreOrderSuccessor(BinaryTreeNode root){

		BinaryTreeNode p = root;
		Stack<BinaryTreeNode> stack = new Stack<BinaryTreeNode>();
		if(root != null){
			p = root;
		}
		else{
			return p;
		}
		if(p.getLeft() != null){
			stack.push(p);
			p = p.getLeft();
		}
		else{
			while(p.getRight() == null){
				p=stack.pop();
			}
			p=p.getRight();
		}
		return p;



	}*/


   // InOrder Successor
   public BinaryTreeNode getInOrderSuccessor(BinaryTreeNode root,BinaryTreeNode node){

   	if(node.right != null){
   		return getMinValue(node.right);
   	}

   	BinaryTreeNode succ = null;

   	while(root != null){

   		if(node.getData() < root.getData()){
   			succ = root;
   			root = root.getLeft();
   		}
   		else if(node.getData() > root.getData()){
   			root = root.getRight();
   		}
   		else
   			break;
   	}
   	return succ;

   }

   public BinaryTreeNode getMinValue(BinaryTreeNode node){

   		BinaryTreeNode current = node;

   		while(current.getLeft() != null){
   			current = current.getLeft();
   		}

   		return current;

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

		// Tree Structure 2
		/*BinaryTreeNode root = leftchild1;
		leftchild1.setLeft(leftchild4);
		leftchild1.setRight(leftchild3);

		leftchild4.setLeft(leftchild6);
		leftchild4.setRight(leftchild5);

		leftchild3.setLeft(leftchild7);
		leftchild3.setRight(new BinaryTreeNode(7));
*/

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

		System.out.println("Level Order Traversal (Iteratively): ");
		ArrayList<ArrayList<Integer>> res3 = tree.levelOrderIterative(root);
		for(ArrayList<Integer> s:res3){
			for(Integer p:s)
			System.out.print(p+" ");
		}
		System.out.println ();

		System.out.println("Max in a Tree Recursive :");
		System.out.println(tree.MaxValue(root));

		System.out.println("Max in a Tree Iterative :");
		System.out.println(tree.MaxValueIterative(root));

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the data you want to search: ");
		int data = scan.nextInt();
		if(searchRecursive(root,data)){
			System.out.print("Element is present.");
		}
		else{
			System.out.print("Element is not present");
		}
		if(tree.searchIterative(root,data)){
			System.out.print("\nElement is present. (Iterative)");
		}
		else{
			System.out.print("\nElement is not present. (Iterative)");
		}

		// Insertion in a BST
		/*System.out.println();
		System.out.println("Enter the data for Insertion: ");
		data = scan.nextInt();
		*/

		tree.levleOrderUsingQueue(tree.insertIteratively(root,data));

		System.out.println();
		tree.insertRecursively(root,data);
		tree.levleOrderUsingQueue(root);

		System.out.println();
		System.out.println("Size of Tree is: ");
		System.out.print(tree.size(root));

		System.out.println();
		System.out.println("Size of Tree Iterative is: ");
		System.out.print(tree.sizeIterative(root));

		/*System.out.println();
		System.out.println("Reverse of the tree is: ");
		tree.reverseTree(root);*/

		System.out.println();
		System.out.println("Height of the tree (Recursive) is: ");
		System.out.println(heightOfTree(root));

		System.out.println();
		System.out.println("Height of the tree (Iterative) is: ");
		System.out.println(tree.heightOfTreeIterative(root));


		System.out.println();
		System.out.println("Count of Leaf Nodes (Iterative) is: ");
		System.out.println(tree.noOfLeafNodes(root));



		System.out.println();
		System.out.println("Count of Full Nodes (Iterative) is: --> ");
		System.out.println(tree.noOfFullNodes(root));

		System.out.println();
		System.out.println("The level that contains maximum sum branch is : --> ");
		System.out.println(tree.levelWithMaxSum(root));

		/*System.out.println("Enter the data you want: ");
		data = scan.nextInt();
		if(tree.isPath(root,data)){
			System.out.println("There exists a path.");
		}
		else{
			System.out.println("There is no such path.");
		}
*/
		//tree.inOrderTraversal(tree.getMirror(root));

		// Lowest Common Ancestor
		System.out.println();
		System.out.println("Enter the first node: ");
		data = scan.nextInt();
		System.out.println("Enter the second node: ");
		int data2 = scan.nextInt();
		System.out.println("The LCA is: ");
		System.out.println(lca(root,data,data2).getData());


		// Getting Preorder successor of a node. (Important Question)
		//System.out.println(tree.getPreOrderSuccessor(leftchild5).getData());

		// Getting InOrder Successor of a node. (Important Question)
		System.out.println("The InOrder Successor is: ");
		//System.out.println("The left is "+leftchild1.left.data+" and right is "+leftchild1.right.data);
		System.out.println(tree.getInOrderSuccessor(root,leftchild3).getData());


























	}
}
