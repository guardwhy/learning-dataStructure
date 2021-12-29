package cn.recursionsearch.demo01;

public class RecursionDemo04 {
    public static void main(String[] args) {
        // 递归阶乘
        function05();
        // 迭代阶乘
        function06();
    }

    private static void function05() {
        // 定义变量
        int n = 30;
        int num = fabonacci(n);
        System.out.println("递归方式:" + num);
    }

    private static int fabonacci(int n) {
        // 条件判断
        if(n ==1 || n == 2){
            return 1;
        }
        return fabonacci(n - 1) + fabonacci(n - 2);
    }

    private static void function06() {
        // 定义变量
        int n = 30;
        int num = getFabonacci(n);
        System.out.println("迭代方式:" + num);
    }

    private static int getFabonacci(int n) {
        if( n ==1 || n == 2){
            return 1;
        }
        // 定义变量
        int first = 1;
        int second = 1;
        // 定义计数器
        int current = 0;
        for (int i = 3; i <= n; i++) {
            // 从第三项起，该项之和等于两项相加
            current = first +second;
            first = second;
            second = current;
        }

        // 返回值
        return current;
    }
}
