package cn.queue.demo01;

import java.util.Iterator;

public class ArrayList<E> implements Iterable<E>{
    // 顺序表的元素
    private E[] data;
    // 顺序表元素的数量
    private int size;

    // 定义常量
    private static final int ELEMENT_NOT_FOUND = -1;
    private static final int DEFAULT_CAPACITY = 6;

    // 元素的数量
    public int size() {
        return size;
    }

    //清除所有元素
    public void clear() {
        for (int i = 0; i < size; i++) {
            data[i] = null;
        }
        size = 0;
    }


    // 构造函数，传入数组的容量capacity构造SqList
    public ArrayList(int capacity){
        data = (E[]) new Object[capacity];
        capacity = (capacity < DEFAULT_CAPACITY) ? DEFAULT_CAPACITY : capacity;
    }

    // 无参数的构造函数，默认数组的容量capacity=10
    public ArrayList(){
        this(DEFAULT_CAPACITY);
    }

    // 获取数组的容量
    public int getCapacity(){
        return data.length;
    }

    // 获取数组中的元素个数
    public int getSize(){
        return size;
    }

    // 返回数组是否为空
    public boolean isEmpty(){
        return size == 0;
    }

    // 向所有元素后添加一个新元素
    public void addLast(E e){
        add(size, e);
    }

    // 在所有元素前添加一个新元素
    public void addFirst(E e){
        add(0, e);
    }

    // 在index索引的位置插入一个新元素e
    public void add(int index, E e){
        // 扩容操作
        if(size == data.length){
           resize(2 * data.length);
        }

        for(int i = size - 1; i >= index ; i --){
            data[i + 1] = data[i];
        }

        data[index] = e;
        size ++;
    }

    // 获取index索引位置的元素
    public E get(int index){
        rangeCheck(index);
        return data[index];
    }

    // 查看元素的索引
    public int indexOf(E e){
        if (e == null) {
            for (int i = 0; i < size; i++) {
                if (data[i] == null) return i;
            }
        } else {
            for (int i = 0; i < size; i++) {
                if (e.equals(data[i])) return i;
            }
        }
        return ELEMENT_NOT_FOUND;
    }

    // 修改index索引位置的元素为e
    public void set(int index, E e){
        rangeCheck(index);
        data[index] = e;
    }

    // 查找数组中是否有元素e
    public boolean contains(E e){
       return indexOf(e) != ELEMENT_NOT_FOUND;
    }

    // 查找数组中元素e所在的索引，如果不存在元素e，则返回-1
    public int find(E e){
        for(int i = 0 ; i < size ; i ++){
            if(data[i].equals(e))
                return i;
        }
        return -1;
    }

    // 从数组中删除index位置的元素, 返回删除的元素
    public E remove(int index){
        rangeCheck(index);
        E ret = data[index];
        for(int i = index + 1 ; i < size ; i ++){
            data[i - 1] = data[i];
        }
        // 置空
        data[--size] = null;

        // 缩容操作
        if(size == data.length / 4){
            resize(data.length / 2);
        }
        return ret;
    }

    // 从数组中删除第一个元素, 返回删除的元素
    public E removeFirst(){
        return remove(0);
    }

    // 从数组中删除最后一个元素, 返回删除的元素
    public E removeLast(){
        return remove(size - 1);
    }

    // 从数组中删除元素e
    public void removeElement(E e){
        int index = find(e);
        if(index != -1) {
            remove(index);
        }
    }

    // 数组索引越界处理
    private void outOfBounds(int index){
        throw new IndexOutOfBoundsException("index:" + index + ", Size:" + size);
    }

    // 索引值检查范围方法
    private void rangeCheck(int index){
        if(index < 0 || index >=size){
            // 调用越界处理方法
            outOfBounds(index);
        }
    }

    // 添加方法索引检查范围
    private void rangeCheckAdd(int index){
        if(index < 0 || index >size){
            // 调用越界处理方法
            outOfBounds(index);
        }
    }

    // 扩容capacity方法
    private void resize(int newCapacity){
        E[] newData = (E[])new Object[newCapacity];
        for(int i = 0 ; i < size ; i ++){
            newData[i] = data[i];
        }
        data = newData;
    }

    @Override
    public String toString(){
        StringBuilder res = new StringBuilder();
        res.append(String.format("顺序表(ArrayList)长度:%d, 容器:%d\n", size, data.length));
        res.append('[');
        for(int i = 0 ; i < size ; i ++){
            res.append(data[i]);
            if(i != size - 1)
                res.append(", ");
        }
        res.append(']');
        return res.toString();
    }

    // 遍历方法
    @Override
    public Iterator<E> iterator() {
        return new SIterator();
    }

    private class SIterator implements Iterator{
        // 定义一个指针变量
        private int cur;
        public SIterator(){
            this.cur=0;
        }
        @Override
        public boolean hasNext() {
            return cur< size;
        }
        @Override
        public E next() {
            return data[cur++];
        }
    }
}
