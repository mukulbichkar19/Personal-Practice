public class PairWiseSwap2{

  private static Node head;

  private static void print(){
    Node temp = head;
    while(temp != null){
      System.out.print(temp.data + " ");
      temp = temp.next;
    }
    System.out.println();
  }

  private static Node pairSwap(){

      if(head == null || head.next == null){
        return null;
      }

      Node prev = head;
      Node current = prev.next;

      head = current;

      while(true){
        Node next = current.next;
        current.next = prev;
        if(next == null || next.next == null){
          prev.next = next;
          break;
        }
        prev.next = next.next;

        prev = next;
        current = prev.next;
      }

      return head;



  }

  public static void main(String args[]){

    head = new Node(1,
                    new Node(2,
                    new Node(3,
                    new Node(4,
                    new Node(5,
                    new Node(6,
                    new Node(7,null)))))));
    head = pairSwap();
    print();

  }


}
