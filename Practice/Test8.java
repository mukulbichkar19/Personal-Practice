import java.util.*;
public class Test8{


  public static void main(String args[]){

     Map<String, Integer> map = new HashMap<>();
     map.put("a",2);
     map.put("b",4);
     map.put("d",3);
     map.put("f",8);


     
     //System.out.println(map);
     //LinkedHashMap<String, Integer> lmap = new LinkedHashMap<>();
     map.entrySet().stream()
                   .sorted(Map.Entry.comparingByValue(Collections.reverseOrder()))
                   .forEachOrdered(x -> System.out.print(x + " "));

      System.out.println();

  }

}
