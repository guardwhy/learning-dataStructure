package cn.linkedlist.demo02;

import java.util.Iterator;

// 单向循环链表
public class LinkedSinglyCircularList<E> implements List<E>{
    // 创建Node节点
    private class Node{
        //数据域 用来存储数据的
        public E data;
        //指针域 用来存储下一个结点对象的地址
        public Node next;

        // 构造方法
        public Node() {
            this(null, null);
        }

        public Node(E data) {
            this(data, null);
        }

        public Node(E data, Node next) {
            this.data = data;
            this.next = next;
        }

        @Override
        public String toString(){
            StringBuilder sb = new StringBuilder();
            sb.append(data).append("->").append(next.data);
            return sb.toString();
        }
    }
    // 链表元素的数量
    private int size;
    //链表当中的头指针指向第一个结点对象
    private Node head;
    //链表当中的头指针指向最后一个结点对象
    private Node tail;

    // 初始化链表
    public LinkedSinglyCircularList(){
        head = null;
        tail = null;
        size = 0;
    }

    public LinkedSinglyCircularList(E[] arr){
        for (E e : arr){
            add(e);
        }
    }

    /***
     * 在链表末尾添加新的元素e
     * @param element
     */
    @Override
    public void add(E element) {
        add(size, element);
    }

    /***
     * 根据链表的index位置添加新的元素e
     * @param index
     * @param element
     */
    @Override
    public void add(int index, E element) {
        if (index < 0|| index > size) {
            throw new ArrayIndexOutOfBoundsException("add index out of bounds");
        }
        // 创建新的结点对象
        Node node = new Node(element);
        if(isEmpty()){
            // 链表为空
            head = node;
            tail = node;
            tail.next = head;
        }else if(index == 0){
            // 在链表头部添加元素
            node.next = head;
            head = node;
            tail.next = head;
        }else if(index == size){
            node.next = tail.next;
            // 在链表尾部添加元素
            tail.next = node;
            tail = node;
        }else{
            // 在链表中添加元素
            Node prev = head;
            for(int i=0; i < index -1; i++){
                prev = prev.next;
            }
            node.next = prev.next;
            prev.next = node;
        }
        size++;
    }

    /***
     * 删除链表中指定的元素element
     * @param element
     */
    @Override
    public void remove(E element) {
        int index = indexOf(element);
        if(index != -1){
            remove(index);
        }
    }
    /***
     * 删除链表中指定索引处index的元素
     * @param index
     * @return
     */
    @Override
    public E remove(int index){
        if (index < 0|| index > size) {
            throw new ArrayIndexOutOfBoundsException("remove index out of bounds");
        }
        // 定义返回值
        E result = null;
        // 当链表只剩下一个元素
        if(size == 1){
            result = head.data;
            head = null;
            tail = null;
        }else if(index == 0){
            // 删除链表头部
            Node prev = head;
            result = prev.data;
            head = prev.next;
            // 置空操作
            prev.next = null;
            tail.next = head;
        }else if(index == size -1){
            // 删除链表尾部
            Node prev = head;
            while (prev.next != tail){
                prev = prev.next;
            }
            result = tail.data;
            // 修改操作
            prev.next = tail.next;
            tail = prev;
        }else{
            // 删除中间的某个元素
            Node prev = head;
            for (int i = 0; i < index -1; i++) {
                prev = prev.next;
            }
            Node deleteNode = prev.next;
            result = deleteNode.data;
            prev.next = deleteNode.next;
            // 置空
            deleteNode.next = null;
        }
        size --;
        return result;
    }
    /***
     * 得链表的第index个位置的元素
     * @param index
     * @return
     */
    @Override
    public E get(int index) {
        if (index < 0|| index > size) {
            throw new ArrayIndexOutOfBoundsException("get index out of bounds");
        }
        // 获取头部
        if(index == 0){
            return head.data;
        }else if(index == size -1){
            // 获取尾部
            return tail.data;
        }else{
            // 获取中间
            Node prev = head;
            for (int i = 0; i < index; i++) {
                prev = prev.next;
            }
            return prev.data;
        }
    }

    /***
     * 修改链表中指定index的元素为element
     * @param index
     * @param element
     * @return
     */
    @Override
    public E set(int index, E element) {
        if (index < 0|| index > size) {
            throw new ArrayIndexOutOfBoundsException("update index out of bounds");
        }
        // 定义返回值
        E result = null;
        if(index == 0){
            // 修改头部
            result= head.data;
            head.data = element;
        }else if(index == size -1){
            // 修改尾部
            result = tail.data;
            tail.data = element;
        }else{
            // 修改中间的元素
            Node prev = head;
            for (int i = 0; i < index; i++) {
                prev = prev.next;
            }
            result = prev.data;
            prev.data = element;
        }
        return result;
    }

    @Override
    public int size() {
        return size;
    }

    /***
     * 查找元素在链表中第一次出现的索引
     * @param element
     * @return
     */
    @Override
    public int indexOf(E element) {
        // 判断链表是否为空
        if(isEmpty()){
            return -1;
        }
        // 定义prev指针
        Node prev = head;
        // 定义索引值
        int index = 0;
        while (!prev.data.equals(element)){
            prev = prev.next;
            index++;
            // 如果没有找到，则返回-1
            if(prev == null){
                return -1;
            }
        }
        return index;
    }

    /***
     * 查找链表中是否有元素element
     * @param element
     * @return
     */
    @Override
    public boolean contains(E element) {
        return indexOf(element)!= -1;
    }

    /***
     * 判断链表是否为空
     * @return
     */
    @Override
    public boolean isEmpty() {
        return size == 0 && head == null && tail == null;
    }

    @Override
    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }

    /***
     * 迭代器实现
     * @return
     */
    @Override
    public Iterator<E> iterator() {
        return new LinkedSinglyCircularListIterator();
    }

    class LinkedSinglyCircularListIterator implements Iterator<E>{
        // 定义游标
        private Node cur = head;
        // 创建flag，表示还可以继续循环
        private boolean flag = true;

        @Override
        public boolean hasNext() {
            if(isEmpty()){
                return false;
            }
            return flag;
        }

        @Override
        public E next() {
            E ret = cur.data;
            cur = cur.next;
            // 再次判断，是否已经循环完一圈
            if(cur == head){
                flag = false;
            }
            return ret;
        }
    }

    @Override
    public String toString(){
        StringBuilder res = new StringBuilder();
        res.append("size=").append(size).append(", [");
        Node node = head;
        for (int i = 0; i < size; i++) {
            if (i != 0) {
                res.append(", ");
            }
            res.append(node);

            node = node.next;
        }
        res.append("]");
        return res.toString();
    }
}
