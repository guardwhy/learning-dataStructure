package cn.heap.demo01;

import java.util.Iterator;

/***
 * 最大堆实现
 * @param <E>
 */
public class MaxHeap<E extends Comparable<E>> implements Iterable<E>{
    // 用ArrayList当做最大堆的存储容器
    private ArrayList<E> data;
    // 堆空间
    public MaxHeap(){
        data = new ArrayList<>();
    }

    // 获取父节点的索引
    private int parent(int k){
        if(k <= 0){
            throw new IllegalArgumentException("没有父节点!");
        }
        return (k -1 ) / 2;
    }

    // 获取左孩子结点的索引
    private int leftChild(int k){
        return 2 * k + 1;
    }

    // 获取右孩子结点的索引
    private int rightChild(int k){
        return 2 * k + 2;
    }

    // 返回最大堆有效元素的个数
    public int size(){
        return data.size();
    }

    // 判断二叉堆是否为空
    public boolean isEmpty(){
        return data.isEmpty();
    }

    // 清空二叉堆
    public void clear(){
        data.clear();
    }

    // 向最大堆中添加一个元素e
    public void add(E e){
        data.addLast(e);
        // 上浮元素对应的索引
        siftUp(data.size() -1);
    }

    // 将角标K所对应的元素进行上浮
    private void siftUp(int k){
        // 父亲节点比自己还要小的话，交换元素
        while (k > 0 && data.get(parent(k)).compareTo(data.get(k)) < 0){
            data.swap(k, parent(k));
            k = parent(k);
        }
    }

    // 找到最大堆
    public E findMax(){
        if (data.isEmpty()){
            throw new IllegalArgumentException("最大堆为空!!!!");
        }
        return data.get(0);
    }

    // 最小堆
    public E findMin(){
        if(data.isEmpty()){
            throw new IllegalArgumentException("最大堆为空!!!");
        }
        E min = data.get(0);
        for (int i=1; i< data.size(); i++){
            if(data.get(i).compareTo(min) < 0){
                min = data.get(i);
            }
        }
        // 返回最小堆
        return min;
    }

    // 删除最大值
    public E extractMax(){
        // 拿到最大值
        E max = findMax();
        // 将索引为0和最后一个元素交换位置
        data.swap(0, data.size() - 1);
        // 将最后一个元素删除
        data.removeLast();

        // 调用函数
        siftDown(0);
        return max;
    }

    // 下浮
    private void siftDown(int k) {
        while (leftChild(k) < data.size()){
            // 拿到左右孩子的最大值
            int j = leftChild(k);
            if(j + 1 < data.size() && data.get(j+1).compareTo(data.get(j)) > 0){
                // data[j] 是leftChild和rightChild中的最大值
                j = rightChild(k);
            }
            if(data.get(k).compareTo(data.get(j)) < 0){
                data.swap(k,j);
                k = j;
            }else {
                break;
            }
        }
    }
    // 取出最大元素后，放入一个新元素
    public E replace(E e){
        E ret = findMax();
        data.set(0, e);
        siftDown(0);
        return ret;
    }

    @Override
    public Iterator<E> iterator() {
        return data.iterator();
    }

    @Override
    public String toString(){
        return data.toString();
    }
}
