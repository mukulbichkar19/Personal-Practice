//import java.lang.Object;
public class checkConsecutive{
	
	static java.util.Stack<Integer> stack = new java.util.Stack<Integer>();

	public static void checkCons(){

		int x;
		boolean cons=false;


		while(!stack.isEmpty()){
			
			x=stack.pop();
			
			if(Math.abs(x-stack.pop())==1){
					
				cons = true;
			}
			else{
				cons = false;
				break;
			}
			



		}
		
		if(cons){
			System.out.println("The given sequence is consecutive. ");
		}
		else{
			System.out.println("The given sequence is not consecutive. ");
		}
		



	}



	public static void main(String args[]){

		stack.push(4);
		stack.push(5);
		stack.push(-2);
		stack.push(-3);
		stack.push(11);
		stack.push(52);
		stack.push(5);
		stack.push(6);
		stack.push(20);
		stack.push(21);

		
		if(stack.size()%2==1){
			stack.pop();

			checkCons();
		}
		else{
			checkCons();
		}



	}
}