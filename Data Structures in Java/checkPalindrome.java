public class checkPalindrome{
	
	Node head;
	int length=0;
	java.util.Stack<Character> stk = new java.util.Stack<Character>();

	public void insertAtEnd(Character data){


		

		if(length == 0){
			head = new Node(data);
			length++;
			
		}
		else if(length == 1){
			Node temp = new Node(data);
			head.next = temp;
			length++;
			
		}
		else{
			Node tem = head;
			while(tem.next != null){
				
				tem = tem.next;
			}
			Node newNode = new Node(data);
			tem.next = newNode;
			length++;
		}
	}

	public void printList(){
		// Print the link list
		System.out.println("----------------------");
		Node temp=head;
		while(temp!=null){
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
		System.out.println();
		System.out.println("------Stack--------");
		while(!stk.isEmpty()){
			System.out.print(stk.peek());
			stk.pop();
		}

	}



	public static void main(String args[]){

		java.util.Scanner scan = new java.util.Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = scan.next();
		checkPalindrome obj = new checkPalindrome();
		

		for(int i=0;i<str.length();i++){
			obj.insertAtEnd(str.charAt(i));
		}
		int i=0;
		while(i<(str.length()/2)){
			obj.stk.push(str.charAt(i));
			i++;
		}

		Node temp = obj.head;
		while(temp.data!='X'){
			temp=temp.next;
		}
		Node temp2 = temp.next;
		boolean valid = false;
		while(!obj.stk.isEmpty() && temp2!=null){
			if(obj.stk.pop() == temp2.data){
				
				
				valid = true;

			}
			else{
				valid = false;
				break;
			}
			temp2 = temp2.next;

		}
		if(valid){
			System.out.println("The String "+str+" is a palindrome");
		}
		else{
			System.out.println("The String "+str+" is a not a palindrome.");
		}



		//obj.printList();
		
		





	}
}