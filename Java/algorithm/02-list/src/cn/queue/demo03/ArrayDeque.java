package cn.queue.demo03;

import java.util.Iterator;

public class ArrayDeque<E> implements Deque<E> {
    // 存储元素的容器
    private E[] data;
    // 队首指针front
    private int front;
    // 队尾指针rear
    private int rear;
    // 有效元素
    private int size;

    // 定义默认队列的大小
    private static int DEFAULT_SIZE = 7;
    // 构造函数
    public ArrayDeque() {
        this(DEFAULT_SIZE);
    }
    //capacity容量存储元素的最大容量是7,7->8 7是可用的，1是虚元素
    public ArrayDeque(int capacity){
        data = (E[]) new Object[capacity + 1];
        front = 0;
        rear = 0;
        size = 0;
    }

    // 在Deque队首中添加一个元素
    @Override
    public void addFirst(E element) {
        // 先判断Deque队列是否已满
        if(isExpansion()){
            // 扩容操作
            resize(data.length * 2 - 1);
        }
        // front指向要添加元素的索引
        front = (front -1 + data.length) % data.length;
        data[front] = element;
        size++;
    }

    // 在Deque对尾中添加元素
    @Override
    public void addLast(E element) {
        // 先判断Deque队列是否已满
        if(isExpansion()){
            // 扩容操作
            resize(data.length * 2 - 1);
        }
        data[rear] = element;
        // front指向要添加元素的索引
        rear = (rear + 1) % data.length;
        size++;
    }

    // 判断Deque是否已满
    private boolean isExpansion() {
        return (rear + 1) % data.length == front;
    }

    // 调用Deque扩容方法
    private void resize(int newLength) {
        // 创建newData对象
        E[] newData = (E[]) new Object[newLength];
        int index = 0;
        for(int cur = front; cur != rear; cur=(cur + 1) % data.length){
            // 将原队列的元素赋值给新队列
            newData[index++] = data[cur];
        }
        front = 0;
        rear = index;
        data = newData;
    }

    // 在Deque队首删除一个元素
    @Override
    public E removeFirst() {
        // 判断对列是否为空
        if(isEmpty()){
            throw new NullPointerException("Deque is empty!!!");
        }
        // 拿到要删除的元素
        E ret = data[front];
        // 移动front指针
        front = (front +1) % data.length;
        size --;
        // 判断对列是否需要缩容
        if(isShrink()){
            resize(data.length / 2 + 1);
        }
        return ret;
    }

    // 在Deque队尾删除一个元素
    @Override
    public E removeLast() {
        // 判断对列是否为空
        if(isEmpty()){
            throw new NullPointerException("Deque is empty!!!");
        }
        // 移动rear指针
        rear = (rear -1 + data.length) % data.length;
        // 拿到要删除的元素
        E ret = data[rear];
        size --;
        // 判断对列是否需要缩容
        if(isShrink()){
            resize(data.length / 2 + 1);
        }
        return ret;
    }

    // 缩容方法
    private boolean isShrink() {
        return size == (data.length - 1) / 4 && data.length - 1 > DEFAULT_SIZE;
    }

    // 获取队首元素
    @Override
    public E getFirst() {
        return data[front];
    }

    // 获取队尾元素
    @Override
    public E getLast() {
        return data[(rear -1 + data.length) % data.length];
    }

    // 获取队列元素
    @Override
    public int size() {
        return size;
    }

    // 判断对列是否为空
    @Override
    public boolean isEmpty() {
        return size == 0 && front == rear;
    }
    // 入队操作
    @Override
    public void enqueue(E element) {
        addLast(element);
    }

    // 出队操作
    @Override
    public E dequeue() {
        return removeFirst();
    }

    // 拿到队首元素
    @Override
    public E getFront() {
        return getFirst();
    }

    // 清空队列
    @Override
    public void clear() {
        data = (E[]) new Object[DEFAULT_SIZE + 1];
        front = 0;
        rear = 0;
        size = 0;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder(String.format("双端队列容量:%d/%d[", size, data.length-1));
        if(isEmpty()){
            sb.append(']');
        }else {
            for(int i = front; i != rear; i=(i+1) % data.length){
                sb.append(data[i]);
                if((i+1) % data.length == rear){
                    sb.append(']');
                }else {
                    sb.append(", ");
                }
            }
        }
        return sb.toString();
    }

    @Override
    public Iterator<E> iterator() {
        return new ArrayDequeIterator();
    }

    class ArrayDequeIterator implements Iterator<E>{
        // 定义指针变量
        private int cur = front;
        @Override
        public boolean hasNext() {
            return cur != rear;
        }

        @Override
        public E next() {
            E ret = data[cur];
            cur = (cur + 1) % data.length;
            return ret;
        }
    }
}
