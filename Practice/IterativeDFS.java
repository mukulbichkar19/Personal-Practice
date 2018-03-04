import java.util.Stack;
import java.util.ArrayList;
public class IterativeDFS{


  private static void inOrderIter(TreeNode root){
    Stack<TreeNode> st = new Stack<>();
    TreeNode p = root;
    while(p!=null || !st.isEmpty()){
      if(p!=null){
        while(p!=null){
          st.push(p);
          p = p.left;
        }
      }else{
        TreeNode curr = st.pop();
        System.out.print(curr.val + " --- ");
        p = curr.right;
      }
    }
    System.out.println("null");
  }

  private static void preOrderIter(TreeNode root){
    Stack<TreeNode> st = new Stack<>();
    TreeNode p = root;
    while(p!=null || !st.isEmpty()){
      if(p!=null){
        while(p!=null){
          System.out.print(p.val + " --- ");
          st.push(p);
          p = p.left;
        }
      }else{
        TreeNode curr = st.pop();
        p = curr.right;
      }
    }
    System.out.println("null");
  }

  private static void postOrderIter(TreeNode root){
    Stack<TreeNode> st = new Stack<>();
    TreeNode p = root;
    ArrayList<TreeNode> revList = new ArrayList<>();
    while(p!=null || !st.isEmpty()){
      if(p!=null){
        while(p!=null){
          st.push(p);
          revList.add(0, p);
          p = p.right;
        }
      }else{
        TreeNode curr = st.pop();
        p = curr.left;
      }
    }

    for(TreeNode t:revList){
      System.out.print(t.val + " --- ");
    }
    System.out.println("null");
  }



  public static void main(String args[]){

    TreeNode root = new TreeNode(5);
    TreeNode left = new TreeNode(18);
    TreeNode right = new TreeNode(2);

    TreeNode left1 = new TreeNode(9);
    TreeNode right1 = new TreeNode(4);

    TreeNode left2 = new TreeNode(15);
    TreeNode right2 = new TreeNode(90);

    root.left = left;
    root.right = right;

    left.left = left1;
    left.right = right1;

    right.left = left2;
    right.right = right2;

    System.out.println("In Order: ");
    inOrderIter(root);
    System.out.println("Pre Order: ");
    preOrderIter(root);
    System.out.println("Post Order: ");
    postOrderIter(root);



  }

}
