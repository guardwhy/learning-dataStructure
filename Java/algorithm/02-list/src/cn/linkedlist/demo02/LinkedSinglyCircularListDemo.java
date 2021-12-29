package cn.linkedlist.demo02;

public class LinkedSinglyCircularListDemo {
    public static void main(String[] args) {
        LinkedSinglyCircularList<Integer> list1 = new LinkedSinglyCircularList<>();
        System.out.println("===链表头部插入===");
        list1.add(0,1);
        list1.add(0,3);
        list1.add(0,5);
        list1.add(0,8);
        System.out.println(list1);

        System.out.println("==链表尾部插入==");
        list1.add(12);
        System.out.println(list1);

        System.out.println("===链表中间插入===");
        list1.add(2, 23);
        System.out.println(list1);
        // System.out.println(list1);

        System.out.println("===删除操作===");
        list1.remove(2);
        list1.remove(4);
        // list1.remove(5);
        System.out.println(list1);
    }
}
