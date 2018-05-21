public class Permute{

  private static int count;
  private static void permuteHelp(String output, String rem){

        if(rem.length() == 0){
             count++;
            System.out.println(output);
        }


        for(int i=0;i<rem.length();i++){

            if(i < rem.length()-1  && rem.charAt(i) == rem.charAt(i+1)){
                continue;
            }
            String curr_output = output + rem.charAt(i);
            //output.append(rem.charAt(i));
            String next = rem.substring(0,i) + rem.substring(i+1);
            //permuteHelp(curr_output, next);
            permuteHelp(curr_output, next);
            //output.deleteCharAt(output.length()-1);
        }
    }


  private static void permuteMain(String s){
       permuteHelp("",s);
   }

  public static void main(String args[]){

    count = 0;
    String s = "apple";

    permuteMain(s);
    System.out.println("No of output is: "+count);

  }

}
