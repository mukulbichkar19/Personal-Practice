import java.util.*;

public class ArrayMultimap implements Multimap{

    HashMap<Integer, ArrayList<Integer>> multimap = null;

    public void put(int key, int value){
      if(multimap == null){
        multimap.put(key, new ArrayList<>(Arrays.asList(value)));
      }else{
        ArrayList<Integer> existing_list = multimap.get(key);
        existing_list.add(value);
        multimap.put(key, existing_list);
      }
    }

    public ArrayList<Integer> get(int key){
      if(multimap.containsKey(key)){
        return multimap.get(key);
      }else{
        return null;
      }
    }

    public int size(){
       return multimap.size();
    }

    public boolean remove(int key){
      if(multimap.containsKey(key)){
        multimap.remove(key);
        return true;
      }
      return false;
    }

    public boolean containsKey(int key){
      return multimap.containsKey(key);
    }

    public boolean containsValue(int value){
      return multimap.containsValue(value);
    }







}
