package cn.heap.demo01;

import java.util.Random;

public class TestMaxHeap {
    public static void main(String[] args) {
        MaxHeap<Integer> heap = new MaxHeap<>();
        Random random = new Random();
        // 遍历添加
        for (int i=0; i<10; i++){
            heap.add(random.nextInt(20));
        }

        System.out.println(heap);

        for (int i=0; i<4; i++){
            System.out.println(heap.extractMax());
        }
    }
}
