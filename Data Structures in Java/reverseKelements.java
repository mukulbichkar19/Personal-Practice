public class reverseKelements{
	

	public static void main(String args[]){

		java.util.Queue<Integer> q = new java.util.LinkedList<Integer>();
		q.add(10);
		q.add(20);
		q.add(30);
		q.add(40);
		q.add(50);
		q.add(60);
		q.add(70);
		q.add(80);
		q.add(90);
		q.add(100);

		java.util.Scanner scan = new java.util.Scanner(System.in);
		System.out.println("Enter the value of k: ");
		int k = scan.nextInt();
		java.util.Stack<Integer> stack = new java.util.Stack<Integer>();
		for(int i=0;i<k;i++){
			stack.push(q.remove());
		}
		while(!stack.isEmpty()){
			q.add(stack.pop());
		}
		for(int i=0;i<q.size()-k;i++){
			q.add(q.remove());
		}
		System.out.println("The queue with "+k+" reversed elements: ");
		for(Integer item:q){
			System.out.print(item.toString()+" ");
		}




	}
}