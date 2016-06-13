// DoublyLinkList

/* Insertion

 1. Beginning
 2. At end
 3. At any position

*/

/* Deletion

1. At Start
2. At end
3. At any position

*/

 public class Doublylinklist{


 	int length;

 	DoubleNode head;
 	
 	// insert at start
 	public void insertAtStart(int data){

 		if(length==0){

 			head = new DoubleNode(data);
 			length++;
 		}
 		else{
 			 
 			 DoubleNode temp = new DoubleNode(data);
 			 temp.next = head;
 			 head.prev = temp;
 			 head = temp;
 			 length++;
 		}

 	}

 	// insert at end
 	public void insertAtEnd(int data){

 		DoubleNode temp = head;
 		DoubleNode node = new DoubleNode(data);

 		while(temp.next!=null){
 			temp=temp.next;
 		}
 		temp.next = node;
 		node.prev = temp;
 		length++;

 	}

 	//insert at any pos
 	public void insertAtAnyPos(int data, int position){
 		
 		System.out.println("Inside insert at any position");
 		int i=1;
 		DoubleNode temp = head;
 		DoubleNode node = new DoubleNode(data);
 		while(i!=position-1){
 			temp=temp.next;
 			i++;
 		}
 		//System.out.println(temp.data);
 		node.prev = temp;
 		node.next = temp.next;
 		temp.next = node;
 		temp.next.prev = node;
 		length++;
 	}

 	//  remove at start
 	public void removeAtStart(){
 		if(length==1){
 			head=null;
 			length--;
 		}
 		else{
 			DoubleNode temp = head;
 			head = temp.next;
 			head.prev=null;
 			temp = null;
 			length--;
 		}
 	}

 	// remove at end
 	public void removeAtEnd(){
 		if(length==1){
 			head=null;
 			length--;
 		}
 		else{
 			DoubleNode temp = head;
 			while(temp.next.next!=null){
 				temp=temp.next;
 			}
 			temp.next=null;
 			length--;
 		}
 	}

 	// remove at positon
 	public void removeAtpos(int position){
 		
 		int i=1;
 		DoubleNode temp = head;
 		while(i != position-1){
 			temp=temp.next;
 			i++;
 		}
 		//System.out.println(temp.data);
 		DoubleNode delnode = temp.next;
 		temp.next = delnode.next;
 		delnode.next.prev = temp;
 		delnode = null;
 		length--;

 	}

 	public void displayList(){

 		DoubleNode temp = head;
 		while(temp!=null){

 			System.out.print(temp.data);
 			System.out.print("--->");
 			temp = temp.next;

 		}
 		System.out.print("null");

 	}

 	public void displayLength(){
 		System.out.println("The length is: "+length);
 	}







 	public static void main(String args[]){


 		Doublylinklist dll =  new Doublylinklist();
 		java.util.Scanner scan = new java.util.Scanner(System.in);
 		int choice,position,data;
 		char cont;
 		do{

 			System.out.println("**** Menu ****");
 			System.out.println("---- Insertion -----");
 			System.out.println("1. At Beginning");
 			System.out.println("2. At end");
 			System.out.println("3. At any position");
 			System.out.println("4. Delete at start");
 			System.out.println("5. Delete at end");
 			System.out.println("6. Delete at any position");
 			System.out.println("7. Display List");

 			System.out.println("8. Display length");	




 			System.out.println("Enter choice: ");
 			choice = scan.nextInt();
 			switch(choice){
 				case 1: System.out.println("Enter the data: ");
 						data = scan.nextInt();
 						dll.insertAtStart(data);
 						break;
 				case 2: System.out.println("Enter the data");
 						data = scan.nextInt();
 						dll.insertAtEnd(data);
 						break;
 				case 3: System.out.println("Enter the data");
 						data = scan.nextInt();
 						System.out.println("Enter the position:");
 						position = scan.nextInt();
 						if(position==1){
 							dll.insertAtStart(data);
 						}
 						else if(position == dll.length){
 							dll.insertAtEnd(data);
 						}
 						else{
 							dll.insertAtAnyPos(data,position);
 						}		
 						break;
 				case 4: if(dll.length == 0){
 							System.out.println("Cannot delete as link list does not exists");
 						}		
 						else{
 							dll.removeAtStart();
 						}
 						break;
 				case 5: if(dll.length == 0){
 							System.out.println("Cannot delete as link list does not exists");
 						}
 						else{
 							dll.removeAtEnd();
 						}
 						break;
 				case 6: System.out.println("Enter the position: ");
 						position=scan.nextInt();
 						if(position==1){
 							dll.removeAtStart();
 						}
 						else if(position == dll.length){
 							dll.removeAtEnd();
 						}
 						else{
 							dll.removeAtpos(position);
 						}
 						break;		
 				case 7: dll.displayList();
 						break;		
 				case 8: dll.displayLength();	
 						break;

 				default: System.out.println("Wrong Choice");
 			}

 			System.out.println("\nDo you want to continue(y/n): ");
 			cont = scan.next().charAt(0);
 		}while(cont=='y' || cont=='Y');



 	}
 }