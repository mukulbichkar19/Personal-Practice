public class findIntersection {

private static Node head1;
private static Node head2;

private static void display(Node head){
        while(head!=null) {
                System.out.print(head.data + " ");
                head = head.next;
        }
        System.out.println();
}

private static int findIntersectionOptimal(Node head1, Node head2){

        // find length of both the link lists
        int len1 = 0;
        int len2 = 0;
        Node temp = head1;
        Node fir;
        Node ptr;
        while(temp != null) {
                len1++;
                temp = temp.next;
        }
        temp = head2;
        while(temp != null) {
                len2++;
                temp = temp.next;
        }
        int diff = 0;
        if(len1 > len2) {
                diff = len1-len2;
        }else{
                diff = len2-len1;
        }

        if(len1 > len2) {
                temp = head1;
                ptr = head2;
        }else{
                temp = head2;
                ptr = head1;
        }

        while(diff != 0) {

                diff--;
                temp = temp.next;

        }
        fir = temp;

        len1 = 0;
        len2 = 0;
        while(temp != null) {
                temp = temp.next;
                len1++;
        }
        Node test = ptr;
        while(test != null) {
                test = test.next;
                len2++;
        }
        
        if(len1 == len2) {
                temp = fir;
                while(temp.data != ptr.data) {
                        temp = temp.next;
                        ptr = ptr.next;
                }
                if(temp.data == ptr.data) {
                        return temp.data;
                }
        }
        return -1;




}

public static void main(String args[]){

        head1 = new Node();
        head2 = new Node();
        Node node1 = new Node(); // 6
        Node node2 = new Node(); // 9
        Node node3 = new Node(); // 15
        Node node4 = new Node(); // 30

        head1.data = 3;
        head1.next = node1;

        node1.data = 6;
        node1.next = node2;

        node2.data = 9;
        node2.next = node3;

        node3.data = 15;
        node3.next = node4;

        node4.data = 30;
        node4.next = null;

        head2.data = 10;
        head2.next = node3;

        // Most optimal method

        System.out.println("Intersection exists at point: "+
                            findIntersectionOptimal(head1, head2));

        //display(head2);

}

}
