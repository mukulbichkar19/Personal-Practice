public class StringToChars{
	


	public static void main(String args[]){

		java.util.Scanner scan = new java.util.Scanner(System.in);
		String str =  scan.nextLine();
		System.out.println("The entered string is: "+str);
		char[] array = str.toCharArray();
		System.out.println("The character array is: ");
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+" ");
		}

	}
}