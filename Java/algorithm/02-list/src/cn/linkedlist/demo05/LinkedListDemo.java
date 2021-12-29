package cn.linkedlist.demo05;
public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        System.out.println("===链表头部插入===");
        //System.out.println(list);

        list.add(0, 1);
        list.add(0, 2);
        list.add(0, 3);
        System.out.println(list);

        System.out.println("===链表尾部插入===");
        list.add(list.size(), 4);
        list.add(list.size(), 5);
        list.add(list.size(), 6);
        System.out.println(list);

        System.out.println("==删除元素==");
        System.out.println(list.remove(3));
        System.out.println(list);
        System.out.println("===更新元素===");
        System.out.println(list.set(2, 66));
        System.out.println(list);
        System.out.println("===获取元素===");
        System.out.println(list.get(3));
    }
}
