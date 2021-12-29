package cn.linkedlist.demo03;

public interface List<E> extends Iterable<E>{
    void add(E element);
    void add(int index, E element) ;
    void remove(E element);
    E remove(int index);
    E get(int index);
    E set(int index, E element) ;
    int size();
    int indexOf(E element) ;
    boolean contains(E element);
    boolean isEmpty();
    void clear();
}
