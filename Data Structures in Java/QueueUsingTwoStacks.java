public class QueueUsingTwoStacks{
	
	static java.util.Stack<Integer> stack1 = new java.util.Stack<Integer>();
	static java.util.Stack<Integer> stack2 = new java.util.Stack<Integer>();

	public static void enqueue(int data){

		stack1.push(data);
	}

	public static int dequeue(){

		if(stack2.isEmpty()){
			while(!stack1.isEmpty()){
				stack2.push(stack1.pop());
			}
		}
		return stack2.pop();
	}

	/*public static void display(){

		System.out.println("The Queue is: ");
		if(stack1.isEmpty()){
			while(!stack2.isEmpty()){
				System.out.println(stack2.pop());
			}
		}
		else{
			while(!stack1.isEmpty()){
				//System.out.println(stack1.pop());
				stack2.push(stack1.pop());
			}
			while(!stack2.isEmpty()){
				System.out.println(stack2.pop());
			}
		}



	}



*/
	public static void main(String args[]){

		java.util.Scanner scan = new java.util.Scanner(System.in);
		char ans;
		int choice=0,data=0;

		do{

			System.out.println("----------- Menu ------------");
			System.out.println("1. Enqueue ");
			System.out.println("2. Dequeue ");
			//System.out.println("3. Display ");
			choice = scan.nextInt();
			switch(choice){

				case 1: System.out.println("Enter data: ");
						data = scan.nextInt();
						enqueue(data);
						break;
				case 2: //System.out.println("Enter data: ");
						data = dequeue();
						System.out.println(data);
						break;		
				/*case 3: display();
						break;*/
				default: System.out.println("Wrong choice.");				
			}
			System.out.println("Do you want to continue(y/n): ");
			ans = scan.next().charAt(0);

		}while(ans=='y' || ans=='Y');
		






	}
}