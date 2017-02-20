public class insertInSortedLL{

  private static Node head;

  private static Node insert(Node head, int data){
    if(head == null){
      Node newNode = new Node(data, null);
      head = newNode;
      return head;
    }else if(head.data > data){
      Node temp = head;
      Node newHead = new Node();
      newHead.data = data;
      newHead.next = temp;
      head = newHead;
      return head;
    }else{

      Node temp = head;
      while(!(temp.next.data > data)){
        temp = temp.next;
      }
      
      Node newNode = new Node();
      newNode.data = data;
      newNode.next = temp.next;
      temp.next = newNode;
    }
    return head;
  }

  // Display Linked List
  private static void display(Node head){
          Node temp = head;
          while(temp != null) {
                  System.out.print(temp.data + " ");
                  temp = temp.next;
          }
          System.out.println();
  }


  public static void main(String args[]){

    head = new Node(2,
                    new Node(5,
                    new Node(7,
                    new Node(10,
                    new Node(15,null)))));

    java.util.Scanner scan = new java.util.Scanner(System.in);
    System.out.println("Enter the number to be inserted: ");
    int data = scan.nextInt();

    display(insert(head, data));





  }
}
