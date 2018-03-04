import java.util.*;
public class StringToCharArray{


  public static void main(String args[]){

    String s = "HelloWorld";
    Map<Character, Integer> charCounts = new HashMap<>();
    s.chars()
     .mapToObj(x -> (char) x)
     .forEach(System.out::println);
     //.forEach(x -> charCounts.put(x, charCounts.getOrDefault(x,0)+1));

    //System.out.println(charCounts);

  }

}
