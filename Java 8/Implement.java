public class Implement{


  public static void main(String args[]){

      MultiMap<Integer, Integer> multimap = new MultiMap<Integer, Integer>();

      multimap.put(1,9);
      multimap.put(2,90);
      multimap.put(1,8);

      System.out.println(multimap.get(1));
      System.out.println(multimap.containsKey(2));


  }

}
