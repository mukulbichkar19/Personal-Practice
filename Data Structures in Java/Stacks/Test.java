import java.util.*;
public class Test{

  private static int t_size = 0;
  private static Deque<Node2> lru;
  private static HashSet<Integer> set;
  public Test(int capacity){
    lru = new LinkedList<>();
    t_size = capacity;
    set = new HashSet<>();
  }


   public int get(int key) {
     if(set.contains(key)){

       for(Node2 n:lru){
         if(n.key == key){
           int val = n.value;
           lru.removeLast();
           lru.addFirst(new Node2(key, n.value));
           return val;
         }
       }
     }

     return -1;
   }

   public void put(int key, int value){

      if(lru.size() < t_size && !set.contains(key)){
        lru.addFirst(new Node2(key, value));
        set.add(key);
      }else if(lru.size() == t_size){
        Node2 n = lru.removeLast();
        set.remove(n.value);
        lru.addFirst(new Node2(key, value));
        set.add(key);

      }
   }

   public void display(){
     for(Node2 n:lru){
       System.out.println(n.key + " :: "+n.value);
     }
     System.out.println("Set consists of: "+set);
   }


  public static void main(String args[]){
    //1, 2, 3, 4, 1, 2, 5, 1, 2, 3, 4, 5
    Test t = new Test(2);

  t.put(1, 1);
  t.put(2, 2);
  System.out.println(t.get(1));       // returns 1
  t.put(3, 3);    // evicts key 2
  System.out.println(t.get(2));       // returns -1 (not found)
  t.put(4, 4);    // evicts key 1
  System.out.println(t.get(1));       // returns -1 (not found)
  System.out.println(t.get(3));       // returns 3
  System.out.println(t.get(4));       // returns 4











  }

}
