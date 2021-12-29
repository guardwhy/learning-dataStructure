package cn.binarysearch.demo;

import cn.set.demo.List;

import java.util.Iterator;

// 链表
public class LinkedList<E> implements List<E> {
    // 创建Node节点
    private class Node {
        // 数据域
        E data;
        // 指向直接前驱的指针
        Node prev;
        // 指向直接后继的指针
        Node next;

        // 构造函数
        public Node() {
            this(null, null, null);
        }

        public Node(E data) {
            this(data, null, null);
        }

        public Node(E data, Node prev, Node next) {
            this.data = data;
            this.prev = prev;
            this.next = next;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            if (prev != null) {
                sb.append(prev.data);
            } else {
                sb.append("null");
            }

            sb.append("->").append(data).append("->");

            if (next != null) {
                sb.append(next.data);
            } else {
                sb.append("null");
            }
            return sb.toString();
        }
    }

    // 链表元素的数量
    private int size;
    // 声明头结点
    private Node head;
    // 声明尾节点
    private Node tail;

    // 初始化头结点
    public LinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public LinkedList(E[] arr) {
        for (E e : arr) {
            add(e);
        }
    }

    //默认向表尾添加元素
    @Override
    public void add(E element) {
        add(size, element);
    }

    //在链表当中指定索引index处添加一个元素
    @Override
    public void add(int index, E element) {
        if (index < 0|| index > size) {
            throw new ArrayIndexOutOfBoundsException("add index out of bounds");
        }
        // 创建新的结点对象
        Node node = new Node(element);

        // 链表为空
        if(isEmpty()){
            head = node;
            tail = node;
            tail.next = head;
            head.prev = tail;

        }else if(index == 0){ // 在链表头部添加元素
            // 头结点的上一跳指向新节点的上一跳
            node.prev = head.prev;
            node.next = head;
            head.prev = node;
            head = node;
            tail.next = head;
        }else if(index == size){ // 在链表尾部添加元素
            node.next = tail.next;
            tail.next = node;
            node.prev = tail;
            tail = node;
            head.prev = tail;
        }else{
            // 在链表中添加元素
            Node p,q; // 定义两个指针变量
            if(index <= size / 2){
                p = head;
                for(int i =0; i < index -1 ; i++){
                    p = p.next;
                }
                q = p.next;
                p.next = node;
                node.prev = p;
                q.prev = node;
                node.next = q;
            }else{
                p = tail;
                for(int i=size -1; i > index; i--){
                    p = p.prev;
                }
                q = p.prev;
                q.next = node;
                node.prev = q;
                p.prev = node;
                node.next = p;
            }
        }
        size++;
    }

    //删除链表中指定的元素element
    @Override
    public void remove(E element) {
        int index = indexOf(element);
        if(index != -1){
            remove(index);
        }
    }

    //删除链表中指定角标处index的元素
    @Override
    public E remove(int index) {
        if (index < 0|| index > size) {
            throw new ArrayIndexOutOfBoundsException("remove index out of bounds");
        }
        // 定义ret变量
        E ret = null;
        Node node;
        // 当链表只剩一个元素
        if(size ==1){
            ret = head.data;
            head = null;
            tail = null;
            // 删除表头
        }else if(index == 0){
            ret = head.data;
            node = head.next;
            head.next = null;
            node.prev = head.prev;
            head.prev = null;
            head = node;
            tail.next = head;
            // 删除表尾
        }else if(index == size -1){
            ret = tail.data;
            node = tail.prev;
            tail.prev = null;
            node.next = tail.next;
            tail.next = null;
            tail = node;
            head.prev = tail;
        }else{
            // 删除链表中间的某一个元素
            Node p, q, r;
            if(index <= size / 2){
                p = head;
                for(int i=0; i < index-1; i++){
                    p = p.next;
                }
                q = p.next;
                ret = q.data;
                r = q.next;
                p.next = r;
                r.prev = p;
                q.next = null;
                q.prev = null;
            }else{
               p = tail;
               for(int i = size -1; i > index + 1; i--){
                   p = p.prev;
               }
               q = p.prev;
               ret = q.data;
               r = q.prev;
               r.next = p;
               p.prev = r;
               q.next = null;
               q.prev = null;
            }
        }
        size --;
        return ret;
    }

    //获取链表中指定索引处的元素
    @Override
    public E get(int index) {
        if (index < 0|| index > size) {
            throw new ArrayIndexOutOfBoundsException("get index out of bounds");
        }
        // 获取头
        if(index == 0){
            return head.data;
        }else if(index == size -1){
            // 获取尾部
            return tail.data;
        }else{
            // 获取中间
            Node p = head;
            for (int i = 0; i < index; i++) {
                p = p.next;
            }
            return p.data;
        }
    }

    // 修改链表中指定索引index的元素为element
    @Override
    public E set(int index, E element) {
        if (index < 0|| index > size) {
            throw new ArrayIndexOutOfBoundsException("set index out of bounds");
        }

        E ret = null;
        // 获取头
        if(index == 0){
           // 修改头
            ret = head.data;
            head.data = element;
        }else if(index == size -1){
            // 修改尾部元素
            ret = tail.data;
            tail.data = element;
        }else{
            // 修改中间
            Node p = head;
            for (int i = 0; i < index; i++) {
                p = p.next;
            }
            ret = p.data;
            p.data = element;
        }

        return ret;
    }

    @Override
    public int size() {
        return size;
    }

    //查找元素在链表中第一次出现的索引
    @Override
    public int indexOf(E element) {
        if(isEmpty()){
            return -1;
        }
        Node p = head;
        int index = 0;
        while (!p.data.equals(element)){
            p = p.next;
            index++;
            if(p == head){
                return -1;
            }
        }
        return index;
    }

    //在链表中判断是否包含元素element
    @Override
    public boolean contains(E element) {
        return indexOf(element) != -1;
    }

    @Override
    public boolean isEmpty() {
        return size== 0 && head == null && tail == null;
    }

    @Override
    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }

    @Override
    public String toString() {
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

    @Override
    public Iterator<E> iterator() {
        return new DoubleCircleLinkedListIterator();
    }

    class  DoubleCircleLinkedListIterator implements Iterator<E>{
        private Node cur = head;
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
            if(cur == head){
                flag = false;
            }
            return ret;
        }
    }
}