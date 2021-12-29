package cn.queue.demo03;

public interface Queue<E> extends Iterable<E>{
    int size();
    boolean isEmpty();
    // 入队操作
    void enqueue(E element);
    // 出队操作
    E dequeue();
    // 查看当前队首的元素
    E getFront();
    // 清空队列
    void clear();
}
