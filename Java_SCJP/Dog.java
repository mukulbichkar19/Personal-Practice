// Program Illustrates the implementation of equals method 
// in java and also how to use it
public class Dog{
	
	private String name;
	private int age;

	public Dog(String name, int age){
		this.name = name;
		this.age = age;
	}

	public boolean equals(Object obj){

		if(!(obj instanceof Dog)){
			return false;
		}
		Dog other = (Dog)obj;
		if(this.name.equals(other.name)
			&& (this.age==other.age)){
			return true;
		}else{
			return false;
		}


	}

	public static void main(String args[]){

		Dog d1 = new Dog("Fiddo",3);
		Dog d2 = new Dog("Fiddo",3);
		Dog d3 = new Dog("Lassie",5);
		if(d1.equals(d2))
		{
			System.out.println("In first return "+d1.name);
		}

		if(d1.equals(d3)){
			System.out.println("In second return "+d2.name);
		}

		if(d1 == d2){
			System.out.println("d1 == d2");
		}

	}


}