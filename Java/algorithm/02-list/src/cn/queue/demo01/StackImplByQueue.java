package cn.queue.demo01;

public class StackImplByQueue<E> {
    // 创建两个栈
    private ArrayQueue<E> queueA;
    private ArrayQueue<E> queueB;

    // 构造函数
    public StackImplByQueue(){
        queueA = new ArrayQueue<>();
        queueB = new ArrayQueue<>();
    }

    // 入栈操作
    public void push(E element){
       // 判断两个队列是否为空
        if(queueA.isEmpty() && queueB.isEmpty()){
            // 往队列A中插入元素
            queueA.enqueue(element);
        }else if(queueA.isEmpty()){
            // 往队列B中添加
            queueB.enqueue(element);
        }else {
            queueA.enqueue(element);
        }
    }

    // 弹栈操作
    public E pop(){
        // 元素值范围
        if(queueA.isEmpty() && queueB.isEmpty()){
            throw new NullPointerException("stack is NULL!!!");
        }else if(!queueA.isEmpty()){
            while (queueA.size() != 1){
                // 从A队列中弹出元素往队列B存放
                queueB.enqueue(queueA.dequeue());
            }
            return queueA.dequeue();
        }else {
            while (queueB.size() != 1){
                // 从B队列中弹出元素往队列A存放
                queueA.enqueue(queueB.dequeue());
            }
            return queueB.dequeue();
        }
    }

    // 查看当前栈的栈顶
    public E peek(){
        if(queueA.isEmpty() && queueB.isEmpty()){
            throw new NullPointerException("stack is null");
        }else if(!queueA.isEmpty()){
            while (queueA.size() !=1){
                // 从A队列中弹出元素往队列B存放
                queueB.enqueue(queueA.dequeue());
            }
            // 拿到栈顶元素
            E ret = queueA.getFront();
            queueB.enqueue(queueA.dequeue());
            return ret;
        }else {
            while (queueB.size() !=1){
                // 从B队列中弹出元素往队列A存放
                queueA.enqueue(queueB.dequeue());
            }
            // 拿到栈顶元素
            E ret = queueB.getFront();
            queueA.enqueue(queueB.dequeue());
            return ret;
        }
    }

    @Override
    public String toString(){
        if(queueA.isEmpty() && queueB.isEmpty()){
            return "[]";
        }else if(!queueA.isEmpty()){
            return queueA.toString();
        }else {
            return queueB.toString();
        }
    }
}
