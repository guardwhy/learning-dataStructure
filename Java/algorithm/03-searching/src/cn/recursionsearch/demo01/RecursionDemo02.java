package cn.recursionsearch.demo01;

public class RecursionDemo02 {
    public static void main(String[] args) {
        // 递归累加
        function01();
        // 迭代累加
        function02();
    }

    // 调用方法
    private static void function01() {
        // 定义变量
        int n = 100;
        int sum = sum(n);
        System.out.println("sum和为[递归求和]:" +sum);
    }

    private static int sum(int n) {
        if(n == 1){
            return 1;
        }
        return sum(n-1) + n;
    }

    private static void function02() {
        // 定义sum值
        int sum = 0;
        int n = 100;
        for (int i = 0; i <= n; i++) {
            // 求和操作
            sum += i;
        }
        System.out.println("sum和为[迭代求和]:" + sum);
    }
}
