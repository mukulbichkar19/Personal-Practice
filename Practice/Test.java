import java.util.*;
public class Test{

    public static void main(String args[]){

      ArrayMultiMap<String, String> multi = new ArrayMultiMap<>();

      multi.put("John","Hancock");
      multi.put("John","Legend");
      multi.put("Terri","Bulldog");
      System.out.println(multi.get("John"));
      System.out.println(multi.keySet());
      System.out.println(multi.values());
      System.out.println(multi.size());




    }



}
