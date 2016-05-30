import java.util.*;
public class Employee{

	public static void swap(GregorianCalendar a, GregorianCalendar b)
	{
		GregorianCalendar temp = a;
		a = new GregorianCalendar(2012,1,1);
		b = temp;
	}



	public static void main(String args[]){

		GregorianCalendar one = new GregorianCalendar(2010,1,1);
		GregorianCalendar two = new GregorianCalendar(2011,1,1);
		swap(one,two);
		System.out.print(one.get(Calendar.YEAR));
		System.out.println(two.get(Calendar.YEAR)); 
		byte a = 14&9;
		System.out.println(a);
			


	}

}