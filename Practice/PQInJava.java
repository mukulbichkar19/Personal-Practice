import java.util.PriorityQueue;
import java.util.Iterator;
import java.util.Collections;
import java.util.Comparator;

public class PQInJava{


  public static void main(String args[]){

    PriorityQueue<Integer> pq = new PriorityQueue<>();
    pq.add(12);
    pq.add(15);
    pq.add(9);
    pq.add(3);
    pq.add(20);

    Iterator<Integer> itr = pq.iterator();
    while(itr.hasNext()){
      System.out.print(itr.next() + " ");
    }
    System.out.println();

    Object[] array = pq.toArray();
    for(int i=0;i<array.length;i++){
      System.out.print(array[i] + " ");
    }
    System.out.println();

    PriorityQueue<Integer> pq_max = new PriorityQueue<>(20, Collections.reverseOrder());

    PriorityQueue<Integer> pq_max1 = new PriorityQueue<>(20, new Comparator<Integer>(){
      public int compare(Integer o1, Integer o2){
        return o2-o1;
      }
    });

    pq_max1.add(12);
    pq_max1.add(15);
    pq_max1.add(9);
    pq_max1.add(3);
    pq_max1.add(20);

    System.out.println(pq_max1);











  }

}
