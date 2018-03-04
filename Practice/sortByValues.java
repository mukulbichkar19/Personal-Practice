import java.util.HashMap;
import java.util.TreeMap;
import java.util.Comparator;
import java.util.Map.Entry;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.Collections;
public class sortByValues{

  public static void main(String args[]){

    HashMap<String, Integer> map = new HashMap<>();

    map.put("A",2);
    map.put("B",9);
    map.put("S",8);
    map.put("E",5);
    map.put("F",1);

    Set<Entry<String,Integer>> entries = map.entrySet();

    // random ordering based on hash values of keys
    System.out.println(map);

    //Sort based on keys
    // Method 1: Using TreeMap
    TreeMap<String, Integer> treemap = new TreeMap<>(map);
    System.out.println("Sorting based on keys: ");
    System.out.println(treemap);

    // Sort by values
    Comparator<Entry<String, Integer>> valueComparator = new Comparator<Entry<String, Integer>>(){

      public int compare(Entry<String, Integer> e1, Entry<String, Integer> e2){
        Integer i1 = e1.getValue();
        Integer i2 = e2.getValue();
        return i1.compareTo(i2);
      }
    };

    List<Entry<String, Integer>> listOfEntries = new ArrayList<Entry<String, Integer>>(entries);

    Collections.sort(listOfEntries, valueComparator);

    LinkedHashMap<String, Integer> sortedByValues = new LinkedHashMap<>(listOfEntries.size());

    for(Entry<String, Integer> entry:listOfEntries){
      sortedByValues.put(entry.getKey(), entry.getValue());
    }

    System.out.println("Sorted by values");
    System.out.println(sortedByValues);













  }



}
