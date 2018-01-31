import java.util.*;
public class ArrayMultiMap<K,V> implements MultiMap<K,V>{

    Map<K, Collection<V>> map = new HashMap<>();

    @Override
    public void put(K key, V value){
        if(!map.containsKey(key)){
          map.put(key, new ArrayList<>());
        }
        map.get(key).add(value);
    }

    @Override
    public Collection<V> get(K key){
        if(map.containsKey(key)){
          return map.get(key);
        }
        return null;
    }

    @Override
    public Set<K> keySet(){
      return map.keySet();
    }

    @Override
    public Set<Map.Entry<K,Collection<V>>> entrySet(){
      return map.entrySet();
    }

    @Override
    public Collection<Collection<V>> values(){
      return map.values();
    }

    @Override
    public boolean containsKey(K key){
      return map.containsKey(key);
    }

    @Override
    public Collection<V> remove(K key){

      return map.remove(key);

    }

    @Override
    public boolean isEmpty(){
      return map.isEmpty();
    }

    @Override
    public int size(){
      int count = 0;
      Collection<Collection<V>> values = map.values();
      for(Collection<V> val:values){
        count += val.size();
      }
      return count;
    }




}
