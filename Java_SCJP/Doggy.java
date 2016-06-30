public class Doggy extends Mammal{
	
	public int puppies;

	public int breed(){
		System.out.println("I just don't get so many breeds of dogs.");
		return 0;
	}

	public void eating(String food){
		System.out.println("Dog is eating "+food);
	}

	public Doggy(boolean hasFur){
		super(hasFur);
		puppies = -1;

	}


	public static void main(String args[]){

		Doggy lassie = new Doggy(true);
		lassie.eating("pedigree");
		lassie.breathe();
		lassie.breed();


	}
}