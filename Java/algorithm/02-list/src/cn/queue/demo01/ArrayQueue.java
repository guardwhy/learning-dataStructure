package cn.queue.demo01;

import java.util.Iterator;

public class ArrayQueue<E> implements Queue<E>{
    // 队列内部其实就是一个线性表来实现
    private ArrayList<E> array;

    // 构造方法
    public ArrayQueue(int capacity){
        array = new ArrayList<>(capacity);
    }

    public ArrayQueue(){
        array = new ArrayList<>();
    }

    // 获取队列中的有效元素的个数
    @Override
    public int size() {
        return array.size();
    }

    // 判断队列是否为空
    @Override
    public boolean isEmpty() {
        return array.isEmpty();
    }

    /***
     * 入队一个元素
     * @param element
     */
    @Override
    public void enqueue(E element) {
        array.addLast(element);
    }

    /***
     * 出队一个元素
     * @return
     */
    @Override
    public E dequeue() {
        return array.removeFirst();
    }

    /***
     * 获取队首元素
     * @return
     */
    @Override
    public E getFront() {
        return array.get(0);
    }

    // 清空队列
    @Override
    public void clear() {
        array.clear();
    }

    @Override
    public Iterator<E> iterator() {
        return array.iterator();
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder(String.format("队列容量:%d/%d[", size(), array.getCapacity()));
        if(isEmpty()){
            sb.append(']');
        }else {
            for(int i=0; i < size(); i++){
                sb.append(array.get(i));
                if(i != size()-1){
                    sb.append(',');
                }else {
                    sb.append(']');
                }
            }
        }

        return sb.toString();
    }
}
