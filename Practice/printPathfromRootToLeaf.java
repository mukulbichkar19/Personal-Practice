import java.util.Map;
import java.util.TreeMap;
public class printPathfromRootToLeaf{

  private static int[] paths;
  private static int pathLen;
  private static Map<Integer,Integer> verticalSum = new TreeMap<>();
  private static Map<Integer, Integer> diagSum = new TreeMap<>();

  private static void printPaths(TreeNode root){
    paths = new int[1000];
    pathLen = 0;
    printPathUtil(root, paths, pathLen);
  }

  private static void printPathUtil(TreeNode root, int[] paths, int pathLen){

    if(root == null){
      return;
    }

    paths[pathLen] = root.val;
    pathLen++;

    if(root.left == null && root.right == null){
      printArray(paths, pathLen);
    }

    printPathUtil(root.left, paths, pathLen);
    printPathUtil(root.right, paths, pathLen);

  }

  private static void printArray(int[] paths, int len){
    for(int i=0;i<len;i++){
      System.out.print(paths[i] + " ");
    }
    System.out.println();
  }

  private static int findLevel(TreeNode root, int search, int level){

    if(root == null){
      return 0;
    }
    if(root.val == search){
      return level;
    }

    int downLevel = findLevel(root.left, search, level+1);
    if(downLevel != 0){
      return downLevel;
    }

    downLevel = findLevel(root.right, search, level+1);
    return downLevel;

  }

  private static void printAtK(TreeNode root, int level, int k){

    //System.out.println("Enters here for: "+root.val+" level "+level+" k "+k);
    if(root == null){
      return;
    }
    if(level == k){
      System.out.print(root.val + " ");
    }

      printAtK(root.left, level+1,k);
      printAtK(root.right, level+1,k);

  }

  private static int findMaxPath(TreeNode node){

    if(node == null){
      return 0;
    }

    int ls = findMaxPath(node.left);
    int rs = findMaxPath(node.right);

    return node.val + Math.max(ls,rs);


  }

  private static void printVerticalPathSums(TreeNode node, int level){

      if(node == null){
          return;
      }

      if(verticalSum.containsKey(level)){
        int existing_sum = verticalSum.get(level);
        existing_sum += node.val;
        verticalSum.put(level, existing_sum);
      }else{
        verticalSum.put(level, node.val);
      }

      printVerticalPathSums(node.left, level-1);
      printVerticalPathSums(node.right, level+1);
  }

  private static void createNumbers(TreeNode node, int num){

      if(node == null){
        return;
      }

      int new_sum = num*10 + node.val;
      if(node.left == null && node.right == null){
        System.out.println(new_sum);
      }

      if(node.left != null){
        createNumbers(node.left, new_sum);
      }

      if(node.right != null){
        createNumbers(node.right, new_sum);
      }

  }

  private static void printLeftView(TreeNode root, int level, MaxLeftLevel m){

    if(root == null){
      return;
    }

    if(level > m.level){
      System.out.println(root.val + " ");
      m.level = level;
    }

    printLeftView(root.left, level+1,m);
    printLeftView(root.right, level+1,m);
  }

  private static void printRightView(TreeNode root, int level, MaxLeftLevel r){

    if(root == null){
      return;
    }

    if(level > r.level){
      System.out.println(root.val + " ");
      r.level = level;
    }

    printRightView(root.right, level+1,r);
    printRightView(root.left, level+1,r);

  }


  private static void diagonalSum(TreeNode root, int level){
    if(root == null){
      return;
    }

    if(diagSum.containsKey(level)){
      int sum = diagSum.get(level);
      sum+=root.val;
      diagSum.put(level, sum);
    }else{
      diagSum.put(level, root.val);
    }

    diagonalSum(root.left, level-1);
    diagonalSum(root.right, level);
  }


  public static void main(String args[]){

    TreeNode root = new TreeNode(6);
    TreeNode left = new TreeNode(3);
    TreeNode right = new TreeNode(5);
    TreeNode left1 = new TreeNode(2);
    TreeNode right1 = new TreeNode(5);
    TreeNode right2 = new TreeNode(4);
    TreeNode left2 = new TreeNode(7);
    TreeNode right3 = new TreeNode(4);

    root.left = left;
    root.right = right;

    left.left = left1;
    left.right = right1;

    //right.left = left2;
    right.right = right2;

    right1.left = left2;
    right1.right = right3;

    //right2.left = new TreeNode(9);

    //printPaths(root);

    int level = findLevel(root,6,1);
    System.out.println("The level for given node is: "+level);
    printAtK(root, 0,3);
    System.out.println();

    System.out.println("Maximum sum for root to leaf is: " +findMaxPath(root));

    printVerticalPathSums(root,0);
    for(Map.Entry<Integer, Integer> entry:verticalSum.entrySet()){
      System.out.println(entry.getValue());
    }

    createNumbers(root, 0);

    System.out.println("Left View looks like: ");
    MaxLeftLevel m = new MaxLeftLevel();
    m.level = 0;
    printLeftView(root, 1, m);

    System.out.println("Right View looks like: ");
    MaxLeftLevel r = new MaxLeftLevel();
    r.level = 0;
    printRightView(root, 1, r);

    diagonalSum(root, 0);
    System.out.println("The diagonal sum is: ");
    for(Map.Entry<Integer, Integer> entry:diagSum.entrySet()){
      System.out.println(entry.getValue());
    }


  }






}
