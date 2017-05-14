public class deQueueInJava{


  public static void main(String args[]) {

    java.util.Deque<Integer> dq = new java.util.LinkedList<>();

    // Add elements in a deQueue
    dq.add(1);
    dq.add(2);

    // Add elements to the first in a deQueue
    dq.addFirst(25);

    // Add element to the last in a deQueue
    dq.addLast(18);

    // offer also adds element in Deque
    dq.offer(45);
    // Add elements to the first in a deQueue
    dq.offerFirst(80);
    // Add element to the last in a deQueue
    dq.offerLast(55);

    for(Integer i:dq){
      System.out.println(i);
    }

    // Get first element
    System.out.println("First element is: " + dq.getFirst() + " : "
                        +dq.peekFirst() + " : " +dq.peek());

    // Get last element
    System.out.println("First element is: " + dq.getLast() + " : "
                        +dq.peekLast() + " : "+dq.element());

   // Remove element
    System.out.println("Remove elements: "+dq.poll() + " : "+dq.pollFirst()
                        +" : "+dq.pollLast());

    for(Integer i:dq){
      System.out.println(i);
    }

    // push and pop elements can be used as well
    // remove, removeFirst and removeFirstOccurrence, removeLast,
    // removeLastOccurrence are also present


    // For more functions refer to https://docs.oracle.com/javase/7/docs/api/java/util/Deque.html










  }


}
