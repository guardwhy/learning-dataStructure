package cn.heap.demo02;

import java.util.Random;

public class TestPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        Random random = new Random();
        // 遍历添加
        for (int i=0; i<10; i++){
            queue.enqueue(random.nextInt(20));
        }

        System.out.println(queue);

        for (int i=0; i<4; i++){
            System.out.println(queue.dequeue());
        }
    }
}
