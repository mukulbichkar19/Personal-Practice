public abstract class Mammal{
	
	public boolean hasFur;

	public Mammal(){
			hasFur = false;
	}

	public Mammal(boolean hasFur){
		this.hasFur = hasFur;
	}

	public void breathe(){
		System.out.println("Mammal is breating");
	}

	public void eating(String something){
		System.out.println("Mammal is eating "+something);
	}

	/*public static void main(String args[]){
		Mammal m = new Mammal();
	}*/




}