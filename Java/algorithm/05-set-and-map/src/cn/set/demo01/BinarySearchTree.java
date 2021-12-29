package cn.set.demo01;
import java.util.LinkedList;
import java.util.Queue;

// 二分搜索树
public class BinarySearchTree<E extends Comparable<E>>{
    // 二分搜索树结点定义
    private class Node {
        // 数据域
        public E e;
        // 左右指针域
        public Node left, right;
        // 构造方法
        public Node (E e){
            this.e = e;
            left = null;
            right = null;
        }
    }

    // 二分搜索树的根节点的指针
    private Node root;
    // 二分搜索树的元素的个数
    private int size;

    // 创建一颗空的二分搜索树
    public BinarySearchTree(){
        root = null;
        size = 0;
    }
    // 获取二分搜索树的元素个数
    public int size(){
        return size;
    }

    // 判断二分搜索树是否为空
    public boolean isEmpty(){
        return size == 0 && root == null;
    }

    /***
     * 向二分搜索树中添加一个元素e
     * @param e
     */
    public void add(E e){
        root = add(root, e);
    }

    /***
     * 向以node为根的二分搜索树中添加元素e
     * 并且返回新结点插入之后的二分搜索树新的根
     * @param node
     * @param e
     * @return
     */
    private Node add(Node node, E e){
        if(node == null){
            size ++;
            return new Node(e);
        }

        if(e.compareTo(node.e) < 0){
            // 以node左子树为根节点，再添加一个元素
            node.left = add(node.left, e);
        }else if(e.compareTo(node.e) > 0){
            // 以node右子树为根节点，再添加一个元素
            node.right = add(node.right, e);
        }

        return node;
    }

    /***
     * 判断二分搜索树中是否包含元素e
     * @param e
     * @return
     */
    public boolean contains(E e){
        return contains(root, e);
    }

    /***
     * 以node为根节点的树中，判断e是否存在
     * @param node
     * @param e
     * @return
     */
    private boolean contains(Node node, E e){
        if(node == null){
            return false;
        }
        if(e.compareTo(node.e) == 0){
            return true;
        }
        // 以当前节点的左孩子为根的左子树,去寻找元素e
        if(e.compareTo(node.e) < 0){
            return contains(node.left, e);
        }else {
            // 以当前节点的右孩子为根的右子树,去寻找元素e
            return contains(node.right, e);
        }
    }

    // 前序遍历
    public void preOrder(){
        preOrder(root);
    }

    /***
     * 前序遍历递归实现
     * @param node
     */
    public void preOrder(Node node){
        if(node == null){
            return;
        }

        System.out.println(node.e);
        preOrder(node.left);
        preOrder(node.right);
    }

    // 前序遍历的非递归实现方式
    public void preOrderNR(){
        // 先访问根节点，然后前序遍历左子树，再前序遍历右子树
        LinkedList<Node> stack = new LinkedList<>();
        // 入栈根节点
        stack.push(root);
        while (!stack.isEmpty()){
            // 先弹出一个元素
            Node cur = stack.pop();
            System.out.println(cur.e);
            // 判断左右孩子是否为空，然后执行入栈操作
            if(cur.right != null){
                stack.push(cur.right);
            }
            if(cur.left != null){
                stack.push(cur.left);
            }
        }
    }

    // 中序遍历
    public void inOrder(){
        inOrder(root);
    }

    /***
     * 中序遍历递归实现
     * @param node
     */
    private void inOrder(Node node){
        if(node == null){
            return;
        }
        inOrder(node.left);
        System.out.println(node.e);
        inOrder(node.right);
    }


    // 中序遍历非递归实现
    public void inOrderNR(){
        // 中序遍历根结点的左子树，然后是访问根结点，最后中序遍历右子树
        LinkedList<Node> stack = new LinkedList<>();
        // 创建pre指针
        Node prev = root;
        // 将现将根节点和根节点的左边全部入栈
       while (prev != null){
           stack.push(prev);
           prev = prev.left;
       }
       while (!stack.isEmpty()){
           // 先弹出元素
           Node cur = stack.pop();
           System.out.println(cur.e);
           // 判断该结点右边是否为空
           if(cur.right != null){
               // 如果右孩子不为空，继续执行入栈操作
               prev = cur.right;
               while (prev != null){
                   // 将左孩子执行入栈操作
                   stack.push(prev);
                   prev = prev.left;
               }
           }
       }
    }

    // 后序遍历
    public void postOrder(){
        postOrder(root);
    }

    /***
     * 后序遍历递归实现
     * @param node
     */
    private void postOrder(Node node){
        if(node == null){
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node.e + " ");
    }

    // 后序遍历非递归实现
    public void postOrderNR(){
        if(root == null){
            return;
        }
        // 申请两个栈s1，s2，头节点入栈s1
        LinkedList<Node> s1 = new LinkedList<>();
        LinkedList<Node> s2 = new LinkedList<>(); // 辅助栈，存储根 -> 右节点 ->左节点 的结果

        // 先插入根节点
        s1.push(root);
        // 如果栈s1不为空，执行以下操作：弹出一个元素，入栈s2
        while (!s1.isEmpty()){
            Node cur = s1.pop();
            s2.push(cur);
            // 如果该节点左孩子不空入栈s1，如果该节点右孩子不空入栈s1.
            if(cur.left != null){
                s1.push(cur.left);
            }
            if(cur.right != null){
                s1.push(cur.right);
            }
        }

        // 将栈s2中的节点一次出栈，打印
        while (!s2.isEmpty()){
            Node cur = s2.pop();
            System.out.println(cur.e + " ");
        }
    }

