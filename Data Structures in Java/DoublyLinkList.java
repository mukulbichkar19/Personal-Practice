// DoublyLinkList

/* Insertion

 1. Beginning
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
 		int i=1;
 		DoubleNode temp = head;
 		DoubleNode node = new DoubleNode(data);
 		while(i!=position-1){
 			temp=temp.next;
 			i++;
 		}
 		node.prev = temp;
 		node.next = temp.next;
 		temp.next = node;
 		temp.next.prev = node;
 		length++;
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
 			System.out.println("8. Display List");
 			System.out.println("9. Display length");




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
 				case 8: dll.displayList();
 						break;		
 				case 9: dll.displayLength();	
 						break;

 				default: System.out.println("Wrong Choice");
 			}

 			System.out.println("\nDo you want to continue(y/n): ");
 			cont = scan.next().charAt(0);
 		}while(cont=='y' || cont=='Y');



 	}
 }