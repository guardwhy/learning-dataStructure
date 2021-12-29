package cn.queue.demo03;

public interface Deque<E> extends Queue<E> {
    // 从队列中添加第一个元素
    void addFirst(E element);
    // 从队列中添加最后一个元素
    void addLast(E element);
    // 从队列中删除第一个元素
    E removeFirst();
    // 从队列中删除最后一个元素
    E removeLast();
    // 从队列中拿到第一个元素
    E getFirst();
    // 从队列中拿到最后一个元素
    E getLast();
    // 队列中有效元素
    int size();
    // 判断队列是否为空
    boolean isEmpty();
}
