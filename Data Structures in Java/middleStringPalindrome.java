public class middleStringPalindrome{

	

	public static void checkPalindrome(String str){

		//System.out.println(str.length()/2);
		boolean palindrome=false;

		for(int i=0, j=str.length()-1;i<(str.length()/2) && j>(str.length()/2); i++,j--)
		{
			
			if(str.charAt(i) == str.charAt(j)){
				palindrome = true;
			}
			else{
				palindrome = false;
				break;
			}
		}
		
		if(palindrome == true){
			System.out.println("So the entered string "+str+" is palindrome.");
		}
		else{
			System.out.println("Sorry, the entered string "+str+" is not a palindrome.");
		}

	}

	
	public static void main(String args[]){

		java.util.Scanner scan = new java.util.Scanner(System.in);
		System.out.println("Enter the String:");
		String str = scan.next();
		checkPalindrome(str);
		

		







	}
}