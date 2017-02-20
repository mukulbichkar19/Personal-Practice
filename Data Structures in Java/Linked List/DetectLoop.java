public class DetectLoop{

  private static Node head;

  private static int findLoop(Node head){

    Node slow = head;
    Node fast = head;

    while(slow!=null && fast!=null && fast.next!=null){

      slow = slow.next;
      fast = fast.next.next;
      if(slow == fast){
        System.out.println("Loop exists in the given Linked List");
        return -1;
      }
    }
    return 0;



  }


  public static void main(String args[]){

    head = new Node();

    Node node1 = new Node();
    Node node2 = new Node();
    Node node3 = new Node();
    Node node4 = new Node();
    Node node5 = new Node();

    head.data = 1;
    node1.data = 2;
    node2.data = 3;
    node3.data = 4;
    node4.data = 5;
    node5.data = 10;

    head.next = node1;
    node1.next =node2;
    node2.next =node3;
    node3.next =node4;
    node4.next =node5;
    node5.next =null;

    if(findLoop(head) == 0){
      System.out.println("Loop does not exists");
    }


  }


}
