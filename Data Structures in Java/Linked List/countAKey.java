public class countAKey {

public static void main(String args[]){
        Node head = new Node(1,
                             new Node(2,
                                      new Node(1,
                                               new Node(2,
                                                        new Node(1,
                                                                 new Node(3,
                                                                          new Node(1,null)))))));
        java.util.Scanner scan = new java.util.Scanner(System.in);
        System.out.println("Enter the key: ");
        int n = scan.nextInt();
        int counter = 0;
        while(head != null) {
                if(head.data == n) {
                        counter++;
                }
                head = head.next;
        }
        System.out.println("The count of key "+n+" is "+counter);

}

}
