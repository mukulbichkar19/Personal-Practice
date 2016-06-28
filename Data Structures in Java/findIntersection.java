public class findIntersection{

	static java.util.Stack<Integer> stack1 = new java.util.Stack<Integer>();

	static java.util.Stack<Integer> stack2 = new java.util.Stack<Integer>();
	
	public static void findIntresect(){

		int stk1=0;


		while(stack1.peek() == stack2.peek()){
			stk1=stack1.pop();
			stack2.pop();
		}
		System.out.println("The intersection is at: "+stk1);

		

		

		




	}

	public static void main(String args[]){

		
		stack1.push(12);
		stack1.push(30);
		stack1.push(45);
		stack1.push(56);
		stack1.push(90);
		stack1.push(101);

		stack2.push(33);
		stack2.push(22);
		stack2.push(75);
		stack2.push(45);
		stack2.push(56);
		stack2.push(90);
		stack2.push(101);

		findIntresect();





	}
}