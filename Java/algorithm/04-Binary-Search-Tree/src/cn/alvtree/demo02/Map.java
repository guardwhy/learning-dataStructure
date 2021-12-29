package cn.alvtree.demo02;
// Map接口
public interface Map<K, V> {
    void put(K key, V value);
    V remove(K key);
    boolean contains(K key);
    V get(K key);
    void update(K key, V value);
    int size();
    boolean isEmpty();
}
