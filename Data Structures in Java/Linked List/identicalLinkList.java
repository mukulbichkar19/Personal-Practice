public class identicalLinkList {

private static Node head1;
private static Node head2;

private static boolean checkIndentity(){

        Node temp1 = head1;
        Node temp2 = head2;
        while(temp1 != null && temp2 !=null) {
                if(temp1.data != temp2.data) {
                        return false;
                }
                temp1 = temp1.next;
                temp2 = temp2.next;
        }
        // Indicates the length diff condition
        if((temp1 == null && temp2 != null) || (temp2 == null && temp1 != null)) {
                return false;
        }
        return true;


}


public static void main(String args[]){

        head1 = new Node(1,
                         new Node(2,
                                  new Node(3,
                                           new Node(4,
                                                    new Node(5, null)))));
        
        head2 = new Node(1,
                         new Node(2,
                                  new Node(3,
                                           null)));

        if(checkIndentity()) {
                System.out.println("The two link lists are identical.");
        }else{
                System.out.println("The two link lists are not identical.");
        }




}

}
