public class ReverseDLL{

  private static DLL head;

  private static void print(){
    DLL temp = head;
    while(temp != null){
      System.out.print(temp.data + " ");
      temp = temp.next;
    }
    System.out.println();
  }

  private static DLL reverse(){
    DLL prev = null;
    DLL current = head;
    DLL next =  null;
    while(current != null){
      next = current.next;
      current.next = prev;
      current.prev = next;
      prev = current;
      current = next;
    }
    return prev;
  }

  public static void main(String args[]){

    head = new DLL();
    DLL node1 = new DLL();
    DLL node2 = new DLL();
    DLL node3 = new DLL();

    head.data = 10;
    node1.data = 8;
    node2.data = 4;
    node3.data = 2;

    head.prev = null;
    head.next = node1;

    node1.prev = head;
    node1.next = node2;

    node2.prev = node1;
    node2.next = node3;

    node3.prev = node2;
    node3.next = null;

    print();
    head = reverse();
    print();





  }


}
