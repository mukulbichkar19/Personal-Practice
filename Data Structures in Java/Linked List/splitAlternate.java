public class splitAlternate{

private static Node head;

private static void split(){

        Node temp1 = head;
        Node temp2 = temp1.next;

        while(temp1 != null && temp2 != null) {
                temp1.next = temp2.next;
                temp1 = temp1.next;
                if(temp1.next != null){
                  temp2.next = temp1.next;
                }

                temp2 = temp1.next;
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

        head = new Node(0,
                        new Node(1,
                                 new Node(0,
                                          new Node(1,
                                                   new Node(0,
                                                            new Node(1,null))))));
        split();

}

}
