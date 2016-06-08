// SinglyLinkedList
public class LinkedList{
	

	public static void main(String args[]){

		System.out.println("Enter the data for head node: ");
		java.util.Scanner scan = new java.util.Scanner(System.in);
		int data = scan.nextInt();
		Node head = new Node(data);
		System.out.println("Node created with data: "+head.data+" and next as: "+head.next);


	}
}