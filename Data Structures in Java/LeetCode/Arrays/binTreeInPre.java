// Construct Binary Tree from Inorder and PreOrder Traversal
public class binTreeInPre{

  int preIndex = 0;

  private Node constructTree(int[] in, int[] pre, int inStart, int inEnd) {

    // Base Case for Recursion
    if(inStart > inEnd){
      return null;
    }

    // Create a node
    Node t = new Node(pre[preIndex++]);

    // If only one element left in the divide step
    // i.e. no children exist
    if(inStart == inEnd){
      return t;
    }

    // Else find the index of the element in the inorder array
    int inIndex = find(in, inStart, inEnd, t.data);

    // Using Recursion to construct the left and right sub trees
    t.left = constructTree(in, pre, inStart, inIndex-1);
    t.right = constructTree(in, pre, inIndex+1, inEnd);

    return t;
}

  private static int find(int[] in, int inStart, int inEnd, int elem){
    for(int i=inStart;i<=inEnd;i++){
      if(in[i] == elem){
        return i;
      }
    }
    return -1;
  }

  private static void printTree(Node node){
    if(node == null){
      return;
    }
    printTree(node.left);
    System.out.print(node.data + " ");
    printTree(node.right);
  }



  public static void main(String args[]){
    binTreeInPre b = new binTreeInPre();
    //int[] preOrder = {9,6,3,2,5,8,12,11,15};
    //int[] inOrder = {2,3,5,6,8,9,11,12,15};
    int[] preOrder = {2,1,3,4};
    int[] inOrder = {1,2,3,4};
    Node root = b.constructTree(inOrder, preOrder,0, preOrder.length-1);
    System.out.println("Constructed Binary Tree");
    printTree(root);

  }

}
