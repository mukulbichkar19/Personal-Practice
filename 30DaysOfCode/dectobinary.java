public class dectobinary{
	


	public static void main(String args[]){

		java.util.Scanner scan = new java.util.Scanner(System.in);
		System.out.println("Enter the decimal number: ");
		int n = scan.nextInt();
		//System.out.println(n);
		int remainder = 0;
		int quotient = 0;
		int temp = 0;
		int prev = 0;
		String binary = Integer.toBinaryString(n);
		System.out.println(binary);
		char[] array = binary.toCharArray();
		//System.out.println(array[0]+" "+array[1]+" "+array[2]+" "+array[3]);
		for(int i=0,j=1;i<array.length;i++,j++){
			if(array[i]==1){
				temp++;
				if(array[j]==1){
					temp++;
					if(temp>=prev){
						prev = temp;
					}
					
				}
				else{
					temp = 0;
				}
			}
		}
		System.out.println(prev);




		}
}