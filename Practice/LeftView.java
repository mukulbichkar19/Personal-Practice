import java.util.Queue;
import java.util.LinkedList;
import java.util.Set;
import java.util.HashSet;
public class LeftView{

  private static TreeNode root;
  private static HashSet<Integer> leftView = new HashSet<>();
  private static HashSet<Integer> rightView = new HashSet<>();
  private static int max = 0;
  private static MaxLevel max_level = new MaxLevel();
  private static MaxLevel max_left_level = new MaxLevel();


  private static void printRightView(TreeNode root){
    rightViewUtil(root,1,max_level);
    System.out.println();
  }

  private static void rightViewUtil(TreeNode t, int level, MaxLevel max_level){

      if(t == null){
        return;
      }

      if(max_level.maxLevel < level){
        System.out.print(t.val + " ");
        max_level.maxLevel = level;
      }

      rightViewUtil(t.right, level+1, max_level);
      rightViewUtil(t.left, level+1, max_level);
  }


  private static void printLeftView(TreeNode root){

    if(root == null){
      return;
    }

    Queue<TreeNode> q = new LinkedList<>();
    q.add(root);
    int size = 1;
    while(!q.isEmpty()){

        for(int i=0;i<size;i++){
          TreeNode curr = q.poll();
          if(i == 0){
            leftView.add(curr.val);
          }
          if(i == size-1){
            rightView.add(curr.val);
          }
          if(curr.left != null){
            q.add(curr.left);
          }
          if(curr.right != null){
            q.add(curr.right);
          }
        }
        size = q.size();
    }
  }

  private static int findHeight(TreeNode t, int level){

    if(t == null){
      return 0;
    }

    if(t.left == null && t.right == null){
      return level;
    }

    int left = findHeight(t.left, level+1);
    int right = findHeight(t.right, level+1);

    return Math.max(left, right);

  }

  private static int findHeightIterative(TreeNode root){

    if(root == null){
      return 0;
    }

    Queue<TreeNode> q = new LinkedList<>();
    q.add(root);
    int size = 1;
    int level = 0;
    while(!q.isEmpty()){

      for(int i=0;i<size;i++){
        TreeNode curr = q.poll();
        if(curr.left != null){
          q.add(curr.left);
        }
        if(curr.right != null){
          q.add(curr.right);
        }
      }
      size = q.size();
      level++;


    }


    return level;

  }


  private static void printLeftViewRec(TreeNode rooot){
    leftViewUtil(root, 1, max_left_level);
    System.out.println("null");
  }

  private static void leftViewUtil(TreeNode t, int level, MaxLevel max_left_level){

    if(t == null){
      return;
    }

    if(level > max_left_level.maxLevel){
      System.out.print(t.val + " --> ");
      max_left_level.maxLevel = level;
    }

    leftViewUtil(t.left, level+1, max_left_level);
    leftViewUtil(t.right, level+1, max_left_level);

  }

  private static void printNoSiblings(TreeNode t){

    if(t == null){
      return;
    }
    if(t.left != null && t.right != null){
      printNoSiblings(t.left);
      printNoSiblings(t.right);
    }else if(t.left == null && t.right!=null){
      System.out.print(t.val + " ");
      printNoSiblings(t.right);
    }else if(t.right == null && t.left!=null){
      System.out.print(t.val + " ");
      printNoSiblings(t.left);
    }else if(t.left == null && t.right == null){
        System.out.print(t.val + " ");
    }
  }


  public static void main(String args[]){

    root = new TreeNode(1);

    TreeNode left = new TreeNode(2);
    TreeNode right = new TreeNode(3);

    TreeNode left1 = new TreeNode(4);
    TreeNode right1 = new TreeNode(5);

    TreeNode left2 = new TreeNode(6);
    TreeNode right2 = new TreeNode(15);

    root.left = left;
    root.right = right;

    left.left = left1;
    left.right = left1;

    //left1.right = right1;

    //right1.right = left2;

    printLeftView(root);
    for(Integer i:leftView){
      System.out.print(i + "---");
    }
    System.out.println("null" + "\n");

    int height = findHeight(root, 1);
    System.out.println("The maximum height is: "+height);

    System.out.println("The height iterative is: "+ findHeightIterative(root));


    printRightView(root);
    printLeftViewRec(root);
    // System.out.println("Right view is: ");
    // for(Integer i:rightView){
    //   System.out.print(i + "---");
    // }
    // System.out.println("null" + "\n");
    System.out.println("No siblings node: ");
    printNoSiblings(root);
    System.out.println();

  }

}
