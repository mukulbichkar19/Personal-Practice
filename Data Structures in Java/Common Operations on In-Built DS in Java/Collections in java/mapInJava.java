public class mapInJava{


  public static void main(String args[]) {

    java.util.Map<String, Integer> hashmap =
                                  new java.util.HashMap<String, Integer>();
    // Associates the specified value with the specified key in this map (optional operation).
    hashmap.put("I", new String("I").length());
    hashmap.put("will", new String("will").length());
    hashmap.put("do", new String("do").length());
    hashmap.put("it", new String("it").length());

    // Returns the value to which the specified key is mapped, or null if this map contains no mapping for the key.
    System.out.println(hashmap.get("will"));
    // Removes the mapping for a key from this map if it is present (optional operation).
    hashmap.remove("it");
    // Display the elements in the hashmap
    for(java.util.Map.Entry<String, Integer> e: hashmap.entrySet()) {
      System.out.println("key is: "+e.getKey() + " value is: "+e.getValue());
    }
    // Returns true if this map contains a mapping for the specified key.
    System.out.println(hashmap.containsKey("will"));
    // Returns true if this map maps one or more keys to the specified value.
    System.out.println(hashmap.containsValue(1));
    // Returns a Collection view of the values contained in this map.
    System.out.println(hashmap.values());
    // Returns the number of key-value mappings in this map.
    System.out.println("The size of hashmap is: "+hashmap.size());
    // For more functions refer to https://docs.oracle.com/javase/7/docs/api/java/util/HashMap.html

    //   TreeMap
    /*
      A Red-Black tree based NavigableMap implementation.
      The map is sorted according to the natural ordering of its keys, or by a Comparator provided at map creation time, depending on which constructor is used.
      For more functions refer to https://docs.oracle.com/javase/7/docs/api/java/util/TreeMap.html
    */

    // LinkedHashMap
    /*
    Hash table and linked list implementation of the Map interface, with predictable iteration order.
    This implementation differs from HashMap in that it maintains a doubly-linked list running through all of its entries.
    This linked list defines the iteration ordering, which is normally the order in which keys were inserted into the map (insertion-order).
    Note that insertion order is not affected if a key is re-inserted into the map.
    (A key k is reinserted into a map m if m.put(k, v) is invoked when m.containsKey(k) would return true immediately prior to the invocation.)
    For more function refer to https://docs.oracle.com/javase/7/docs/api/java/util/LinkedHashMap.html
    */


    //Advanced Stuff
    java.util.HashMap<Integer, Integer> adv = new java.util.HashMap<>();
    adv.put(0,1);
    adv.put(1,2);
    adv.put(2,3);

    adv.put(4);
    adv.getOrDefault(4,0);
    for(java.util.Map.Entry<Integer, Integer> entry:adv.entrySet()){
      System.out.println(entry.getKey() + " and val " +entry.getValue());
    }


  }


}
