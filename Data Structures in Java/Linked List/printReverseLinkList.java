public class printReverseLinkList{

  private static Node head;

  private static void printReverse(Node head){
    if(head == null){
      return;
    }else{
      printReverse(head.next);
      System.out.print(head.data+" ");
    }
    System.out.println();
  }

  public static void main(String args[]){

    head = new Node(10,
                    new Node(12,
                    new Node(15,
                    new Node(18, null))));

    printReverse(head);



  }

}
