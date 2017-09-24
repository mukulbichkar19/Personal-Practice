public class DetectCycle{

  private static Node head = null;

  private static Node detectCycle(Node head){

    // Corner Case
    if(head == null){
      return null;
    }

    Node slow = head, fast = head;
    boolean isCyclePresent = false;
    while(fast!=null && fast.next!=null){
      fast = fast.next.next;
      slow = slow.next;
      if(slow == fast){
        Node track = head;
        while(track != slow){
          slow = slow.next;
          track = track.next;
        }
        return track;
      }

    }

    // if(!isCyclePresent){
    //   return null;
    // }else{
    //   slow = head;
    //   while(slow!=fast){
    //     slow = slow.next;
    //     fast = fast.next;
    //   }
    // }

    return null;



  }

  public static void main(String args[]){

    head = new Node(1);
    Node node1 = new Node(2);
    Node node2 = new Node(3);
    Node node3 = new Node(4);
    Node node4 = new Node(5);

    // 1. No cycle
    head.next = node1;
    node1.next = node2;
    node2.next = node3;
    node3.next = node4;
    //node4.next = node1;

    Node result = detectCycle(head);
    if(result == null){
      System.out.println("No cycle found");
    }else{
      System.out.println("Cycle found at: "+result.data);
    }



  }


}
