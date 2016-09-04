public class StringManipulation{
	




	public static void main(String args[]){


		String original = "25km W of Chauk, Burma";

		int commaPosition = original.indexOf(",");

		System.out.println("Comma is located at position: "+commaPosition);

		System.out.println("So the first part of the string upto comma is: "+original.substring(0,commaPosition));

		System.out.println("So the next part of the string after the comma is: "+original.substring(commaPosition+2,original.length()));

		String[] arrays = original.split(",");
		String part1 = arrays[0];
		String part2 = arrays[1];
		System.out.println(part1);
		System.out.println(part2);	



	}
}