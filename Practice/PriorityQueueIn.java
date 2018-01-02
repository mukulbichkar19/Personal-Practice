import java.util.PriorityQueue;
import java.util.Iterator;
import java.util.Collections;
import java.util.Comparator;
public class PriorityQueueIn{


  public static void main(String args[]){

    PriorityQueue<Integer> pq = new PriorityQueue<>(20, new Comparator<Integer>(){
      public int compare(Integer i1,Integer i2){
        return i2-i1;
      }
    });
    pq.add(12);
    pq.add(13);
    pq.add(17);
    pq.add(0);
    pq.add(6);
    System.out.println(pq);



  }

}
