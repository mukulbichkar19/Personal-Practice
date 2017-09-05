public class SortLL{

  private static Node head;

  private static Node sortedList(Node head){

    if(head == null || head.next == null){
      return head;
    }

    // Step 1: Cut the list into two halves using slow and fast pointers
    Node prev=null, slow = head, fast = head;
    while(fast!=null && fast.next!=null){
      prev = slow;
      slow = slow.next;
      fast = fast.next.next;
    }

    prev.next = null;

    // Step 2: sort each half
    Node l1 = sortedList(head); // First half
    Node l2 = sortedList(slow); // Second half

    // Step 3: merge the two halves l1 and l2
    return merge(l1,l2);

  }

  private static Node merge(Node l1, Node l2){

    Node l = new Node(0), p = l;

    while(l1 != null && l2 != null){

      if(l1.data < l2.data){
        p.next = l1;
        l1=l1.next;
      }else{
        p.next = l2;
        l2 = l2.next;
      }
      p = p.next;
    }

    if(l1 != null){
      p.next = l1;
    }

    if(l2!=null){
      p.next = l2;
    }

    return l.next;

  }


  private static void display(Node head){

    Node temp = head;
    while(temp != null){
      System.out.print(temp.data + " ---> ");
      temp = temp.next;
    }
    System.out.println("null" + "\n");


  }



  public static void main(String args[]){

    head = new Node(3);
    Node node1 = new Node(18);
    Node node2 = new Node(5);
    Node node3 = new Node(15);

    head.next = node1;
    node1.next = node2;
    node2.next = node3;
    System.out.println("Before Sort");
    display(head);
    head = sortedList(head);
    System.out.println("After Sort");
    display(head);




  }


}
