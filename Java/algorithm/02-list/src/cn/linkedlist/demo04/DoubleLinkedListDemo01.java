package cn.linkedlist.demo04;

public class DoubleLinkedListDemo01 {
    public static void main(String[] args) {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        System.out.println("===链表头部插入===");
        for(int i=0; i<5; i++){
            list.addFirst(i);
            System.out.println(list);
        }

        System.out.println("===链表尾部插入===");
        list.addLast(12);
        list.addLast(111);
        list.addLast(123);
        list.addLast(15);
        System.out.println(list);

        System.out.println("===链表中间插入===");
        list.add(2, 23);
        list.add(7, 66);
        list.add(8, 39);

        System.out.println(list);



        /*System.out.println("===查找元素===");
        Integer integer = list.get(2);
        System.out.println("通过索引获取元素:" + integer);
        Integer first = list.getFirst();
        System.out.println("第一个链表元素:" + first);
        Integer last = list.getLast();
        System.out.println("最后链表元素:" + last);
        boolean b = list.contains(23);
        System.out.println("是否存在该元素:" + b);*/

        /*System.out.println("===修改节点元素===");
        System.out.println("linkedList(修改前)" + list);
        list.update(4, 38);
        System.out.println("linkedList(修改后)" + list);*/

        System.out.println("===删除链表节点前====");
        System.out.println(list);
        System.out.println("===删除链表节点后====");

        // 删除链表第一个节点
        list.removeFirst();
        System.out.println(list);
        // 根据链表index位置的元素, 返回删除的元素
        list.remove(4);
        System.out.println(list);

        // 删除链表最后一个节点
        list.removeLast();
        System.out.println(list);

        // 删除链表中的元素
        list.removeElement(39);
        System.out.println(list);

    }
}
