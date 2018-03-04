public class constructTreeFromBST{

  private static TreeNode root;

  private static TreeNode constructTree(int[] pre, int low, int high){

    if(low > high){
      return null;
    }

    TreeNode temp = new TreeNode(pre[low]);

    if(low == high){
      return temp;
    }

    int right_subtree = findNextGreater(pre, low, high, temp.val);

    if(right_subtree != -1){
      temp.left = constructTree(pre, low+1, right_subtree-1);
      temp.right = constructTree(pre, right_subtree, high);
    }

    return temp;
  }

  private static int findNextGreater(int[] pre, int low, int high, int elem){
    for(int i=low;i<=high;i++){
      if(pre[i] > elem){
        return i;
      }
    }
    return -1;
  }

  private static void printInOrder(TreeNode t){
    if(t != null){
      printInOrder(t.left);
      System.out.println(t.val + " ");
      printInOrder(t.right);
    }
  }





  public static void main(String args[]){

    int[] preOrder = {10,5,1,7,40,50};

    root = constructTree(preOrder,0, preOrder.length-1);
    printInOrder(root);






  }
}
