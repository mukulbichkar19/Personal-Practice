public class ConvertSLLtoBST{

  private static Node head = null;

  // Approach 1: Using Recusrion
  // Time Complexity: O(n*lgn)
  private static TreeNode convertToBST(Node head){

    // Corner Case
    if(head == null){
      return null;
    }

    return toBST(head, null);

  }

  private static TreeNode toBST(Node head, Node tail){

    Node slow = head;
    Node fast = head;
    if(head == tail){
      return null;
    }
     while(fast != tail && fast.next != tail){
       slow = slow.next;
       fast = fast.next.next;
     }

     TreeNode thead = new TreeNode(slow.data);
     thead.left = toBST(head,slow);
     thead.right = toBST(slow.next, tail);
     return thead;


  }

  private static void preorder(TreeNode head){

    if(head == null) {
      return;
    }
    System.out.println(head.data);
    preorder(head.left);
    preorder(head.right);


  }


  public static void main(String args[]){

    head = new Node(1);
    Node node1 = new Node(3);
    Node node2 = new Node(4);
    Node node3 = new Node(5);
    Node node4 = new Node(7);

    head.next = node1;
    node1.next = node2;
    node2.next = node3;

    TreeNode root = convertToBST(head);
    preorder(root);


  }



}
