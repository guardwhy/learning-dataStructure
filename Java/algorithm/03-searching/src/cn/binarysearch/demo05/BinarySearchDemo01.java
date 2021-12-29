package cn.binarysearch.demo05;

// 二分查找
public class BinarySearchDemo01 {
    public static void main(String[] args) {
        // 创建数组
        int[] array = {1,2,3,4,5,6,7,8};
        // 查找的key值
        int key = 5;

        int index1 = binarySearch1(array, key);
        System.out.println("该元素的索引:" + index1);


        int index2 = binarySearch2(array, key, 0, array.length-1);
        System.out.println("该元素的索引:" + index2);
    }


    // 迭代法实现
    private static int binarySearch1(int[] array, int key) {
        // 定义low值
        int low = 0;
        // 定义high值
        int high = array.length - 1;
        // 定义mid值
        int mid = (low + high) / 2;
        // 循环遍历
        while (array[mid] != key){
            if(array[mid] > key){
                high = mid - 1;
            }else if(array[mid] < key){
                low = mid + 1;
            }
            // 查找失败
            if(low > high){
                return -1;
            }
            // 重新更新mid值
            mid = (low + high) / 2;
        }

        return mid;
    }

    // 递归方法实现
    private static int binarySearch2(int[] array, int key, int low, int high) {
        if(low > high){
            return -1;
        }
        // 中间值
        int mid = (low + high) / 2;
        if(array[mid] == key){
            return mid;
        }

        if(key < array[mid]){
            return binarySearch2(array, key, low, mid-1);
        }else {
            return binarySearch2(array, key, mid + 1, high);
        }
    }
}
