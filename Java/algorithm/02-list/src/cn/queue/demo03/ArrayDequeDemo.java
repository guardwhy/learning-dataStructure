package cn.queue.demo03;

public class ArrayDequeDemo {
    public static void main(String[] args) {
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        // 插入元素
        System.out.println("===队头插入===");
        for (int i = 1; i <=3 ; i++) {
            deque.addFirst(i);
        }
        System.out.println(deque);

        System.out.println("===队尾插入===");
        for (int i = 4; i <=6 ; i++) {
            deque.addLast(i);
        }
        System.out.println(deque);

        System.out.println("===队头删除===");
        System.out.println(deque.removeFirst());

        System.out.println("===队尾删除===");
        System.out.println(deque.removeLast());
    }
}
