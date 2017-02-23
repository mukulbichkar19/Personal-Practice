public class swappingNodes{

  private static Node head;

  private static void display(Node head){
    Node temp = head;
    while(temp != null){
      System.out.print(temp.data + " ");
      temp = temp.next;
    }
    System.out.println();
  }

  private static Node swapNodes(int val1,int val2){

    Node temp1 = head;
    Node temp2 = head;
    Node x = head;
    Node y = head;
    while(x.data != val1){
      temp1 = x;
      x = temp1.next;
    }

    while(y.data != val2){
      temp2 = y;
      y = temp2.next;
    }






    if(x==null || y==null){
      return null;
    }

    if(temp1 != null){
      temp1.next = y;
    }else{
      head = y;
    }

    if(temp2 != null){
      temp2.next = x;
    }else{
      head = x;
    }

    Node temp = x.next;
    x.next = y.next;
    y.next = temp;

    return head;
  }

  public static void main(String args[]){

      head = new Node(10,
                      new Node(15,
                      new Node(12,
                      new Node(13,
                      new Node(20,
                      new Node(14, null))))));
      java.util.Scanner scan = new java.util.Scanner(System.in);
      System.out.println("Enter the first number: ");
      int val1 = scan.nextInt();
      System.out.println("Enter the second number: ");
      int val2 = scan.nextInt();
      display(swapNodes(val1, val2));

      //display(head);


  }
}
