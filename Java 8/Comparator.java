import java.util.*;
import java.util.stream.Collectors;
public class Comparator{



  public static void main(String args[]){

    ArrayList<String> names = new ArrayList<>();
    names.add("abhay");
    names.add("jack");
    names.add("daniel");
    names.add("weber");

    System.out.println("Before sorting: ");
    names.forEach(System.out::println);

    // sort can be directly applied on ArrayList
    names.sort((String s1, String s2) -> s1.compareTo(s2));

    System.out.println("After sorting: " + names);

    TreeMap<String, Integer> treemap = new TreeMap<>();

    treemap.put("a",1);
    treemap.put("w",5);
    treemap.put("d",2);
    treemap.put("q",3);

    treemap.forEach((k,v) -> System.out.println(k + " :: " +v));

    List<String> uppercase = Arrays.asList("A","B","C","D");

    List<String> lower = uppercase.stream()
                                  .map(String::toLowerCase)
                                  .collect(Collectors.toList());

    System.out.println("All lowercase: ");
    lower.forEach(System.out::println);





  }

}
