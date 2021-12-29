package cn.heap.demo02;

import java.util.Iterator;

public class PriorityQueue<E extends Comparable<E>> implements Queue<E>{
    // 堆对象
    private MaxHeap<E> heap;
    // 构造器
    public PriorityQueue(){
        heap = new MaxHeap<>();
    }

    @Override
    public int size() {
        return heap.size();
    }

    @Override
    public boolean isEmpty() {
        return heap.isEmpty();
    }

    @Override
    public void enqueue(E element) {
        // 入队操作
        heap.add(element);
    }

    @Override
    public E dequeue() {
        return heap.extractMax();
    }

    @Override
    public E getFront() {
        return heap.findMax();
    }

    @Override
    public void clear() {
        heap.clear();
    }

    @Override
    public Iterator<E> iterator() {
        return heap.iterator();
    }

    @Override
    public String toString() {
        return heap.toString();
    }
}
