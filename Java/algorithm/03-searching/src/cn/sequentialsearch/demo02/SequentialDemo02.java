package cn.sequentialsearch.demo02;
// 哨兵方式
public class SequentialDemo02 {
    public static void main(String[] args) {
        // 创建数组
        int[] array = {16,2,35,47,59,62,73,88,99};
        // 要查找的元素
        int key = 59;
        // 新数组
        int[] newArray = new int[array.length+1];
        newArray[0] = key;
        for (int i = 0; i < array.length; i++) {
            newArray[i+1] = array[i];
        }
        // 创建查找方法
        int index = sequentialSearch(newArray, key)-1;
        // 条件判断
        if(index != -1){
            System.out.println("查找的元素的索引是:" + index);
        }else {
            System.out.println("要查找的元素不存在！！");
        }
    }

    private static int sequentialSearch(int[] arr, int key) {
        // 数组长度
        int len = arr.length -1;
        // 哨兵
        arr[0] = key;
        // 从数组尾部开始遍历
        while (arr[len] != key){
            len--;
        }
        return len;
    }
}
