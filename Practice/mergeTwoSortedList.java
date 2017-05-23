public class mergeTwoSortedList{

  private static void display(Node head){

    Node temp = head;
    while(temp != null){
      System.out.print(temp.data + " ---> ");
      temp = temp.next;
    }
    System.out.print(" null ");
    System.out.println();

  }

  private static Node mergedLists(Node l1, Node l2) {
    Node res = new Node(-1);
    if(l1 == null){
      return l2;
    }
    if(l2 == null){
      return l1;
    }
    if(l1.data <= l2.data){
      res = l1;
      l1.next = mergedLists(l1.next, l2);
    }else{
      res = l2;
      l2.next = mergedLists(l1, l2.next);
    }
    return res;
  }

  // Using a dummy variable
  private static Node mergeIterative(Node l1, Node l2){
    Node head = new Node(0);
    Node p = head;
    while(l1 != null || l2!=null){
      if(l1!=null && l2!=null){
        if(l1.data > l2.data){
          p.next = l2;
          l2 = l2.next;
        }else{
          p.next = l1;
          l1 = l1.next;
        }
        p = p.next;
      } else if(l1 == null){
        p.next = l2;
        break;
      } else if(l2 == null) {
        p.next = l1;
        break;
      }
    }
    return head.next;
  }



  public static void main(String args[]){

    Node head1 = new Node(1);
    Node newNode1 = new Node(13);
    Node newNode2 = new Node(15);

    Node head2 = new Node(8);
    Node newNode21 = new Node(11);
    Node newNode22 = new Node(70);

    head1.next = newNode1;
    newNode1.next = newNode2;

    head2.next = newNode21;
    newNode21.next = newNode22;

    //display(mergedLists(head1, head2));
    display(mergeIterative(head1, head2));




  }




}
