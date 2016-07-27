public class numberGuessGame{
	
	public static int guess(int n){

		java.util.Random rm = new java.util.Random();
		int answer = rm.nextInt(n+1)+0;
		
	while(guessNum(answer)!=0){
            if(guessNum(answer) == 1){
            	System.out.println("Before reduction: "+answer);
                answer = rm.nextInt(answer)+0;
                System.out.println("Reduced is: "+answer);   
            }
            else if(guessNum(answer) == -1){
            	System.out.println("Before increase: "+answer);
               answer = rm.nextInt(n-answer)+(answer+1); 
               System.out.println("Increased is: "+answer);     
            }
     }
        return answer;
        

	}

	public static int guessNum(int s){

		int target = 6;
		if(s>target)
		{	
			return 1;
		}
		else if(s<target){
			return -1;
		}
		else if(s == target){
			return 0;
		}
		return 2;

	}


	public static void main(String args[]){

		java.util.Scanner scan = new java.util.Scanner(System.in);
		System.out.println("Enter the range: ");
		int n = scan.nextInt();
		System.out.println(guess(n));
		
		


	}
}