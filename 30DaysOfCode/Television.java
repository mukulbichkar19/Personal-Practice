public class Television{
	
	public int channel;
	public double band;

	public Television(){
		channel = 4;
	}

	public static void main(String args[]){

		Television t = new Television();
		System.out.println("Television channel is "+t.channel+" "+t.band);


	}
}