public class SortedInsertInCLL{

  private static Node head;

  private static void print(){
    Node temp = head;
    //System.out.print(head.data+" ");
    while(temp.next != head){
      System.out.print(temp.data + " ");
      temp = temp.next;
    }
    System.out.println(temp.data + " ");

  }

  private static Node insert(int n){

    Node temp = head;
    Node newNode = new Node();
    newNode.data = n;
    // If list is empty
    if(head == null){
      newNode.next = null;
      head = newNode;
    }

    // If data to be inserted is less than the head
    if(n < head.data){
      while(temp.next != head){
        temp = temp.next;
      }
      temp.next = newNode;
      newNode.next = head;
      head = newNode;
    }else if(n > head.data){
      while(temp.next != head){
        if(temp.data < n && temp.next.data > n){
          newNode.next = temp.next;
          temp.next = newNode;
        }
        temp = temp.next;
      }
      if(n > temp.data){
        temp.next = newNode;
        newNode.next = head;
      }      
    }


    return head;
  }

  public static void main(String args[]){

    head = new Node();
    Node node1 = new Node();
    Node node2 = new Node();
    Node node3 = new Node();
    //Node node4 = new Node();

    head.data = 2;
    node1.data = 5;
    node2.data = 8;
    node3.data = 10;
    head.next = node1;
    node1.next = node2;
    node2.next = node3;
    node3.next = head;
    print();

    java.util.Scanner scan = new java.util.Scanner(System.in);

    System.out.println("Enter the element to be inserted: ");
    int n = scan.nextInt();
    head = insert(n);
    print();

  }


}
