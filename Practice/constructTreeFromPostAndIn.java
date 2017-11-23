public class constructTreeFromPostAndIn{


  private static TreeNode buildTreeUtil(int[] in, int[] post, int inStrt, int inEnd, Index pIndex){

    if(inStrt > inEnd){
      return null;
    }

    TreeNode root = new TreeNode(post[pIndex.index]);
    (pIndex.index)--;
    if(inStrt == inEnd){
      return root;
    }

    int iIndex = search(in,inStrt, inEnd,root.val);

    root.right = buildTreeUtil(in, post, iIndex+1, inEnd, pIndex);
    root.left = buildTreeUtil(in, post, inStrt, iIndex-1, pIndex);

    return root;
  }

  private static int search(int[] inorder, int start, int end, int val){
    int i;
    for(i=start;i<=end;i++){
      if(inorder[i] == val){
        break;
      }
    }
    return i;
  }


  private static TreeNode buildTree(int[] in, int[] post, int n){

    Index pIndex = new Index();
    pIndex.index = n-1;
    //index = n-1;
    return buildTreeUtil(in, post, 0, n-1, pIndex);

  }

  private static void display(TreeNode root){
    if(root != null){
      System.out.println(root.val);
      display(root.left);
      display(root.right);
    }
  }

  public static void main(String args[]){

      int[] in = {4, 8, 2, 5, 1, 6, 3, 7};
      int[] post = {8, 4, 5, 2, 6, 7, 3, 1};
      TreeNode root = buildTree(in, post, post.length);
      display(root);




  }




}
