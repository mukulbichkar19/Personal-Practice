public class DLL{

	Memeff head;
	int length;
	
	public void insertAtStart(int data){

			if(length==0){
				head = new Memeff(data);
				length++;
			}
			else{
				Memeff temp = new Memeff(data);
				temp.ptrdiff = head.ptrdiff ^ temp.ptrdiff;
				length++;
			}
	}




	public static void main(String args[]){


		DLL dll = new DLL();


		java.util.Scanner scan = new java.util.Scanner(System.in);
 		int choice,position,data;
 		char cont;
 		do{

 			System.out.println("**** Menu ****");
 			System.out.println("---- Insertion -----");
 			System.out.println("1. At Beginning");
 			System.out.println("2. At end");
 			System.out.println("3. At any position");
 			System.out.println("4. Delete at start");
 			System.out.println("5. Delete at end");
 			System.out.println("6. Delete at any position");
 			System.out.println("7. Display List");

 			System.out.println("8. Display length");	




 			System.out.println("Enter choice: ");
 			choice = scan.nextInt();
 			switch(choice){
 				case 1: System.out.println("Enter the data: ");
 						data = scan.nextInt();
 						dll.insertAtStart(data);
 						break;
 				/*case 2: System.out.println("Enter the data");
 						data = scan.nextInt();
 						dll.insertAtEnd(data);
 						break;
 				case 3: System.out.println("Enter the data");
 						data = scan.nextInt();
 						System.out.println("Enter the position:");
 						position = scan.nextInt();
 						if(position==1){
 							dll.insertAtStart(data);
 						}
 						else if(position == dll.length){
 							dll.insertAtEnd(data);
 						}
 						else{
 							dll.insertAtAnyPos(data,position);
 						}		
 						break;
 				case 4: if(dll.length == 0){
 							System.out.println("Cannot delete as link list does not exists");
 						}		
 						else{
 							dll.removeAtStart();
 						}
 						break;
 				case 5: if(dll.length == 0){
 							System.out.println("Cannot delete as link list does not exists");
 						}
 						else{
 							dll.removeAtEnd();
 						}
 						break;
 				case 6: System.out.println("Enter the position: ");
 						position=scan.nextInt();
 						if(position==1){
 							dll.removeAtStart();
 						}
 						else if(position == dll.length){
 							dll.removeAtEnd();
 						}
 						else{
 							dll.removeAtpos(position);
 						}
 						break;		
 				case 7: dll.displayList();
 						break;		
 				case 8: dll.displayLength();	
 						break;*/

 				default: System.out.println("Wrong Choice");
 			}

 			System.out.println("\nDo you want to continue(y/n): ");
 			cont = scan.next().charAt(0);
 		}while(cont=='y' || cont=='Y');



	}



}