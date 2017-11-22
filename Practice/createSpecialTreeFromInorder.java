public class createSpecialTreeFromInorder{

  private static TreeNode root;
  private static int findMax(int[] in, int l, int h){

    int max = in[l];
    int index = l;
    for(int i=l+1;i<=h;i++){
      if(in[i] > max){
        max = in[i];
        index = i;
      }
    }
    return index;
  }
  private static TreeNode constructTree(int[] in, int l, int h){

    // Base Case
    if(l > h){
      return null;
    }
    int root_index = findMax(in, l, h);
    TreeNode root = new TreeNode(in[root_index]);
    root.left = constructTree(in, l, root_index-1);
    root.right = constructTree(in, root_index+1, h);
    return root;
  }

  private static void createNode(int[] parent, int i, TreeNode[] created){

    if(created[i] != null){
      return;
    }

    created[i] = new TreeNode(i); //Create a treenode inside created

    if(parent[i] ==  -1){
      root = created[i];
      return;
    }

    // If parent is not created then create parent
    if(created[parent[i]] == null){
      createNode(parent, parent[i], created);
    }

    TreeNode p = created[parent[i]];

    if(p.left == null){
      p.left = created[i];
    }else{
      p.right = created[i];
    }
  }


  private static void createTree(int[] parent){

    TreeNode[] created = new TreeNode[parent.length];
    for(int i=0;i<created.length;i++){
      created[i] = null;
    }

    for(int i=0;i<created.length;i++){
      createNode(parent, i, created);
    }

  }



  private static void display(TreeNode root){
    if(root != null){
      display(root.left);
      System.out.println(root.val);
      display(root.right);
    }
  }

  public static void main(String args[]){

    // int[] inorder = {1, 5, 10, 40, 30, 15, 28, 20};
    // TreeNode root = constructTree(inorder, 0, inorder.length-1);
    // display(root);
    //

    // Creating a tree from parent array where the value is index position
    // and parent array represents the index of parent
    int[] parent = {-1, 0, 0, 1, 1, 3, 5};
    createTree(parent);
    display(root);





  }


}
