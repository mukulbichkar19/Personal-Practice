public class PriorityQueueDemo{



  public static void main(String args[]){

    int[] elements = {3,4,1,5,90,122,900,45,2,8};
    java.util.PriorityQueue<Integer> pq = new java.util.PriorityQueue<>(
    elements.length, new java.util.Comparator<Integer>(){
        public int compare(Integer o1, Integer o2){
          if(o1 < o2){
            return -1;
          }else if(o1 == o2){
            return 0;
          }
          return 1;
        }
      });
    for(int i=0;i<elements.length;i++){
      pq.offer(new Integer(elements[i]));
    }

    for(Integer e:pq){
      System.out.println(e);
    }



  }

}
