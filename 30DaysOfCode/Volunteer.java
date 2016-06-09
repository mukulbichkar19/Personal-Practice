public class Volunteer extends Employee{
	
	// Instance variable
	int hours;
	static int pay=40;

	Volunteer(String name){
		//explicit call 
		super(name);
	}

	//setters
	public void setHours(int hours){
		this.hours = hours;
	}

	//Getters
	public int getHours(){
		return hours;
	}

	public int getPay(){
		return pay*this.hours;
	}

	@Override
	// Override print function
	void print(){
		System.out.println("Volunteer Info: "+"\n1.Name: "+this.name+"\n2.Hours: "
							+this.hours+"\n3. Salary is: "+this.getPay());
	}



}