
public class isValidSymbolStack{
	
	public static void main(String[] args) {
		
		java.util.Scanner scan = new java.util.Scanner(System.in);
		java.util.Stack<Character> stk = new java.util.Stack<Character>();
		boolean valid = false;
		System.out.println("Enter the expression: ");
		String expr = scan.next();
		
		if(expr.length() ==0 || expr == null){
			System.out.println("Not a Valid String");
		}
		else{
			for(int i=0;i<expr.length();i++){
				
				if(expr.charAt(i) == ')'){
					if(!stk.empty() && stk.peek() == '('){
						stk.pop();
						valid = true; //
						
					}
					else{
						valid = false;
					}
				}
				
				else if(expr.charAt(i) == '}'){
					if(!stk.empty() && stk.peek() == '{'){
						stk.pop();
						valid = true;
					}
					else{
						valid = false;
					}
				}
				
				else if(expr.charAt(i) == ']'){
					if(!stk.empty() && stk.peek() == '['){
						stk.pop();
						valid = true;
					}
					else{
						valid = false;
					}
				}
				else{
					
					if(expr.charAt(i)=='(' || expr.charAt(i)=='{' || expr.charAt(i)=='[' )
					stk.push(expr.charAt(i));
				}
	
			}
			if(stk.isEmpty()){
				valid = true;
			}
			else{
				valid = false;
			}
		}
		
		if(valid){
			System.out.println("The entered "+expr+" is valid.");
		}
		else{
			System.out.println("The entered "+expr+" is not valid.");
		}
		
		
		
		
		
		
		
	}

}
