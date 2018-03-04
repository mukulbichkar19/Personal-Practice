import java.util.*;
public class DequeImpl{



  public static void main(String args[]){

      // Deque is used for Sliding Window questions
      Deque<Integer> dq = new ArrayDeque<>(10); //ArrayDeque is the
                                                // implementation of Deque Interface
      dq.add(4);
      dq.add(5);

      // Can add at first position
      dq.addFirst(15);

      // Can add at last position
      dq.addLast(90);

      // contains
      System.out.println(dq.contains(22));

      // getFirst
      System.out.println(dq.getFirst());

      // getLast
      System.out.println(dq.getLast());

      // remove/poll first
      dq.pollFirst();

      System.out.println(dq);

      int[] array = {1,3,-1,-3,5,3,6,7};
      int window_size = 3;
      findMaxInSliding(array, window_size);


  }

  private static void findMaxInSliding(int[] array, int k){

    if(array.length < k){
      System.out.println("Not possible");
    }

    List<Integer> result = new ArrayList<>();

    Deque<Integer> d_q = new ArrayDeque<>();

    for(int i=0;i<array.length;i++){

        


    }



  }


}
