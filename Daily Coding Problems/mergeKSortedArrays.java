import java.util.*;
public class mergeKSortedArrays{


  public static void main(String args[]){

    int[][] sorted = {{1,2,4,8,12,15}, {3,6,9,12,15},{4,9,13,16,18,22}, {30,42,44,50,70}};
    System.out.println("K: "+sorted.length);
    System.out.println("N: "+sorted[0].length);


    List<Integer> result = new ArrayList<>();

    PriorityQueue<ArrayElement> pq =
    new PriorityQueue<>((a,b) -> Integer.compare(a.value, b.value));

    for(int i=0;i<sorted.length;i++){
      pq.add(new ArrayElement(i, sorted[i][0], 0));
    }

    for(ArrayElement p:pq){
      System.out.println("ArrayElement is: ");
      System.out.println(p.array_no + " :: index: "+p.index+" value: "+p.value);
    }

    while(!pq.isEmpty()){
      ArrayElement min_element = pq.poll();
      if(min_element.index + 1 < sorted[min_element.array_no].length){
        pq.add(new ArrayElement(min_element.array_no,
        sorted[min_element.array_no][min_element.index+1],min_element.index + 1));
      }
      result.add(min_element.value);
    }

    System.out.println(result);




  }


}
