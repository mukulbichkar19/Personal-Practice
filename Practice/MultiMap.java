import java.util.*;
public interface MultiMap<K,V>{

    public void put(K key, V value);
    public Collection<V> get(K key);
    public Set<K> keySet();
    public Set<Map.Entry<K,Collection<V>>> entrySet();
    public Collection<Collection<V>> values();
    public boolean containsKey(K key);
    public Collection<V> remove(K key);
    public boolean isEmpty();
    public int size();


}
