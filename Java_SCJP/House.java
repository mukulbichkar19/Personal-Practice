public class House{
	
	public String address = new String();

	public void finalize(){
		System.out.println("Inside House");
		address = null;
	}

	public static void main(String args[]){
		
		System.out.println(args[1]+args[2]);

	}

}