public class middleList{

  private static Node head1;
  private static Node head2;


  private static void display(Node head){
    Node temp = head;
    while(temp != null){
      System.out.print(temp.data + " ");
      temp = temp.next;
    }
    System.out.println();
  }

  // Method 1:
  // a. First find length
  // b. Move till length/2
  private static int middle_scan(Node head){

      Node temp = head;
      int length = 0;
      while(temp != null){
        length++;
        temp = temp.next;
      }

      int counter = 0;
      temp = head;
      while(counter != (length/2)){
        temp = temp.next;
        counter++;
      }
      return temp.data;
  }

  // Method 2: Using Slow and Fast Pointer
  // Most of the questions in linked list will be
  // tackled optimally using slow and fast Ptr approach
  private static int middle_slow_fast(Node head){

    Node slow = head;
    Node fast = head;

    while(fast != null && fast.next != null){

      slow = slow.next;
      fast = fast.next.next;

    }
    return slow.data;
  }

  // Method 3: Using Mid and counter
  private static int usingCounter(Node head){
    Node mid = head;
    int counter = 0;
    while(head!=null){
      if(counter%2 !=0){
        mid = mid.next;
      }
      counter++;
      head = head.next;
    }

    return mid.data;

  }

  public static void main(String args[]){

     head1 = new Node(1,
                           new Node(2,
                           new Node(3,
                           new Node(4,
                           new Node(5,null)))));

     head2 = new Node(1,
                           new Node(2,
                           new Node(3,
                           new Node(4,
                           new Node(5,
                           new Node(6,null))))));

    System.out.println("The middle of ll is: "+middle_scan(head2));
    System.out.println("The middle of ll using fast and slow is: "+
                        middle_slow_fast(head2));
    System.out.println("The middle of ll using  counter is: "+
                        usingCounter(head2));


  }

}
