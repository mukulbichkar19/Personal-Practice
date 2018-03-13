import java.util.*;

public class SmallestSubstring{

  /*public static String checksmallestsubstring(String[] arr, String tobe_matched){

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
  }*/

  private static String smallestSub(char[] arr, String str){

    //The smallest substring will be of length of arr.
   // If nor we increment by 1
   boolean flag = false;
   int lim = str.length();
   String min_len = "";
   java.util.Set<Character> org = new HashSet<>();
   for(int i=0;i<arr.length;i++){
     org.add(arr[i]);
   }
   for(int k=arr.length;k<=lim;k++){
     for(int j=0;j+k<=lim;j++){
       String sub = str.substring(j,j+k);
       //System.out.println(sub);
       char[] sub_array = sub.toCharArray();
       int count = 0;
       Set<Character> match = new HashSet<>();
        for(int i=0;i<sub_array.length;i++){
         if(org.contains(sub_array[i])){
           match.add(sub_array[i]);
           count++;
         }
       }
       if(match.size() == org.size()){
          min_len = sub;
          flag = true;
          break;
       }
     }
     if(flag){
       break;
     }
   }
   return min_len;
  }

  private static int calculateVal(char[] a){
    int xor = 0;
    for(int i=0;i<a.length;i++){
      xor ^= a[i];
    }
    return xor;
  }





  public static void main(String args[]){

      char[] arr = {'x','y','z'};
      java.util.Scanner scan = new java.util.Scanner(System.in);
      System.out.println("Enter the string: ");
      String tobe_matched = scan.next();
      //String matched_result = checksmallestsubstring(arr,tobe_matched);
      String matched_result = smallestSub(arr,tobe_matched);
      if(matched_result != ""){
        System.out.println(matched_result + " is the smallest substring");
      }else{
        System.out.println("Smallest Substring does not exist.");
      }


  }



}
