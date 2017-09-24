public class ReverseRecursive{

  private static Node head = null;

  private static void reverse(Node p){

    if(p.next == null){
      head = p;
      return;
    }
    reverse(p.next);
    Node q = p.next;
    q.next = p;
    p.next = null;
  }

  public static void main(String args[]){

    head = new Node(1);
    Node node1 = new Node(2);
    Node node2 = new Node(3);
    Node node3 = new Node(4);
    Node node4 = new Node(5);

    head.next = node1;
    node1.next = node2;
    node2.next = node3;
    node3.next = node4;

    reverse(head);
    // Display the linked list
    Node temp = head;
    while(temp != null){
      System.out.println(temp.data);
      temp = temp.next;
    }
    System.out.println();






  }



}
