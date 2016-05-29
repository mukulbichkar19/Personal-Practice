import java.util.Stack;

public class StackDemo{

	public static void modifyStacks(Stack<String> one, Stack<Integer> two){
		two.push(50);
		one.pop();
		one = new Stack<String>();
	}
	

	public static void main(String args[]){

		Stack<String> names = new Stack<String>();
		names.push("Kim");
		names.push("Edward");
		names.push("Jane");

		Stack<Integer> grades =  new Stack<Integer>();
		grades.push(96);
		grades.push(87);

		modifyStacks(names,grades);

		for(String name : names){
				System.out.println(name);
		}

		for(int grade:grades){
			System.out.println(grade);
		}


	}

}