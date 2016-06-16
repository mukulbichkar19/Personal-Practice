import java.util.*;
public class CollectionExploration{
	

	


	public static void main(String args[]){

		// Lists, ArrayLists, LinkedList
		ArrayList<String> daysofTheWeek = new ArrayList<String>();
		daysofTheWeek.add("Sun");
		daysofTheWeek.add("Tues");
		daysofTheWeek.add("Wed");
		daysofTheWeek.add(1,"Mon");
		// Way 1: Using for loop
		for(int i=0;i<daysofTheWeek.size();i++){
			System.out.print(daysofTheWeek.get(i)+" ");	
		}
		System.out.println();
		// Way 2: New For loop
		for(String i:daysofTheWeek){
			System.out.print(i+" ");
		}
		System.out.println();
		// Way 3: Using Iterator
		Iterator<String> iter = daysofTheWeek.iterator();
		while(iter.hasNext()){
			System.out.print(iter.next()+" ");
		}
		System.out.println();

		System.out.println(daysofTheWeek.subList(1,3));
		System.out.println(daysofTheWeek.contains("Mon"));  //contains
		System.out.println(daysofTheWeek.indexOf("Sun"));


		System.out.println("Done with ArrayLists");

		System.out.println("---------------------------");

		//--------------------------------------------------- x ----------------

		// Sets
		// HashSets, TreeSet, LinkedHashSet
		HashSet<String> mySet = new HashSet<String>();
		mySet.add("Dog");
		mySet.add("Cat");
		mySet.add("Mouse");
		mySet.add("Cat");
		//System.out.println(mySet); //No duplicates and 
		for(String temp:mySet){
			System.out.print(temp+" ");
		}
		System.out.println();
		Iterator<String> it = mySet.iterator();
		while(it.hasNext()){
			System.out.print(it.next()+" ");
		}
		System.out.println();

	}
}