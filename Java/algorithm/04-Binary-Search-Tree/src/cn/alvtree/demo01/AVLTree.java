package cn.alvtree.demo01;

import cn.map.demo.Map;

import java.util.ArrayList;

/***
 * 二叉平衡树实现
 * @param <K>
 * @param <V>
 */
public class AVLTree<K extends Comparable<K>,V> implements Map<K, V> {
    // 创建Node节点
    private class Node {
        public K key;
        public V value;
        // 左右指针域
        public Node left, right;
        // 当前节点所处的高度,默认为1
        public int height;

        // 构造方法
        public Node(K key, V value) {
            this.key = key;
            this.value = value;
            left = null;
            right = null;
            height = 1;
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
    public AVLTree(){
        root = null;
        size = 0;
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
     * 获得节点Node的高度,如果节点为空，则高度为0
     * @param node
     * @return
     */
    private int getHeight(Node node){
        if(node == null){
            return 0;
        }
        return node.height;
    }

    /***
     * 获得节点node的平衡因子
     * 计算平衡因子:左子树的高度-右子树的高度
     * > 0 左边比右边高
     * == 0 左右一样高
     * < 0 右边比左边高
     * @param node
     * @return
     */
    private int getBalanceFactor(Node node) {
        if(node == null){
            return 0;
        }
        return getHeight(node.left) - getHeight(node.right);
    }

    /***
     * 判断该二叉树是不是二分搜索树
     * @return
     */
    public boolean isBinarySearchTree(){
        // 将Map中的key值存放在List中
        ArrayList<K> keys = new ArrayList<>();
        // 使用中序遍历，遍历的结果都是有序的
        inOrder(root, keys);
        // 判断该数组是否升序
        for (int i=1; i < keys.size(); i++){
            if(keys.get(i-1).compareTo(keys.get(i)) > 0){
                return false;
            }
        }
        return true;
    }
    // 中序遍历
    private void inOrder(Node node, ArrayList<K> keys) {
        if(node == null){
            return;
        }
        inOrder(node.left, keys);
        keys.add(node.key);
        inOrder(node.right, keys);
    }

    /***
     * 判断该二叉树是否是一棵平衡二叉树
     * @return
     */
    public boolean isBalanced(){
        return isBalanced(root);
    }
    /***
     * 判断以Node为根的二叉树是否是一棵平衡二叉树
     * @return
     */
    private boolean isBalanced(Node node){
        if(node == null){
            return true;
        }
        // 拿到平衡因子
        int balanceFactor = getBalanceFactor(node);
        if(Math.abs(balanceFactor) > 1){
            return false;
        }
        // 判断当前结点的左右子树是否是平衡二叉树
        return isBalanced(node.left) && isBalanced(node.right);
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

        // 更新height
        y.height = Math.max(getHeight(y.left), getHeight(y.right) + 1);
        x.height = Math.max(getHeight(x.left), getHeight(x.right) + 1);

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

        // 更新height
        y.height = Math.max(getHeight(y.left), getHeight(y.right) + 1);
        x.height = Math.max(getHeight(x.left), getHeight(x.right) + 1);

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

        // 更新节点的高度
        node.height = 1 + Math.max(getHeight(node.left), getHeight(node.right));
        // 计算平衡因子
        int balanceFactor = getBalanceFactor(node);

        // 左侧的左侧不平衡【右旋转LL】
        if(balanceFactor > 1 && getBalanceFactor(node.left) >= 0){
            return rightRotate(node);
        }

        // 左侧的右侧不平衡【先左后右旋转LR】
        if (balanceFactor > 1 && getBalanceFactor(node.left) < 0) {
            // 当前节点的左孩子进行一次左旋转
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }

        // 右侧的右侧不平衡【左旋转RR】
        if(balanceFactor < -1 && getBalanceFactor(node.right) <= 0){
            return leftRotate(node);
        }
        // 右侧的左侧不平衡【先右后左旋转RL】
        if (balanceFactor < -1 && getBalanceFactor(node.right) > 0) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
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
        // 创建最终要返回的node
        Node retNode;
        if (key.compareTo(node.key) < 0) {
            node.left = remove(node.left, key);
            retNode = node;
        } else if (key.compareTo(node.key) > 0) {
            node.right = remove(node.right, key);
            retNode = node;
        } else {// e.compareTo(node.e) == 0
            // 如果左子树为空
            if(node.left == null){
                Node rightNode = node.right;
                // 置空操作
                node.right = null;
                size --;
                retNode = rightNode;
            // 待删除节点右子树为空的情况
            }else if(node.right == null){
                Node leftNode = node.left;
                // 置空操作
                node.left = null;
                size --;
                retNode = leftNode;
            }else{
                // 待删除节点左右子树均不为空的情况,找到node结点的后继
                Node successor = minimum(node.right);
                // 找到比待删除节点大的最小节点, 即待删除节点右子树的最小节点
                successor.right = remove(node.right, successor.key);
                // 用这个节点顶替待删除节点的位置
                successor.left = node.left;
                // 置空操作
                node.left = node.right = null;
                retNode =  successor;
            }
        }

        // 当retNode为null
        if(retNode == null){
            return null;
        }

        // 更新节点的高度
        retNode.height = 1 + Math.max(getHeight(retNode.left), getHeight(retNode.right));
        // 计算平衡因子
        int balanceFactor = getBalanceFactor(retNode);

        // 左侧的左侧不平衡【右旋转LL】
        if(balanceFactor > 1 && getBalanceFactor(retNode.left) >= 0){
            return rightRotate(retNode);
        }

        // 左侧的右侧不平衡【先左后右旋转LR】
        if (balanceFactor > 1 && getBalanceFactor(retNode.left) < 0) {
            // 当前节点的左孩子进行一次左旋转
            node.left = leftRotate(retNode.left);
            return rightRotate(retNode);
        }

        // 右侧的右侧不平衡【左旋转RR】
        if(balanceFactor < -1 && getBalanceFactor(retNode.right) <= 0){
            return leftRotate(retNode);
        }
        // 右侧的左侧不平衡【先右后左旋转RL】
        if (balanceFactor < -1 && getBalanceFactor(retNode.right) > 0) {
            retNode.right = rightRotate(retNode.right);
            return leftRotate(retNode);
        }
        return retNode;
    }
}
