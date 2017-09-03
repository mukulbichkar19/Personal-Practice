public class DetectCycle{

  private static Node head = null;

  private static Node detectCycle(Node head){

    Node slow = head;
    Node fast = head;

    while(fast!=null && fast.next!=null){

      slow = slow.next;
      fast = fast.next.next;
      if(slow == fast){
        break;
      }
    }

    // If no cycle detected then return null
    if(fast == null || fast.next == null){
      return null;
    }



    // If break it indicates a cycle now move slow to head and progress
    // at same pace till slow == fast
    slow = head;
    while(slow != fast){
      slow = slow.next;
      fast = fast.next;
    }






    return fast;



  }

  public static void main(String args[]){

    head = new Node(5);
    Node node1 = new Node(10);
    Node node2 = new Node(15);
    Node node3 = new Node(18);
    Node node4 = new Node(20);

    head.next = node1;
    node1.next = node2;
    node2.next = node3;
    node3.next = node4;
    node4.next = node3;



    Node cycle = detectCycle(head);
    if(cycle != null){
        System.out.println("Cycle is present at: "+cycle.data);
    }else{
      System.out.println("Cycle not present");
    }





  }


}
