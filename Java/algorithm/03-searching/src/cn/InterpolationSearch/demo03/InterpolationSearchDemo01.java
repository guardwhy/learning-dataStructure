package cn.InterpolationSearch.demo03;
// 插值查找
public class InterpolationSearchDemo01 {
    public static void main(String[] args) {
        // 创建数组
        int[] arr = {1, 5, 12, 21, 30, 32, 55, 68, 80, 89, 90, 99};
        // 查找值
        int key = 30;
        // 创建插入查找方法
        int index = interpolationSearch(arr, key, 0, arr.length-1);
        // 索引值
        if(index == -1){
            System.out.println("没有找到该元素！！！");
        }else {
            System.out.println("该元素的索引:" + index);
        }
    }
    //插入查找方法
    private static int interpolationSearch(int[] arr, int key, int low, int high) {
        // 条件判断,查找失败
        if(low > high){
            return -1;
        }
        // 计算中间值
        int mid = low + (int)(1.0 *(key -arr[low]) / (arr[high] - arr[low]) * (high - low));
        if(mid < low || mid > high){
            return -1;
        }

        // 当中间值等于要查找的key时，寻找成功
        if(arr[mid] == key){
            return mid;
        }else if(arr[mid] > key){
            return interpolationSearch(arr, key, low, mid-1);
        }else {
            return interpolationSearch(arr, key, mid + 1, high);
        }
    }
}
