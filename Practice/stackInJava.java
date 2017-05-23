public class stackInJava{


  private static boolean isValid(String s){

      java.util.Stack<Character> charStack = new java.util.Stack<>();
       if(s == null){
           return true;
       }else if(s.length() == 1){
           return false;
       }else{


         for(int i=0;i<s.length();i++){
           switch(s.charAt(i)){
             case '[' : charStack.push('[');
                         break;
             case '{' : charStack.push('{');
                         break;
             case '(' : charStack.push('(');
                         break;
             case ']' :  if(charStack.size()!=0 && charStack.peek() == '[' )
                         {
                           charStack.pop();
                         }else{
                             charStack.push(']');
                         }
                         break;
             case '}' :  if(charStack.size()!=0 && charStack.peek() == '{')
                         {
                           charStack.pop();
                         }else{
                             charStack.push('}');
                         }
                         break;
             case ')' : if(charStack.size()!=0 && charStack.peek() == '(')
                         {
                           charStack.pop();
                         }else{
                             charStack.push(')');
                         }
                         break;
              }
         }


       }
       return charStack.isEmpty();
  }

  public static void main(String args[]){

    String s = args[0];

    if(isValid(s)){
      System.out.println("Valid Parantheses");
    }else{
      System.out.println("Not a valid parantheses");
    }





  }

}
