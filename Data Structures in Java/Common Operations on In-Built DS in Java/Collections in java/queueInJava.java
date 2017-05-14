public class queueInJava{


  public static void main(String args[]) {
    java.util.Queue<Integer> q = new java.util.PriorityQueue<>();
    q.offer(5); // Add element in a queue
    q.offer(2);
    q.offer(1);
    q.poll(); // remove the element at head of queue FIFO
    for(Integer i:q){
      System.out.println(i);
    }
    // Check the element at the head of queue
    System.out.println("The element at the head of queue is: " + q.peek());
    // More functions can bfe found at https://docs.oracle.com/javase/7/docs/api/java/util/Queue.html

    // Inserts the specified element into this queue if
    // it is possible to do so immediately without violating capacity restrictions,
    // returning true upon success and throwing an IllegalStateException if no space is currently available.
    q.add(30);
    q.add(45);
    for(Integer i:q){
      System.out.println(i);
    }
    // Retrieves, but does not remove, the head of this queue.
    System.out.println("The element at head is: " + q.element());
    // Retrieves and removes the head of this queue.
    q.remove();
    for(Integer i:q){
      System.out.println(i);
    }





  }


}
