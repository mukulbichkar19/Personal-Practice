public class Lion extends Mammal{
	

	public int eat(String something){
		
		System.out.println("Inside Lion");
		return this.eat(something);
	}

	public static void main(String args[]){

		Mammal m = new Mammal();
		m.eat("food");
		Lion l = new Lion();
		l.eat("meat");


	}


}