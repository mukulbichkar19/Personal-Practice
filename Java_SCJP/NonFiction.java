public class NonFiction extends Book{

	public String subject;

	public NonFiction(String subject, String ISBN){
		super(ISBN);
		this.subject = subject;
	}

	public NonFiction(String subject){
		super("-1");
		this.subject = subject;
	}


	public static void main(String args[]){


		NonFiction x = new NonFiction("American History","123-456");
		NonFiction y = new NonFiction("Greek Mythology");
		System.out.println(x.ISBN);
		System.out.println(y.ISBN);
	}

	


}