package cn.fibonaccisearch.demo04;

import java.util.Arrays;

public class FibonacciSearchDemo01 {
    public static void main(String[] args) {
        // 创建数组
        int[] arr = {5, 12, 21, 32, 35, 40, 44, 50, 51, 52};
        // 查找值
        int key = 12;
        // 查找索引值
        int index = fibonacciSearch(arr, key);
        // 索引值
        if(index == -1){
            System.out.println("没有找到该元素！！！");
        }else {
            System.out.println("该元素的索引:" + index);
        }
    }

    private static int fibonacciSearch(int[] arr, int key) {
        int[] fibArray = getFibonacci();
        // 定义mid,low,high,k值
        int low = 0;
        int k = 0;
        int mid = 0;
        int high = arr.length - 1;
        // 定义一个k值，找到一个合适的斐波那契值，用来表示数组的长度
        while (high > fibArray[k] - 1){
            k++;
        }

        // 给数组扩容
        int[] temp = Arrays.copyOf(arr, fibArray[k]);

        for(int i=high + 1; i < temp.length; i++){
            temp[i] = arr[high];
        }

        while (low <= high){
            // 找到黄金分割点(中间值)
            mid = low + fibArray[k -1] -1;
            if(key < temp[mid]){
                high = mid -1;
                k -= 1;
            }else if(key > temp[mid]){
                low = mid + 1;
                k -= 2;
            }else{
                if(mid <= high){
                    return mid;
                }else {
                    return high;
                }
            }
        }
        return -1;
    }

    // 获取斐波那契数列
    private static int[] getFibonacci() {
        // 斐波那契数
        int[] fibArray = new int[52];
        fibArray[0] = 1;
        fibArray[1] = 1;
        for (int i=2; i<fibArray.length; i++){
            fibArray[i] = fibArray[i - 1] + fibArray[i - 2];
        }
        return fibArray;
    }
}
