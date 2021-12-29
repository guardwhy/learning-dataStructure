package cn.sum.demo01;

public class SumDemo02 {
    public static void main(String[] args) {
        // 定义变量
        int sum =0, n=100;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n ; j++) {
                for (int k = 1; k <=n; k++) {
                    sum+=i;
                }
            }
        }
        System.out.println(sum); // 50500000
    }
}
