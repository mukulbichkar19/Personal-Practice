public class ReverseWordsInString{

  static char[] s;

  public static String strArray(String s) {
    char[] c = s.toCharArray();
    reverse(c,0,c.length-1);
    System.out.println("In string: ");
    for(int i=0;i<c.length;i++){
      System.out.print(c[i]);
    }
    System.out.println();
    return null;
  }




  public static void main(String args[]){

      String str = "the sky is blue";
      String st = strArray(" ");
      /*s = str.toCharArray();

      // Reverse the entire string
      reverse(s,0,s.length-1);

      for(int i=0;i<s.length;i++){
        System.out.print(s[i]);
      }
      System.out.println();

      // Reverse each word
      int start = 0;
      for(int i=0;i<s.length;i++){
        if(s[i] == ' '){
          reverse(s, start, i-1);
          start = i+1;
        }
      }

      // Reverse the last word
      reverse(s, start, s.length-1);*/


      // for(int i=0;i<s.length;i++){
      //   System.out.print(s[i]);
      // }
      // System.out.println();

  }


  private static void reverse(char[] s,int start, int end){

    /*int s1 = start;
    int e1 = end;

    while(e1 > s1){
      char temp = s[e1];
      s[e1] = s[s1];
      s[s1] = temp;
      s1++;
      e1--;
    }*/

    int begin = start;
    int close = end;

    while(begin < end){

        char swap = s[begin];
        s[begin] = s[end];
        s[end] = swap;

        begin++;
        end--;

    }




  }

}
