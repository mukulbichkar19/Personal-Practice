public class reverseString{

  public static void main(String args[]) {
    String s = "Hello World welcome to Java";
    String[] str = s.split(" ");
    StringBuilder sb = new StringBuilder();
    for(String s1:str){
       String rev = new StringBuilder(s1).reverse().toString();
       sb.append(rev);
       sb.append(" ");
    }
    System.out.println("Reversed string: "+sb);
  }

}
