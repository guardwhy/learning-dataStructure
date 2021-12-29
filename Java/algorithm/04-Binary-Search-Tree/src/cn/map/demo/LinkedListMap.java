package cn.map.demo;

/***
 * 底层由链表实现的映射(map)
 * @param <K>
 * @param <V>
 */
public class LinkedListMap<K,V> implements Map<K,V>{
    // 创建Node节点
    private class Node{
        public K key;
        public V value;
        //指针域 用来存储下一个结点对象的地址
        public Node next;

        // 构造方法
        public Node(){
            this(null, null, null);
        }

        public Node(K key, V value){
            this(key, value, null);
        }

        public Node(K key, V value, Node next){
            this.key = key;
            this.value = value;
            this.next = next;
        }

        @Override
        public String toString() {
           return key.toString() + ":" + value.toString();
        }
    }

    // 链表元素的数量
    private int size;
    //链表当中的虚拟头结点
    private Node dummyHead;

    // 链表初始化
    public LinkedListMap(){
        dummyHead = new Node();
        size = 0;
    }

    /***
     * 定义辅助方法，传个key值返回key值对应的节点
     * @param key
     * @return
     */
    private Node getNode(K key){
        Node prev = dummyHead.next;
        while (prev != null){
            if(prev.key.equals(key)){
                return prev;
            }
            prev = prev.next;
        }
        return null;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    /***
     * 通过key，添加节点.
     * @param key
     * @param value
     */
    @Override
    public void put(K key, V value) {
        Node node = getNode(key);
        if(node == null){
            dummyHead.next = new Node(key, value, dummyHead.next);
            size++;
        }else{
            node.value = value;
        }
    }

    /***
     * 通过key，删除节点
     * @param key
     * @return
     */
    @Override
    public V remove(K key) {
        Node prev = dummyHead;
        while (prev.next != null){
            if(prev.next.key.equals(key)){
                break;
            }
            prev = prev.next;
        }

        if(prev.next != null){
            Node delNode = prev.next;
            prev.next = delNode.next;
            delNode.next = null;
            size --;
            return delNode.value;
        }
        return null;
    }

    @Override
    public boolean contains(K key) {
        return getNode(key) != null;
    }

    @Override
    public V get(K key) {
        Node node = getNode(key);
        return node == null ? null:node.value;
    }

    @Override
    public void update(K key, V value) {
        Node node = getNode(key);
        if(node == null){
            throw new IllegalArgumentException(key + "update key out of bounds");
        }
        node.value = value;
    }
}
