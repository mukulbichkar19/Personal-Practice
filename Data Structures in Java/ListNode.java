public class ListNode{

	public ListNode next;
	public int data;

	public ListNode(int data){

		this.data = data;
	}
	//Setters
	public void setData(int data){
		this.data = data;
	}

	public void setNext(ListNode next){
		this.next = next;
	}

	//Getters
	public int getData(){
		return this.data;
	}

	public ListNode getNext(){
		return this.next;
	}

	//LinkList Length
	public int LengthLinkedList(ListNode head){

		int length = 0;
		ListNode currentNode = head;
		while(currentNode != null){

			length++;
			currentNode = currentNode.next;
		}
		return length;
	}





}
