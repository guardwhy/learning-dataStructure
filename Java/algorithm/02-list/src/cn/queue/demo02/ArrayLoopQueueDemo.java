package cn.queue.demo02;

public class ArrayLoopQueueDemo {
    public static void main(String[] args) {
        ArrayLoopQueue<Integer> queue = new ArrayLoopQueue<>();
        System.out.println("===入队操作===");
        for (int i = 1; i <=12 ; i++) {
            queue.enqueue(i);
        }

        System.out.println(queue);

        System.out.println("===出队操作===");
        for (int i = 1; i <= 4; i++){
            queue.dequeue();
        }
        System.out.println(queue);

        System.out.println("===队首元素===");
        System.out.println(queue.getFront());
    }
}
