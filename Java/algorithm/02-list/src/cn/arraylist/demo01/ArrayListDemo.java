package cn.arraylist.demo01;
/**
 * 顺序表测试类
 */
public class ArrayListDemo {
    public static void main(String[] args) {
        //1.1 创建顺序表对象
        ArrayList<Integer> list = new ArrayList();
        System.out.println("===顺序表添加===");
        for (int i = 0; i < 10; i++){
            list.addLast(i);
        }

        System.out.println(list);

        System.out.println("===顺序表(修改索引位置的元素)===");
        list.set(3,100);
        System.out.println(list);
    }
}
