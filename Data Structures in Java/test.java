import java.util.*;

public class test{
	
	static java.util.Stack<Integer> stack = new java.util.Stack<Integer>();

	public static int countCalc(int current){

		int count = 0;
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

		
		/*java.util.Scanner scan = new java.util.Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int n = scan.nextInt();
		int[] array = new int[n];
		System.out.println("Enter the array elements: ");
		int[] span = new int[n];
		for(int i=0,j=array.length-1;i<n && j>=0;i++,j--){
			array[i] = scan.nextInt();
			stack.push(array[i]);
			int current = stack.peek();
			span[i] = countCalc(current);
		}
		System.out.println("----------------Stack-----------");
		
		

		for(int i=0;i<array.length;i++){
			System.out.println(span[i]);
		}




	*/

		ArrayList l = new ArrayList();
		for(int i=0;i<=10;i++){
			l.add(i);
		}
		//System.out.println(l);
		/*Iterator iter = l.iterator();
		while(iter.hasNext()){
			Integer i = (Integer)iter.next();
			if(i%2 == 0){
				System.out.println(i);
			}
			else{
				iter.remove();
			}
		}*/

		ListIterator iter = l.listIterator();
		while(iter.hasNext()){
			
		}


		

		




	}
}