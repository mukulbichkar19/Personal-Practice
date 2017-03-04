public class StringCompare{

  private static Node head1;
  private static Node head2;

  private static int stringcmp(){

      Node temp = head1;
      Node temp2 = head2;

      if(temp == null && temp2 == null){
        return 1;
      }

      while(temp != null && temp2 != null && temp.data == temp2.data){
        temp = temp.next;
        temp2 = temp2.next;
      }

      if(temp != null && temp2 != null){
        if(temp.data > temp2.data){
          return 1;
        }else{
          return -1;
        }
      }

      if(temp == null && temp2 != null){
        return -1;
      }

      if(temp != null && temp2 == null){
        return 1;
      }

      return 0;

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
                                     new Node(4, new Node(2, null)))));
    int comp = stringcmp();
    if(comp == 0){
      System.out.println("The two strings are equal");
    }else if(comp == 1){
      System.out.println("The first string is greater than second string.");
    }else if(comp == -1){
      System.out.println("The second string is greater than first string.");
    }

  }

}
