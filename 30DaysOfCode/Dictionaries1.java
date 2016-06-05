public class Dictionaries1{
	






	public static void main(String args[]){

		// English to Spanish Dictionaries
		java.util.Map<String,String> engGermanDictionary = new java.util.HashMap<String,String>();
		engGermanDictionary.put("Monday","Montag");
		engGermanDictionary.put("Tuesday","Dienstag");
		engGermanDictionary.put("Wednesday","Mittwoch");
		engGermanDictionary.put("Thursday","Donnerstag");
		engGermanDictionary.put("Friday","Freitag");
		engGermanDictionary.put("Saturday","SamStag");
		engGermanDictionary.put("Sunday","Sonntag");

		// Print out the days 
		System.out.println("The german equivalent is: "+engGermanDictionary.get("Monday"));
		// Print all keys
		System.out.print("The keys are: "+engGermanDictionary.keySet());
		System.out.println();
		// Print all values
		System.out.println("The values are: "+engGermanDictionary.values());
		// Size of dictionary
		System.out.println("The size of dictionary is: "+engGermanDictionary.size());

		// Shopping list
		java.util.Map<String, Boolean> shoplist = new java.util.HashMap<String, Boolean>();
		shoplist.put("Orange Juice",true);
		shoplist.put("Apples",Boolean.TRUE);
		shoplist.put("Chicken",false);
		shoplist.put("Onions",true);
		shoplist.put("Sugar",true);
		shoplist.put("Bread",false);

		// Print as Key-Value pairs
		System.out.println(shoplist.toString());
		// Clearing the content of a dictionary
		shoplist.clear();
		System.out.println(shoplist.toString());



		// Conclusions
		// 1. No Natural Ordering.
		// 2.  




	}
}