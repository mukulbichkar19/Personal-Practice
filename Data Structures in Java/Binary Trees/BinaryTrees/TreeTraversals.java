public class TreeTraversals{

  static TreeNode root = null;
  private static int count = 0;

  private static void inOrder(TreeNode root){
    if(root == null){
      return;
    }
    inOrder(root.left);
    System.out.print(root.data + " ");
    inOrder(root.right);


  }


  private static void preOrder(TreeNode root){
      if(root != null){
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
      }

  }

  private static void postOrder(TreeNode root){
    if(root != null){
      postOrder(root.left);
      postOrder(root.right);
      System.out.print(root.data + " ");
    }
  }

  private static void insert(TreeNode root, TreeNode to_be_inserted){

    TreeNode y = null;
    TreeNode x = root;
    while(x != null){
      y = x;
      if(to_be_inserted.data > x.data){
        x = x.right;
      }else{
        x = x.left;
      }
    }
    // Tree absent
    if(y == null){
      root = to_be_inserted;
    }else if(to_be_inserted.data > y.data){
      y.right = to_be_inserted;
    }else {
      y.left = to_be_inserted;
    }
  }

  private static int findMinimum(TreeNode root){

    TreeNode x = root;
    while(x.left != null){
      x = x.left;
    }
    return x.data;
  }

  private static int findMaximum(TreeNode root){
    TreeNode x = root;
    while(x.right != null){
      x = x.right;
    }
    return x.data;
  }

  private static void inOrderIterative(TreeNode root){
    System.out.println("Inside inorder iterative: ");
    java.util.Stack<TreeNode> stack = new java.util.Stack<>();
    TreeNode temp = root;
    while(true){
      if(temp != null){
          stack.push(temp);
          temp = temp.left;
      }else{
        if(stack.isEmpty()){
          break;
        }
        TreeNode curr = stack.pop();
        System.out.print(curr.data + " ");
        temp = curr.right;
      }
    }
  }

  private static void preOrderIterative(TreeNode root){
    System.out.println("Inside preorder iterative: ");
    java.util.Stack<TreeNode> stack = new java.util.Stack<>();
    TreeNode temp = root;
    stack.push(temp);
    while(!stack.isEmpty()){
      temp = stack.pop();
      System.out.print(temp.data + " ");
      if(temp.right != null){
        stack.push(temp.right);
      }
      if(temp.left !=  null){
        stack.push(temp.left);
      }
    }
  }

  private static void postOrderIterative(TreeNode root){

    java.util.Stack<TreeNode> stack1 = new java.util.Stack<>();
    java.util.Stack<TreeNode> stack2 = new java.util.Stack<>();
    TreeNode temp = root;
    while(!stack1.isEmpty()){
      temp = stack1.pop();
      stack2.push(temp);
      if(temp.right != null){
        stack1.push(temp.right);
      }
      if(temp.left != null){
        stack1.push(temp.left);
      }
    }

    // Print result
    for(TreeNode t:stack2){
      System.out.print(t.data + " ");
    }

    System.out.println();

  }


  private static boolean tree_search(TreeNode root, int find){

      if(root != null){
        if(root.data == find){
          return true;
        }
        if(root.data > find){
          return tree_search(root.left, find);
        }else{
          return tree_search(root.right, find);
        }
      }
      return false;
  }

  private static int size(TreeNode root){
    if(root == null){
      return 0;
    }
    return size(root.left) + 1 + size(root.right);
  }

  private static int maxDepth(TreeNode root){
    if(root == null){
      return 0;
    }
    return 1+Math.max(maxDepth(root.left), maxDepth(root.right));
  }


  private static void level_traversal_queue(TreeNode root){

    // Using queue
    java.util.Queue<TreeNode> queue = new java.util.LinkedList<>();
    TreeNode temp = root;
    System.out.println("Level order traversal: ");
    while(temp != null){
      System.out.print(temp.data + " ");
      queue.offer(temp.left);
      queue.offer(temp.right);
      temp = queue.poll();
    }

  }

  private static void level_traversal(TreeNode root){
    int height = height(root);
    System.out.println("Tree Traversal Using level");
    for(int i=1;i<=height;i++){
      printGivenLevel(root, i);
      System.out.println();
    }
  }

  private static void printGivenLevel(TreeNode root, int level){
    if(root == null){
      return;
    }else if(level == 1){
      System.out.print(root.data + " ");
    }else{
      printGivenLevel(root.left, level-1);
      printGivenLevel(root.right, level-1);
    }
  }

  private static int height(TreeNode root){
    if(root == null){
      return 0;
    }
    return 1 + Math.max(height(root.left), height(root.right));
  }

  private static void levelOrder(TreeNode root){

    java.util.Queue<TreeNode> q1 = new java.util.LinkedList<>();

    q1.add(root);

    while(true){

      int nodeCount = q1.size();

      if(nodeCount == 0){
        break;
      }

      while(nodeCount > 0){
        TreeNode node = q1.peek();
        System.out.print(node.data + " ");
        q1.remove();
        if(node.left != null){
          q1.add(node.left);
        }
        if(node.right != null){
          q1.add(node.right);
        }
        nodeCount--;
      }
      System.out.println();




    }



  }



  public static void main(String args[]){

    root = new TreeNode(5);
    TreeNode left_root = new TreeNode(2);
    TreeNode left_left_child = new TreeNode(1);
    TreeNode left_right_child = new TreeNode(3);

    TreeNode right_root = new TreeNode(9);
    TreeNode right_left_child = new TreeNode(7);
    TreeNode right_right_child = new TreeNode(11);

    root.left = left_root;
    root.right = right_root;

    left_root.left = left_left_child;
    left_root.right = left_right_child;

    right_root.left = right_left_child;
    right_root.right = right_right_child;
/*
    // InOrder TreeTraversals
    // LDR
    inOrder(root);
    System.out.println("End of InOrder");
    // PreOrder Tree TreeTraversals
    // DLR
    //preOrder(root);
    System.out.println("End of preOrder");
    // PostOrder Tree TreeTraversals
    // LRD
    postOrder(root);
    System.out.println("End of postOrder");*/

    // Insert into a Tree
    //TreeNode new_right = new TreeNode(18);
    TreeNode new_left = new TreeNode(4);
    //insert(root, new_right);
    insert(root, new_left);
    System.out.println("After insertion");
    inOrder(root);
    System.out.println();
    /*
    // Find Minimum
    int min = findMinimum(root);
    System.out.println("The minimum in BST is: "+min);

    // Find Maximum
    int max = findMaximum(root);
    System.out.println("The maximum in BST is: "+max);*/

    preOrderIterative(root);
    System.out.println();
    // Tree Search
    if(tree_search(root,15)){
      System.out.println("Element found in tree");
    }else {
      System.out.println("Element NOT found in tree");
    }


    System.out.println("The size of Binary tree is: "+size(root));
    System.out.println("Max depth is : "+maxDepth(root));

    level_traversal_queue(root);
    System.out.println();
    level_traversal(root);
    System.out.println("Tree traversal each line in O(n): ");
    levelOrder(root);





  }


}
