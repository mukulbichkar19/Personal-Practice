// Example of Inheritance
import java.util.Locale;
import java.text.NumberFormat;

public class Employee{
	
	protected String name;
	private double salary;

	public Employee(String name){
		this.name = name;
	}

	// Setters
	/*public void setName(String name){
		this.name = name;
	}*/

	public void setSalary(double salary){
		this.salary = salary;
	}

	//Getters
	public String getName(){
		return name;
	}

	public double getSalary(){
		return salary;	
	}

	void print(){

		if(this.salary == 0.0){
			System.err.println("Error: No salary info available for "+this.name+". Exiting");
		}
		else{

			NumberFormat salaryFormat = NumberFormat.getNumberInstance(Locale.US);

			System.out.println("Employee Name: "+this.name+" \nSalary is: "+salaryFormat.format(this.salary)+"\n");
		}
	}


}