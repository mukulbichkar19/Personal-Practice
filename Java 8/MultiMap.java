import java.util.*;

class MultiMap<K,V> implements InterfaceMulti<K,V>
{

  private Map<K, Collection<V>> map = new HashMap<>();

  @Override
  public void put(K key, V value){
    if(map.get(key) == null){
      map.put(key, new ArrayList<V>());
    }
    map.get(key).add(value);
  }

  @Override
  public Collection<V> get(K key){

    return map.get(key);

  }

 @Override
  public Set<K> keySet(){
    return map.keySet();
  }

 @Override
  public boolean containsKey(K key){
    return map.containsKey(key);
  }

}
