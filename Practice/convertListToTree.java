import java.util.Queue;
import java.util.LinkedList;

public class convertListToTree{

  public static void displayLL(LinkedListNode head){
    LinkedListNode temp = head;
    while(temp != null){
      System.out.print(temp.data + " --> ");
      temp = temp.next;
    }
    System.out.print("null"+"\n");
  }

  private static TreeNode constructTree(LinkedListNode head){

      Queue<TreeNode> queue = new LinkedList<>();
      TreeNode root = new TreeNode(head.data);
      queue.add(root);
      LinkedListNode temp = head;
      while(temp != null){
          TreeNode curr = queue.poll();
          temp = temp.next;
          if(temp != null){
            TreeNode left = new TreeNode(temp.data);
            curr.left = left;
            queue.add(left);
          }
          temp = temp.next;
          if(temp != null){
            TreeNode right = new TreeNode(temp.data);
            curr.right = right;
            queue.add(right);
          }

        }
      return root;
  }


  private static void inOrder(TreeNode root){
    if(root != null){
      inOrder(root.left);
      System.out.print(root.val + " ");
      inOrder(root.right);
    }
  }

  public static void main(String args[]){

    LinkedListNode head = new LinkedListNode(10);
    LinkedListNode n1 = new LinkedListNode(12);
    LinkedListNode n2 = new LinkedListNode(15);
    LinkedListNode n3 = new LinkedListNode(25);
    LinkedListNode n4 = new LinkedListNode(30);
    LinkedListNode n5 = new LinkedListNode(36);

    head.next = n1;
    n1.next = n2;
    n2.next = n3;
    n3.next = n4;
    n4.next = n5;

    displayLL(head);
    inOrder(constructTree(head));
    System.out.println();




  }


}
