import java.util.*;
// Works only for String data type.
public class findTargetValueinArray{
	
	// 1. Finding Target value by using Array as a List
	public static boolean asAList(String[] arr,String target){
		return Arrays.asList(arr).contains(target);
	}

	// 2. Findding target value using a HashSet (Preferred method)
	public static boolean isPresent(String[] arr,String target){
		Set<String> set = new HashSet<String>(Arrays.asList(arr));
		return set.contains(target);
	}

	// 3. Using loop the most inefficient method. O(n)
	public static boolean useLoop(String[] arr,String target){
		for(String s:arr){
			if(s.equals(target)){
				return true;
			}
		}
		return false;
	}


	public static void main(String args[]){

		String[] array = {"abc","def","pqr"};
		java.util.Scanner scan = new java.util.Scanner(System.in);
		System.out.println("Enter the target value: ");
		String target = scan.next();
		if(useLoop(array,target))
		{
			System.out.println("The value "+target+" is present.");
		}
		else{
			System.out.println("The value "+target+" is not present.");
		}
		scan.close();
	}
}