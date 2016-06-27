public class twoStacksUsingArray{
	
	private static int array[] = new int[5];
	private static int top1=0;
	private static int top2=array.length-1;
	


	public static void main(String args[]){

		char ans;
		int choice, data;
		java.util.Scanner scan = new java.util.Scanner(System.in);
		do{

			System.out.println("------ Menu ------");
			System.out.println("1. Push to Stack 1");
			System.out.println("2. Push to Stack 2");
			System.out.println("3. Pop from Stack 1");
			System.out.println("4. Pop from Stack 2");
			System.out.println("5. Display Stack 1");
			System.out.println("6. Display Stack 2");
			choice = scan.nextInt();
			switch(choice){

				case 1: System.out.println("Enter the data: ");
						data = scan.nextInt();
						if(top1 == top2+1){
							System.out.println("Cannot push in Stack1");
						}
						else{
							array[top1] = data;
							top1++;
							
						}
						break;
				case 2: System.out.println("Enter the data: ");
						data = scan.nextInt();
						if(top2 == top1-1){
							System.out.println("Cannot push in Stack2");
						}
						else{
							array[top2] = data;
							top2--;
						}						
						break;		
				case 5: System.out.println("Stack1 looks like: ");
						for(int i=top1-1;i>=0;i--){
							System.out.print(array[i]+" ");
						}		
						break;
				case 6: System.out.println("Stack2 looks like: ");
						//System.out.print(top2);
						for(int i=top2+1;i<array.length;i++){
							System.out.print(array[i]+" ");
						}
						break;
				default: System.out.println("Wrong Choice");				
						


			}
			System.out.println();
			System.out.println("Do you want to continue(y/n): ");
			ans = scan.next().charAt(0);

		}while(ans=='y' || ans=='Y');



	}


}