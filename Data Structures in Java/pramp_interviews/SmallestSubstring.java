public class SmallestSubstring{

  public static String checksmallestsubstring(String[] arr, String tobe_matched){

    String match = null;
    // Approach 1: brute force
    int arr_len = arr.length;
    // Find hex values of string arr
    int arr_hex = 0;
    for(String s:arr){
       arr_hex ^= s.charAt(0);
    }
    System.out.println(arr_hex);
    for(int i=0;i<tobe_matched.length()-arr_len+1;){
        String substring = tobe_matched.substring(i,i+arr_len);
        if(findHex(substring)==arr_hex)
        {
          match = substring;
          break;
        }
        i++;
    }

    return match;

  }

  private static int findHex(String s){
    int hex_value = 0;
    for(int i=0;i<s.length();i++){
      hex_value ^= s.charAt(i);
    }
    return hex_value;
  }

  public static void main(String args[]){

      String[] arr = {"x","y","z"};
      java.util.Scanner scan = new java.util.Scanner(System.in);
      System.out.println("Enter the string: ");
      String tobe_matched = scan.next();
      String matched_result = checksmallestsubstring(arr,tobe_matched);
      if(matched_result != null){
        System.out.println(matched_result);
      }else{
        System.out.println("Smallest Substring does not exist.");
      }


  }



}
