import java.util.*;
import java.util.Comparator;
import java.util.stream.Collectors;

public class MapOperations {

  /**
   * sortMapByKey : Sort a map by keys
   * @author Mukul
   */
  private static void sortMapByKey() {

      Map<String, Integer> map = new HashMap<>();

      map.put("alice", 2);
      map.put("apple", 3);
      map.put("xyz", 5);
      map.put("ripples", 7);
      map.put("cat", 2);
      map.put("decoy", 8);

      LinkedHashMap<String, Integer> sortedByKey = new LinkedHashMap<>();

      // Sort a map based on keys in ascending or natural ordered way
       map.entrySet()
          .stream()
          .sorted(Map.Entry.comparingByKey())
          .forEachOrdered(x -> sortedByKey.put(x.getKey(), x.getValue()));

      // sortedByKey.entrySet().stream().forEach(System.out::println);

      LinkedHashMap<String, Integer> sortedByKeyRev = new LinkedHashMap<>();
       map.entrySet()
          .stream()
          .sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
          .forEachOrdered(x -> sortedByKeyRev.put(x.getKey(), x.getValue()));

      // sortedByKeyRev.entrySet().stream().forEach(System.out::println);
  }



  /**
   * sortByValues : Sort a map based on values
   * @author Mukul
   */
  private static void sortByValues() {

    Map<String, Integer> map = new HashMap<>();
    map.put("alice", 2);
    map.put("apple", 3);
    map.put("xyz", 5);
    map.put("ripples", 7);
    map.put("cat", 2);
    map.put("decoy", 8);

    LinkedHashMap<String, Integer> sortedByValues = new LinkedHashMap<>();

    // Sorting in ascending order
    map.entrySet()
       .stream()
       .sorted(Map.Entry.comparingByValue())
       .forEachOrdered(x -> sortedByValues.put(x.getKey(), x.getValue()));

   // sortedByValues.entrySet().forEach(System.out::println);

   LinkedHashMap<String, Integer> sortedByValuesRev = new LinkedHashMap<>();

   // Sorting in descending order
   map.entrySet()
      .stream()
      .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
      .forEachOrdered(x -> sortedByValuesRev.put(x.getKey(), x.getValue()));

  // sortedByValuesRev.entrySet().stream().forEach(System.out::println);
  }





  public static void main(String args[]) {

      sortMapByKey();
      System.out.println("---------------------------");
      sortByValues();



  }

}
