public class queueUsingStack{


	private static java.util.Stack<Integer> stack1 = new java.util.Stack<Integer>();
	private static java.util.Stack<Integer> stack2	= new java.util.Stack<Integer>();


	public static void main(String args[]){


		System.out.println("Enter the size of queue: ");
		java.util.Scanner scan = new java.util.Scanner(System.in);
		int data;
		int n = scan.nextInt();
		System.out.println("Enter the data in queue: ");
		for(int i=0;i<n;i++){
			data = scan.nextInt();
			stack1.push(data);
		}
		for(int i=0;i<n;i++){
			data = stack1.pop();
			stack2.push(data);
		}
		while(!stack2.isEmpty()){
			System.out.print(stack2.pop()+" ");
		}







	}
	



}