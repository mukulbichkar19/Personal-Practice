public class listInJava{

  /*
  Resizable-array implementation of the List interface. Implements all optional list operations, and permits all elements, including null. In addition to implementing the List interface, this class provides methods to manipulate the size of the array that is used internally to store the list.
  (This class is roughly equivalent to Vector, except that it is unsynchronized.)
  The size, isEmpty, get, set, iterator, and listIterator operations run in constant time.
  The add operation runs in amortized constant time, that is, adding n elements requires O(n) time.
  All of the other operations run in linear time (roughly speaking).
  The constant factor is low compared to that for the LinkedList implementation.
  Each ArrayList instance has a capacity.
  The capacity is the size of the array used to store the elements in the list.
  It is always at least as large as the list size. As elements are added to an ArrayList, its capacity grows automatically.
  The details of the growth policy are not specified beyond the fact that adding an element has constant amortized time cost.



  */

  public static void main(String args[]){

    // ArrayList
    java.util.ArrayList<Integer> arraylist = new java.util.ArrayList<>();
    arraylist.add(1);
    arraylist.add(3);
    arraylist.add(5);
    arraylist.add(15);
    arraylist.add(3);

    // Display array list using for Each
    for(Integer i:arraylist) {
      System.out.println(i);
    }

    // Display array list
    java.util.ListIterator<Integer> arraylistiter = arraylist.listIterator();
    while(arraylistiter.hasNext()) {
      System.out.println("Iterate arraylist: " + arraylistiter.next());
    }

    // Display array list in reverse order
    while(arraylistiter.hasPrevious()) {
      System.out.println("Iterate arraylist in reverse: " + arraylistiter.previous());
    }

    // Returns the element at the specified position in this list.
    System.out.println("Get the element at specified index: " + arraylist.get(1));

    // Returns the index of the first occurrence of the specified element in this list, or -1 if this list does not contain the element.
    System.out.println("Get the index of the selected element: " + arraylist.indexOf(2));

    // Returns the index of the last occurrence of the specified element in this list, or -1 if this list does not contain the element.
    System.out.println("Get the last occurrence of the given element: " + arraylist.lastIndexOf(3));

    // Convert Array List to array
    Integer[] array = arraylist.toArray(new Integer[0]);
    System.out.println("After conversion to array: ");
    for(Integer i:array) {
      System.out.println(i);
    }

    // For more functions please refer to https://docs.oracle.com/javase/7/docs/api/java/util/ArrayList.html

    ///////// ******* End of ArrayList ********* ///////////


    // LinkedList
    java.util.LinkedList<String> linklist = new java.util.LinkedList<>();
    // Appends the specified element to the end of this list.
    linklist.add("I");
    linklist.add("will");
    linklist.add("do");
    // Inserts the specified element at the beginning of this list.
    linklist.addFirst("Today");
    for(String s:linklist) {
      System.out.println("linklist " + s);
    }
    // Appends the specified element to the end of this list.
    linklist.addLast("it");
    for(String s:linklist) {
      System.out.println("linklist last " + s);
    }
    java.util.Iterator<String> descIter = linklist.descendingIterator();
    while(descIter.hasNext()){
      System.out.println(descIter.next());
    }
    // refer to https://docs.oracle.com/javase/7/docs/api/java/util/LinkedList.html
    // for other items








  }


}
