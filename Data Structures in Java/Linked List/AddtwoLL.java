public class AddtwoLL{

private static Node head1;
private static Node head2;
private static Node result;

private static Node reverse(Node head){

  Node prev = null;
  Node current = head;
  Node next = null;
  while(current != null){
    next = current.next;
    current.next = prev;
    prev = current;
    current = next;
  }
  return prev;
}

private static void print(Node head){
  Node temp = head;
  while(temp != null){
    System.out.print(temp.data + " ");
    temp = temp.next;
  }
  System.out.println();
}

private static void add(){

    head1 = reverse(head1);
    //print(head1);
    head2 = reverse(head2);
    //print(head2);
    Node temp1 = head1;
    Node temp2 = head2;
    while(temp1 != null && temp2 != null){
      int sum = temp1.data + temp2.data;
    }




}


public static void main(String args[]){

        head1 = new Node(5,
                         new Node(6,
                                  new Node(3, null)));

        head2 = new Node(8,
                         new Node(4,
                                  new Node(2, null)));

       add();



}

}
