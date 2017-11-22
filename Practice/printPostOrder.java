public class printPostOrder{

  static int index = 0;
  static int index1 = 0;

  static int search(int[] in, int start, int end, int val){

    for(int i=start;i<=end;i++){
      if(in[i] == val){
        return i;
      }
    }
    return 0;
  }

  static void printPost(int[] in,int start, int end, int[] pre){

      if(start > end){
        return;
      }
      int in_index = search(in, start, end, pre[index++]);
      printPost(in, start, in_index-1,pre); // Construct left subtree
      printPost(in, in_index+1, end, pre); // Construct the right subtree
      System.out.print(in[in_index] + " ");
  }

  private static TreeNode constructTree(int[] in, int[] pre, int start, int end){
    if(start > end){
      return null;
    }
    int root_node_index = search(in, start, end, pre[index1++]);
    TreeNode root = new TreeNode(in[root_node_index]);
    root.left = constructTree(in, pre, start, root_node_index-1);
    root.right = constructTree(in, pre, root_node_index+1, end);
    return root;
  }

  private static void displayTree(TreeNode root){

    if(root != null){
      displayTree(root.left);
      displayTree(root.right);
      System.out.print(root.val + " ");
    }
  }


  public static void main(String args[]){

    int[] in = {4, 2, 5, 1, 3, 6};
    int[] pre = {1, 2, 4, 5, 3, 6};

    printPost(in, 0, pre.length-1, pre);
    System.out.println();
    TreeNode root = constructTree(in, pre, 0, pre.length-1);
    displayTree(root);

  }
}