    // 层序遍历
    public void levelOrder(){
        // 创建队列
        Queue<Node> queue = new LinkedList<>();
        // 先入队根节点
        queue.offer(root);
        while (!queue.isEmpty()){
            // 先出队一个元素
            Node cur = queue.poll();
            System.out.println(cur.e);
            // 分别入队左右子树
            if(cur.left != null){
                queue.offer(cur.left);
            }
            if(cur.right != null){
                queue.offer(cur.right);
            }
        }
    }

    // 返回二分搜索树的最小值【迭代实现】
    public E minimum2(){
        if (isEmpty()){
            throw new IllegalArgumentException("BST is empty!!!");
        }
        // 定义指针prev指向根节点
        Node prev = root;
        while (prev.left != null){
            prev = prev.left;
        }

        return prev.e;
    }

    // 返回二分搜索树的最小值【递归实现】
    public E minimum(){
        if(isEmpty()){
            throw new IllegalArgumentException("BST is empty!!!");
        }
        Node minNode = minimum(root);
        return minNode.e;
    }

    /***
     * 返回以node为根的二分 搜索树的最小值所在的节点
     * @param node
     * @return
     */
    private Node minimum(Node node){
        if(node.left == null){
            return node;
        }
        return minimum(node.left);
    }

    // 返回二分搜索树的最大值【递归实现】
    public E maximum(){
        if(isEmpty()){
            throw new IllegalArgumentException("BST is empty!!!");
        }
        Node maxNode = maximum(root);
        return maxNode.e;
    }

    /***
     * 返回以node为根的二分 搜索树的最大值所在的节点
     * @param node
     * @return
     */
    private Node maximum(Node node){
        if(node.right == null){
            return node;
        }
        return maximum(node.right);
    }

    // 从二分搜索树中删除最小值所在节点, 返回最小值
    public E removeMin(){
        // 调用函数
        E ret = minimum();
        root = removeMin(root);
        return ret;
    }

    /***
     * 删除掉以node为根的二分搜索树中的最小节点
     * 返回删除节点后新的二分搜索树的根
     * @param node
     * @return
     */
    private Node removeMin(Node node){
        // 向左走再也走不动了
        if(node.left == null){
            // 定义变量保存当前结点的右子树
            Node rightNode = node.right;
            node.right = null;
            size --;
            return rightNode;
        }
        // 以node的左边为根节点，删除当前左子树的最小值，然后返回给左边接上
        node.left = removeMin(node.left);
        return node;
    }

    // 从二分搜索树中删除最大值所在节点, 返回最大值
    public E removeMax(){
        // 调用函数
        E ret = maximum();
        root = removeMax(root);
        return ret;
    }

    /***
     * 删除掉以node为根的二分搜索树中的最大节点
     * 返回删除节点后新的二分搜索树的根
     * @param node
     * @return
     */
    private Node removeMax(Node node){
        if(node.right == null){
            // 定义变量保存当前结点的左子树
            Node leftNode = node.left;
            node.left = null;
            size --;
            return leftNode;
        }
        // 以node的右边为根节点，删除当前右子树的最大值，然后返回给右边接上
        node.right = removeMax(node.right);
        return node;
    }

    // 从二分搜索树中删除元素为e的节点
    public void remove(E e){
        root = remove(root, e);
    }

    /***
     * 删除掉以node为根的二分搜索树中值为e的节点,递归算法
     * 返回删除节点后新的二分搜索树的根
     * @param node
     * @param e
     * @return
     */
    private Node remove(Node node, E e){
        if(node == null){
            return null;
        }
        if(e.compareTo(node.e) < 0){
            node.left = remove(node.left, e);
            return node;
        }else if(e.compareTo(node.e) > 0){
            node.right = remove(node.right, e);
            return node;
        }else { // e.compareTo(node.e) == 0
            // 如果左子树为空
            if(node.left == null){
                Node rightNode = node.right;
                // 置空操作
                node.right = null;
                size --;
                return rightNode;
            }
            // 待删除节点右子树为空的情况
            if(node.right == null){
                Node leftNode = node.left;
                // 置空操作
                node.left = null;
                size --;
                return leftNode;
            }

            // 待删除节点左右子树均不为空的情况
            // 找到node结点的后继
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
    
   @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        // 前序遍历实现
        generateBST(root, 0, sb);
        return sb.toString();
    }

    // 生成以node为根节点，深度为depth的描述二叉树的字符串
    private void generateBST(Node node, int depth, StringBuilder sb){
        if(node == null){
            sb.append(generateDepth(depth) + "null\n");
            return;
        }

        // 当前结点存储的元素
        sb.append(generateDepth(depth) + node.e + "\n");
        // 访问当前结点的左子树
        generateBST(node.left, depth + 1, sb);
        // 访问当前结点的右子树
        generateBST(node.right, depth + 1, sb);
    }

    private String generateDepth(int depth){
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < depth ; i ++)
            sb.append("--");
        return sb.toString();
    }
}
