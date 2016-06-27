public class StackUsingArray{
	

	private int top = -1;
	private static int capacity;
	protected static int[] stackArr;
	//public static final int CAPACITY = 10; //Initial Capacity of the Stack

	public void push(int data){

		top++;
		stackArr[top] = data;
	}

	public boolean isFull(){

		if(top == this.capacity-1){
			return true;
		}else{
			return false;
		}
	}

	public boolean isEmpty(){
		
		if(top == -1){
			return true;
		}
		else{
			return false;
		}
	}

	public int pop(){

		
		return stackArr[top--];
		
	}

	public void display(){
		int temp = top;
		while(temp>=0){
			System.out.print(stackArr[temp]+" ");
			temp--;
		}
	}





	public static void main(String args[]){

		int choice, data;
		char ans;

		java.util.Scanner scan = new java.util.Scanner(System.in);

		System.out.println("Enter the size of array: ");
		capacity = scan.nextInt();
		stackArr = new int[capacity];
		StackUsingArray stack = new StackUsingArray();


		do{

				System.out.println("*** Menu ***");
				System.out.println("1. Push ");
				System.out.println("2. Pop ");
				System.out.println("3. Is Full ?");
				System.out.println("4. Is Empty ?");
				System.out.println("5. Display Stack");
				System.out.println("Enter your choice: ");
				choice = scan.nextInt();
				switch(choice){

					case 1: System.out.println("Enter the data you want to push: ");
                            data = scan.nextInt();
                            if(stack.isFull()){
                            	System.out.println("Stack is full cannot push further");
                            }
                            else{
                            	stack.push(data);
                            }
                            break;
                    case 2: if(stack.isEmpty()){
                    			System.out.println("Cannot pop as stack is empty");
                    		}
                    		else{
                    			data = stack.pop();
                    			System.out.println(data+" popped out from Stack.");
                    		}
                    		break;
                    case 3: if(stack.isEmpty())
                    		{
                    			System.out.println("Stack is empty");
                    		}
                    		else{
                    			System.out.println("Stack is not empty");
                    		}
                    		break;
                    case 4: if(stack.isFull()){
                    			System.out.println("Stack is Full");
                    		}
                    		else{
                    			System.out.println("Stack is not full");
                    		}
                    		break;
                    case 5: stack.display();
                    		break;		
                    default: System.out.println("Wrong Choice");
                    		
                }
				System.out.println("Do you want to continue (y/n) ?");
				ans = scan.next().charAt(0);
		}while(ans=='y' || ans=='Y');






	}
}