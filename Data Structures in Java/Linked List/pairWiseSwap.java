public class pairWiseSwap {

private static Node head;

// Just swap the data
private static void iterativeSwap(){

        Node temp = head;
        // the stopping condition for odd length ll is
        // temp.next != null and for even length ll it is
        // temp != null check this first as temp.next !=  null
        // will check for null--> next which is absent giving null Pointer error
        while(temp != null && temp.next != null) {
                int swapdata = temp.data;
                temp.data = temp.next.data;
                temp.next.data = swapdata;
                temp =  temp.next.next;
        }
}

private static void recursiveSwap(Node head){
        if(head != null && head.next != null) {
                int swap = head.data;
                head.data = head.next.data;
                head.next.data = swap;
                recursiveSwap(head.next.next);
        }

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

        head = new Node(1,
                        new Node(2,
                                 new Node(3,
                                          new Node(4,
                                                   new Node(5,
                                                            null)))));

        iterativeSwap();
        print();

        recursiveSwap(head);
        print();




}

}
