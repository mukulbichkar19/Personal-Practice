public class Recursive2{

  private static Node head;

  private static void fun2(Node head){
    if(head == null){
      return;
    }
    System.out.println(head.data);

    if(head.next != null){
      fun2(head.next.next);
    }
    System.out.println(head.data);

  }

  public static void main(String args[]){

    head = new Node(1,
                    new Node(2,
                    new Node(3,
                    new Node(4,
                    new Node(5, null)))));
    fun2(head);

  }


}
