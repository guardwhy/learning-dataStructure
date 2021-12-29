package cn.linkedlist.demo01;

public class LinkedSinglyListDemo {
    public static void main(String[] args) {
        LinkedSinglyList<Integer> linkedList = new LinkedSinglyList<>();

        System.out.println("===插入元素===");
        linkedList.add(0,1);
        linkedList.add(0,3);
        linkedList.add(0,5);
        linkedList.add(0,8);
        // System.out.println(linkedList);

        //System.out.println("==链表尾部插入==");
        linkedList.add(12);
        // System.out.println(linkedList);

        //System.out.println("===链表中间插入===");
        linkedList.add(2, 23);
        System.out.println(linkedList);

        /*System.out.println("===查找元素===");
        Integer integer = linkedList.get(2);
        System.out.println("通过索引获取元素:" + integer);
        boolean b = linkedList.contains(23);
        System.out.println("是否存在该元素:" + b);
        int element = linkedList.indexOf(12);
        System.out.println("该元素的索引:" + element);*/

        System.out.println("===删除链表节点前====");
        System.out.println(linkedList);
        System.out.println("===删除链表节点后====");
        // 根据链表index位置的元素, 返回删除的元素
        linkedList.remove(2);
        System.out.println(linkedList);

        // 删除链表中的元素
        linkedList.remove(0);
        System.out.println(linkedList);


    }
}
