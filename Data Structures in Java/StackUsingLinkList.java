public class StackUsingLinkList{
	
	Node top;
	int size;



	// Push Data
	public void push(int data){
		//System.out.println("Inside push function");
		if(size==0){
			top = new Node(data);
			size++;
		}
		else{
			Node temp = new Node(data);
			temp.next = top;
			top = temp;
			size++;
		}
	}

	//Pop Data
	public int pop(){

		Node temp = top;
		int data = temp.data;
		top = temp.next;
		temp = null;
		return data;
		


	}

	public void display(){

		Node temp = top;
		if(size!=0){

			while(temp!=null){
				System.out.print(temp.data+" ");
				System.out.print(" ---> ");
				temp=temp.next;
			}
			System.out.print("null");
			System.out.println();
		}
		else{
			System.out.println("Stack does not exists");
		}


	}

	public boolean isEmpty(){
		if(size == 0){
			return true;
		}
		else{
			return false;
		}
	}


	public static void main(String args[]){

		java.util.Scanner scan = new java.util.Scanner(System.in);
		int choice, data;
		char ans;
		StackUsingLinkList sll = new StackUsingLinkList();

		do{

			System.out.println("***** Menu *****");
			System.out.println("1. Push ");
			System.out.println("2. Pop ");
			System.out.println("3. Display ");
			System.out.println("4. Is Empty ");
			choice = scan.nextInt();
			switch(choice){

				case 1: System.out.println("Enter the data");
						data = scan.nextInt();
						sll.push(data);
						break;
				case 2: data = sll.pop();
						System.out.println(data+" popped out of Stack");
				        break;
				case 3: sll.display();
						break; 
				case 4: if(sll.isEmpty()){
							System.out.println("Stack is empty");
						}
						else{
							System.out.println("Stack is not empty");
						}
						break;		       
				default: System.out.println("Sorry Wrong Choice.");
			}
			System.out.println("Do you want to continue(y/n): ");
			ans =scan.next().charAt(0);
		}while(ans=='y' || ans=='Y');





	}
}