public class cycleInLL{

  private static Node head;

  private static boolean findCycle(Node head){

    if(head == null){
        return false;
    }
    Node s = head;
    Node f = head;
    while(f.next != null && f.next.next != null){

      s = s.next; // move to next one
      f = f.next.next;
      if(s == f ){
        return true;
      }
    }
    return false;
  }

  public static void main(String args[]){
    head = new Node(1);
    Node newNode = new Node(2);
    Node newNode2 = new Node(3);
    Node newNode3 = new Node(4);
    Node newNode4 = new Node(5);
    // cyclic for odd length
    head.next = newNode;
    newNode.next = newNode2;
    //newNode2.next = head;
    //newNode3.next = newNode4;
    //newNode4.next = newNode2;

    if(findCycle(head)){
      System.out.println("Cycle present");
    }else{
      System.out.println("Cycle not present");
    }







  }

}
