import java.util.Queue;
import java.util.LinkedList;
import java.util.Map;
import java.util.LinkedHashMap;
public class sumPropertyTree{

  private static TreeNode root;
  private static int max_sum = 0;
  private static Map<Integer, Integer> vertical_sum = new LinkedHashMap<>();
  private static int global_sum = 0;
  private static TreeNode head;
  private static TreeNode temp;


  private static void inOrderDisplay(TreeNode root){

    if(root != null){
      inOrderDisplay(root.left);
      System.out.println(root.val);
      inOrderDisplay(root.right);
    }
  }

  private static int findSum(TreeNode root){

    int left_sum = 0;
    int right_sum = 0;
    if(root==null || (root.left!=null && root.right!=null)){
      return 1;
    }else{

      if(root.left != null){
        left_sum += root.left.val;
      }

      if(root.right != null){
        right_sum += root.right.val;
      }

      if((root.val == left_sum+right_sum) &&
                (findSum(root.left)!=0) &&
                (findSum(root.right)!=0)){
        return 1;
      }else{
        return 0;
      }
    }
  }


  private static int countLeafNodes(TreeNode root){

    if(root == null){
      return 0;
    }else if(root.left == null && root.right == null){
      return 1;
    }
    return countLeafNodes(root.left) + countLeafNodes(root.right);



  }


  private static int findLevel(TreeNode temp, int target, int level){

    if(temp == null){
      return 0;
    }

    if(temp.val == target){
      return level;
    }

    if(temp.left != null){
      int llevel = findLevel(temp.left, target, level+1);
      if(llevel != 0){
        return llevel;
      }
    }

    if(temp.right != null){
      int rlevel = findLevel(temp.right, target, level+1);
      if(rlevel != 0){
        return rlevel;
      }
    }

    return 0;

  }

  private static void printAtK(TreeNode temp, int target, int level){

    if(temp == null){
      return;
    }

    if(level == target){
      System.out.println("The node is: "+temp.val);
    }

    if(level <= target){
      if(temp.left != null){
        printAtK(temp.left, target, level+1);
      }

      if(temp.right != null){
          printAtK(temp.right, target, level+1);
      }
    }
  }


  private static TreeNode treeMirror(TreeNode root){

    if(root == null){
      return root;
    }

    TreeNode left = treeMirror(root.left);
    TreeNode right = treeMirror(root.right);

    root.left = right;
    root.right = left;

    return root;

  }

  private static int maxWidth(TreeNode root){

    if(root == null){
      return 0;
    }

    java.util.Queue<TreeNode> q = new java.util.LinkedList<>();
    q.add(root);
    int size = 1;
    int max_size = 0;
    while(!q.isEmpty()){
      TreeNode curr = null;
      for(int i=0;i<size;i++){
        curr = q.poll();
        if(curr.left != null){
          q.add(curr.left);
        }
        if(curr.right != null){
          q.add(curr.right);
        }
      }
      size = q.size();
      max_size = Math.max(size, max_size);
    }
    return max_size;
  }

  private static void printFromRootToLeaf(TreeNode root){

    int[] paths = new int[1000];
    printPathRec(root, paths, 0);
    findGreatestSum(root, 0);

  }

  private static void printPathRec(TreeNode temp, int[] paths, int pathLen){

    if(temp == null){
      return;
    }

    paths[pathLen] = temp.val;
    pathLen++;

    if(temp.left == null && temp.right == null){
      printArray(paths, pathLen);
      //findSum(paths, pathLen);
    }else{
      printPathRec(temp.right, paths, pathLen);
      printPathRec(temp.left, paths, pathLen);
    }

  }

  private static void printArray(int[] a, int len){
    for(int i=0;i<len;i++){
      System.out.print(a[i] + " --> ");
    }
    System.out.println("null" + "\n");
  }

  private static void findSum(int[] a, int l){
    int sum = 0;
    for(int i=0;i<l;i++){
      sum+=a[i];
    }
    max_sum = Math.max(max_sum, sum);
  }

  private static void findGreatestSum(TreeNode node, int curr_sum){

    if(node == null){
      return;
    }

    curr_sum +=  node.val;

    if(node.left == null && node.right == null){
      if(curr_sum > max_sum){
        max_sum = curr_sum;
      }
    }

    findGreatestSum(node.left, curr_sum);
    findGreatestSum(node.right, curr_sum);
  }

