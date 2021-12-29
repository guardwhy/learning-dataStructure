package cn.queue.demo01;

public class ArrayQueueDemo {
    public static void main(String[] args){
        // 创建queue对象
        ArrayQueue<Integer> queue = new ArrayQueue<>();
        System.out.println("===入队操作===");
        for(int i = 0 ; i < 10 ; i ++){
            // 入队操作
            queue.enqueue(i);
        }
        System.out.println(queue);

        // 出队操作
        System.out.println("===出队操作===");
        for (int i = 0; i < 6; i++) {
            queue.dequeue();
        }
        System.out.println(queue);

        System.out.println("===获取队首元素===");
        System.out.println(queue.getFront());
    }
}
