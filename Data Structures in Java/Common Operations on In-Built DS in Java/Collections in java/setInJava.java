

public class setInJava{

  /*
  The Java platform contains three general-purpose Set implementations: HashSet, TreeSet, and LinkedHashSet.
  HashSet, which stores its elements in a hash table, is the best-performing implementation; however it makes no guarantees concerning the order of iteration.
  TreeSet, which stores its elements in a red-black tree, orders its elements based on their values; it is substantially slower than HashSet.
  LinkedHashSet, which is implemented as a hash table with a linked list running through it, orders its elements based on the order in which they were inserted into the set (insertion-order).
  LinkedHashSet spares its clients from the unspecified, generally chaotic ordering provided by HashSet at a cost that is only slightly higher.
  */



  public static void main(String args[]){

    // HashSet
    java.util.Set<String> hashset = new java.util.HashSet<>();
    // Adding elements inside HashSet
    hashset.add("do");
    hashset.add("it");
    hashset.add("now");
    // Display the elements inside hashset
    // 1. Using for-each
    for(String e:hashset){
      System.out.println(e);
    }
    // 2. Using Iterators
    java.util.Iterator<String> setIterator = hashset.iterator();
    while(setIterator.hasNext()){
      System.out.println("Inside iterator: "+setIterator.next());
    }
    // Get the size of hashset
    System.out.println("Size of hashset is: " + hashset.size());
    // Check if hashset is empty
    System.out.println("Check whether hashSet is empty " + hashset.isEmpty());
    // Remove an element from hashset
    hashset.remove("it");
    System.out.println("After Removal");
    for(String e:hashset){
      System.out.println(e);
    }
    // Convert a hashset to array
    String[] array = hashset.toArray(new String[0]);
    System.out.println("After converting to array: ");
    for(String i:array){
      System.out.println(i);
    }
    // Check if an element is present in the hashset
    System.out.println(hashset.contains("now"));


    ///// **** End of HashSet ********* ///////

    // TreeSet
    java.util.TreeSet<Integer> treeset = new java.util.TreeSet<>();
    treeset.add(1);
    treeset.add(2);
    treeset.add(3);
    treeset.add(4);
    treeset.add(5);
    // Display treeset
    for(Integer i : treeset) {
      System.out.println(i);
    }
    // Using Iterators
    java.util.Iterator<Integer> treesetiter = treeset.iterator();
    while(treesetiter.hasNext()){
      System.out.println("inside treeset: "+treesetiter.next());
    }
    // Using Descending Iterators
    java.util.Iterator<Integer> treesetiterdesc = treeset.descendingIterator();
    while(treesetiterdesc.hasNext()){
      System.out.println("inside descending: "+treesetiterdesc.next());
    }
    // Get the Ceiling
    System.out.println("Ceiling is: " + treeset.ceiling(8));
    // Returns the first (lowest) element currently in this set.
    Integer lowest = treeset.first();
    System.out.println("First element is: " + lowest);
    // Returns the last (highest) element currently in this set.
    Integer great = treeset.last();
    System.out.println("Highest element is: " + great);
    // Retrieves and removes the first (lowest) element, or returns null if this set is empty.
    System.out.println("First element in treeset: "+treeset.pollFirst());
    // Retrieves and removes the last (highest) element, or returns null if this set is empty.
    System.out.println("Last element in treeset: "+treeset.pollLast());
    java.util.SortedSet<Integer> subset = treeset.subSet(0, 2);
    // System.out.println("Subset iteration: ");
    // for(Integer i : subset) {
    //   System.out.println(i);
    // }

    ///// **** End of TreeSet ********* ///////


    // LinkedHashSet
    // Same as hashset but the order is maintained here
    java.util.LinkedHashSet<String> linkedhashset = new java.util.LinkedHashSet<>();
    linkedhashset.add("Let's");
    linkedhashset.add("do");
    linkedhashset.add("it");
    for(String s : linkedhashset) {
      System.out.println(s);
    }













  }


}
