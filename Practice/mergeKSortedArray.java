import java.util.*;
public class mergeKSortedArray{
  private  static PriorityQueue<Integer> min = new PriorityQueue<>();
  private static PriorityQueue<Integer> max = new PriorityQueue<>(20, Collections.reverseOrder());
  private static void merge(List<int[]> lists){

    List<Integer> result = new ArrayList<>();

    PriorityQueue<Integer> pq = new PriorityQueue<>();

    for(int[] i:lists){
      pq.add(i[0]);
    }

    System.out.println(pq);

    // while(!pq.isEmpty()){
    //   result.add(pq.poll());
    //   if()
    // }
    //
    // System.out.println();
    // System.out.println("Result : "+result);

  }


  private static void test(){



    addNum(1);
    addNum(2);
    addNum(3);
    addNum(4);







  }

  private static void addNum(int n){
      max.offer(n);
      min.offer(max.poll());
      if(max.size() < min.size()){
        max.offer(min.poll());
      }
      System.out.println(max + " :: " +min);

  }

  private static void display(PriorityQueue<Integer> q){
    Object[] arr = q.toArray();
    for(int i=0;i<arr.length;i++){
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  public static void main(String args[]){

    int[] a = {1,3,5};
    int[] b = {0,8};
    int[] c = {9,10,11};
    List<int[]> lists = new ArrayList<>();
    lists.add(a);
    lists.add(b);
    lists.add(c);
    //merge(lists);

    test();



  }

}
