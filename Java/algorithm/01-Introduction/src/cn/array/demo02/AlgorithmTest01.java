package cn.array.demo02;

public class AlgorithmTest01 {
    public static void main(String[] args) {
        // 1.1 创建数组
        int[] arr1={11,10,8,9,7,22,23,0};
        System.out.print("arr:" + "[" + arr1[0]);

        // 1.2 遍历数组
        for(int i = 1; i < arr1.length; i++) {
            System.out.print(", " + arr1[i]);
        }
        System.out.println("]");
        System.out.println("===翻转后数组===");

        int[] arr2 = reverse(arr1);
        System.out.print("arr:" + "[" + arr2[0]);
        // 1.2 遍历数组
        for(int i = 1; i < arr2.length; i++) {
            System.out.print(", " + arr2[i]);
        }
        System.out.println("]");
    }

    private static int[] reverse(int[] arr) {
        int n = arr.length;//申请4个字节
        int temp;//申请4个字节
        for(int start=0,end=n-1;start<=end;start++,end--){
            temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
        }
        return arr;
    }
}