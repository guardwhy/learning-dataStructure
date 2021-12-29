package cn.array.demo02;

public class AlgorithmTest02 {
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
        int n=arr.length;//申请4个字节
        int[] temp=new int[n];//申请n*4个字节+数组自身头信息开销24个字节
        for (int i = n-1; i >=0; i--) {
            temp[n-1-i] = arr[i];
        }
        return temp;
    }
}
