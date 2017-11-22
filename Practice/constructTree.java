import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;
import java.util.LinkedList;
import java.util.TreeMap;
import java.util.Vector;
import java.util.Map;

public class constructTree{

  private static TreeNode root;


  private static void BFS(){

    Queue<TreeNode> queue = new LinkedList<>();
    queue.add(root);
    while(!queue.isEmpty()){
      TreeNode curr = queue.poll();
      System.out.println(curr.val);
      if(curr.left != null){
        queue.add(curr.left);
      }
      if(curr.right != null){
        queue.add(curr.right);
      }
    }



  }

  private static void DFS(){
    preOrder(root);
    System.out.println("\n" + "In Order Traversal:");
    inOrder(root);
    System.out.println("\n" + "PostOrder Traversal:");
    postOrder(root);
    System.out.println("\n" + "InOrder Traversal without recursion:");
    inOrderwoRecursion(root);
    System.out.println("\n" + "PreOrder Traversal without recursion:");
    preOrderwoRecursion(root);
    System.out.println("\n" + "PostOrder Traversal without recursion:");
    postOrderwoRecursion(root);
    System.out.println();
  }

  private static void preOrder(TreeNode root){
    if(root != null){
      System.out.println(root.val);
      preOrder(root.left);
      preOrder(root.right);
    }
  }

  private static void inOrder(TreeNode root){
    if(root != null){
      inOrder(root.left);
      System.out.println(root.val);
      inOrder(root.right);
    }
  }

  private static void postOrder(TreeNode root){
    if(root !=  null){
      postOrder(root.left);
      postOrder(root.right);
      System.out.println(root.val);
    }
  }

  private static void inOrderwoRecursion(TreeNode root){

    Stack<TreeNode> stack = new Stack<>();
    TreeNode p = root;
    while(p!=null || !stack.isEmpty()){

      if(p!=null){
        stack.push(p);
        p=p.left;
      }else{
        TreeNode n = stack.pop();
        System.out.print(n.val + " ");
        p = n.right;
      }
    }
    System.out.println();
  }

  private static void preOrderwoRecursion(TreeNode root){

    Stack<TreeNode> stack = new Stack<>();
    TreeNode p = root;
    while(p!=null || !stack.isEmpty()){
      if(p!=null){
        System.out.print(p.val + " ");
        stack.push(p);
        p=p.left;
      }else{
        TreeNode n = stack.pop();
        p = n.right;
      }
    }
    System.out.println();
  }

  private static void postOrderwoRecursion(TreeNode root){

    Stack<TreeNode> stack = new Stack<>();

    TreeNode temp = root;

    while(temp != null || !stack.isEmpty()){

      if(temp != null){
        if(temp.right != null){
          stack.push(temp.right);
        }
        stack.push(temp);
        temp = temp.left;
      }else{
        TreeNode pop = stack.pop();
        if(!stack.isEmpty() && pop.right == stack.peek()){
          stack.pop();//Remove the right child
          stack.push(pop);//Push back the root element
          temp = pop.right;
        }else{
          System.out.print(pop.val + " ");
          temp = null;
        }
      }
    }





  }


  private static void printLevelOrderWithEachLevel(){
    int size = 1;
    Queue<TreeNode> q = new LinkedList<>();
    q.add(root);
    while(!q.isEmpty()){
      for(int i=0;i<size;i++){
        TreeNode popped = q.poll();
        if(i!=size){
          System.out.print(popped.val+" ");
        }
        if(popped.left != null){
          q.add(popped.left);
        }
        if(popped.right != null){
          q.add(popped.right);
        }
      }
      System.out.print("\n");
      size = q.size();
    }
  }


  private static void findMinMax(TreeNode node, Values min, Values max, int hd){
      if(node == null){
        return;
      }
      if(hd < min.min){
        min.min = hd;
      }else if(hd > max.max){
        max.max = hd;
      }
      findMinMax(node.left, min, max, hd-1);
      findMinMax(node.right, min, max, hd+1);
  }

  private static void printVertical(TreeNode node, int line, int hd){

    if(node == null){
      return;
    }

    if(line == hd){
      System.out.print(node.val + " ");
    }
    printVertical(node.left, line, hd-1);
    printVertical(node.right, line, hd+1);

  }



  private static void printVerticalLines(){

    Values v = new Values();
    // 1. Find minimum and maximum horizontal distances from root.
    findMinMax(root, v, v, 0);
    // 2. Print Verical Lines if a node fall into that vertical Lines
    for(int i=v.min;i<=v.max;i++){
      printVertical(root, i, 0);
      System.out.println();
    }

  }


  private static void getVerticalOrder(TreeNode root, int hd, TreeMap<Integer, Vector<Integer>> m){

    if(root == null){
      return;
    }

    Vector<Integer> get = m.get(hd);

    if(get == null){
      get = new Vector<>();
      get.add(root.val);
    }else{
      get.add(root.val);
    }

    m.put(hd, get);

    getVerticalOrder(root.left, hd-1, m);
    getVerticalOrder(root.right, hd+1,m);

  }


  private static void printVerticalLinear(){

      TreeMap<Integer, Vector<Integer>> m = new TreeMap<>();
      int hd = 0; //for root
      getVerticalOrder(root,hd,m);
      for(Map.Entry<Integer, Vector<Integer>> entry:m.entrySet()){
        System.out.println(entry.getValue());
      }



  }




  public static void main(String args[]){

    root = new TreeNode(1);
    TreeNode left1 = new TreeNode(2);
    TreeNode right1 = new TreeNode(3);
    TreeNode left2 =  new TreeNode(4);
    TreeNode right2 = new TreeNode(5);
    TreeNode left3 = new TreeNode(6);
    TreeNode right3 = new TreeNode(7);
    root.left = left1;
    root.right = right1;

    left1.left = left2;
    left1.right = right2;

    right1.left = left3;
    right1.right = right3;
    //BFS();

    System.out.println("DFS: ");
    DFS();

    System.out.println("For printing level order traversal on new line: ");
    printLevelOrderWithEachLevel();
    System.out.println("Vertical Printing: ");
    printVerticalLines();
    printVerticalLinear();



  }


}
