package cn.queue.demo02;

import java.util.Iterator;

public class ArrayLoopQueue<E> implements Queue<E>{
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
    public ArrayLoopQueue() {
        this(DEFAULT_SIZE);
    }
    //capacity容量存储元素的最大容量是10,10->11 10是可用的，1是虚元素
    public ArrayLoopQueue(int capacity){
        data = (E[]) new Object[capacity + 1];
        front = 0;
        rear = 0;
        size = 0;
    }

    //获取循环队列的有效元素的个数
    @Override
    public int size() {
        return size;
    }

    //判断循环队列是否为空
    @Override
    public boolean isEmpty() {
        return size == 0 && front == rear;
    }

    // 向循环队列入队一个元素
    @Override
    public void enqueue(E element) {
        /**
         * 队列空:front == rear
         * 队列满:(rear + 1) % data.length == front
         */
        // 判断队列是否需要扩容
        if((rear + 1) % data.length == front){
            resize(data.length * 2 -1);
        }
        // 将元素存放到当前rear对应的地址
        data[rear] = element;
        // 队尾指针rear向前移动
        rear = (rear + 1) % data.length;
        size++;
    }

    // 循环队列出队一个元素
    @Override
    public E dequeue() {
        // 判断是否为空
        if(isEmpty()){
            throw new NullPointerException("queue is NULL!!!");
        }
        // 定义临时变量用来存放出队元素
        E ret = data[front];
        // 队头指针front向前移动
        front = (front + 1) % data.length;
        size--;
        // 判断队列是否需要缩容
        if (size ==(data.length - 1) / 4 && data.length - 1 > DEFAULT_SIZE) {
            resize(data.length / 2+1);
        }
        return ret;
    }

    // 创建扩容方法
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

    // 获取队首元素
    @Override
    public E getFront() {
        if(isEmpty()){
            throw new NullPointerException("queue is null!!!");
        }
        return data[front];
    }

    @Override
    public void clear() {
        data = (E[]) new Object[DEFAULT_SIZE + 1];
        front = 0;
        rear = 0;
        size = 0;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder(String.format("循环队列容量:%d/%d[", size, data.length-1));
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
        return new ArrayLoopQueueIterator();
    }

    class ArrayLoopQueueIterator implements Iterator<E>{
        // 定义指针变量
        private int cur;
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
