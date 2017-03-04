public class MoveMDeleteN{

  private static Node head;

  private static Node moveMdeleteN(int m, int n){

    Node temp = head;
    Node tempm;
    Node tempn;
    int count = 0;
    while(temp != null){
      tempm = temp;
      count = 1;
      while(count < m){
        tempm = tempm.next;
        count++;
      }

      tempn = tempm;
      count = 0;
      while(tempn != null && tempn.next != null && count < n){
        tempn = tempn.next;
        count++;
      }
      tempn = tempn.next;
      tempm.next = tempn;
      temp = tempn;
    }
    return head;

  }

  private static void print(){
    Node temp = head;
    while(temp != null){
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
                    new Node(6,
                    new Node(7,
                    new Node(8,
                    new Node(9,
                    new Node(10, null))))))))));
    java.util.Scanner scan = new java.util.Scanner(System.in);
    System.out.println("Enter M: ");
    int m = scan.nextInt();
    System.out.println("Enter N: ");
    int n = scan.nextInt();
    head = moveMdeleteN(m,n);
    print();



  }

}
