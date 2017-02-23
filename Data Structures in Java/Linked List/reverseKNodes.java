public class reverseKNodes {

private static Node head;

private static Node reverse(Node head, int k){

  Node current = head;
  Node prev = null;
  Node next = null;
  int count = 0;
  while(count < k && current != null){
    next = current.next;
    current.next = prev;
    prev = current;
    current = next;
    count++;
  }

  if(next != null){
    head.next = reverse(next, k);
  }
  return prev;

}

private static void print(){

        Node temp = head;
        while(temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
        }
        System.out.println();

}

public static void main(String args[]){
       head = new Node(1,
                        new Node(2,
                                 new Node(3,
                                          new Node(4,
                                                   new Node(5,
                                                            new Node(6,
                                                                     new Node(7,
                                                                              new Node(8, null))))))));
      java.util.Scanner scan = new java.util.Scanner(System.in);
      System.out.println("Enter the no of nodes to reverse: ");
      int k = scan.nextInt();
      head = reverse(head, k);
      print();
}

}
