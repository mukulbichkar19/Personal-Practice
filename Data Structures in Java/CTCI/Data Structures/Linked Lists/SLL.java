public class SLL{

	private static Node head = null;


	private static boolean insertNode(int data, int pos){

		// If ll is empty
		if(head == null){
			head = new Node(data);
			return true;
		}else{
			int current_len = getLength();
			if(pos > current_len+1){
				System.out.println("The current length of linked list is: "+current_len);
				System.out.println("Cannot add the node");
				return false;
			}else{
				if(pos == 1){
					Node temp = new Node(data);
					temp.next = head;
					head = temp;
					return true;
				}else if(pos == current_len+1){
					Node temp = head;
					while(temp.next != null){
						temp = temp.next;
					}
					Node newNode = new Node(data);
					temp.next = newNode;
					return true;
				}else{
					Node temp = head;
					int val = 1;
					while(val != pos-1){
						temp = temp.next;
						val++;
					}
					Node newNode = new Node(data);
					newNode.next = temp.next;
					temp.next = newNode;
					return true;
				}
			}
		}
	}

	private static int getLength(){
		Node temp = head;
		int len = 0;
		while(temp != null){
			len++;
			temp=temp.next;
		}
		return len;
	}


	// display:Display's the LL
	private static void display(){
		Node temp = head;
		while(temp != null){
			System.out.print(temp.data + " ---> ");
			temp = temp.next;
		}
		System.out.println("null");
	}

	// Search an element inside the linked list
	private static boolean search(int data){
		Node temp = head;
		while(temp!=null){
			if(temp.data == data){
				return true;
			}
			temp = temp.next;
		}
		return false;
	}


	private static boolean delete(int data){

		Node temp = head;
		while(temp.next.data != data){
			temp = temp.next;
		}
		Node delNode = temp.next;
		temp.next = delNode.next;
		delNode = null;
		return true;
	}


	public static void main(String args[]){

		int ans = -1;
		do{

			System.out.println("Menu: ");
			System.out.println("1. Insert at any position ");
			System.out.println("2. Delete a node");
			System.out.println("3. Display");
			java.util.Scanner scan = new java.util.Scanner(System.in);
			System.out.println("Enter your choice: ");
			int ch = scan.nextInt();
			switch(ch){

				case 1: System.out.println("Enter the value: ");
				        int val = scan.nextInt();
								System.out.println("Enter the position: ");
								int pos = scan.nextInt();
								if(insertNode(val, pos)){
									System.out.println("Node inserted successfully");
								}else{
									System.out.println("Node not inserted successfully");
								}
								break;
			case 2: 	System.out.println("Enter the value to be deleted: ");
			          int delVal = scan.nextInt();
								if(search(delVal)){
									if(delete(delVal)){
										System.out.println("Node deleted successfully");
									}else{
										System.out.println("Node could not be deleted successfully");
									}
								}else{
									System.out.println("Could not find the element you want to delete.");
								}
								break;
			case 3: 	display();
								break;
			default:	System.out.println("Not a valid choice");

			}
			System.out.println("Press 0 to continue or any other number to exit");
			ans = scan.nextInt();


		}while(ans == 0);



	}



}
