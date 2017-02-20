public class findNfromEnd {

private static Node head;

private static int usingLength(Node head,int n){

        int length = 0;
        Node temp = head;
        while(temp != null) {
                length++;
                temp = temp.next;
        }
        int counter = 1;
        temp = head;
        if((length-n) <= 0) {
                return -1;
        }
        while(counter != (length-n)) {
                temp = temp.next;
                counter++;
        }
        return temp.data;
}

private static int usingCounter(Node head, int n){
        Node main = head;
        Node ref = head;
        int counter = 0;
        while(counter != n && ref!=null) {
                ref = ref.next;
                counter++;
        }
        if(ref == null) {
                return -1;
        }
        while(ref.next != null) {
                ref = ref.next;
                main = main.next;
        }

        return main.data;

}

public static void main(String args[]){

        head = new Node(35,
                        new Node(15,
                                 new Node(4,
                                          new Node(20,null))));
        java.util.Scanner scan = new java.util.Scanner(System.in);
        System.out.println("Enter the nth node position: ");
        int n = scan.nextInt();
        if(usingLength(head,n) != -1) {
                System.out.println("The nth node from end is: "
                                   +usingLength(head,n));
        }else{
                System.out.println("The nth node from end exceeds limit");
        }

        // using two pointers
        if(usingCounter(head, n) != -1) {
                System.out.println("The nth node from end is: "
                                   +usingCounter(head,n));
        }else{
                System.out.println("The nth node from end exceeds limit");
        }


}


}
