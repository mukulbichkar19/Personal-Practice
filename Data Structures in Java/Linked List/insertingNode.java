/*

The below code covers insertion, finding length(both Iterative & recursive),
 and searching an element(iterative and recursive)

*/
public class insertingNode {

private static Node linked_list = null;

// Insert Node at the start
private static Node insertAtHead(Node linked_list, int data){

        // Case when linked list is empty
        if(linked_list == null) {
                Node firstHead = new Node();
                firstHead.data = data;
                firstHead.next = null;
                linked_list = firstHead;
                return linked_list;
        }else{
                Node oldHead = linked_list;
                Node newHead = new Node();
                newHead.data = data;
                newHead.next = oldHead;
                linked_list = newHead;
        }
        return linked_list;
}

// Insert at given position
private static Node insertAtPos(Node linked_list, int data, int pos){



  if(pos == 1){
    return insertAtHead(linked_list, data);
  }else if(pos == length(linked_list)+1){
    return insertAtTail(linked_list, data);
  }else{
    Node temp = linked_list;
    int prev = 1;
    while(prev != pos-1){
      prev++;
      temp = temp.next;
    }
    Node newNode = new Node();
    newNode.data = data;
    newNode.next = temp.next;
    temp.next = newNode;
  }
  return linked_list;
}



// Insert at the end
private static Node insertAtTail(Node linked_list, int data){

        Node temp = linked_list;
        while(temp.next !=  null) {
                temp = temp.next;
        }
        Node tailNode = new Node();
        tailNode.data = data;
        tailNode.next = null;
        temp.next = tailNode;
        return linked_list;
}


// // Find length of linked List (Iterative)
// private static int length(Node linked_list){
//   Node temp = linked_list;
//   int length = 0;
//   while(temp != null){
//     length++;
//     temp=temp.next;
//   }
//   return length;
// }


// Find length of linked List (Recursive)

private static int length(Node linked_list){
  //Node temp = linked_list;
  if(linked_list == null){
    return 0;
  }else{
    return 1+length(linked_list.next);
  }

}

// // Search in linked list(Iterative)
// private static boolean searchInLL(Node linked_list, int search){
//
//   Node temp = linked_list;
//   while(temp != null){
//     if(temp.data == search){
//       return true;
//     }
//     temp = temp.next;
//   }
//   return false;
// }

// Search in linked list(Recursive)
private static boolean searchInLL(Node linked_list, int search){

  if(linked_list == null){
    return false;
  }else{
    if(linked_list.data == search){
      return true;
    }
    return searchInLL(linked_list.next, search);
  }

}



// Display Linked List
private static void display(Node linked_list){
        Node temp = linked_list;
        while(temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
        }
        System.out.println();
}



public static void main(String args[]){

        int data;

        char ch;

        do {
                System.out.println("------- Menu --------");
                System.out.println("1. Insert at head.");
                System.out.println("2. Insert at given position");
                System.out.println("3. Insert at the end");
                System.out.println("4. Display linked list");
                System.out.println("5. Length of linked list");
                System.out.println("6. Search an element");
                java.util.Scanner scan = new java.util.Scanner(System.in);
                System.out.println("Enter choice: ");
                int option = scan.nextInt();
                switch(option) {

                case 1: System.out.println("Insert the data: ");
                        data = scan.nextInt();
                        linked_list = insertAtHead(linked_list, data);
                        break;
                case 2: System.out.println("Insert the data and position: ");
                        data = scan.nextInt();
                        int pos = scan.nextInt();
                        linked_list = insertAtPos(linked_list,data,pos);
                        break;
                case 3: System.out.println("Insert the data: ");
                        data = scan.nextInt();
                        linked_list = insertAtTail(linked_list, data);
                        break;
                case 4: display(linked_list);
                        break;
                case 5: System.out.println("The length of linked list is: "+
                                            length(linked_list));
                        break;
                case 6: System.out.println("Enter the number you want to search: ");
                        int search = scan.nextInt();
                        if(searchInLL(linked_list, search)){
                          System.out.println("Element "+search+" present");
                        }else{
                          System.out.println("Element "+search+" not present");
                        }
                        break;
                default: System.out.println("Wrong Choice");

                }
                System.out.println("Do you want to continue(y/n): ");
                ch = scan.next().charAt(0);

        } while(ch == 'y' || ch == 'Y');



}



}
