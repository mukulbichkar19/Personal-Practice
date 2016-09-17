// Insertion sort for singly linked list

public class insertionSort{

   // Subroutine for printing the elements of a linked list.
    public static void printLinkList(dataNode head){
      dataNode temp = head;
      while(temp != null){
        System.out.print(temp.data + " ");
        temp = temp.next;
      }
    }


    // Method to sort a linked list
    public static dataNode insertNode(dataNode node){

        if(node == null){
            return null;
        }

        // Making the first node as the start of sorted list
        dataNode sortedList = node;
        node = node.next;
        sortedList.next = null;

        while(node != null){

          final dataNode current = node;
          node = current.next;

          // Find where current belongs
          if(current.data < sortedList.data){
              current.next = sortedList;
              sortedList = current;
          }
          else{
            // Search for correct position to insert
            dataNode search = sortedList;
            while(search.next != null && current.data > search.next.data){
                search = search.next;
            }
            current.next = search.next;
            search.next = current;
          }
        }
        return sortedList;
    }


    public static void main(String args[]){

      dataNode head = new dataNode(3);
      dataNode dataNode1 = new dataNode(2);
      dataNode dataNode2 = new dataNode(5);
      dataNode dataNode3 = new dataNode(1);
      dataNode dataNode4 = new dataNode(7);

      head.next = dataNode1;
      dataNode1.next = dataNode2;
      dataNode2.next = dataNode3;
      dataNode3.next = dataNode4;
      dataNode4.next = null;

      //printLinkList(head);

      printLinkList(insertNode(head));

    }


}
