package cn.set.demo01;

// 创建Set接口
public interface Set<E>{
    void add(E e);
    boolean contains(E e);
    void remove(E e);
    int size();
    boolean isEmpty();
}
