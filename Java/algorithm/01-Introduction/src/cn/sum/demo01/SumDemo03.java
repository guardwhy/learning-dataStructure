package cn.sum.demo01;

public class SumDemo03 {
    public static void main(String[] args) {
        int sum=0,n=100;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n ; j++) {
                sum+=i;
            }
        }
        System.out.println(sum);
    }
}