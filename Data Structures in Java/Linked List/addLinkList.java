public class addLinkList {

private static Node head1;
private static Node head2;
private static Node result;




private static Node addLL(){

        int carry = 0;
        Node temp1 = head1;
        Node temp2 = head2;
        Node temp3 = null;
        int sum = 0;

        while(temp1!=null ||  temp2!=null) {
                sum = 0;

                if(temp1 == null && temp2 != null) {
                        sum = temp2.data;
                }else if(temp2 == null && temp1 != null) {
                        sum = temp1.data;
                }else{
                        sum = temp1.data + temp2.data;
                }

                if(temp1==head1 && temp2==head2) {
                        temp3 = new Node(sum%10,null);
                        carry = sum/10;
                        result = temp3;
                }else{
                        int data = sum+carry;
                        temp3.next = new Node(data%10,null);
                        carry = data/10;
                        temp3 = temp3.next;
                }
                if(temp1 != null) {
                        temp1 = temp1.next;
                }
                if(temp2 != null) {
                        temp2 = temp2.next;
                }



        }
        return result;
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

        head1 = new Node(7,
                         new Node(5,
                                  new Node(9, new Node(4,new Node(6,null)))));

        head2 = new Node(8,
                         new Node(4, null));

        print(addLL());




}

}
