import java.util.TreeMap;
import java.util.HashMap;
import java.util.Comparator;
public class StringManipulation{


  public static void main(String args[]){

    String s = "Document is not. This is a placebo. Nothing it's is condescending; so there's still hope.";

    String[] split = s.replaceAll("[^a-zA-Z\\s]","").split(" ");

    HashMap<String, Integer> count = new HashMap<>();

    for(int i=0;i<split.length;i++){
      String str = split[i].toLowerCase();
      int val = 1;
      if(count.containsKey(str)){
         val = count.get(str);
         val += 1;
      }
      count.put(str, val);
    }

    // Sort the results in decreasing Order
    TreeMap<String, Integer> treeMap = new TreeMap<String, Integer>(
      new Comparator<Integer>(){
        public int compare(Integer i1, Integer i2){
          return i2-i1;
        }
      }
    );

    treemap.putAll(count);
    System.out.println(treemap);

  }


}
