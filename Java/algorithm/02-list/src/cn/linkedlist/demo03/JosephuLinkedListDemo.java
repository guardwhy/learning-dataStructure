package cn.linkedlist.demo03;

public class JosephuLinkedListDemo {
    public static void main(String[] args) {
        JosephuLinkedList<Integer> list = new JosephuLinkedList<>();
        for (int i = 1; i <= 20; i++) {
            list.add(i);
        }

        System.out.println(list);
        list.josephusLoop();
        System.out.println(list);
    }
}
