import java.util.Date;
import java.io.*;
public class Example{
	

	public static void main(String args[])
	{
		short s1 = 	10, s2 = 12;
		short sum = (short)(s1 + s2);
		System.out.println(sum);
		byte b1 = 60,b2 = 60;
		System.out.println(b1);
		byte product = (byte)(b1*b2);
		System.out.println(product); 
		int result = 12 + 2 * 5 % 3 - 15 / 4; 
		System.out.println(result);



		// Casting Example
		Object x = new String("String Object");
		
		if(x instanceof Date){
			Date d = (Date)x;
			System.out.println(d);
		}

		Date today = new Date();
		Date now = today;
		/*System.out.println(today);
			System.out.println(now);*/
		if(today == now){
			System.out.println("today == now");
		}


		String s11 = "Hello";
		String s12 = "Hello";

		if(s11==s12){
			System.out.println("s1==s2");
		}

		String x1 = new String("GoodBye");
		String x2 = new String("GoodBye");
		if(x1==x2)
		{
			System.out.println("x1==x2");
		}
		else if(x1.equals(x2)){
			System.out.println("x1 equals x2");
		}
		File f1 = new File("sample.txt");
		File f2 = new File("sample.txt");
		if(f1!=f2)
		{
			System.out.println("f1!=f2");
		}
		

	}
}