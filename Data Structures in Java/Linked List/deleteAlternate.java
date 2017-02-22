public class deleteAlternate {

private static Node head;

private static void delete(){

        Node prev = head;
        Node current = prev.next;

        while(prev != null && current != null) {

                prev.next = current.next;
                current = null;
                prev = prev.next;
                if(prev != null) {
                        current = prev.next;
                }
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
                                                    null))));

        delete();
        print();


}

}
