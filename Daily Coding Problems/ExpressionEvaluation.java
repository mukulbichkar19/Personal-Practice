import java.util.ArrayList;
public class ExpressionEvaluation{

  private static String[] generate_all_expressions(String s, long target){
      ArrayList<String> res = new ArrayList<>();
      generateExpressions("",s,target,res);
      String[] result = new String[res.size()];
      int k = 0;
      for(String r:res){
        result[k++] = r;
      }
      return result;
  }

  private static void generateExpressions(String s, String rem,long target,
                                          ArrayList<String> res) {

           if(rem.length() == 0){

              if(calculateValue(s) == target){
                res.add(s);
              }
              return;
           }

           for(int i=0;i<rem.length();i++){
              String new_string = s + rem.charAt(i);
              String new_rem = rem.substring(0,i) + rem.substring(i+1);
              String with_join = new_string;
              String with_multiply = new_string;
              String with_add = new_string;
              if(new_rem.length()!=0){
                with_join += "J";
                with_multiply += "M";
                with_add += "A";
                generateExpressions(with_join, new_rem, target, res);
                generateExpressions(with_multiply, new_rem, target, res);
                generateExpressions(with_add, new_rem, target, res);
              }
              generateExpressions(new_string, new_rem, target, res);
           }
  }


  private static int calculateValue(String s){

    int value = 0;

    System.out.println("Inside evaluate strings: " +s);
    for(int sy=1;sy<s.length();sy++){

      char ch = s.charAt(sy);

      if(sy == 'J'){
        sum += String.valueOf(s.charAt(sy-1)) * 10 + String.valueOf(s.charAt(sy+1));
      }else if(sy == 'M'){
        sum += 
      }



    }

    return 0;

  }





  public static void main(String args[]){

    String s = "12";
    long target = 3;


    String[] result = generate_all_expressions(s, target);
    for(int i=0;i<result.length;i++){
      System.out.println(result[i] + " ");
    }



  }


}
