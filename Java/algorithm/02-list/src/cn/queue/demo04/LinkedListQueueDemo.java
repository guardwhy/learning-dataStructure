package cn.queue.demo04;

public class LinkedListQueueDemo {
    public static void main(String[] args) {
        System.out.println("==入队操作==");
        LinkedListQueue<Integer> queue = new LinkedListQueue<>();
        for(int i = 1 ; i <= 10 ; i ++){
            queue.enqueue(i);
        }
        System.out.println(queue);

        System.out.println("===出队操作===");
        for(int i = 1 ; i <= 4 ; i ++){
            queue.dequeue();
        }
        System.out.println(queue);

        System.out.println("===队首元素===");
        System.out.println(queue.getFront());
    }
}
