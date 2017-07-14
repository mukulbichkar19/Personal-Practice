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

  private static void display(Node head){
    if(head != null){
      System.out.print(head.data + " ");
      display(head.next);
    }
  }

  private static Node recursiveReverse(Node curr,Node prev){
    if(curr.next == null){
      head = curr;
      head.next = prev;
      return head;
    }
    Node next = curr.next;
    curr.next = prev;
    return recursiveReverse(next,curr);
  }

  private static Node swapKNodes(Node head, int k){

    Node curr = head;
    Node prev=null , next = null;
    int count = 0;
    while(count < k && curr!=null){
      next = curr.next;
      curr.next = prev;
      prev = curr;
      curr = next;
      count++;
    }
    if(next != null){
      head.next = swapKNodes(next, k);
    }
    return prev;

  }



  public static void main(String args[]){

    head = new Node(1,
                    new Node(2,
                    new Node(3,
                    new Node(4,
                    new Node(5, null)))));
    //fun2(head);

    head = recursiveReverse(head, null);
    java.util.Scanner scan = new java.util.Scanner(System.in);
    System.out.println("Enter the value of k: ");
    int k = scan.nextInt();
    head = swapKNodes(head,k);
    display(head);
    System.out.println();
  }


}
