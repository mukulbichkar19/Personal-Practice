public class reverseLL{

  private static Node head;

  private static void printLL(Node head){
      Node temp = head;
      while(temp != null){
        System.out.print(temp.data + " --> ");
        temp = temp.next;
      }
      System.out.print("null");
      System.out.println();
  }

  private static Node reverseLL(Node head){
    if(head == null){
      return null;
    }
    Node prev = null;
    Node current = head;
    Node next = current.next;
    while(next != null){
      current.next = prev;
      prev = current;
      current = next;
      next = current.next;
    }
    current.next = prev;
    head = current;
    return head;

  }



  public static void main(String args[]){
    head = new Node(1);
    Node newNode1 = new Node(2);
    Node newNode2 = new Node(3);
    Node newNode3 = new Node(4);
    Node newNode4 = new Node(5);

    head.next = newNode1;
    newNode1.next = newNode2;
    newNode2.next = newNode3;
    newNode3.next = newNode4;

    head = reverseLL(head);

    printLL(head);

  }

}
