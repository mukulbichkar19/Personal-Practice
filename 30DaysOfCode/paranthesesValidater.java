public class paranthesesValidater{
	
	public static boolean isValid(String str){

		// Declare a flag to indicate the status
		boolean flag = false;

		// Convert String to Character
		char[] c = str.toCharArray();
		
	
		for(int i=0,j=1;i<c.length && j<c.length;){
			
			if(c[i]=='(' && c[j]==')'){
				
				flag = true;
			}

			else if(c[i] == '{' && c[j] == '}'){
				
				flag = true;
			}
			else if(c[i] == '[' && c[j] == ']'){
				
				flag = true;
			}
			else{
				flag = false;
			}
			i = i+2;
			j = j+2;
			
		}
		

		return flag;
	}



	public static void main(String args[]){

		java.util.Scanner scan = new java.util.Scanner(System.in);
		System.out.println("Enter the expression to be validated : ");
		String s = scan.next();
		if(isValid(s)){
			System.out.println("The entered string is valid");
		}
		else{
			System.out.println("The entered string is not valid.");
		}


	}
}