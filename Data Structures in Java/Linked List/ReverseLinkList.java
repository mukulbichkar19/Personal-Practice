/*

   Reversing a linked list using Iterative solution and other using tail recursion


 */


public class ReverseLinkList {

private static Node head;


private static Node iterativeReverse(Node head){

        Node prev = null;
        Node current = head;
        Node next = current.next;

        while(next != null) {
                next = current.next;
                current.next = prev;
                prev = current;
                current = next;
        }
        return prev;
}


private static Node recursive(Node curr, Node prev){

        // Base Condition
        if(curr.next == null) {
                head = curr;
                curr.next = prev;
                return null;
        }
        Node next1 = curr.next;

        curr.next = prev;

        recursive(next1, curr);
        return head;

}



private static void display(Node head){
        Node temp = head;
        while(temp != null) {
                System.out.print(temp.data+" ");
                temp =  temp.next;
        }
        System.out.println();
}

public static void main(String args[]){

        head = new Node(85,
                        new Node(15,
                                 new Node(4,
                                          new Node(20,null))));

        display(recursive(head, null));


        display(iterativeReverse(head));






}

}
