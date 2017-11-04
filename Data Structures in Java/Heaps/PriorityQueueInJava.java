import java.util.*;
public class PriorityQueueInJava{


  public static void main(String args[]){

    // The in-built structure in java is min heap
    PriorityQueue<Integer> pq = new PriorityQueue<>();

    pq.add(3);
    pq.add(6);
    pq.add(0);
    pq.add(2);
    pq.add(1);
    pq.add(9);

    // Iterator
    Iterator<Integer> itr = pq.iterator();
    while(itr.hasNext()){
      System.out.print(itr.next()+" ");
    }
    System.out.println();
    // Convert array to Object array
    Object[] arr = pq.toArray();
    for(int i=0;i<arr.length;i++){
      System.out.print(arr[i] + " ");
    }
    System.out.println();

    // Max heap
    // 1. Using in-built reverse collections order
    PriorityQueue<Integer> pq_max = new PriorityQueue<>(20,
                                                    Collections.reverseOrder());
    pq_max.add(3);
    pq_max.add(6);
    pq_max.add(0);
    pq_max.add(2);
    pq_max.add(1);
    pq_max.add(9);

    System.out.println(pq_max);

    // 2. By Overriding the comparator
    PriorityQueue<Integer> pq_max2 = new PriorityQueue<>(20, new Comparator<Integer>(){
      public int compare(Integer o1, Integer o2){
        return o2 - o1;
      }
    });

    pq_max2.add(3);
    pq_max2.add(6);
    pq_max2.add(0);
    pq_max2.add(2);
    pq_max2.add(1);
    pq_max2.add(9);

    System.out.println(pq_max2);

  }



}
