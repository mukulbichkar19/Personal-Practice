public class ReverseSLL{

  private static Node head = null;

  private static Node reverse(Node head){

    Node current = head;
    Node prev = null;
    Node next = null;

    while(current != null){
      next = current.next;
      current.next = prev;
      prev = current;
      current = next;
    }
    return prev;
  }

  private static void display(Node head){
    Node temp = head;
    while(temp != null){
      System.out.print(temp.data + " --> ");
      temp = temp.next;
    }
    System.out.print("null\n");
  }

  public static void main(String args[]){

    head = new Node(1,
                     new Node(2,
                     new Node(3,
                     new Node(4,null))));

    Node reverse_ll = reverse(head);
    display(reverse_ll);

  }


}
