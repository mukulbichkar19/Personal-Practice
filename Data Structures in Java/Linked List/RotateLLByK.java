public class RotateLLByK {

private static Node head;

private static Node rotateLL(int k){

        Node temp = head;
        int count = 1;
        while(temp!=null && count < k) {
                temp = temp.next;
                count++;
        }
        Node newhead = temp.next;
        temp.next = null;
        temp = newhead;
        while(temp.next != null) {
                temp = temp.next;
        }
        temp.next = head;
        head = newhead;
        return head;

}

private static void print(){
        Node temp = head;
        while(temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
        }
}

public static void main(String args[]){

        head = new Node(10,
                        new Node(20,
                                 new Node(30,
                                          new Node(40,
                                                   new Node(50,
                                                            new Node(60,null))))));

        java.util.Scanner scan = new java.util.Scanner(System.in);

        System.out.println("Enter the value of k : ");
        int k = scan.nextInt();

        head = rotateLL(k);
        print();


}

}
