public class createFullBinaryFromPrePost{

  private static int preIndex = 0; // Will iterate over the preOrder array

  private static TreeNode constructTree(int[] pre,int[] post, int l, int h, int size){

    // Base Case
    if(preIndex >= size || l > h){
      return null;
    }

    TreeNode root = new TreeNode(pre[preIndex]);
    preIndex++;

    // If there is just one element to recur on in
    // and also if preIndex becomes equal to size after incrementing
    if(l==h || preIndex >= size){
      return root;
    }

    // Iterate over the postIndex array and find
    int i;
    for(i=l;i<=h;i++){
      if(pre[preIndex] == post[i]){
        break;
      }
    }
    if(i<=h){
      root.left = constructTree(pre,post, l, i, size);
      root.right = constructTree(pre, post, i+1, h, size);
    }
    return root;
  }


  private static void inorder_traversal(TreeNode root){
    if(root!=null){
      inorder_traversal(root.left);
      System.out.println(root.val +" ");
      inorder_traversal(root.right);
  }
}


  public static void main(String args[]){

    int[] pre = {1, 2, 4, 8, 9, 5, 3, 6, 7};
    int[] post = {8, 9, 4, 5, 2, 6, 7, 3, 1};
    TreeNode root = constructTree(pre,post, 0, pre.length-1, pre.length);
    inorder_traversal(root);
    System.out.println();




  }



}
