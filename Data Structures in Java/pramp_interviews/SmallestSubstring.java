public class SmallestSubstring{

  public static String checksmallestsubstring(String[] arr, String tobe_matched){

    // Approach 1: brute force
    System.out.println(tobe_matched);
    for(String s:arr){
      System.out.print(s+" ");
    }

    return tobe_matched;

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
