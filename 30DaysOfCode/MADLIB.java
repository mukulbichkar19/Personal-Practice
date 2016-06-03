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
		
	}

	public void printInstruction(){
		System.out.println(" Welcome to Madlibs game.\n In this game, you will enter words and we will generate a story out of it.\n Start by typing in a name.");

	}

	public void putTogether(){
		String storybody = "Jessie and her friend "+getName()+" went to DisneyLand today. "
		+" They saw a "+getNoun1()+" at Magic Kingdom"
		+" and ate "+getAdjective1()+" feast for dinner. The next day I"
		+" ran "+getAdverb()+" to see mickey mouse in his"+getNoun2()+" "
		+" and then at the night I gazed at the "+getRandomNums()+" "+getAdjective2()+" fireworks shooting from"
		+getNoun3()+".";
		setStory(storybody);
	}

	public void enterName(){
		setName(scanner.nextLine());
	}

	public void enterNoun1(){
		setNoun1(scanner.nextLine());
	}

	public void enterNoun2(){
		setNoun2(scanner.nextLine());
	}

	public void enterNoun3(){
		setNoun3(scanner.nextLine());
	}

	public void enterAdjective1(){
		setAdjective1(scanner.nextLine());
	}

	public void enterAdjective2(){
		setAdjective2(scanner.nextLine());
	}

	public void enterAdverb(){
		setAdverb(scanner.nextLine());
	}







	public static void main(String args[]){

		MADLIB game = new MADLIB();
		game.printInstruction();

	}



}