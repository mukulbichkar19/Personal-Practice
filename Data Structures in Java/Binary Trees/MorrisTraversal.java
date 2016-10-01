public class MorrisTraversal{

  BinaryTreeNode root;


  public void morrisTraverse(BinaryTreeNode node){

    BinaryTreeNode predecessor;
    BinaryTreeNode current;

    current = root;
    while(current != null){
      // If there is no left subtree
      // Just output the data and make current as current right
      if(current.left == null){
        System.out.print(current.data + " ");
        current = current.right;
      }
      else{
        //find the predecessor
        predecessor = current.left;
        //To find predecessor keep going right till right node is not null  or right node is not current
        while(predecessor.right != current && predecessor.right != null){
          predecessor = predecessor.right;
        }
        // if right is null then go left after establishing link from predecessor  to current
        if(predecessor.right == null){
          predecessor.right = current;
          current = current.left;
        }
        //left is already visited and go right after visiting current.
        else{
            predecessor.right = null;
            System.out.print(current.data + " ");
            current = current.right;
        }


      }

    }




  }

  public static void levelordertraversal(BinaryTreeNode root){
    java.util.Queue<Integer> q = new java.util.LinkedList<Integer>();
    //q.offer();
  }





  public static void main(String args[]){

    MorrisTraversal t =new MorrisTraversal();
    t.root = new BinaryTreeNode(1);
    BinaryTreeNode leftchild1 = new BinaryTreeNode(2);
    BinaryTreeNode leftchild2 = new BinaryTreeNode(4);
    BinaryTreeNode leftchild3 = new BinaryTreeNode(5);
    BinaryTreeNode leftchild4 = new BinaryTreeNode(2);
    BinaryTreeNode leftchild5 = new BinaryTreeNode(5);
    BinaryTreeNode leftchild6 = new BinaryTreeNode(4);
    BinaryTreeNode leftchild7 = new BinaryTreeNode(6);
    BinaryTreeNode rightchild1 = new BinaryTreeNode(3);
    BinaryTreeNode rightchild2 = new BinaryTreeNode(8);
    BinaryTreeNode rightchild3 = new BinaryTreeNode(10);

    t.root.setLeft(leftchild1);
    t.root.setRight(rightchild1);

    t.root.left.left = leftchild2;
    t.root.left.right = leftchild3;

    //leftchild3.setLeft(leftchild4);
    //leftchild3.setRight(leftchild5);

    //leftchild5.setLeft(leftchild6);
    //leftchild5.setRight(leftchild7);

    //rightchild1.setLeft(rightchild2);
    //rightchild1.setRight(rightchild3);

    //levelordertraversal(root);
    t.morrisTraverse(t.root);



  }


}
