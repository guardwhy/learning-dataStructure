package cn.queue.demo04;

public class LinkedListQueue<E>  implements Queue<E>{
    private class Node{
        public E e;
        public Node next;

        public Node(E e, Node next){
            this.e = e;
            this.next = next;
        }

        public Node(E e){
            this(e, null);
        }

        public Node(){
            this(null, null);
        }

        @Override
        public String toString(){
            return e.toString();
        }
    }

    private Node head, tail;
    private int size;

    public LinkedListQueue(){
        head = null;
        tail = null;
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    // 入队操作
    @Override
    public void enqueue(E element) {
        if(tail == null){
            tail = new Node(element);
            head = tail;
        }else {
            tail.next = new Node(element);
            tail = tail.next;
        }
        // 队列元素长度
        size ++;
    }

    // 出队操作
    @Override
    public E dequeue() {
        // 判断是否为空
        if(isEmpty()){
            throw new NullPointerException("Deque is empty!!!");
        }
        // 要删除的元素
        Node deleteNode = head;
        head = head.next;
        // 置空操作
        deleteNode.next = null;
        if(head == null){
            tail = null;
        }
        size --;
        return deleteNode.e;
    }

    // 拿到队首元素
    @Override
    public E getFront() {
        // 判断条件
        if(isEmpty()){
            throw new NullPointerException("Queue is NULL!!!");
        }
        return head.e;
    }

    @Override
    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }

    @Override
    public String toString(){
        StringBuilder res = new StringBuilder();
        res.append("size=").append(size).append(", [");
        // 定义一个指针变量
        Node cur = head;
        while(cur != null){
            res.append(cur + "->");
            cur = cur.next;
        }
        res.append("NULL");
        res.append("]");
        return res.toString();
    }
}
