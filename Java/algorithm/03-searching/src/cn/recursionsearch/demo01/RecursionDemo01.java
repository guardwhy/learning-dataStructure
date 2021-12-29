package cn.recursionsearch.demo01;

public class RecursionDemo01 {
    public static void main(String[] args) {
        int result = factorial(5);
        System.out.println("5的阶乘:" + result);
    }

    public static int factorial(int n){
        if (n == 1){
            return 1;
        }
        return n * factorial(n-1);
    }
}
