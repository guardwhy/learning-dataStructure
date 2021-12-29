package cn.array.demo02;
/**
 * 通过new A()创建一个对象的内存占用如下:
 * 1.整型成员变量a占用4个字节;
 * 2.对象本身占用16个字节;
 * 3、这样创建该对象总共需要20个字节,但由于不是以8位单位,所以会自动填充为24个字节。
 */
public class A {
    public int a = 1;

    public static void main(String[] args) {
        A a = new A();
    }
}
