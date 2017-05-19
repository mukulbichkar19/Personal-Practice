public class addLL{


  private static void displayLL(Node head){
    Node t = head;
    while(t!=null){
      System.out.print(t.data + " ");
      t = t.next;
    }
    System.out.println();
  }


  private static Node add(Node s, Node t){
    int sum = 0;
    int carry = 0;
    int value = 0;
    Node t1 = s;
    Node t2 = t;
    Node res = new Node(Integer.MIN_VALUE);
    Node t3 = res;
    while(t1!=null || t2!=null)
    {

      if(t1!=null && t2==null){
        sum = t1.data + carry;
      }else if(t1==null && t2!=null){
        sum = t2.data + carry;
      }else{
          sum = t1.data + t2.data + carry;
      }

      value = sum%10; // carry from previous step
      carry = sum/10;

      if(res.data == Integer.MIN_VALUE){
        res.data = value;
      }
      else{
        Node newNode = new Node(value);
        t3.next = newNode;
        t3 = t3.next;
      }

      if(t1 != null){
        t1 = t1.next;
      }
      if(t2 !=null){
        t2 = t2.next;
      }
    }
    if(carry != 0){
      Node newNode = new Node(carry);
      t3.next = newNode;
      t3 = t3.next;
    }
    return res;
  }


  public static void main(String args[]){
    // LL 2-->4-->3
    Node head1 = new Node(5);
    Node temp1 = new Node(9);
    // Node temp2 = new Node(3);
    head1.next = temp1;
    // temp1.next = temp2;



    // LL 5-->6-->4
    Node head2 = new Node(5);
    // Node temp3 = new Node(6);
    // Node temp4 = new Node(4);
    // head2.next = temp3;
    // temp3.next = temp4;


    Node result = add(head1, head2);
    displayLL(result);





  }

}
