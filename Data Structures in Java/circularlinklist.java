// CircularLinkedList
/*
In the following program the below operations will be done:- 

A) Insertion
1. Insert at start.
2. Insert at end
3. Insert at any position

B) Deletion
1. Remove from Beginning.
2. Remove from End.
3. Remove from a specified location.

C) General
1. Display the length.
2. Clear the linked list.

*/

public class circularlinklist{

			int length; // Length of linked list

			Node head;



		public void insertAtStart(int data){

				if(length==0){
					head = new Node(data);
					head.next = head;
					length++;
					//System.out.println("Head is "+head.data+" and next is "+head.next.data);
				}
				else{
						Node node = new Node(data);
						Node temp=head;
						while(temp.next!=head){
							temp=temp.next;
						}
						node.next=head;
						head = node;
						temp.next=head;
						length++;
					}

		}

		public void insertAtEnd(int data){

			Node temp = head;
			while(temp.next!=head){
				temp=temp.next;
			}
			Node node = new Node(data);
			//System.out.println(temp.data);
			node.next = head;
			temp.next = node;
			//temp.next = node;
			length++;

		}

		public void insertAtPos(int data, int position){

			System.out.println("Inside Insert at position "+position);
			int i = 1;
			Node temp = head;
			System.out.println(i);
			int index = position-1;
			while(index == i){
				temp = temp.next;
				i++;
			}
			System.out.println(temp.data);
			/*Node node = new Node(data);
			node.next = temp.next;
			temp.next = node;
			length++;*/
		}

		public void removeFirst(){
			if(length==1){
				head = null;
				length--;
			}
			else{
				
				Node temp = head;
				Node delhead = temp;
				while(temp.next!=head){
					temp = temp.next;
				}
				//System.out.println(temp.data);
				Node newhead = head.next;
				temp.next = newhead;
				head = newhead;
				delhead = null;
				//head = temp.next;
				//temp = null;
				length--;
			}
		}

		public void removeLast(){
			if(length==1){
				head = null;
				length--;
			}
			else{
					Node temp = head;
					while(temp.next.next!=head){
						temp=temp.next;
					}
					//System.out.println(temp.data);
					Node delnode = temp.next;
					temp.next = head;
					delnode = null;
					length--;
			}
		}

		public void removeFromSpecifiedPosition(int position){

			
				int i=1;
				Node temp = head;
				while(i!=position-1){
					temp = temp.next;
					i++;
				}
				Node del = temp.next;
				temp.next = del.next;
				del = null;

			}

		

		public void displayLength(){

			System.out.println("The length of link list is: "+length);
		}

		public void displayList(){

				//int len = length;
			if(length!=0){
			//Node temp = head;
			if(length==1){
				System.out.print(head.data);
				System.out.print(" ---> ");	
				
			}
			else{
				Node temp = head.next;
				System.out.print(head.data);
				System.out.print(" ---> ");
				while(temp!=head){
				//System.out.println(temp.next.data);
				System.out.print(temp.data);
				temp=temp.next;
				//System.out.println("\t"+temp.data);
				System.out.print(" ---> ");
				//len--;
				 }
		    }
		    System.out.print("null");
			System.out.println();
		}
			else{
				System.out.println("Link list does not exists");
			}
		}

		public void clearAll(){

			head = null;
			length = 0;
		}




	

	public static void main(String args[]){

		//System.out.println("Enter the data for head node: ");
		java.util.Scanner scan = new java.util.Scanner(System.in);
		char ans;
		int choice=0;
		int data=0;
		circularlinklist cll = new circularlinklist();
		cll.length = 0;
		do{
			System.out.println("*******  Menu *******");
			System.out.println("1. Insert at the start");
			System.out.println("2. Insert at the end (Append)");
			System.out.println("3. Insert at the any position"); //Not able to implement
			System.out.println("----------------------------");
			System.out.println("4. Remove a node from beginning");
			System.out.println("5. Remove a node from end");
			System.out.println("6. Remove a node from specified position");
			System.out.println("----------------------------");
			System.out.println("7. Length of linked list");
			System.out.println("8. Delete the linked list");
			System.out.println("9. Display Linked List");
			System.out.println("Enter choice: ");
			choice = scan.nextInt();

			switch(choice){


					case 1: System.out.println("Enter data: ");
							data = scan.nextInt();
							cll.insertAtStart(data);
							break;
					case 2: System.out.println("Enter data: ");
							data = scan.nextInt();
							cll.insertAtEnd(data);
							break;
					case 3: System.out.println("Enter data: ");	
							data = scan.nextInt();
							System.out.println("Enter the position at which you want to enter: ");
							int position = scan.nextInt();
							if(position > cll.length){
								System.out.println("Cannot insert at this position");
								System.out.println("The length of list is: "+cll.length);
								break;
							}
							else{
								if(position == 1){
									cll.insertAtStart(data);
								}
								else if(position == cll.length+1){
									cll.insertAtEnd(data);
								}
								else{
									cll.insertAtPos(data,position);
								}
							}
						
						break;
					case 4: if(cll.length==0){

								System.out.println("Cannot delete as link list does not exists");
							}
							else{
									cll.removeFirst();
							}
							break;
					case 5: if(cll.length==0){

								System.out.println("Cannot delete as link list does not exists");
							}
							else{
									

									cll.removeLast();
							}
							break;	
					case 6: if(cll.length == 0){
								System.out.println("Cannot remove the node as link list does not exists");
							}		
							else{
									System.out.println("Enter the position you want to remove: ");
									position = scan.nextInt();
									if(position == 1){
										cll.removeFirst();
									}
									else if(position == cll.length){
										cll.removeLast();
									}
									else{
										cll.removeFromSpecifiedPosition(position);
									}
									
								}
							break;
					case 7: cll.displayLength();
							break;
					case 8: cll.clearAll();
							 break;
					case 9: cll.displayList();
							 break;		
					default: System.out.println("Wrong Choice");		

			}

			System.out.println("Do you want to continue(y/n): ");	
			ans=scan.next().charAt(0);
			//System.out.println("Char is "+ans);
			//System.out.println(ans=='n');
		}while(ans=='y'|| ans=='Y');
	}
}