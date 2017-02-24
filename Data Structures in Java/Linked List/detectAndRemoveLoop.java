public class detectAndRemoveLoop {

private static Node head;
/**
 * Detects loop and removes it
 * @return *head with loop removed
 */
private static Node detectRemoveLoop(){

        // Initialize the slow and fast
        Node slow = head;
        Node fast = head.next;

        while(slow!=null && fast!=null && fast.next!=null) {
                slow = slow.next;
                fast = fast.next.next;
                if(slow == fast) {
                        // Loop exists now remove the Loop
                        slow = head; // Move slow to start
                        while(slow != fast.next) {
                                // Move slow and fast at same pace
                                slow = slow.next;
                                fast = fast.next; // Reduce the pace of fast
                        }
                        fast.next = null; // Remove the loop
                }
        }
        return head;
}

private static void print(){

        Node temp = head;
        while(temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
        }
        System.out.println();

}


public static void main(String args[]){
        head = new Node();

        Node node1 = new Node();
        Node node2 = new Node();
        Node node3 = new Node();
        Node node4 = new Node();


        head.data = 1;
        node1.data = 2;
        node2.data = 3;
        node3.data = 4;
        node4.data = 5;


        head.next = node1;
        node1.next =node2;
        node2.next =node3;
        node3.next =node4;
        node4.next =node1;

        head = detectRemoveLoop();
        print();

}

}