  private static void findVerticalSum(TreeNode root, int val){

    if(root != null){
      findVerticalSum(root.left, val-1);
      if(vertical_sum.containsKey(val)){
        int new_sum = vertical_sum.get(val) + root.val;
        vertical_sum.put(val, new_sum);
      }else{
        vertical_sum.put(val, root.val);
      }
      findVerticalSum(root.right, val+1);
    }
  }


  private static void findAllSum(TreeNode root, int n){

    if(root == null){
      return;
    }

    int new_sum = n*10 + root.val;

    if(root.left == null && root.right == null){
      global_sum += new_sum;
    }

    findAllSum(root.left, new_sum);
    findAllSum(root.right, new_sum);

  }

  private static TreeNode findNextRight(TreeNode root, int num){

     if(root == null){
       return null;
     }

     Queue<TreeNode> que = new LinkedList<>();
     que.add(root);
     int size = 1;
     while(!que.isEmpty()){
        for(int i = 0;i<size;i++){
          TreeNode curr = que.poll();
          if(!que.isEmpty() && curr.val == num && i<size-1){
            return que.peek();
          }else if(curr.val == num && i==size-1){
            return null;
          }

          if(curr.left != null){
            que.add(curr.left);
          }

          if(curr.right != null){
            que.add(curr.right);
          }
        }
        size = que.size();

     }

     return null;

  }

  private static TreeNode findNextLeft(TreeNode root, int num){

     if(root == null){
       return null;
     }

     Queue<TreeNode> que = new LinkedList<>();
     que.add(root);
     int size = 1;
     while(!que.isEmpty()){
        for(int i = 0;i<size;i++){
          TreeNode curr = que.poll();
          if(!que.isEmpty() && curr.val == num && i<size-1){
            return que.peek();
          }else if(curr.val == num && i==size-1){
            return null;
          }

          if(curr.right != null){
            que.add(curr.right);
          }

          if(curr.left != null){
            que.add(curr.left);
          }
        }
        size = que.size();

     }

     return null;

  }


  private static TreeNode covertLeafToDLL(TreeNode t){

    if(t == null){
      return null;
    }



    if(t.left == null && t.right == null){
      if(head == null && temp == null){
        head = t;
        temp = t;
        head.left = null;
        head.right = null;
      }else{
        t.left = temp;
        temp.right = t;
        temp = t;
      }
      return null;
    }

    t.left = covertLeafToDLL(t.left);
    t.right = covertLeafToDLL(t.right);
    return t;
  }

  public static void main(String args[]){

        root = new TreeNode(1);

        TreeNode left = new TreeNode(2);
        TreeNode right = new TreeNode(3);

        TreeNode left1 = new TreeNode(4);
        TreeNode right1 = new TreeNode(5);

        TreeNode left2 = new TreeNode(8);
        TreeNode right2 = new TreeNode(15);

        root.left = left;
        root.right = right;

        left.left = left1;
        left.right = right1;

        right.left = left2;
        right.right = right2;


        inOrderDisplay(root);
        // if(findSum(root) == 1){
        //   System.out.println("Follows the sum property");
        // }else{
        //   System.out.println("Does not follow the sum property");
        // }
        //
        //
        // int leafNodes = countLeafNodes(root);
        // System.out.println("The number of leaf nodes are: "+leafNodes);

        // int level = findLevel(root,4,1);
        // System.out.println("The level found is "+level);

        // printAtK(root,3,0);
        //
        // treeMirror(root);
        // System.out.println("Mirror: ");
        // inOrderDisplay(root);

        System.out.println("The maximum width is: "+maxWidth(root));

        printFromRootToLeaf(root);

        System.out.println("The maximum sum path is: "+max_sum);

        findVerticalSum(root, 0);

        for(Map.Entry<Integer, Integer> entry:vertical_sum.entrySet()){
            System.out.println(entry.getKey() + " :: " +entry.getValue());
        }

        findAllSum(root, 0);
        System.out.println("Global sum is: "+global_sum);


        // TreeNode right_elem = findNextRight(root, 5);
        // //System.out.println(right_elem);
        // if(right_elem == null){
        //   System.out.println("The next right element is: NULL");
        // }else{
        //   System.out.println("The next right element is: "+right_elem.val);
        // }

        TreeNode left_elem = findNextLeft(root, 5);
        //System.out.println(right_elem);
        if(left_elem == null){
          System.out.println("The next left element is: NULL");
        }else{
          System.out.println("The next left element is: "+left_elem.val);
        }

        root = covertLeafToDLL(root);
        inOrderDisplay(root);
        System.out.println("Doubly linked list: ");
        TreeNode t = head;
        while(t!=null){
          System.out.println(t.val);
          t = t.right;
        }






  }

}
