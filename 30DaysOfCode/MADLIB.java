// MADLIBS Project

public class MADLIB{
	
	java.util.Scanner scanner = new java.util.Scanner(System.in);
	String story;
	String name;
	String adjective1;
	String adjective2;
	String noun1;
	String noun2;
	String noun3;
	String adverb;
	String randNums;
	java.util.Random rand = new java.util.Random();

	// Getter
	public String getStory(){
		return story;
	}

	public String getName(){
		return name;
	}

	public String getAdjective1(){
		return adjective1;
	}

	public String getAdjective2(){
		return adjective2;
	}

	public String getNoun1(){
		return noun1;
	}

	public String getNoun2(){
		return noun2;
	}

	public String getNoun3(){
		return noun3;
	}

	public String getAdverb(){
		return adverb;
	}

	public String getRandomNums(){
		return randNums;
	}

	// Setters
	public void setStory(String story)
	{
		this.story = story;
	}

	public void setName(String name){
		this.name = name;
	}

	public void setAdjective1(String adjective1){
		this.adjective1 = adjective1;
	}

	public void setAdjective2(String adjective2){
		this.adjective2 = adjective2;
	}

	public void setNoun1(String noun1){
		this.noun1 = noun1;
	}

	public void setNoun2(String noun2){
		this.noun2 = noun2;
	}

	public void setNoun3(String noun3){
		this.noun3 = noun3;
	}

	public void setAdverb(String adverb){
		this.adverb = adverb;
	}

	public void setRandomNums(){
		int num = Math.abs(rand.nextInt()) % 100;
		int index = 0;
		int[] numberHolder = new int[3];
		while(index < numberHolder.length){
			numberHolder[index] = num + index;
			index++;
		}
		randNums = "not "+numberHolder[0]+", not "+numberHolder[1]+", but "+numberHolder[2];
	}

	public void printInstruction(){
		System.out.println(" Welcome to Madlibs game.\n In this game, you will enter words and we will generate a story out of it.\n Start by typing in a name.");

	}

	public void putTogether(){
		String storybody;
		int num = Math.abs(rand.nextInt())%2;
		if(num==0){
		
		storybody = "Jessie and her friend "+getName()+" went to DisneyLand today. "
		+" They saw a "+getNoun1()+" at Magic Kingdom"
		+" and ate "+getAdjective1()+" feast for dinner. The next day I"
		+" ran "+getAdverb()+" to see mickey mouse in his"+getNoun2()+" "
		+" and then at the night I gazed at the "+getRandomNums()+" "+getAdjective2()+" fireworks shooting from"
		+getNoun3()+".";
		
		} else {
			storybody = "Amanda and Aishwarya "+getName()+" went to the zoo last summer. "+
						"They saw a huge "+getNoun1()+" and a tiny little "+getNoun2()+". That night "
						+ "they decided to climb "+getAdverb()+" into the "+getNoun3()+" to get a closer look."
						+ "The zoo was "+getAdjective2()+"at night ,but they did not care until"+getRandomNums()+" "
						+getAdjective2()+" apes yelled in their faces, making"
						 +"Amanda and "+getName()+" sprint all the way back home";

		}
		setStory(storybody);

	}

	public void enterName(){
		setName(scanner.nextLine());
	}

	public void enterNoun1(){
		System.out.println("Give me a noun: ");
		setNoun1(scanner.nextLine());
	}

	public void enterNoun2(){
		System.out.println("Give me a noun: ");
		setNoun2(scanner.nextLine());
	}

	public void enterNoun3(){
		System.out.println("Give me a noun: ");
		setNoun3(scanner.nextLine());
	}

	public void enterAdjective1(){
		System.out.println("Give me an adjective: ");
		setAdjective1(scanner.nextLine());
	}

	public void enterAdjective2(){
		System.out.println("Give me an adjective: ");
		setAdjective2(scanner.nextLine());
	}

	public void enterAdverb(){
		System.out.println("Give me an adverb: ");
		setAdverb(scanner.nextLine());
	}

	public void play(){
		
		enterName();
		enterNoun1();
		enterAdjective1();
		enterAdverb();
		enterNoun2();
		enterAdjective2();
		enterNoun3();
		setRandomNums();
		putTogether();
		System.out.println(getStory());


	}







	public static void main(String args[]){

		MADLIB game = new MADLIB();
		game.printInstruction();
		game.play();

	}



}