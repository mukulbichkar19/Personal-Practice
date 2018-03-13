import java.util.*;
public interface InterfaceMulti<K,V>{

  public void put(K key, V value);
  public Collection<V> get(K key);
  public Set<K> keySet();
  public boolean containsKey(K key);




}
