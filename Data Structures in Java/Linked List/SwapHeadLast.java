public class SwapHeadLast {

private static Node head;

private static void swap(){
        Node start = head;
        Node end;
        Node sec_last=head;
        while(sec_last.next.next != null) {
                sec_last = sec_last.next;
        }
        end = sec_last.next;
        end.next = start.next;
        head = end;
        sec_last.next = start;
        start.next = null;
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
                                                   new Node(5, null)))));
        swap();
        print();


}




}
