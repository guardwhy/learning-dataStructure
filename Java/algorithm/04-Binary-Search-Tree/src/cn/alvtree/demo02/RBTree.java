package cn.alvtree.demo02;

import cn.map.demo.Map;

/***
 * 二红黑树实现
 * @param <K>
 * @param <V>
 */
public class RBTree<K extends Comparable<K>,V> implements Map<K, V> {
    // 定义常量
    private static final boolean RED = true;
    private static final boolean BLACK = false;

    // 创建Node节点
    private class Node {
        public K key;
        public V value;
        // 左右指针域
        public Node left, right;
        // 颜色
        public boolean color;

        // 构造方法
        public Node(K key, V value) {
            this.key = key;
            this.value = value;
            left = null;
            right = null;
            // 初始化颜色为红色
            color = RED;
        }

        @Override
        public String toString() {
            return "(" + key +"," +value + ")";
        }
    }

    // 二分搜索树的根节点的指针
    private Node root;
    // 二分搜索树的元素的个数
    private int size;

    // TreeMap初始化
    public RBTree(){
        root = null;
        size = 0;
    }

    /***
     * 判断节点node的颜色
     * @param node
     * @return
     */
    private boolean isRed(Node node){
        if(node == null){
            return BLACK;
        }

        return node.color;
    }

    /***
     * 返回以node为根节点的二分搜索树中，key所在的节点
     * @param node
     * @param key
     * @return
     */
    private Node getNode(Node node, K key){
        if(node == null){
            return null;
        }
        if(key.equals(node.key)){
            return node;
        }else if(key.compareTo(node.key) < 0){
            return getNode(node.left, key);
        }else {
            return getNode(node.right, key);
        }
    }


    /***
     * 对节点y进行向右旋转操作，返回旋转后新的根节点x
     * @param y
     * @return
     */
    private Node rightRotate(Node y){
        Node x = y.left;
        Node T3 = x.right;

        // 向右旋转的过程【LL平衡旋转】
        x.right = y;
        y.left = T3;

        // 返回该节点
        return x;
    }

    /***
     * 对节点y进行向左旋转操作，返回旋转后新的根节点x
     * @param y
     * @return
     */
    private Node leftRotate(Node y){
        Node x = y.right;
        Node T2 = x.left;

        // 向右旋转的过程【LL平衡旋转】
        x.left = y;
        y.right = T2;


        // 返回该节点
        return x;
    }


    /***
     * 向TreeMap添加新的元素(key, value)
     * @param key
     * @param value
     */
    @Override
    public void put(K key, V value) {
        root = put(root, key, value);
    }

    /***
     * 向以node为根的AVLTree中插入元素(key, value)，递归算法
     * 返回插入新节点后AVLTree的根
     * @param node
     * @param key
     * @param value
     * @return
     */
    private Node put(Node node, K key, V value) {
        if(node == null){
            size ++;
            return new Node(key, value);
        }
        if(key.compareTo(node.key) < 0){
            // 以node左子树为根节点，再添加一个元素
            node.left = put(node.left, key, value);
        }else if(key.compareTo(node.key) > 0){
            // 以node右子树为根节点，再添加一个元素
            node.right = put(node.right, key, value);
        }else {
            // 当key相等时，value直接覆盖
            node.value = value;
        }
        return node;
    }



    /***
     * 判断TreeMap中是否包含元素e
     * @param key
     * @return
     */
    @Override
    public boolean contains(K key) {
        return getNode(root, key) != null;
    }

    /***
     * 通过键获取值
     * @param key
     * @return
     */
    @Override
    public V get(K key) {
        Node node = getNode(root, key);
        return node == null ? null: node.value;
    }

    /***
     * 通过key，修改值
     * @param key
     * @param value
     */
    @Override
    public void update(K key, V value) {
        Node node = getNode(root, key);
        if(node == null){
            throw new IllegalArgumentException(key + "update key out of bounds");
        }
        node.value = value;
    }

    /***
     * 获取TreeMap的元素个数
     * @return
     */
    @Override
    public int size() {
        return size;
    }

    /***
     * 判断TreeMap是否为空
     * @return
     */
    @Override
    public boolean isEmpty() {
        return size == 0 && root == null;
    }

    /***
     * 返回以node为根的二分搜索树的最小值所在的节点
     * @param node
     * @return
     */
    private Node minimum(Node node){
        if(node.left == null){
            return node;
        }
        return minimum(node.left);
    }

    /***
     * 删除掉以node为根的二分搜索树中的最小节点
     * 返回删除节点后新的二分搜索树的根
     * @param node
     * @return
     */
    private Node removeMin(Node node){

        if(node.left == null){
            Node rightNode = node.right;
            node.right = null;
            size --;
            return rightNode;
        }

        node.left = removeMin(node.left);
        return node;
    }

    /***
     * 从二分搜索树中删除键为key的节点
     * @param key
     * @return
     */
    @Override
    public V remove(K key) {
        Node node = getNode(root, key);
        if(node != null){
            root = remove(root, key);
            return node.value;
        }
        return null;
    }

    /***
     * 删除掉以node为根的AVLTree的元素(key, value),递归算法
     * 返回删除节点后新的AVLTree的根
     * @param node
     * @param key
     * @return
     */
    private Node remove(Node node, K key) {
        if (node == null) {
            return null;
        }
        if (key.compareTo(node.key) < 0) {
            node.left = remove(node.left, key);
            return node;
        } else if (key.compareTo(node.key) > 0) {
            node.right = remove(node.right, key);
            return node;
        } else {// e.compareTo(node.e) == 0
            // 如果左子树为空
            if (node.left == null) {
                Node rightNode = node.right;
                // 置空操作
                node.right = null;
                size--;
                return rightNode;
            }else  if (node.right == null) {
                Node leftNode = node.left;
                // 置空操作
                node.left = null;
                size--;
                return leftNode;

            }else{
                // 待删除节点右子树为空的情况
                // 待删除节点左右子树均不为空的情况,找到node结点的后继
                Node successor = minimum(node.right);
                // 找到比待删除节点大的最小节点, 即待删除节点右子树的最小节点
                successor.right = removeMin(node.right);
                // 用这个节点顶替待删除节点的位置
                successor.left = node.left;
                // 置空操作
                node.left = node.right = null;
                return successor;
            }
        }
    }
}
