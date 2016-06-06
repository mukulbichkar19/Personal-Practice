public class MethodOverloading{

	public void send(float f){
		System.out.println("float parameter");
	}

	public void send(Object x){
		System.out.println("Object parameter");
	}

	public void send(String s){
		System.out.println("String parameter");
	}

	public void send(int d){
		System.out.println("int parameter");
	}
	



	public static void main(String args[]){

		MethodOverloading m = new MethodOverloading();
		m.send(12.5);
		m.send(12345);
		m.send(new String("Hello"));
		m.send(new java.util.Date());



	}
}