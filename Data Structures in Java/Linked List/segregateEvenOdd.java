public class segregateEvenOdd {

private static Node head;



private static Node segregate(){

        Node temp = head;
        Node even_head = null;
        Node last = null;
        Node next = null;
        Node old_last = null;
        Node prev = null;

        // Find the first even and first odd
        while(temp != null) {

                if(temp.data%2==0 && even_head == null) {
                        even_head = temp;
                        break;
                }
                temp = temp.next;
        }

        // Move the pointer to the last element
        last = head;
        old_last = head;
        while(last.next != null && old_last != null) {
                last = last.next;
                old_last = old_last.next;
        }
      

        // Move all elements before the start of first even to the end of link
        // list
        temp = head;
        while(temp != even_head) {

                if(temp.data%2 != 0 && temp != even_head) {
                        next = temp.next;
                        last.next = temp;
                        temp.next = null;
                        last = temp;
                        temp = next;
                }

        }
        // Assign the even head as the new head
        head = even_head;

        // Iterate from new head and move all odd to the end
        temp = head;

        while(temp != old_last) {

                if(temp.data%2 != 0) {

                        next = temp.next;
                        last.next = temp;
                        temp.next = null;
                        last = temp;
                        prev.next = next;
                        temp = next;

                }else{

                        prev = temp;
                        temp = temp.next;

                }
        }

        print(head);
        return even_head;
}

private static void print(Node head){

        Node temp = head;
        while(temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
        }
        System.out.println();

}


public static void main(String args[]){


        head = new Node(17,
                        new Node(15,
                                 new Node(8,
                                          new Node(12,
                                                   new Node(10,
                                                            new Node(5,
                                                                     new Node(4,
                                                                              new Node(1,
                                                                                       new Node(7,
                                                                                                new Node(6, null))))))))));



        //print(head1);
        head = segregate();
        //print(head);

}


}
