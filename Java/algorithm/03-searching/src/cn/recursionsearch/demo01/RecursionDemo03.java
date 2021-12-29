package cn.recursionsearch.demo01;

public class RecursionDemo03 {
    public static void main(String[] args) {
        // 递归阶乘
        function03();
        // 迭代阶乘
        function04();
    }
    // 调用函数
    private static void function03() {
        // 定义变量
        int n = 10;
        int result = factorial(n);
        System.out.println("递归阶乘实现:" + result);
    }

    private static int factorial(int n) {
        if(n == 1){
            return 1;
        }
        return factorial(n - 1) * n;
    }

    // 调用函数
    private static void function04() {
        int result = 1;
        int n = 10;
        for (int i = 1; i <= n ; i++) {
            result *= i;
        }
        System.out.println("迭代阶乘实现:" + result);
    }
}
