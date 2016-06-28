public class test{
	
	static java.util.Stack<Integer> stack = new java.util.Stack<Integer>();

	public static int countCalc(int current){

		int count = 1;
		java.util.ListIterator<Integer> iter = stack.listIterator(stack.size());
		while(iter.hasPrevious()){
			//System.out.println(iter.previous());
			if(iter.previous()<=current){
				count ++;
			}
		}
		
		//System.out.println(stack.peek());
		return count;
	}

	public static void main(String args[]){

		
		java.util.Scanner scan = new java.util.Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int n = scan.nextInt();
		int[] array = new int[n];
		System.out.println("Enter the array elements: ");
		for(int i=0;i<n;i++){
			array[i] = scan.nextInt();
			stack.push(array[i]);
		}
		System.out.println("----------------Stack-----------");
		int[] span = new int[n];
		//java.util.Iterator<Integer> iter = stack.iterator(); 
		// Iterator over a stack produces output in reverse fashion i.e
		// bottom up.
		for(int i=array.length-1;i>=0;i--){
			int current = stack.pop();
			span[i] = countCalc(current);
		}

		for(int i=0;i<array.length;i++){
			System.out.println(span[i]);
		}






		

		




	}
}