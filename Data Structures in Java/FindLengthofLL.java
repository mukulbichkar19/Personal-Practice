public class FindLengthofLL{

  private static int findLengthRecursively(ListNode temp){

    if(temp == null){
      return 0;
    }
    return 1+findLengthRecursively(temp.next);

  }

  private static int findLengthIterative(ListNode head){
    ListNode temp = head;
    int len = 0;
    while(temp!=null){
      len++;
      temp = temp.next;
    }
    return len;
  }

  public static ListNode rotate(ListNode head, int k){

    ListNode temp = head;
    ListNode attach = head;
    int count = 1;
    while(count != k){
      temp = temp.next;
      count++;
    }
    ListNode end = temp;
    ListNode newHead = end.next;
    end.next = null;
    ListNode temp2 = newHead;
    while(temp2.next != null){
      temp2 = temp2.next;
    }
    temp2.next = attach;
    return newHead;
  }

  public static void main(String args[]){

    ListNode head = new ListNode(1);
    head.next = new ListNode(5);
    head.next.next = new ListNode(10);
    head.next.next.next = new ListNode(18);
    head.next.next.next.next = new ListNode(25);
    head.next.next.next.next.next = new ListNode(9);
    head.next.next.next.next.next.next = new ListNode(125);

    int length_recursive = findLengthRecursively(head);
    System.out.println("The length of link list by recursion is: "+length_recursive);
    int length_iterative = findLengthIterative(head);
    System.out.println("The length of link list by iteration is: "+length_iterative);
    java.util.Scanner scan = new java.util.Scanner(System.in);
    System.out.println("Enter the value of k: ");
    int k = scan.nextInt();
    ListNode head_new = rotate(head,k);
    ListNode temp = head_new;
    while(temp != null){
      System.out.print(temp.data + " ");
      temp = temp.next;
    }
    System.out.println();

  }


}
