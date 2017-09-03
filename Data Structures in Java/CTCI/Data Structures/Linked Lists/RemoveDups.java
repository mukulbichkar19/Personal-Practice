public class RemoveDups{

  private static Node head = null;

  private static void removeDups(Node head){

    java.util.HashSet<Integer> hashset = new java.util.HashSet<>();
    Node temp = head;
    hashset.add(head.data);
    while(temp.next != null){
      if(!hashset.contains(temp.next.data)){
        hashset.add(temp.data);
        temp = temp.next;
      }else{
        temp.next = temp.next.next;
      }
    }
    display(head);
  }

  private static void display(Node head){
    Node temp = head;

    while(temp != null){
      System.out.print(temp.data + " --> ");
      temp = temp.next;
    }
    System.out.print("null" + "\n");


  }



  public static void main(String args[]){

    head = new Node(5);
    Node node1 = new Node(10);
    Node node2 = new Node(18);
    Node node3 = new Node(19);
    Node node4 = new Node(20);
    Node node5 = new Node(51);

    head.next = node1;
    node1.next = node2;
    node2.next = node3;
    node3.next = node4;
    node4.next = node5;

    // Remove Duplicates
    // Time: O(n)
    // Space: O(m) where m <= n
    removeDups(head);



  }


}
