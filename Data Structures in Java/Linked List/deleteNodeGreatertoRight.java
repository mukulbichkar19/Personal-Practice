// Given a singly linked list, remove all the nodes which have a greater value on right side.
public class deleteNodeGreatertoRight {

private static Node head;

private static void findMaxUsingTwoLoops(){

        Node current = head;
        int max = current.data;
        Node prev =null;
        while(current != null && current.next != null) {
                Node temp = current.next;
                max = current.data;

                while(temp != null) {
                        if(temp.data > max) {
                                max = temp.data;
                        }
                        temp = temp.next;
                }

                if(max > current.data) {

                        if(current==head) {

                                head = current.next;
                                current = head;
                                prev = current;

                        }else{
                                current = current.next;
                                prev.next = current;
                                //current = prev.next;

                        }




                }
                else{

                        prev = current;
                        current = current.next;

                }

        }
}

private static void print(Node head){

        Node temp = head;
        while(temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
        }
        System.out.println();

}

private static Node reverseLL(Node head){

        Node prev = null;
        Node current = head;
        Node next = current.next;
        //System.out.println("current is: "+current.data+" next is: "+next.data);
        while(current != null) {
                next = current.next;
                current.next = prev;
                prev = current;
                current = next;
        }
        //System.out.println("New Head is: "+prev);
        return prev;

}

private static Node deleteMaxToRight(Node head){

        // reverse the given linked list
        head = reverseLL(head);


        // Logic to delete the nodes
        Node current = head;
        int max_so_far = current.data;
        Node next;
        while(current != null){
          next = current.next;
          if(max_so_far < current.data){
            max_so_far = current.data;
          }
          if(next.data < max_so_far){
            current.next = next.next;
          }
          current = current.next;
        }

        // Again reverse to get the linked list in original form
        head = reverseLL(head);


        return head;


}


public static void main(String args[]){

        head = new Node(12,
                        new Node(15,
                                 new Node(10,
                                          new Node(11,
                                                   new Node(5,
                                                            new Node(6,
                                                                     new Node(2,
                                                                              new Node(3, null))))))));

        // Method 1: Using two loops O(n^2)
        //findMaxUsingTwoLoops();
        //print(head);

        // Method 2: Using Reverse Strategy O(n)
        head = deleteMaxToRight(head);
        print(head);


}

}
