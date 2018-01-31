import java.util.*;
public class Sorting{


  public static void main(String args[]){

    // 1. Sort a hashmap
    Map<String, Integer> map = new HashMap<>();
    map.put("a",3);
    map.put("z",6);
    map.put("l",8);
    map.put("m",90);
    map.put("n",11);
    map.put("p",12);

    System.out.println("Without sorting: "+map);

  //   // Sorting based on keys
  //   LinkedHashMap<String, Integer> result = new LinkedHashMap<>();
  //   map.entrySet().stream()
  //                 .sorted(Map.Entry.comparingByKey())
  //                 .forEachOrdered(x -> result.put(x.getKey(), x.getValue()));
  //
  //  System.out.println("After Sorting based on keys: "+result);
  //
  //  // Sorting based on values
  //  LinkedHashMap<String, Integer> sortedByValue = new LinkedHashMap<>();
  //  map.entrySet().stream()
  //                .sorted(Map.Entry.comparingByValue(Collections.reverseOrder()))
  //                .forEachOrdered(x -> sortedByValue.put(x.getKey(), x.getValue()));
  //
  // System.out.println("After Sorting based on values: "+sortedByValue);

  LinkedHashMap<String, Integer> sortByKey = new LinkedHashMap<>();
  map.entrySet().stream()
     .sorted(Map.Entry.comparingByKey())
     .forEachOrdered(x -> sortByKey.put(x.getKey(), x.getValue()));

  System.out.println(sortByKey);

  LinkedHashMap<String, Integer> sortedByValue = new LinkedHashMap<>();

  map.entrySet().stream()
     .sorted(Map.Entry.comparingByValue())
     .forEachOrdered(x -> sortedByValue.put(x.getKey(), x.getValue()));

System.out.println(sortedByValue);










  }


}
