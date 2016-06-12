public class Person{
	
	protected String firstName;
	protected String lastName;
	protected int id;

	Person(String firstName,String lastName, int id){
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = id;
	}

	public void printPerson(){
		System.out.println("\nName: "+lastname+" "+firstName+"\nid: "+id);
	}


}