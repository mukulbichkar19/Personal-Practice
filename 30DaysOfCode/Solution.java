public class Solution{
	

	public static void main(String args[]){
		
		java.util.Scanner scan = new java.util.Scanner(System.in);
		String firstName = scan.next();
		String lastName = scan.next();
		int id = scan.nextInt();
		int numScores = scan.nextInt();
		int[] testScores = new int[numScores];
		for(int i=0;i<numScores;i++){
			testScores[i] = scan.nextInt();
		}
		scan.close();
		Student s1 = new Student(firstName,lastName,id,testScores);
		s1.printPerson();
		System.out.println("Grade: "+s1.calculate());
	}
}