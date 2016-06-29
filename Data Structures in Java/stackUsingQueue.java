public class stackUsingQueue{
	
	static java.util.Queue<Integer> q1 = new java.util.LinkedList<Integer>();
	static java.util.Queue<Integer> q2 = new java.util.LinkedList<Integer>();


	public static void push(int data){

		if(q1.isEmpty()){
			q2.offer(data);
		}
		else if(q2.isEmpty()){
			q1.offer(data);
		}

	}

	public static int pop(){

		int size=0,i=0;

		if(q1.isEmpty()){

			size = q2.size();
			while(i<size-1){
				q1.offer(q2.poll());
				i++;
			}
			return q2.poll();

		}
		else if(q2.isEmpty()){

			size = q1.size();
			while(i<size-1){
				q2.offer(q1.poll());
				i++;
			}
			return q1.poll();
		}

		return 0;

	}




	public static void main(String args[]){


		java.util.Scanner scan = new java.util.Scanner(System.in);
		char ans;
		int choice=0,data=0;

		do{

			System.out.println("----------- Menu ------------");
			System.out.println("1. Push ");
			System.out.println("2. Pop ");
			
			choice = scan.nextInt();
			switch(choice){

				case 1: System.out.println("Enter data: ");
						data = scan.nextInt();
						push(data);
						break;
				case 2: 
						data = pop();
						System.out.println(data);
						break;		
				
				default: System.out.println("Wrong choice.");				
			}
			System.out.println("Do you want to continue(y/n): ");
			ans = scan.next().charAt(0);

		}while(ans=='y' || ans=='Y');
		










	}
}