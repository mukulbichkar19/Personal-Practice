public class ReverseLL{

  private static Node head = null;


  private static Node reverseRecursive(Node head){

    if(head == null || head.next == null){
      return head;
    }

    Node p = reverseRecursive(head.next);
    head.next.next = head;
    head.next = null;
    return p;
  }

  private static Node tailRecursive(Node curr, Node prev){

    // Base case
    if(curr.next == null){
      head = curr;
      curr.next = prev;
      return null;
    }

    Node next1 = curr.next;

    curr.next = prev;

    tailRecursive(next1, curr);
    return head;

  }


  private static void display(Node head){
    Node temp = head;
    while(temp != null){
      System.out.print(temp.data + " --> ");
      temp = temp.next;
    }
    System.out.print("null" + "\n");
  }

  public static void main(String args[]){

    head = new Node(8);
    Node node1 = new Node(1);
    Node node2 = new Node(3);
    Node node3 = new Node(5);

    head.next = node1;
    node1.next = node2;
    node2.next = node3;

    //head = reverseRecursive(head);
    head = tailRecursive(head, null);
    display(head);



  }


}
