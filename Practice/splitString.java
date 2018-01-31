public class splitString{

  private static String reverseWords(String s){

    if(s.length() == 0){
        return "";
    }

    String[] splitted = s.trim().split("\\\\s+");



    StringBuffer str = new StringBuffer("");
    for(int i=splitted.length-1;i>0;i--){
      //System.out.println(splitted[i]);
      if(splitted[i] != " "){
        str.append(splitted[i]);
        str.append(" ");
      }
    }

    return str.toString().trim();
  }


  public static void main(String args[]){

      String s = "   a   b ";
      String res = reverseWords(s);
      System.out.println("The reversed string is: "+res);

  }


}
