package cn.sequentialsearch.demo02;
// 顺序查找
public class SequentialDemo01 {
    public static void main(String[] args) {
        // 创建数组
        int[] arr = {1,16,2,35,47,59,62,73,88,99};
        // 查找key
        int key = 47;
        // 索引值
        int index = sequentialSearch(arr, key);
        if(index == -1){
            System.out.println("没有找到该元素！！！");
        }else {
            System.out.println("该元素的索引:" + index);
        }

    }

    // 调用查找方法
    private static int sequentialSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }
}
