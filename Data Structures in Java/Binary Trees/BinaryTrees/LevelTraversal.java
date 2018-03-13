public class LevelTraversal{

  private static TreeNode head;

  private static void levelOrder(TreeNode root){

    java.util.Queue<TreeNode> queue = new java.util.LinkedList<>();
    queue.add(root);
    while(!queue.isEmpty()){
      System.out.print(queue.peek().data + " ");
      if(queue.peek().left != null){
        queue.add(queue.peek().left);
      }
      if(queue.peek().right != null){
        queue.add(queue.peek().right);
      }
      queue.poll();
    }
  }

  private static void levelWithIndicators(TreeNode root){

      java.util.Queue<TreeNode> queue = new java.util.LinkedList<>();
      TreeNode temp = root;
      queue.add(temp);
      queue.add(null);
      while(temp != null){
        if(temp.left != null){
          queue.add(temp.left);
        }
        if(temp.right != null){
          queue.add(temp.right);
        }
        queue.add(null);
        temp = temp.left;

      }





  }

  public static void main(String args[]){

    head = new TreeNode(1);
    TreeNode node_left = new TreeNode(2);
    TreeNode node_right = new TreeNode(3);
    TreeNode node_left_1 = new TreeNode(4);
    TreeNode node_right_1 = new TreeNode(5);
    TreeNode node_left_2 = new TreeNode(6);
    TreeNode node_right_2 = new TreeNode(7);

    head.left = node_left;
    head.right = node_right;

    node_left.left = node_left_1;
    node_left.right = node_right_1;

    node_right.left = node_left_2;
    node_right.right = node_right_2;

    levelOrder(head);
    levelWithIndicators(head);

  }


}
