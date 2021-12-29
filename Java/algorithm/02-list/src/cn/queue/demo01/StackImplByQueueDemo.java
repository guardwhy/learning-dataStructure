package cn.queue.demo01;

public class StackImplByQueueDemo {
    public static void main(String[] args) {
        StackImplByQueue<Integer> stack = new StackImplByQueue<>();
        System.out.println("===入队元素===");
        for (int i = 1; i <=12 ; i++) {
            stack.push(i);
        }
        System.out.println(stack);
        System.out.println("===出队元素===");
        for (int i=1; i<=5; i++){
            stack.pop();
        }
        System.out.println(stack);
        System.out.println("===获取队首元素===");
        System.out.println(stack.peek());
    }
}
