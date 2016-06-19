// SinglyLinkedList
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
import java.util.*;

public class MyLinkedList{

			int length; // Length of linked list

			Node head;



		public void insertAtStart(int data){

				if(length==0){
					head = new Node(data);
					length++;
				}
				else{
						Node node = new Node(data);
						node.next = head;
						head = node;
						length++;
				}

		}

		public void insertAtEnd(int data){

			Node temp = head;
			while(temp.next!=null){
				temp=temp.next;
			}
			Node node = new Node(data);
			temp.next = node;
			length++;

		}

		public void insertAtPos(int data, int position){

			int i = 1;
			Node temp = head;
			//System.out.println("Inside Insert at Pos"+position);
			while(position-1 != i){
				temp = temp.next;
				i++;
			}
			//System.out.println("The prev node is: "+temp.data);
			Node node = new Node(data);
			node.next = temp.next;
			temp.next = node;
			length++;
		}

		public void removeFirst(){
			if(length==1){
				head = null;
				length--;
			}
			else{
				
				Node temp = head;
				head = temp.next;
				temp = null;
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
					while(temp.next.next!=null){
						temp=temp.next;
					}
					//System.out.println(temp.data);
					temp.next = null;
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
				//System.out.println(del.data);
				temp.next = temp.next.next;
				del = null;

			}


		// Insertion in a sorted link list
		public int SortedInsert(int data){

			int position = 1;
			Node temp = head;
			//System.out.println(data);
			//System.out.println(temp.data>data);
			while(temp.next.data < data){
				temp=temp.next;
				position++;
			}
			//System.out.println(temp.data);
			//	System.out.println(position);
			return position+1;

		}	

		public boolean checkPalindrome(){

				int middle = 0,i=1;
				boolean isPalindrome=false;

				if(length == 0){
					//return false;
					System.out.println("Link Lists does not exists");
				}
				else{

					middle = length/2;
				}
				
				Node temp =head;
				
				if(length%2 == 0){
					while(i != middle){
						temp = temp.next;
						i++;
					}
				}
				else{
					
					while(i != (middle+1)){
						temp = temp.next;
						i++;
					}
				}
				Node middleNode = temp;
				Node startRev = temp.next;
				Node revHead = temp.next;
				Node nextHead=null;
				if(revHead.next!=null ){
					nextHead = revHead.next;
				}
				else{
					int data = revHead.data;
					if(data == head.data){
						//return true;
						isPalindrome = true;
					}
				}
				while(revHead.next != null){
					int swapData = revHead.data;
					revHead.data = nextHead.data;
					nextHead.data = swapData;
					revHead = nextHead;
					nextHead = revHead.next;
				}
				Node start = head;
				
				while(start.data!=middleNode.data){

					if(start.data == startRev.data){
						isPalindrome=true;
					}
					else{
						isPalindrome=false;
					}

					start=start.next;
					startRev=startRev.next;
				}
				//System.out.println(isPalindrome+" indicates status");
				return isPalindrome;



		}
		

		public void displayLength(){

			System.out.println("The length of link list is: "+length);
		}

		public void displayList(){

			if(length!=0){
			Node temp = head;
			while(temp!=null){
				System.out.print(temp.data);
				temp=temp.next;
				System.out.print(" ---> ");
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

		public void reverseList(){

			Node current = head;
			Node prev =null;
			Node nextNode = null;

			while(current!=null){

				nextNode = current.next;

				current.next = prev;

				prev = current;

				current = nextNode;
			}
			//System.out.println(prev.data);
			head = prev;
		}

		public int findMiddle(){

			Node slowPtr=head;
			Node fastPtr=head;
			int len=1;
		
			//System.out.println(slowPtr.data+" "+fastPtr.data);
			while(fastPtr != null){
				
				slowPtr = slowPtr.next;
				fastPtr = slowPtr.next.next;
				len++;
			}
			//System.out.println(len+1);
			if((len+1)%2 == 0){
				System.out.println("Link list is even");
			}
			else{
				System.out.println("Link List is odd");
			}
			
			
			return slowPtr.data;

		}

		public void printReverse(Node head){
			
			Node temp = head;

			if(temp == null){
				return;
			}
			printReverse(temp.next);
			System.out.print(head.data);
			System.out.print(" ---> ");



		}

		public void swapInPairs(){

			Node prevNode = head;
			Node nextNode = prevNode.next;
			int cpy=0;
			while(prevNode != null && prevNode.next!=null){

				cpy = nextNode.data;
				nextNode.data = prevNode.data;
				prevNode.data = cpy;
				prevNode = nextNode.next;
				if(prevNode != null){
					//if(prevNode.next!=null)
					nextNode = prevNode.next;
					//System.out.println(nextNode.data);
				}

			}
		}

		public void reOrder(){

				LinkedList<Node> stack = new LinkedList<Node>();
				Node slowPtr = head;
				Node fastPtr = head;
				while(fastPtr!=null && fastPtr.next!=null){
					fastPtr = fastPtr.next.next;
					slowPtr = slowPtr.next;
				}
				//System.out.println(slowPtr.data);
				Node head2 = slowPtr.next;
				slowPtr.next = null;
				while(head2!=null){

					Node temp = head2;
					head2 = head2.next;
					temp.next=null;
					stack.push(temp);

				}
				Node temp2 = head;
				while(!stack.isEmpty()){
					
					Node temp = stack.pop();
					temp.next = temp2.next;
					temp2.next = temp;
					temp2 = temp.next;
					
				}




		}	


		


	

	public static void main(String args[]){

		
		java.util.Scanner scan = new java.util.Scanner(System.in);
		char ans;
		int choice=0;
		int data=0;
		MyLinkedList sll = new MyLinkedList();
		sll.length = 0;
		do{
			System.out.println("*******  Menu *******");
			System.out.println("1. Insert at the start");
			System.out.println("2. Insert at the end (Append)");
			System.out.println("3. Insert at the any position");
			System.out.println("----------------------------");
			System.out.println("4. Remove a node from beginning");
			System.out.println("5. Remove a node from end");
			System.out.println("6. Remove a node from specified position");
			System.out.println("----------------------------");
			System.out.println("7. Length of linked list");
			System.out.println("8. Delete the linked list");
			System.out.println("9. Display Linked List");
			System.out.println("10. Insertion in a sorted list.");
			System.out.println("11. Reversing a link list.");
			System.out.println("12. Find Middle of Link List");
			System.out.println("13. Printing Link List in reverse");
			System.out.println("14. Linked list is odd or even");
			System.out.println("15. Swap in pairs");
			System.out.println("16. Check whether a link list is Palindrome ?");
			System.out.println("17. Re-ordering a list as alternate with one element from last.");
			System.out.println("Enter choice: ");
			choice = scan.nextInt();

			switch(choice){


					case 1: System.out.println("Enter data: ");
							data = scan.nextInt();
							sll.insertAtStart(data);
							break;
					case 2: System.out.println("Enter data: ");
							data = scan.nextInt();
							sll.insertAtEnd(data);
							break;
					case 3: System.out.println("Enter data: ");	
							data = scan.nextInt();
							System.out.println("Enter the position at which you want to enter: ");
							int position = scan.nextInt();
							if(position > sll.length){
								System.out.println("Cannot insert at this position");
								System.out.println("The length of list is: "+sll.length);
								break;
							}
							else{
								sll.insertAtPos(data,position);
							}
						
						break;
					case 4: if(sll.length==0){

								System.out.println("Cannot delete as link list does not exists");
							}
							else{
									sll.removeFirst();
							}
							break;
					case 5: if(sll.length==0){

								System.out.println("Cannot delete as link list does not exists");
							}
							else{
									

									sll.removeLast();
							}
							break;	
					case 6: if(sll.length == 0){
								System.out.println("Cannot remove the node as link list does not exists");
							}		
							else{
									System.out.println("Enter the position you want to remove: ");
									position = scan.nextInt();
									if(position == 1){
										sll.removeFirst();
									}
									else if(position == sll.length){
										sll.removeLast();
									}
									else{
										sll.removeFromSpecifiedPosition(position);
									}
									
								}
							break;
					case 7: sll.displayLength();
							break;
					case 8: sll.clearAll();
							 break;
					case 9: sll.displayList();
							 break;		
					case 10: System.out.println("Enter the data you want to insert: "); 
							 data = scan.nextInt();
							 sll.SortedInsert(data);
					         position = sll.SortedInsert(data);
					         System.out.println(position);
					         if(position == 1){
					         		sll.insertAtStart(data);
					         }
					         else if(position == sll.length+1){
					         		sll.insertAtEnd(data);
					         }
					         else{
					         		sll.insertAtPos(data,position);	
					         	}
					         break;		
					case 11: sll.reverseList();
							 break;    
					case 12: position = sll.findMiddle();
							 System.out.println("The middle of link list is: "+position);
							 break;		       
					case 13: sll.printReverse(sll.head);
						     System.out.print("null");
							 System.out.println();
							 break;	
					case 14: sll.findMiddle();	
							 break; 
					case 15: sll.swapInPairs();
							 break;		
					case 16: if(sll.checkPalindrome()){
								System.out.println("The link list is a palindrome");
							 }
							 else{
							 	System.out.println("The link list is not a palindrome.");
							 }
							 break;		  
					case 17: sll.reOrder();
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