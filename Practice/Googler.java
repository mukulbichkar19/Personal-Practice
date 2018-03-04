public class Googler{



  public static void main(String args[]){

    String a = "abcd";
    String b = "cdabcdab";

    StringBuilder concatenated = new StringBuilder("");

//		if(a.length() == 0) {
//			return 0;
//		}
    int count = 0;
    while(!concatenated.toString().contains(b)) {
      count++;
      concatenated.append(a);
    }

    System.out.println("count is: "+count);
    System.out.println(concatenated.toString());




  }


}
