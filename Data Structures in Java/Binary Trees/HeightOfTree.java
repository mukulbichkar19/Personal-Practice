public class HeightOfTree{


  // Recursively calculate the
  public static int findHeight(BinaryTreeNode temp){

    if(temp==null){
      return 0;
    }
    else{
      int left_height = findHeight(temp.left);
      int right_height = findHeight(temp.right);
      if(left_height > right_height){
        return left_height+1;
      }else{
        return right_height+1;
      }
    }



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

    HeightOfTree t = new HeightOfTree();
    System.out.println("The height of tree is "+t.findHeight(root));
  }



}
