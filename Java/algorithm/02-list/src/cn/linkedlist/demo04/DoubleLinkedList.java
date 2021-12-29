package cn.linkedlist.demo04;

public class DoubleLinkedList<E> {
    // 链表元素的数量
    private int size;
    // 声明头结点
    private Node first;
    // 声明尾节点
    private Node last;

    // 创建Node节点
    private class Node{
        // 存放内容
        public E data;
        // 指向链表的上一个节点
        public Node prev;
        // 指向下一个节点
        public Node next;

        public Node() {
        }

        // 构造方法
        public Node(Node prev, E data, Node next) {
            this.prev = prev;
            this.data = data;
            this.next = next;
        }

        @Override
        public String toString(){
            return data.toString();
        }
    }

    // 初始化头结点
    public DoubleLinkedList(){
        first = null;
        last = null;
        size = 0;
    }

    /***
     * 获取链表中的元素个数
     * @return
     */
    public int getSize(){
        return size;
    }

    /***
     * 返回链表是否为空
     * @return
     */
    public boolean isEmpty(){
        return size == 0;
    }

    /***
     * 根据链表的index位置添加新的元素e
     * @param index
     * @param data
     */
    public void add(int index, E data){
        // 调用方法
        rangeCheckAdd(index);

        if (index == size) { // 往最后面添加元素
            addLast(data);
        } else if(index == 0){
            addFirst(data);
        } else {

            // 新添加节点下一个元素
            Node nextNode = node(index);
            // 新添加节点的上一个元素
            Node prevNode = nextNode.prev;
            // 新添加节点
            Node newNode = new Node (prevNode, data, nextNode);
            /*// next节点的上一个prev指向新节点
            nextNode.prev = newNode;
            // prevNode节点的下一个next指向新节点
            prevNode.next = newNode;*/

            newNode.prev = prevNode;
            newNode.next = nextNode;
            nextNode.prev = newNode;
            prevNode.next = newNode;
        }
        size++;
    }

    /***
     * 在链表头添加新的元素e
     * @param data
     */
    public void addFirst(E data){
        // 创建一个新节点
       Node newNode = new Node(null, data, null);
       if(isEmpty()){
           last = newNode; // last -> newNode
       }else {
           first.prev = newNode; // first.prev->newNode
       }
       newNode.next = first; // newNode.next -> first;
       first = newNode;
       size++;
    }

    /***
     * 在链表末尾添加新的元素e
     * @param data
     */
    public void addLast(E data){
        // 创建一个新节点
        Node newNode = new Node(null, data, null);
        if(isEmpty()){
            first = newNode; // first->newNode
        }else{
            last.next = newNode; // last指向的节点指向新节点
            newNode.prev = last; // 新节点的前驱指向last指针
        }
        last = newNode; // last指针指向新节点
        size++;
    }

    /***
     * 得链表的第index个位置的元素
     * @param index
     * @return
     */
    public E get(int index){
        return node(index).data;
    }

    /***
     * 获得链表的第一个元素
     * @return
     */
    public E getFirst(){
        return get(0);
    }

    /***
     * 获得链表的最后一个元素
     * @return
     */
    public E getLast(){
        return get(size - 1);
    }

    /***
     * 查找链表中是否有元素e
     * @param data
     * @return
     */
    public boolean contains(E data){
        Node cur = first.next;
        while(cur != null){
            if(cur.data.equals(data))
                return true;
            cur = cur.next;
        }
        return false;
    }

    /***
     * 修改链表的第index(0-based)个位置的元素为e
     * @param index
     * @param data
     */
    public void update(int index, E data){
        // 调用索引检测方法
        rangeCheck(index);
        // 创建cur指针，指向虚拟头结点
        Node cur = first;
        for(int i = 0 ; i < index ; i ++) {
            cur = cur.next;
        }
        cur.data = data;
    }

    @Override
    public String toString(){
        StringBuilder res = new StringBuilder();
        res.append("size=").append(size).append(", [");
        // 定义一个指针变量
        Node cur = first;
        while(cur != null){
            res.append(cur + "->");
            cur = cur.next;
        }
        res.append("NULL");
        res.append("]");
        return res.toString();
    }

    /**
     * 获取index位置对应的节点对象
     * @param index
     * @return
     */
    private Node node(int index) {
        rangeCheck(index);
        Node node;
        if (index < (size >> 1)) {
            node = first;
            for (int i = 0; i < index; i++) {
                node = node.next;
            }
        } else {
            node = last;
            for (int i = size - 1; i > index; i--) {
                node = node.prev;
            }
        }
        return node;
    }

    /***
     * 从链表中删除index位置的元素, 返回删除的元素
     * @param index
     */
    public void remove(int index){
        // 调用索引检测方法
        rangeCheck(index);
        // 条件判断
        if(index == 0){
            removeFirst();
        }else if(index == size -1 ){
            removeLast();
        }else {

            //删除位置的前一个元素
            Node preNode = first;
            for(int i=0; i < index-1; i++) {
                preNode = preNode.next;
           }
            //要删除位置的元素
            Node deleteNode = preNode.next;
            //要删除元素的下一个元素
            Node nextNode = deleteNode.next;
            preNode.next = nextNode;
            nextNode.prev = preNode;

            size--;
        }
    }

    /***
     * 从链表中删除第一个元素, 返回删除的元素
     */
    public void removeFirst(){
        if (size == 1)
        {
           first = null;
           last = null;
        } else {
           first =first.next;
        }
        size--;
    }

    /***
     * 从链表中删除最后一个元素, 返回删除的元素
     */
    public void removeLast(){
        if (size == 1)
        {
            first = null;
            last = null;
        } else {
            last.prev.next = null;
            last = last.prev;
        }
        size--;
    }

    /***
     * 从链表中删除元素e
     * @param data
     */
    public void removeElement(E data){
        // 创建头结点
        Node prev = first;
        while(prev.next != null){
            if(prev.next.data.equals(data))
                break;
            prev = prev.next;
        }

        if(prev.next != null){
            Node delNode = prev.next;
            prev.next = delNode.next;
            delNode.next = null;
            size --;
        }
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
    // 数组索引越界处理
    private void outOfBounds(int index){
        throw new IndexOutOfBoundsException("index:" + index + ", Size:" + size);
    }
}
