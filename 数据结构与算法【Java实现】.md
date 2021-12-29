## 第1章 数据结构和算法概述

### 1.1 什么是数据结构

1、官方解释

==数据结构(data structure)是计算机存储、组织数据的方式==。数据结构是指相互之间存在一种或多种特定关系的数据元素的集合。【百度百科】
一句话解释：存数据的，而且是在内存中存！

2、大白话

<font color = red>数据结构就是把数据元素按照一定的关系组织起来的集合，用来组织和存储数据</font>。

### 1.2 数据结构分类

传统上，我们可以把数据结构分为逻辑结构和物理结构两大类。

#### 1.2.1 逻辑结构分类

逻辑结构是从具体问题中抽象出来的模型，是抽象意义上的结构，按照对象中数据元素之间的相互关系分类。

1、集合结构：集合结构中数据元素除了属于同一个集合外，他们之间没有任何其他的关系。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211106105601.png" style="zoom:80%;" />	

2、线性结构：线性结构中的数据元素之间存在一对一的关系

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211106110134.png" style="zoom:80%;" />	

 3、树形结构：树形结构中的数据元素之间存在一对多的层次关系

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211106114056.png" style="zoom:80%;" />	

4、图形结构：图形结构的数据元素是多对多的关系

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211106114925.png" style="zoom:80%;" />	

#### 1.2.2 物理结构分类

1、基本介绍

- 逻辑结构在计算机中真正的表示方式（又称为映像）称为物理结构，也可以叫做存储结构。常见的物理结构有顺序存储结构、链式存储结构。

2、顺序存储结构

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211106115540.png)	

- 把数据元素放到地址连续的存储单元里面，其数据间的逻辑关系和物理关系是一致的 ，==比如常用的数组就是顺序存储结构==。
- 顺序存储结构存在一定的弊端，就==像生活中排时也会有人插队也可能有人有特殊情况突然离开，这时候整个结构都处于变化中==，此时就需要链式存储结构。

3、链式存储结构

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211106120401.png)

- 把数据元素存放在任意的存储单元里面，这组存储单元可以是连续的也可以是不连续的。此时，数据元素之间并不能反映元素间的逻辑关系，因此在链式存储结构中引进了一个指针存放数据元素的地址，这样通过地址就可以找到相关联数据元素的位置。

#### 1.2.3 常见的数据结构

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211106140436.png" style="zoom: 67%;" />	

### 1.3 什么是算法

#### 1.3.1 基本概念

1、基本介绍

算法（Algorithm）是指解题方案的准确而完整的描述，是一系列解决问题的清晰指令，算法代表着用系统的方法描述解决问题的策略机制。
一句话描述：算法是一种解决特定问题的思路。比如：LRU算法，最近最少使用，解决的就是当空间不够用时，应该淘汰谁的问题，这是一种策略，不
是唯一的答案，所以算法无对错，只有好和不好。

2、大白话

==根据一定的条件，对一些数据进行计算，得到需要的结果。==

#### 1.3.2 常见算法

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211106141953.png" style="zoom: 67%;" />	

#### 1.3.3 算法初体验

在生活中，遇到某个问题，常常解决方案不是唯一的。例如从广州到深圳，如何去？会有不同的解决方案，我们可以开车，可以坐高铁，可以坐动车，甚至可以步行，不同的解决方案带来的时间成本和金钱成本是不一样的，比如坐高铁用的时间最少，但是费用最高，步行费用最低，但时间最长。

在程序中，也可以用不同的算法解决相同的问题，而不同的算法的成本也是不相同的。总体上，一个优秀的算法追求以下两个目标：

- 花最少的时间完成需求。
- 占用最少的内存空间完成需求。

1、案例需求1：计算`1`到`100`的和。

方案一：解法要完成需求，要完成以下几个步骤：

- 定义两个整型变量
- 执行`100`次加法运算
- 打印结果到控制台

```java
package cn.guardwhy.demo01;

public class SumDemo01 {
    public static void main(String[] args) {
        int sum = 0;
        int n=100;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("sum=" + sum); // sum=5050
    }
}
```

方案二：要完成需求，要完成以下几个步骤

- 定义两个整型变量。
- 执行`1`次加法运算，`1`次乘法运算，一次除法运算，总共`3`次运算。
- 打印结果到控制台。

```java
package cn.guardwhy.demo01;

public class SumDemo01 {
    public static void main(String[] args) {
        int sum = 0;
        int n=100;
        sum = (n+1)*n/2;
        System.out.println("sum="+sum); // sum=5050
    }
}
```

==很明显，第二种算法完成需求，花费的时间更少一些==。

2、需求2：计算10的阶乘

方案一：解法要完成需求，要完成以下几个步骤：

- 使用递归完成需求，`funMethod()`方法会执行`10`次，并且第一次执行未完毕，调用第二次执行，第二次执行未完毕，调用第三次执行
- 最终，最多的时候，需要在栈内存同时开辟`10`块内存分别执行`10`个`funMwthod()`方法。

```java
package cn.guardwhy.demo01;

public class Test {
    public static void main(String[] args) {
        //计算10的阶乘
        long result = funMethod(10);
        System.out.println("result结果:" + result); // result结果:3628800
    }
    //计算n的阶乘
    public static long funMethod(long n){
        if (n==1){
            return 1;
        }
        return n * funMethod(n-1);
    }
}
```

方案二：要完成需求，要完成以下几个步骤

- 使用for循环完成需求，`funMethod()`方法只会执行一次，最终，只需要在栈内存开辟一块内存执行`funMethod()`方法即可。
- 很明显，第==二种算法完成需求，占用的内存空间更小==。

```java
package cn.guardwhy.demo01;

public class Test {
    public static void main(String[] args) {
        //测试，计算10的阶乘
        long result = funMethod(10);
        System.out.println("result:" + result); // result:3628800
    }
    //计算n的阶乘
    public static long funMethod(long n){
        int result=1;
        for (long i = 1; i <= n; i++) {
            result*=i;
        }
        return result;
    }
}
```

### 1.4 算法复杂度

数据结构和算法本质上是==”快“和"省=="。所以代码的执行效率是非常重要的度量，通常采用==时间复杂度==和==空间复杂度==来计算。

#### 1.4.1 时间复杂度

##### 1.4.1.1 大O复杂度表示法

1、基本定义

在进行算法分析时，语句总的执行次数`T(n)`是关于问题规模`n`的函数，进而分析`T(n)`随着`n`的变化情况并确定`T(n)`的量级。==算法的时间复杂度，就是算法的时间量度==，记作:`T(n)=O(f(n))`。它表示随着问题规模`n`的增大，算法执行时间的增长率和`f(n)`的增长率相同，称作算法的渐近时间复杂度，简称时间复杂度，其中`f(n)`是问题规模`n`的某个函数。

在这里，需要明确一个事情：执行次数=执行时间用大写`O()`来体现算法时间复杂度的记法，称之为大`O`记法。一般情况下，随着输入规模`n`的增大，`T(n)`增长最慢的算法为最优算法。

2、使用大`O`表示法来表示一些求和算法的时间复杂度

算法实现一

```java
package cn.guardwhy.demo01;

public class SumDemo01 {
    public static void main(String[] args) {
        int sum = 0;//执行1次
        int n=100;//执行1次
        sum = (n+1)*n/2;//执行1次
        System.out.println("sum="+sum);
    }
}
```

算法实现二

```java
package cn.guardwhy.demo01;

public class SumDemo01 {
    public static void main(String[] args) {
        int sum = 0;//执行1次
        int n=100;//执行1次
        for (int i = 1; i <= n; i++) {
            sum += i;//执行了n次
        }
        System.out.println("sum=" + sum);
    }
}
```

算法实现三

```java
package cn.guardwhy.demo01;

public class SumDemo01 {
    public static void main(String[] args) {
        int sum=0;//执行1次
        int n=100;//执行1次
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n ; j++) {
                sum+=i;//执行n^2次
            }
        }
        System.out.println("sum="+sum);
    }
}
```

4、小结

如果忽略判断条件的执行次数和输出语句的执行次数，那么当输入规模为`n`时，以上算法执行的次数分别为：

```css
算法实现一：3次
算法实现二：n+2次
算法实现三：n^2+2次
```

如果用大O记法表示上述每个算法的时间复杂度，推导大`O`阶的表示法有以下几个规则可以使用

- 用常数`1`取代运行时间中的所有加法常数。
- 在修改后的运行次数中，只保留高阶项。
- 如果最高阶项存在，且常数因子不为`1`，则去除与这个项相乘的常数。

所以，最终上述算法的大`O`记法分别为

```css
算法一：O(1)
算法二：O(n)
算法三：O(n^2)
```

##### 1.4.1.2 常见的大O阶

1、线性阶

- 一般含有非嵌套循环涉及线性阶，线性阶就是随着输入规模的扩大，对应计算次数呈直线增长。
- 下面这段代码，它的循环的时间复杂度为==O(n)==,因为循环体中的代码需要执行`n`次。

```java
package cn.guardwhy.demo01;

public class TestDemo01 {
    public static void main(String[] args) {
        int sum = 0;
        int n=100;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("sum=" + sum);
    }
}
```

2、平方阶

- 一般嵌套循环属于这种时间复杂度。
- 下面这段代码，`n=100`，也就是说外层循环每执行一次，内层循环就执行`100`次，那总共程序想要从这两个循环中出来，就需要执行`100 * 100`次，也就是`n`的平方次，所以这段代码的时间复杂度是==O(n^2)==。

```java
package cn.guardwhy.demo01;

public class Test {
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
```

3、立方阶

- 一般三层嵌套循环属于这种时间复杂度
- 下面这段代码`n=100`也就是说，外层循环每执行一次，中间循环循环就执行`100`次，中间循环每执行一次，最内层循环需要执行`100`次，那总共程序想要从这三个循环中出来，就需要执行`100 * 100 * 100`次，也就是`n`的立方，所以这段代码的时间复杂度是==O(n^3)==。

```java
package cn.guardwhy.demo01;

public class TestDemo01 {
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
```

4、对数阶

由于每次`i*2`之后，就距离`n`更近一步，假设有`x`个`2`相乘后大于`n`，则会退出循环。由于是`2^x=n`,得到`x=log(2)n`,所以这个循环的时间复杂度为==O(logn)==

```java
package cn.guardwhy.demo01;

public class SumDemo01 {
    public static void main(String[] args) {
        int i=1, n=100, sum = 0;
        while (i <= n){
            sum += i;
            i = i * 2;
        }

        System.out.println(sum); // 127
    }
}
```

注意事项：对于对数阶，由于随着输入规模`n`的增大，==不管底数为多少，它们的增长趋势是一样的，所以会忽略底数==。

5、常数阶

- 一般不涉及循环操作的都是常数阶，因为它不会随着`n`的增长而增加操作次数。
- 下面代码不管输入规模`n`是多少，都执行`2`次，根据大`O`推导法则，常数用`1`来替换，所以下属代码的时间复杂度为`O(1)`

```java
package cn.guardwhy.demo01;

public class SumDemo01 {
    public static void main(String[] args) {
        int n=100;
        int i=n+2;
        System.out.println(i);
    }
}
```

6、常见时间复杂度的总结

| 描述         | 增长的数量级 | 说明     | 举例           |
| ------------ | ------------ | -------- | -------------- |
| 常数级别     | `1 `         | 普通语句 | 将两个数相加   |
| 对数级别     | `logN`       | 二分策略 | 二分查找       |
| 线性级别     | ` N`         | 循环     | 找出最大元素   |
| 线型对数级别 | `NlogN`      | 分治思想 | 归并排序       |
| 平方级别     | `N^2`        | 双层循环 | 检查所有元素对 |
| 立方级别     | `N^3 `       | 三层循环 | 检查所有三元组 |
| 指数级别     | `2^N`        | 穷举查找 | 检查所有子集   |

它们的复杂程度从低到高依次为：`O(1)<O(logn)<O(n)<O(nlogn)<O(n^2)<O(n^3)`从平方阶开始，随着输入规模的增大，时间成本会急剧增大，我们的算法，尽可能的追求的是`O(1),O(logn),O(n),O(nlogn)`这几种时间复杂度，而如果发现算法的时间复杂度为平方阶、立方阶或者更复杂的。这种算法是不可取的，需要优化。

##### 1.4.1.3 函数调用时间复杂度

1、案例实现一

- 在`main`方法中，有一个`for`循环，循环体调用了`show`方法，由于`show`方法内部只执行了一行代码，所以`show`方法的时间复杂度为`O(1)`。
- `main`方法的时间复杂度就是==O(n)==。

```java
package cn.guardwhy.demo02;

public class AlgorithmTest01 {
    public static void main(String[] args) {
        // 定义变量
        int n = 100;
        for (int i = 0; i < n; i++) {
            // 调用show()方法
            show(i);
        }
    }

    // 声明show()方法
    private static void show(int i) {
        System.out.println(i);
    }
}
```

2、案例实现二

- 在`main`方法中，有一个`for`循环，循环体调用了`show`方法，由于`show`方法内部也有一个`for`循环，所以`show`方法的时间复杂度为`O(n)`
- 那`main`方法的时间复杂度为==O(n^2)==。

```java
package cn.guardwhy.demo02;

public class AlgorithmTest01 {
    public static void main(String[] args) {
        int n = 100;
        for (int i = 0; i < n; i++) {
            show(i);
        }
    }
    private static void show(int i) {
        for (int j = 0; j < i; i++) {
            System.out.println(i);
        }
    }
}
```

3、案例实现三

- 在`show`方法中，有一个`for`循环所以`show`方法的时间复杂度为`O(n)`,在`main`方法中，`show(n)`这行代码内部执行的次数为`n`，第一个`for`循环内调用了`show`方法，所以其执行次数为`n^2`,第二个嵌套`for`循环内只执行了一行代码，所以其执行次数为`n^2`,那么`main`方法总执行次数为`n+n^2+n^2=2n^2+n`。
- 根据`大O`推导规则，去掉`n`保留最高阶项，并去掉最高阶项的常数因子`2`，所以最终`main`方法的时间复杂度为==O(n^2)==。

```java
package cn.guardwhy.demo02;

public class AlgorithmTest01 {
    public static void main(String[] args) {
        int n=100;
        show(n);
        for (int i = 0; i < n; i++) {
            show(i);
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(j);
            }
        }
    }
    private static void show(int i) {
        for (int j = 0; j < i; i++) {
            System.out.println(i);
        }
    }
}
```

##### 1.4.1.4 最坏情况

从心理学角度讲，每个人对发生的事情都会有一个预期，比如看到半杯水，有人会说：哇哦，还有半杯水哦！但也有人会说：天哪，只有半杯水了。一般人处于一种对未来失败的担忧，而在预期的时候趋向做最坏的打算，这样即使最糟糕的结果出现，当事人也有了心理准备，比较容易接受结果。假如最糟糕的结果并没有出现，当事人会很快乐。

算法分析也是类似，假如有一个需求:有一个存储了n个随机数字的数组，请从中查找出指定的数字。

```java
package cn.guardwhy.demo02;

import java.util.Scanner;

public class AlgorithmTest01 {
    public static void main(String[] args) {
        int[] arr={11,10,8,9,7,22,23,0};
        System.out.println("请输入要查找的元素:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        // 调用方法
        int index = searchArray(num, arr);
        System.out.println("索引:" + index);
    }

    public static int  searchArray(int num, int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if (num==arr[i]){
                return i;
            }
        }
        return -1;
    }
}
```

1、最好情况：

- 查找的第一个数字就是期望的数字，那么算法的时间复杂度为`O(1)`

2、最坏情况：

- 查找的最后一个数字，才是期望的数字，那么算法的时间复杂度为`O(n)`

3、平均情况：

- 任何数字查找的平均成本是`O(n/2)`，最坏情况是一种保证，在应用中这是一种最基本的保障，即使在最坏情况下，也能够正常提供服务，除非
  特别指定，我们提到的运行时间都指的是最坏情况下的运行时间。

####  1.4.2 空间复杂度

空间复杂度全称是渐进空间复杂度，表示算法的存储空间与数据规模之间的增长关系，比如将一个数组拷贝到另一个数组中，就是相当于空间扩大了一倍。

##### 1.4.2.1 内存占用情况

1、基本数据类型内存占用情况

| 数据类型  | 内存占用字节数 |
| --------- | -------------- |
| `byte `   | `1`            |
| `short `  | `2`            |
| `int `    | `4`            |
| `long `   | `8`            |
| `float `  | `4`            |
| `double ` | `8`            |
| `boolean` | `1`            |
| `char `   | `2`            |

2、计算机访问内存的方式都是一次一个字节。

3、==一个引用（机器地址）需要`8`个字节表示==。

```java
Student stu = new Student();// stu这个变量需要占用8个字节来表示
```

4、创建一个对象，比如`new Student()`，除了`Student`对象内部存储的数据占用的内存，该对象本身也有内存开销，每个对象的自身开销是`16`个字节，==用来保存对象的头信息==。

5、一般内存的使用，如果不够`8`个字节，都会被自动填充为`8`字节

```java
package cn.guardwhy.demo02;
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
```

6、`java` 中数组被被限定为对象，他们一般都会因为记录长度而需要额外的内存，一个原始数据类型的数组一般需要`24`字节的头信息(`16`个自己的对象开销，`4`字节用于保存长度以及`4`个填充字节)再加上保存值所需的内存。

##### 1.4.2.2 算法的空间复杂度

算法的空间复杂度计算公式记作：`S(n)=O(f(n))`,其中`n`为输入规模，`f(n)`为语句关于`n`所占存储空间的函数。

案例需求：对指定的数组元素进行反转，并返回反转的内容。

1、算法实现一

- 忽略判断条件占用的内存，得出的内存占用情况如下，不管传入的数组大小为多少，始终额外申请`4+4=8`个字节

```java
package cn.guardwhy.demo02;

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
```

2、执行结果

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211107100932.png" style="zoom:80%;" />	

3、算法实现二

- 不管传入的数组大小为多少，始终额外申请`4+4n+24=4n+28`，根据大`O`推导法则，算法一的空间复杂度为`O(1)`,算法二的空间复杂度为`O(n)`。
- 所以从空间占用的角度讲，算法一要优于算法二。

```java
package cn.guardwhy.demo02;

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
```

4、执行结果

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211107100734.png" style="zoom: 80%;" />	

## 第2章 排序算法

在生活中，我们离不开排序，按大小个、按成绩，在计算机中也离不开排序：按编号、按价格、按远近，如下图的电脑价格

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211107104842.png" style="zoom: 67%;" />	

根据时间复杂度的不同，主流的排序算法可以分为`4`大类

1、时间复杂度为`O(n^2)`的排序算法

- 冒泡排序、选择排序、插入排序、希尔排序

2、时间复杂度为`O(nlogn)`的排序算法

- 快速排序 、归并排序、堆排序

3、时间复杂度为线性的排序算法

- 计数排序、桶排序、基数排序

3、根据其稳定性，可以分为稳定排序和不稳定排序

- **稳定排序**：值相同的元素在排序后仍然保持着排序前的顺序。
- **不稳定排序**：值相同的元素在排序后打乱了排序前的顺序。

### 2.1 冒泡排序

#### 2.1.1 基本介绍

冒泡排序是最基础的排序算法，冒泡排序的英文是`bubble sort`，它是一种基础的交换排序，冒泡排序这种排序算法的每一个元素都可以像小气泡一样，根据自身大小，一点一点地向着数组的一侧移动。	

#### 2.1.2 排序原理

1、比较相邻的元素。如果前一个元素比后一个元素大，就交换这两个元素的位置。==按照冒泡排序的思想，要把相邻的元素两两比较，当一个元素大于右侧相邻元素时，交换它们的位置。当一个元素小于或等于右侧相邻元素时，位置不变==。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211107113812.png" style="zoom: 67%;" />	

2、经过第一轮后：元素9作为数列中最大的元素，就像是汽水里的小气泡一样，==“漂”到了最右侧==

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211107111939.png" style="zoom:80%;" />	

3、每一轮结束都会有一个元素被移到最右侧

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211107130934.png" style="zoom:80%;" />



4、对每一对相邻元素做同样的工作，从开始第一对元素到结尾的最后一对元素。最终最后位置的元素就是最大值。

#### 2.1.3 代码实现

1、冒泡排序实现

```java
package cn.bubble.demo01;

import java.util.Arrays;

public class BubbleDemo01 {
    public static void main(String[] args) {
        int[] arr = {11, 10, 8, 9, 7, 22, 23, 0};
        System.out.println("排序前:" + Arrays.toString(arr));

        for(int i = 0; i <  arr.length - 1; i++){
              for(int j = 0; j <  arr.length - 1; j++){
                //临时变量 用于交换
                int tmp = 0;
                if( arr[j] >  arr[j+1]){
                  tmp =  arr[j];
                   arr[j] =  arr[j+1];
                   arr[j+1] = tmp;
               }
             }
           }
        System.out.println("排序后:" + Arrays.toString(arr));
    }
}
```

2、执行结果

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211107134130.png)	

3、冒泡排序的优化实现

第6轮已经可以结束了，也就是如果不需要交换了，则说明已经排好序了

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211107134701.png" style="zoom:80%;" />	

思路：在外层循环外，设置标志`flag`，默认为排好，如果不交换则跳出本次循环内层循环优化，已经被移到右侧的元素不用再参与比较了。

4、冒泡排序实现【优化后代码】

```java
package cn.bubble.demo01;

import java.util.Arrays;

public class BubbleDemo02 {
    public static void main(String[] args) {
        // 1.1 创建数组
        int[] arr ={11, 10, 8, 9, 7, 22, 23, 0};
        System.out.println("排序前:" + Arrays.toString(arr));
        
        // 1.2 创建方法
        bubbleSort(arr);
        System.out.println("排序后:" + Arrays.toString(arr));

    }
    
    // 2.1 将前面额冒泡排序算法，封装成一个方法，调用方法
    public static void bubbleSort(int[] arr) {
        // 2.2 临时变量
        int temp = 0;
        //2.3 标识变量，表示是否进行过交换
        boolean flag = false; 
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                //2.4 如果前面的数比后面的数大，则交换
                if (arr[j] > arr[j + 1]) {
                    flag = true;
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            //2.4 在一趟排序中，一次交换都没有发生过
            if (!flag) { 
                break;
            } else {
                //2.5 重置flag!!!, 进行下次判断
                flag = false;
            }
        }
    }
}
```

#### 2.1.4 时间复杂度分析

冒泡排序使用了双层`for`循环，其中内层循环的循环体是真正完成排序的代码，分析冒泡排序的时间复杂度，主要分析一下内层循环体的执行次数即可。

- 元素比较的次数为

```java
(N-1)+(N-2)+(N-3)+...+2+1=((N-1)+1)*(N-1)/2=N^2/2-N/2
```

- 元素交换的次数为

```java
(N-1)+(N-2)+(N-3)+...+2+1=((N-1)+1)*(N-1)/2=N^2/2-N/2
```

- 总执行次数为

```java
(N^2/2-N/2)+(N^2/2-N/2)=N^2-N
```

按照大`O`推导法则，保留函数中的最高阶项那么最终冒泡排序的时间复杂度为==O(N^2)==

### 2.2 选择排序

选择排序是一种更加简单直观的排序方法，用到它的时候，数据规模越小越好。唯一的好处可能就是不占用额外的内存空间了吧

#### 2.2.1 排序原理

1、每一次遍历的过程中，==都假定第一个索引处的元素是最小值，和其他索引处的值依次进行比较，如果当前索引处的值大于其他某个索引处的值，则假定其他某个索引出的值为最小值，最后可以找到最小值所在的索引==。

2、交换第一个索引处和最小值所在的索引处的值。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211107161918.png" style="zoom: 67%;" />	

#### 2.2.2 代码示例

1、选择排序代码实现

```java
package cn.selectsort.demo01;

import java.util.Arrays;

public class SelectSortDemo01 {
    public static void main(String[] args) {
        //1.1 创建数组
        int[] arr = {4, 6, 8, 7, 9, 2, 10, 1};
        System.out.println("排序前:" + Arrays.toString(arr));

        // 1.2 调用selectSort()方法
        selectSort(arr);
        System.out.println("排序后:" + Arrays.toString(arr));

    }

    // 2.1 创建selectSort()方法
    public static void selectSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            // 2.2 假定本次遍历，最小值所在的索引是i
            int minIndex = i;
            int min = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                // 2.3 假定的最小值，并不是最小
                if (min > arr[j]) {
                    // 2.4 重置min
                    min = arr[j];
                    //2.5 跟换最小值所在的索引
                    minIndex = j;
                }
            }
            // 2.6 将最小值，放在arr[0], 即交换
            if (minIndex != i) {
                arr[minIndex] = arr[i];
                arr[i] = min;
            }
        }
    }
}
```

#### 2.2.3 时间复杂度分析

选择排序使用了双层`for`循环，其中外层循环完成了数据交换，内层循环完成了数据比较，所以分别统计数据交换次数和数据比较次数

- 数据比较次数

```css
(N-1)+(N-2)+(N-3)+...+2+1=((N-1)+1)*(N-1)/2=N^2/2-N/2;
```

- 数据交换次数

```css
N-1
```

时间复杂度

```css
N^2/2-N/2+（N-1）=N^2/2+N/2-1
```

根据大`O`推导法则，保留最高阶项，去除常数因子，时间复杂度为==O(N^2)==

### 2.3 插入排序

#### 2.3.1 基本介绍

插入排序的代码实现虽然没有冒泡排序和选择排序那么简单粗暴，但它的原理应该是最容易理解的了，因为只要打过扑克牌的人都应该能够秒懂。插入排序是一种最简单直观的排序算法，它的工作原理是通过构建有序序列，对于未排序数据，在已排序序列中从后向前扫描，找到相应位置并插入。

插入排序和冒泡排序一样，也有一种优化算法，叫做拆半插入。

#### 2.3.2 排序原理

1、把所有的元素分为两组，==已经排序的和未排序的==。

2、找到未排序的组中的第一个元素，向已经排序的组中进行插入。

3、逆序遍历已经排序的元素，依次和待插入的元素进行比较直到找到一个元素小于等于待插入元素，就把待插入元素放到这个位置，其他的元素向后移动一位。

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211107195621.png)

#### 2.3.3 代码示例

1、插入排序代码实现

```java
package cn.insertsort.demo01;

import java.util.Arrays;

public class InsertSortDemo01 {
    public static void main(String[] args) {
        //1.1 创建数组
        int[] arr = {4, 3, 2, 10, 12, 1, 5, 6};
        System.out.println("排序前(插入排序):" + Arrays.toString(arr));

        // 1.2 调用selectSort()方法
        insertSort(arr);
        System.out.println("排序后(插入排序):" + Arrays.toString(arr));
    }

    private static void insertSort(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            //2.1 定义待插入的数
            int insertVal = arr[i];
            //2.2 定义待插入的数的索引
            int insertIndex = i - 1;

            /**
             * 2.3 给insertVal找到插入的位置
             * insertIndex >= 0 保证在给insertVal找插入位置，不越界
             * insertVal < arr[insertIndex] 待插入的数，还没有找到插入位置,就需要将arr[insertIndex]后移
             */

           /*
           while (insertIndex >= 0 && insertVal < arr[insertIndex]) {
                // 2.4 数据移动
                arr[insertIndex + 1] = arr[insertIndex];
                insertIndex--;
            }*/

            // 2.3 查找插入的位置
            for(; insertIndex >= 0; --insertIndex){
                if(arr[insertIndex] > insertVal){
                    // 2.4 数据移动
                    arr[insertIndex + 1] = arr[insertIndex];
                }else {
                    break;
                }
            }

            // 2.5 当退出while循环时，说明插入的位置找到insertIndex + 1
            if (insertIndex + 1 != i) {
                // 2.6 插入数据
                arr[insertIndex + 1] = insertVal;
            }
        }
    }
}
```

2、执行结果

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211108113525.png" style="zoom:80%;" />	

#### 2.3.4 时间复杂度分析

插入排序使用了双层`for`循环，其中内层循环的循环体是真正完成排序的代码，分析插入排序的时间复杂度，主要分析一下内层循环体的执行次数即可。

- 比较的次数为

```css
(N-1)+(N-2)+(N-3)+...+2+1=((N-1)+1)*(N-1)/2=N^2/2-N/2
```

- 交换的次数为

```css
(N-1)+(N-2)+(N-3)+...+2+1=((N-1)+1)*(N-1)/2=N^2/2-N/2
```

- 总执行次数为

```css
(N^2/2-N/2)+(N^2/2-N/2)=N^2-N
```


按照大`O`推导法则，保留函数中的最高阶项那么最终插入排序的时间复杂度为==O(N^2)==。

### 2.4 希尔排序

#### 2.4.1 基本介绍

1、希尔排序是希尔`(Donald Shell)`于 1959 年提出的一种排序算法。希尔排序也是一种插入排序，它是简单插入排序经过改进之后的一个更高效的版本，也称为缩小增量排序。希尔排序，也称递减增量排序算法，是插入排序的一种更高效的改进版本。==但希尔排序是非稳定排序算法==。

2、希尔排序是基于插入排序的以下两点性质而提出改进方法的：

- 插入排序在对几乎已经排好序的数据操作时，效率高，即可以达到线性排序的效率。
- 但插入排序一般来说是低效的，因为插入排序每次只能将数据移动一位。

#### 2.4.2 排序原理

1、原始数组，以下数据元素颜色相同为一组。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211108122106.png" style="zoom:67%;" />	

2、初始增量`gap=length/2=5`,意味着整个数组被分为`5`组，`[8,3], [9,5],[1,4],[7,6],[2,0]`

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211108150602.png" style="zoom:80%;" />	

3、对这`5`组分别进行直接插入排序，像`3, 5, 6`这些小元素都被调到前面了，然后缩小增量`gap=5/2=2`,数组被分为`2`组`[3,1,0,9,7],[5,6,8,4,2]`。

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211108153412.png)

4、对以上`2`组再分别进行直接插入排序，此时整个数组的有序程度更进一步，再缩小增量`gap=2/2=1`，整个数组为`1`组`[0,2,1,4,3,5,7,6,9,8]`。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211108154016.png" style="zoom:80%;" />	

5、经过上面的“宏观调控",整个数组的有序化程度成果喜人，仅仅需要对以上数列简单微调，无需大量移动操作即可完成整个数组的排序。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211108160522.png" style="zoom:80%;" />	

#### 2.4.3 代码示例

1、有序序列在插入时==采用交换法==

```java
package cn.shellsort.demo01;

import java.util.Arrays;

public class ShellSortDemo01 {
    public static void main(String[] args) {
        //1.1 创建数组
        int[] arr = { 8, 9, 1, 7, 2, 3, 5, 4, 6, 0 };
        System.out.println("排序前(希尔排序):" + Arrays.toString(arr));

        // 1.2 调用selectSort()方法
        shellSort(arr);
        System.out.println("排序后(希尔排序):" + Arrays.toString(arr));
    }

    // 2.1 创建shellSort()方法
    private static void shellSort(int[] arr) {
        // 2.2 定义临时变量temp
        int temp = 0;
        for (int gap = arr.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < arr.length; i++) {
                // 2.3 遍历各组中所有的元素(共gap组，每组有个元素), 步长gap
                for (int j = i - gap; j >= 0; j -= gap) {
                    // 2.4 如果当前元素大于加上步长后的那个元素，说明交换
                    if (arr[j] > arr[j + gap]) {
                        temp = arr[j];
                        arr[j] = arr[j + gap];
                        arr[j + gap] = temp;
                    }
                }
            }
        }
    }
}

```

2、执行结果

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211108162525.png" style="zoom:80%;" />	

3、有序序列在插入时==采用移动法==

```java
package cn.shellsort.demo01;

import java.util.Arrays;

public class ShellSortDemo01 {
    public static void main(String[] args) {
        //1.1 创建数组
        int[] arr = { 8, 9, 1, 7, 2, 3, 5, 4, 6, 0 };
        System.out.println("排序前(希尔排序):" + Arrays.toString(arr));

        // 1.2 调用selectSort()方法
        shellSort(arr);
        System.out.println("排序后(希尔排序):" + Arrays.toString(arr));
    }

    // 2.1 创建shellSort()方法
    private static void shellSort(int[] arr) {
        // 2.2 增量gap,并逐步的缩小增量
        for (int gap = arr.length / 2; gap > 0; gap /= 2) {
            // 2.3 从第gap个元素，逐个对其所在的组进行直接插入排序
            for (int i = gap; i < arr.length; i++) {
                int j = i;
                int temp = arr[j];
                if (arr[j] < arr[j - gap]) {
                    while (j - gap >= 0 && temp < arr[j - gap]) {
                        //移动
                        arr[j] = arr[j-gap];
                        j -= gap;
                    }
                    //当退出while后，就给temp找到插入的位置
                    arr[j] = temp;
                }
            }
        }
    }
}
```

4、执行结果

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211108162525.png" style="zoom:80%;" />	

#### 2.4.4 结论

希尔排序基本思想是先将整个待排序的记录序列分割成为若干子序列分别进行直接插入排序，待整个序列中的记录"基本有序"时，再对全体记录进行依次直接插入排序。通过测试发现，==在处理大批量数据时，希尔排序的性能确实高于插入排序==。

### 2.5 快速排序

#### 2.5.1 基本介绍

快速排序是对冒泡排序的一种改进，它的基本思想是：通过一趟排序将要排序的数据分割成独立的两部分，其中一部分的所有数据都比另外一部分的所有数据都要小，然后再按此方法对这两部分数据分别进行快速排序，整个排序过程可以递归进行，以此达到整个数据变成有序序列。

#### 2.5.2 排序原理

1、首先设定一个分界值，通过该分界值将数组分成左右两部分。

2、将大于或等于分界值的数据放到到数组右边，小于分界值的数据放到数组的左边。此时左边部分中各元素都小于或等于分界值，而右边部分中各元素都大于或等于分界值。

3、然后，左边和右边的数据可以独立排序。对于左侧的数组数据，又可以取一个分界值，将该部分数据分成左右两部分，同样在左边放置较小值，右边放置较大值。右侧的数组数据也可以做类似处理。

4、重复上述过程，可以看出，这是一个递归定义。通过递归将左侧部分排好序后，再递归排好右侧部分的顺序。当左侧和右侧两个部分的数据排完序后，整个数组的排序也就完成了。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211109095129.png" style="zoom: 67%;" />	

#### 2.5.3 代码示例

1、快速排序代码实现

```java
package cn.quicksort.demo01;

import java.util.Arrays;

public class QuickSortDemo03 {
    public static void main(String[] args) {
        int[] arr= {6, 1, 2, 7, 9, 3, 4, 5, 8};
        System.out.println("排序前(快速排序):" + Arrays.toString(arr));
        quickSort(arr,0,arr.length-1);

        System.out.println("排序后(快速排序):" + Arrays.toString(arr));
    }
    public static void quickSort(int[] arr,int left, int right) {
        //1.1 左下标
        int start = left;
        //1.2 右下标
        int end = right;
        //1.3 pivot 中轴值
        int pivot = arr[(left + right) / 2];
        //1.4 临时变量，作为交换时使用
        int temp = 0;

        //1.5 while循环的目的是让，比pivot值小放到左边，比pivot值大放到右边
        while( start < end) {
            //1.6 在pivot的左边一直找,找到大于等于pivot值,才退出
            while( arr[start] < pivot) {
                start += 1;
            }
            //1.7 在pivot的右边一直找,找到小于等于pivot值,才退出
            while(arr[end] > pivot) {
                end -= 1;
            }
            //1.8 如果start >= end说明pivot的左右两的值，已经按照左边全部是小于等于pivot值，右边全部是大于等于pivot值
            if( start >= end) {
                break;
            }

            //1.9 交换数组元素
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            //1.10 如果交换完后，发现这个arr[start] == pivot值 相等 end--， 前移
            if(arr[start] == pivot) {
                end -= 1;
            }
            //1.11 如果交换完后，发现这个arr[end] == pivot值 相等 start++， 后移
            if(arr[end] == pivot) {
                start += 1;
            }
        }
        // 1.12 如果start == end, 必须start++, end--, 否则为出现栈溢出
        if (start == end) {
            start += 1;
            end -= 1;
        }
        //1.13 向左递归
        if(left < end) {
            quickSort(arr, left, end);
        }
        //1.14 向右递归
        if(right > start) {
            quickSort(arr, start, right);
        }
    }
}
```

2、执行结果

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211109101540.png" style="zoom:80%;" />	

#### 2.5.4 时间复杂度分析

快速排序的一次切分从两头开始交替搜索，直到`left`和`right`重合，因此，一次切分算法的时间复杂度为==O(n)==,但整个快速排序的时间复杂度和切分的次数相关。
1、最优情况

- ==每一次切分选择的基准数字刚好将当前序列等分==。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211109103050.png" style="zoom:67%;" />	

如果把数组的切分看做是一个树，那么上图就是它的最优情况的图示，共切分了`logn`次，所以，最优情况下快速排序的时间复杂度为==O(nlogn)==

2、最坏情况

- 每一次切分选择的基准数字是当前序列中最大数或者最小数，这使得每次切分都会有一个子组，那么总共就得切分`n`次。
- 最坏情况下，快速排序的时间复杂度为==O(n^2)==

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211109104552.png" style="zoom: 67%;" />	

3、平均情况

每一次切分选择的基准数字不是最大值和最小值，也不是中值，这种情况可以用数学归纳法证明，快速排序的时间复杂度为==O(nlogn)==。

### 2.6 归并排序

#### 2.6.1 基本介绍

归并排序是建立在归并操作上的一种有效的排序算法，==该算法是采用分治法的一个非常典型的应用==。将已有序的子序列合并，得到完全有序的序列；即先使每个子序列有序，再使子序列段间有序。若将两个有序表合并成一个有序表，称为二路归并。

#### 2.6.2 排序原理

1、【分阶段】

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211109162251.png" style="zoom: 67%;" />	

- 尽可能的一组数据拆分成两个元素相等的子组，并对每一个子组继续拆分，直到拆分后的每个子组的元素个数是1为止。
- 将相邻的两个子组进行合并成一个有序的大组。
- 不断的重复步骤2，直到最终只有一个组为止。

2、【治阶段】

将两个已经有序的子序列`【4, 5, 7, 8】【1, 2, 3, 6】`合并成一个有序序列。

`1< 4` ,把`1`填充到`temp`数组中，向右移动指针`j`。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211109165619.png" style="zoom: 67%;" />	

`2<4`，将`2`继续填入`temp`数组，向右移动指针`j`

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211109191609.png" style="zoom:67%;" />	

`3<4`，将`3`继续填入`temp`数组，向右移动指针`j`

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211109192742.png" style="zoom:80%;" />	

`4<6`，此时将`4`填入temp数组，向右移动指针`i`

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211109203756.png" style="zoom:67%;" />	

继续重复这种比较+填入的步骤，直到右子序列已经填完，这时将左边剩余的`7`和`8`依次填入。

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211109204837.png)

最后，将`temp`中的内容全部拷到原数组中去，排序完成。

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211109210129.png)

#### 2.6.3 代码示例

1、归并排序代码示例

```java
package cn.mergetsort.demo01;

import java.util.Arrays;

public class MergetSortDemo01 {
    public static void main(String[] args) {
        //1.1 创建数组
        int array[] = { 8, 4, 5, 7, 1, 3, 6, 2 };
        System.out.println("排序前(归并排序):" + Arrays.toString(array));

        //1.2 创建一个temp数组，
        int temp[] = new int[array.length];

        // 1.3 调用mergeSort()方法
        mergeSort(array, 0, array.length - 1, temp);
        System.out.println("排序后(归并排序):" + Arrays.toString(array));
    }

    //2 分阶段 + 治阶段
    public static void mergeSort(int[] array, int left, int right, int[] temp) {
        if(left < right) {
            //2.2 中间索引
            int mid = (left + right) / 2;
            //2.3 向左递归进行分解
            mergeSort(array, left, mid, temp);
            //2.4 向右递归进行分解
            mergeSort(array, mid + 1, right, temp);
            //2.5 调用合并方法
            merge(array, left, mid, right, temp);
        }
    }

    /**
     *
     * @param array 排序的原始数组
     * @param left 左边有序序列的初始索引
     * @param mid 中间索引
     * @param right 右边索引
     * @param temp 做中转的数组
     */

    // 3 创建合并的方法merge
    public static void merge(int[] array, int left, int mid, int right, int[] temp) {
        // 3.1 初始化i, 左边有序序列的初始索引
        int i = left;
        //3.2 初始化j, 右边有序序列的初始索引
        int j = mid + 1;
        // 3.3 指向temp数组的当前索引
        int t = 0;

        // 3.4 先把左右两边(有序)的数据按照规则填充到temp数组,直到左右两边的有序序列，有一边处理完毕为止
        while (i <= mid && j <= right) {
            /**
             * 3.5 如果左边的有序序列的当前元素，小于等于右边有序序列的当前元素
             * 即将左边的当前元素，填充到 temp数组,然后 t++, i++
             */
            if(array[i] <= array[j]) {
                temp[t] = array[i];
                t += 1;
                i += 1;
            } else {
                // 将右边有序序列的当前元素，填充到temp数组
                temp[t] = array[j];
                t += 1;
                j += 1;
            }
        }

        //3.6 把有剩余数据的一边的数据依次全部填充到temp
        while( i <= mid) {
            // 3.7 左边的有序序列还有剩余的元素，就全部填充到temp
            temp[t] = array[i];
            t += 1;
            i += 1;
        }

        //3.8 右边的有序序列还有剩余的元素，就全部填充到temp
        while( j <= right) {
            temp[t] = array[j];
            t += 1;
            j += 1;
        }

        /**
         * 3.9 将temp数组的元素拷贝到array,注意，并不是每次都拷贝所有
         * 第一次合并 tempLeft = 0 , right = 1,
         * 第一次合并 tempLeft = 2 , right = 3,
         * 最后一次 tempLeft = 0  right = 7
         */
        t = 0;
        int tempLeft = left;
        while(tempLeft <= right) {
            array[tempLeft] = temp[t];
            t += 1;
            tempLeft += 1;
        }
    }
}
```

2、执行结果

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211109214452.png" style="zoom:80%;" />	

#### 2.6.4 时间复杂度分析

==归并排序是分治思想的最典型的例子==，上面的算法中，对数组进行排序，先将它分为`array[left...mid]`和`array[mid+1...right]`两部分，分别通过递归调用将他们单独排序，最后将有序的子数组归并为最终的排序结果。该递归的出口在于如果一个数组不能再被分为两个子数组，那么就会执行`merge`进行归并，在归并的时候判断元素的大小进行排序。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211109220259.png" style="zoom: 80%;" />	

用树状图来描述归并，如果一个数组有`8`个元素，那么它将每次除以`2`找最小的子数组，共拆`log8`次，值为`3`，所以树共有`3`层,那么自顶向下第`k`层有`2^k`个子数组，每个数组的长度为`2^(3-k)`，归并最多需要`2^(3-k)`次比较。因此每层的比较次数为`2^k*2^(3-k)=2^3`,那么`3`层总共为 `3*2^3`。假设元素的个数为`n`，那么使用归并排序拆分的次数为`log2(n)`,所以共`log2(n)`层，那么使用`log2(n)`替换上面`3*2^3`中的`3`这个层数，最终得出的归并排序的时间复杂度为：`log2(n) * 2^(log2(n))=log2(n) * n`,根据大`O`推导法则，忽略底数，最终归并排序的时间复杂度为`O(nlogn)`。

1、归并排序的缺点：
==需要申请额外的数组空间，导致空间复杂度提升，是典型的以空间换时间的操作==。

2、快速排序和归并排序的区别：
快速排序是另外一种分治的排序算法，它将一个数组分成两个子数组，将两部分独立的排序。快速排序和归并排序是互补的：==归并排序将数组分成两个子数组分别排序，并将有序的子数组归并从而将整个数组排序，而快速排序的方式则是当两个数组都有序时，整个数组自然就有序了。==在归并排序中，一个数组被等分为两半，归并调用发生在处理整个数组之前，在快速排序中，切分数组的位置取决于数组的内容，递归调用发生在处理整个数组之后。

### 2.7 计数排序

#### 2.7.1 基本介绍

计数排序的核心

- ==在于将输入的数据值转化为键存储在额外开辟的数组空间中==。作为一种线性时间复杂度的排序，计数排序要求输入的数据必须是有确定范围的整数。

计数排序的特征

- 当输入的元素是`n `个` 0 `到 `k` 之间的整数时，它的运行时间是 `O(n + k)`。计数排序不是比较排序，排序的速度快于任何比较排序算法。由于用来计数的数组`array`的长度取决于待排序数组中数据的范围（等于待排序数组的最大值与最小值的差加上`1`），这使得计数排序对于数据范围很大的数组，需要大量时间和内存。
- 计数排序是用来排序`0`到`100`之间的数字的最好的算法，<font color= red>但是它不适合按字母顺序排序人名</font>，计数排序可以用在基数排序中的算法来排序数据范围很大的数组。

#### 2.7.2 排序原理

计数排序，这种排序算法是利用数组下标来确定元素的正确位置的。假设数组中有10个整数，取值范围为0～10，要求用最快的速度把这10个整数从小到大进行排序。可以根据这有限的范围，建立一个长度为`11`的数组`arr1 = {9，1，2，7，8，1，3，6，5，3}`，数组下标从`0`到`10`，元素初始值全为`0`。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211110115246.png" style="zoom:80%;" />	

开始遍历这个无序的随机数列，每一个整数按照其值对号入座，同时对应数组下标的元素进行加`1`操作，例如第`1`个整数是`9`，那么数组下标为`9`的元素加`1`。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211110115823.png" style="zoom:80%;" />	

最终，当数列遍历完毕时，数组的状态如下：

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211110120256.png" style="zoom:80%;" />	

该数组中每一个下标位置的值代表数列中对应整数出现的次数，直接遍历数组，输出数组元素的下标值，元素的值是几，就输出几次，`0`不输出
则顺序输出是：`1、1、2、3、3、5、6、7、8、9`，计数排序：适合于连续的取值范围不大的数组，不连续和取值范围过大会造成数组过大。

#### 2.7.3 代码示例

1、计数排序代码实现

```java
package cn.countingsort.demo01;

import java.util.Arrays;

public class CountingSortDemo01 {
    public static void main(String[] args) {
        //1.1 创建数组
        int[] arr1 = {9，1，2，7，8，1，3，6，5，3};
        System.out.println("排序前(计数排序):" + Arrays.toString(arr1));

        // 1.2 调用countingSort()方法
        countingSort(arr1, arr1.length);
        System.out.println("排序后(计数排序):" + Arrays.toString(arr1));
    }

    /**
     * 2.1 创建countingSort()方法
     * arr1是数组，n是数组大小，假设数组中存储的都是非负整数。
     */
    public static void countingSort(int[] arr1, int n) {
        // 2.2 判断数组的大小
        if (n <= 1) return;

        // 2.3 查找数组中数据的范围
        int max = arr1[0];
        for (int i = 1; i < n; ++i) {
            if (max < arr1[i]) {
                max = arr1[i];
            }
        }

        //2.4 申请一个计数数组arr2，下标大小[0,max]
        int[] arr2 = new int[max + 1];
        for (int i = 0; i <= max; ++i) {
            arr2[i] = 0;
        }

        // 2.5 计算每个元素的个数，放入arr2中
        for (int i = 0; i < n; ++i) {
            arr2[arr1[i]]++;
        }

        // 2.6 依次累加
        for (int i = 1; i <= max; ++i) {
            arr2[i] = arr2[i-1] + arr2[i];
        }

        // 2.7 创建临时数组temp，存储排序之后的结果
        int[] temp = new int[n];
        for (int i = n - 1; i >= 0; --i) {
            int index = arr2[arr1[i]]-1;
            temp[index] = arr1[i];
            arr2[arr1[i]]--;
        }

        // 2.8 将结果拷贝给arr1数组
        for (int i = 0; i < n; ++i) {
            arr1[i] = temp[i];
        }
    }
}
```

2、执行结果

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211110121248.png" style="zoom:80%;" />	

#### 2.7.4 时间复杂度分析

计数排序是一个稳定的排序算法。当输入的元素是 `n` 个` 0`到 `k` 之间的整数时，时间复杂度是==O(n+k)==，空间复杂度也是==O(n+k)==，其排序速度快于任何比较排序算法。当k不是很大并且序列比较集中时，计数排序是一个很有效的排序算法。

### 2.8 桶排序

#### 2.8.1 基本介绍

桶排序是计数排序的升级版。它利用了函数的映射关系，高效与否的关键就在于这个映射函数的确定。为了使桶排序更加高效，需要做到这两点：

<font color = red>在额外空间充足的情况下，尽量增大桶的数量，使用的映射函数能够将输入的`N` 个数据均匀的分配到`K` 个桶中</font>。

#### 2.8.2 排序原理

桶排序需要创建若干个桶来协助排序，每一个桶`(bucket)`代表一个区间范围，里面可以承载一个或多个元素

1、桶排序的第1步

- 创建这些桶，并确定每一个桶的区间范围。这里创建的桶数量等于原始数列的元素数量，除最后一个桶只包含数列最大值外， 前面各个桶的区间按照比例来确定【==区间跨度 = (最大值-最小值）/ (桶的数量 - 1)==】，假设有一个数组`arr = {4.3, 0.54, 2.18, 3.6, 0.88, 4.22, 0.78, 1.71, 3.12}`

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211110145706.png)

2、第2步，遍历原始数列，把元素对号入座放入各个桶中。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211110150211.png" style="zoom:80%;" />	

3、第3步，对每个桶内部的元素分别进行排序

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211110160601.png" style="zoom:67%;" />	

4、第4步，遍历所有的桶，输出所有元素

#### 2.8.3 代码示例

1、桶排序代码示例

```java
package cn.bucketsort.demo01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class BucketSort {
    public static void main(String[] args) {
        //1.1 创建数组
        double[] arr1 = {4.3, 0.54, 2.18, 3.6, 0.88, 4.22, 0.78, 1.71, 3.12};
        System.out.println("排序前(桶排序):" + Arrays.toString(arr1));

        // 1.2 调用bucketSort()方法
        double[] arr2 = bucketSort(arr1);
        System.out.println("排序后(桶排序):" + Arrays.toString(arr2));
    }

    // 创建bucketSort()方法
    private static double[] bucketSort(double[] arr1) {
        // 2.1 定义最小值和最大值
        double max = 0;
        double min = 0;

        //2.2 获得最大值和最小值之间的差
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] > max) {
                max = arr1[i];
            }
            if (arr1[i] < min) {
                min = arr1[i];
            }
        }
        double d = max - min;

        //2.3 桶初始化
        int bucketNum = arr1.length;
        ArrayList<LinkedList<Double>> bucketList =
                new ArrayList<LinkedList<Double>>(bucketNum);
        for (int i = 0; i < bucketNum; i++) {
            bucketList.add(new LinkedList<Double>());
        }

        //2.4 将每个元素放入桶中
        for (int i = 0; i < arr1.length; i++) {
            int num = (int) ((arr1[i] - min) * (bucketNum - 1) / d);
            bucketList.get(num).add(arr1[i]);

        }
        //2.5 对每个桶内部进行排序
        for (int i = 0; i < bucketList.size(); i++) {
            Collections.sort(bucketList.get(i));
        }

        //2.6 输出全部元素
        double[] arr2 = new double[arr1.length];
        int index = 0;
        for (LinkedList<Double> list : bucketList) {
            for (double element : list) {
                arr2[index] = element;
                index++;
            }
        }
        return arr2;
    }
}
```

2、执行结果

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211110163110.png" style="zoom: 80%;" />	

#### 2.8.4 时间复杂度分析

如果要排序的数组的元素有`n`个，把它们分在`m`个桶中，这样每个桶里的数据就是`k = n / m`。每个桶内排序的时间复杂度就为==O(k * logk)==。`m`个桶就是`m * O(k * logk)=m * O((n / m)*log(n / m))=O(nlog(n / m))`。当桶的个数`m`接近数据个数`n`时，`log(n/m)`就是一个较小的常数，所以时间复杂度接近==O(n)==

### 2.9 基数排序

#### 2.9.1 基本介绍

- 基数排序是 1887 年赫尔曼·何乐礼发明的。它是这样实现的：将整数按位数切割成不同的数字，然后按每个位数分别比较。
- 基数排序`(radix sort)`属于==分配式排序==`(distribution sort)`，又称==桶子法==`(bucket sort)`或 `bin sort`，顾名思义，它是通过键值的各个位的值，将要排序的元素分配至某些==“桶”==中，达到排序的作用。
- ==基数排序法是属于稳定性的排序，基数排序法的是效率高的稳定性排序法==，基数排序`(Radix Sort)`是桶排序的扩展。

#### 2.9.2 排序原理

将创建数组将所有待比较数值统一为同样的数位长度，数位较短的数前面补零。从最低位开始，依次进行一次排序。这样从最低位排序一直到最高位排序完成以后, 数列就变成一个有序序列。

1、基数排序第一步【第一轮排序】

- 数组的初始状态: `arr = {42, 4, 541, 718, 13, 208, 36, 27, 6}`
- 将每个元素的==个==位数职出，然后看这个数应该放在哪个对应的桶(一个一维数组)
- 按照这个桶的顺序(一维数组的下标依次取出数据，放入原来数组)

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211110184709.png)

2、基数排序第二步【第二轮排序】

- 数组`arr`状态: `arr = {541, 42, 13, 4, 6, 36, 27, 208, 718}`。
- 将每个元素的==十==位数取出，然后看这个数应该放在哪个对应的桶(一个一维数组)
- 按照这个桶的顺序(一维数组的下标依次取出数据，放入原来数组)

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211110190839.png" style="zoom:80%;" />

3、基数排序第三步【第三轮排序】

- 数组`arr`状态: 数组 arr = {4, 6, 208, 13, 718, 27, 36，42, 541}
- 将每个元素百位数取出，然后看这个数应该放在哪个对应的桶(一个一维数组)
- 按照这个桶的顺序(一维数组的下标依次取出数据，放入原来数组)

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211110195700.png)

#### 2.9.3 代码示例

1、基数排序代码示例

```java
package cn.radixsort.demo01;

import java.util.Arrays;

public class ReadxSortDemo01 {
    public static void main(String[] args) {
        // 1.1 创建数组
        int[] arr = {541, 42, 13, 4, 6, 36, 27, 208, 718};
        System.out.println("排序前(基数排序):" + Arrays.toString(arr));

        // 1.2 调用radixSort()方法
        radixSort(arr);
        System.out.println("排序后(基数排序):" + Arrays.toString(arr));
    }

    //2、基数排序方法
    private static void radixSort(int[] arr) {

        //2.1 得到数组中最大的数的位数，假设第一数就是最大数
        int max = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        //2.2 得到最大数是几位数
        int maxLength = (max + "").length();

        /**
         * 2.3 定义一个二维数组，表示10个桶, 每个桶就是一个一维数组
         * 二维数组包含10个一维数组
         * 为了防止在放入数的时候，数据溢出，则每个一维数组(桶)，大小定为arr.length
         * 注意: 基数排序是使用空间换时间的经典算法
         */
        int[][] bucket = new int[10][arr.length];

        /**
         * 2.4 为了记录每个桶中，实际存放了多少个数据,定义一个一维数组来记录各个桶的每次放入的数据个数
         * 可以这样理解,比如：bucketElementCounts[0], 记录的就是bucket[0]桶的放入数据个数
         */
        int[] bucketElementCounts = new int[10];

        for(int i = 0 , n = 1; i < maxLength; i++, n *= 10) {
            //2.5 针对每个元素的对应位进行排序处理，第一次是个位，第二次是十位，第三次是百位..
            for(int j = 0; j < arr.length; j++) {
                //2.6 取出每个元素的对应位的值
                int digitOfElement = arr[j] / n % 10;
                //2.7 放入到对应的桶中
                bucket[digitOfElement][bucketElementCounts[digitOfElement]] = arr[j];
                bucketElementCounts[digitOfElement]++;
            }
            //2.8 定义index索引，按照这个桶的顺序(一维数组的下标依次取出数据，放入原来数组)
            int index = 0;

            //2.9 遍历每一桶，并将桶中是数据，放入到原数组
            for(int k = 0; k < bucketElementCounts.length; k++) {
                //2.10 如果桶中，有数据，放入到原数组
                if(bucketElementCounts[k] != 0) {
                    //2.11 循环该桶即第k个桶(即第k个一维数组), 放入
                    for(int l = 0; l < bucketElementCounts[k]; l++) {
                        //2.12 将取出的元素放入到arr数组中，并且索引执行++操作
                        arr[index++] = bucket[k][l];
                    }
                }
                //2.13 第i+1轮处理后，需要将每个 bucketElementCounts[k] = 0
                bucketElementCounts[k] = 0;
            }
        }
    }
}
```

2、执行结果

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211110203413.png" style="zoom:80%;" />	

#### 2.9.4 时间复杂度分析

- 基数排序每一位的比较可以使用线性排序，比如桶排序或者计数排序，当然需要保证如计数排序的稳定性。每次排序时间复杂度==O(n)==，那么如果有`k`位，则时间复杂度为`O(k x n)`,如果k不大，那么时间复杂度就是==O(n)== 
- 基数排序是对传统桶排序的扩展，速度很快。
- 基数排序是经典的空间换时间的方式，占用内存很大, 当对海量数据排序时，容易造成 OutOfMemoryError 。
- 基数排序时稳定的，有负数的数组，不用基数排序来进行排序。

###  2.11排序的稳定性

#### 2.11.1 排序算法总结

排序算法可以分为内部排序和外部排序，内部排序是数据记录在内存中进行排序，而外部排序是因排序的数据很大，一次不能容纳全部的排序记录，在排序过程中需要访问外存。常见的内部排序算法有：插入排序、希尔排序、选择排序、冒泡排序、归并排序、快速排序、堆排序、基数排序等。用一张图概括：

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211111055825.png" style="zoom:80%;" />	

具体使用情况

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211111055916.png" style="zoom:80%;" />

#### 2.11.2 稳定性的定义

数组`array`中有若干元素，其中`A`元素和`B`元素相等，并且`A`元素在`B`元素前面，如果使用某种排序算法排序后，能够保证`A`元素依然在`B`元素的前面，可以说这个该算法是稳定的。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211111091337.png" style="zoom:80%;" />	

#### 2.11.3 稳定性的意义

如果一组数据只需要一次排序，则稳定性一般是没有意义的，如果一组数据需要多次排序，稳定性是有意义的。例如要排序的内容是一组商品对象，第一次排序按照价格由低到高排序，第二次排序按照销量由高到低排序，如果第二次排序使用稳定性算法，就可以使得相同销量的对象依旧保持着价格高低的顺序展现，只有销量不同的对象才需要重新排序。这样既可以保持第一次排序的原有意义，而且可以减少系统开销。

1、第一次按照价格从低到高排序

| 商品名称         | 价格 | 销量 |
| ---------------- | ---- | ---- |
| 现代操作系统     | 399  | 10   |
| 计算机组成原理   | 499  | 78   |
| `Java`入门到放弃 | 599  | 78   |
| `Spring`源码分析 | 619  | 33   |

第二次按照销量进行从高到低排序

| 商品名称         | 价格 | 销量 |
| ---------------- | ---- | ---- |
| 计算机组成原理   | 499  | 78   |
| `Java`入门到放弃 | 599  | 78   |
| `Spring`源码分析 | 619  | 33   |
| 现代操作系统     | 399  | 10   |

#### 2.11.4 常见排序算法稳定性

冒泡排序

- 只有当`arr[i]>arr[i+1]`的时候，才会交换元素的位置，而相等的时候并不交换位置，所以冒泡排序是一种稳定排序算法。

选择排序

- 选择排序是给每个位置选择当前元素最小的,例如有数据`{5(1),8, 5(2), 2, 9 }`第一遍选择到的最小元素为`2`，所以`5(1)`会和`2`进行交换位置，此时`5(1)`到了`5(2)`后面，破坏了稳定性，所以选择排序是一种不稳定的排序算法。

插入排序

- 比较是从有序序列的末尾开始，也就是想要插入的元素和已经有序的最大者开始比起，如果比它大则直接插入在其后面，否则一直往前找直到找到它该插入的位置。如果碰见一个和插入元素相等的，那么把要插入的元素放在相等元素的后面。所以，相等元素的前后顺序没有改变，从原无序序列出去的顺序就是排好序后的顺序，所以插入排序是稳定的。

希尔排序

- 希尔排序是按照不同步长对元素进行插入排序 ,虽然一次插入排序是稳定的，不会改变相同元素的相对顺序，但在不同的插入排序过程中，相同的元素可能在各自的插入排序中移动，最后其稳定性就会被打乱，所以希尔排序是不稳定的。

归并排序

- 归并排序在归并的过程中，只有arr[i]<arr[i+1]的时候才会交换位置，如果两个元素相等则不会交换位置，所以它并不会破坏稳定性，归并排序是稳定的。

快速排序

- 快速排序需要一个基准值，在基准值的右侧找一个比基准值小的元素，在基准值的左侧找一个比基准值大的元素，然后交换这两个元素，此时会破坏稳定性，所以快速排序是一种不稳定的算法。

## 第3章 线性表

线性表是最基本、最简单、也是最常用的一种数据结构，一个线性表是`n`个具有相同特性的数据元素的有限序列。

1、基本介绍

前驱元素

- 若`A`元素在`B`元素的前面，则称`A`为`B`的前驱元素。

后继元素

- 若`B`元素在`A`元素的后面，则称`B`为`A`的后继元素。

2、线性表的特征：数据元素之间具有一种==“一对一”==的逻辑关系。

- 第一个数据元素没有前驱，这个数据元素被称为==头结点==。
- 最后一个数据元素没有后继，这个数据元素被称为==尾结点==。
- 除了第一个和最后一个数据元素外，其他数据元素有且仅有一个前驱和一个后继。

如果把线性表用数学语言来定义，则可以表示为`(a1,...ai-1,ai,ai+1,...an)`，`ai-1`领先于`ai`,`ai`领先于`ai+1`，称`ai-1`是`ai`的前驱元素，`ai+1`是`ai`的后继元素

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211111110510.png" style="zoom: 80%;" />	

3、线性表的分类
线性表中数据存储的方式可以是顺序存储，也可以是链式存储，按照数据的存储方式不同，==可以把线性表分为顺序表和链表==

### 3.1 顺序表(数组)

#### 3.1.1 基本介绍

顺序表是在计算机内存中以数组的形式保存的线性表，线性表的顺序存储是指用一组地址连续的存储单元，依次存储线性表中的各个元素、使得线性表中再逻辑结构上响铃的数据元素存储在相邻的物理存储单元中，即通过数据元素物理存储的相邻关系来反映数据元素之间逻辑上的相邻关系。

数组是最常见的顺序表，数组`(Array)`是有限个相同类型的变量所组成的有序集合，数组中的每一个变量被称为元素。数组是最为简单、最为常用的数据结构。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211111113629.png" style="zoom:80%;" />	

#### 3.1.2 相关原理分析

1、基本概念

数组用一组连续的内存空间来存储一组具有相同类型的数据。

(模拟内存存储)灰色格子：被使用的内存，黄色格子：空闲的内存，蓝色格子：数组占用的内存

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211111114441.png" style="zoom:80%;" />	

2、顺序表API设计

| 类名     | SqList                                                       |
| -------- | ------------------------------------------------------------ |
| 构造方法 | `SqList(int capacity)`：创建容量为`capacity`的`SqList`对象   |
| 成员方法 | 1、`public void clear()`：清空所有元素。<br/>2、`public boolean isEmpty()`：判断线性表是否为空，是返回`true`，否返回`false`。<br/>3、`public int size()`:获取线性表中元素的个数。<br/>4、`public E get(int index)`: 返回index位置对应的元素。<br/>5、`public void add(int index,E data)`：在线性表的第`i`个元素之前插入一个值为`t`的数据元素。<br/>6、`public void add(E data)`:向线性表中添加一个元素`t`。<br/>7、`public E remove(int index)`: 删除index位置对应的元素。<br/>8、`public int indexOf(E e)`: 返回线性表中首次出现的指定的数据元素的位序号，若不存在，则返回`-1`。<br/>9、`boolean contains(E data)`：是否包含某个元素。<br/>10、`public E set(int index, E data)`：设置`index`位置的元素 |
| 成员变量 | 1、`private E[] data`：存储元素的数组。<br/>2、`private int size`:当前线性表的长度。 |

#### 3.1.3 添加元素

1、尾部插入

在数据的实际元素数量小于数组长度的情况下：直接把插入的元素放在数组尾部的空闲位置即可，等同于更新元素的操作。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211115215832.png" style="zoom:80%;" />	

```css
直接在索引(index = 6)的位置上添加元素10
```

2、通过数组下标插入

在数据的实际元素数量小于数组长度的情况下：
由于数组的每一个元素都有其固定下标，==所以首先把插入位置及后面的元素向后移动腾出地方，再把要插入的元素放到对应的数组位置上==。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211115215905.png" style="zoom:67%;" />	

3、代码实现

顺序表：`SqList`

```java
package cn.liner.demo01;

public class SqList{
    // 顺序表的元素
    private int[] data;
    // 顺序表元素的数量
    private int size;

    // 构造函数，传入数组的容量capacity构造SqList
    public SqList(int capacity){
        data = new int[capacity];
        size = 0;
    }

    // 无参数的构造函数，默认数组的容量capacity=10
    public SqList(){
        this(10);
    }

    // 获取数组的容量
    public int getCapacity(){
        return data.length;
    }

    // 获取数组中的元素个数
    public int getSize(){
        return size;
    }

    // 返回数组是否为空
    public boolean isEmpty(){
        return size == 0;
    }

    // 向所有元素后添加一个新元素
    public void addLast(int e){
        add(size, e);
    }

    // 在所有元素前添加一个新元素
    public void addFirst(int e){
        add(0, e);
    }

    // 在index索引的位置插入一个新元素e
    public void add(int index, int e){

        if(size == data.length){
            throw new IllegalArgumentException("数组已满，添加失败！！");
        }

        if(index < 0 || index > size){
            throw new IllegalArgumentException("添加失败，索引值不符合添加范围！！");
        }

        for(int i = size - 1; i >= index ; i --){
            data[i + 1] = data[i];
        }

        data[index] = e;
        size ++;
    }

    @Override
    public String toString(){
        StringBuilder res = new StringBuilder();
        res.append(String.format("顺序表(SqList)长度:%d, 容器:%d\n", size, data.length));
        res.append('[');
        for(int i = 0 ; i < size ; i ++){
            res.append(data[i]);
            if(i != size - 1)
                res.append(", ");
        }
        res.append(']');
        return res.toString();
    }
}
```

测试类：`SqListDemo01`

```java
package cn.liner.demo01;
/**
 * 顺序表测试类
 */
public class SqListDemo01 {
    public static void main(String[] args) {
        //1.1 创建顺序表对象
        SqList list = new SqList(20);
        for (int i = 0; i < 10; i++)
            list.addLast(i);
        System.out.println(list);
        System.out.println("=====");

        list.add(1, 100);
        System.out.println(list);
        System.out.println("=====");

        list.addFirst(-1);
        System.out.println(list);
    }
}
```

3、执行结果

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211115214914.png" style="zoom:67%;" />	

#### 3.1.4 查询和修改元素

1、代码实现

顺序表：`SqList`

```java
package cn.liner.demo01;

public class SqList{
    // 顺序表的元素
    private int[] data;
    // 顺序表元素的数量
    private int size;

    // 构造函数，传入数组的容量capacity构造SqList
    public SqList(int capacity){
        data = new int[capacity];
        size = 0;
    }

    // 无参数的构造函数，默认数组的容量capacity=10
    public SqList(){
        this(10);
    }

    // 获取数组的容量
    public int getCapacity(){
        return data.length;
    }
    // 获取index索引位置的元素
    public int get(int index){
        if(index < 0 || index >= size)
            throw new IllegalArgumentException("获取失败！！该索引值不存在！！");
        return data[index];
    }

    // 修改index索引位置的元素为e
    public void set(int index, int e){
        if(index < 0 || index >= size){
            throw new IllegalArgumentException("设置失败，该索引值不存在");
        }
        data[index] = e;
    }

    // 查找数组中是否有元素e
    public boolean contains(int e){
        for(int i = 0 ; i < size ; i ++){
            if(data[i] == e)
                return true;
        }
        return false;
    }

    // 查找数组中元素e所在的索引，如果不存在元素e，则返回-1
    public int find(int e){
        for(int i = 0 ; i < size ; i ++){
            if(data[i] == e)
                return i;
        }
        return -1;
    }

    @Override
    public String toString(){
        StringBuilder res = new StringBuilder();
        res.append(String.format("顺序表(SqList)长度:%d, 容器:%d\n", size, data.length));
        res.append('[');
        for(int i = 0 ; i < size ; i ++){
            res.append(data[i]);
            if(i != size - 1)
                res.append(", ");
        }
        res.append(']');
        return res.toString();
    }
}
```

测试类：`SqListDemo01`

```java
package cn.liner.demo01;
/**
 * 顺序表测试类
 */
public class SqListDemo01 {
    public static void main(String[] args) {
        //1.1 创建顺序表对象
        SqList list = new SqList(20);
        System.out.println("===顺序表添加===");
        for (int i = 0; i < 10; i++){
            list.addLast(i);
        }
        System.out.println(list);
        System.out.println("===顺序表(获取索引位置的元素)===");
        int index = list.get(2);
        System.out.println("查找到的元素是:" +index);

        System.out.println("===顺序表(修改索引位置的元素)===");
        list.set(3,100);
        System.out.println(list);

        System.out.println("===顺序表(查找数组中是否有该元素)===");
        boolean flag = list.contains(4);
        System.out.println("是否存在:" + flag);

        System.out.println("===顺序表(查找数组中元素e所在的索引)===");
        int i = list.find(100);
        System.out.println(i);
    }
}
```

2、执行结果

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211116103518.png" style="zoom:67%;" />	

#### 3.1.5 删除元素

1、代码实现

顺序表：`SqList`

```java
package cn.liner.demo01;

public class SqList{
    // 顺序表的元素
    private int[] data;
    // 顺序表元素的数量
    private int size;

    // 构造函数，传入数组的容量capacity构造SqList
    public SqList(int capacity){
        data = new int[capacity];
        size = 0;
    }

    // 无参数的构造函数，默认数组的容量capacity=10
    public SqList(){
        this(10);
    }

    // 获取数组的容量
    public int getCapacity(){
        return data.length;
    }

    // 从数组中删除index位置的元素, 返回删除的元素
    public int remove(int index){
        if(index < 0 || index >= size){
            throw new IllegalArgumentException("移除失败，索引值不存在！！！");
        }
        int ret = data[index];
        for(int i = index + 1 ; i < size ; i ++){
            data[i - 1] = data[i];
        }

        size --;
        return ret;
    }

    // 从数组中删除第一个元素, 返回删除的元素
    public int removeFirst(){
        return remove(0);
    }

    // 从数组中删除最后一个元素, 返回删除的元素
    public int removeLast(){
        return remove(size - 1);
    }

    // 从数组中删除元素e
    public void removeElement(int e){
        int index = find(e);
        if(index != -1) {
            remove(index);
        }
    }

    @Override
    public String toString(){
        StringBuilder res = new StringBuilder();
        res.append(String.format("顺序表(SqList)长度:%d, 容器:%d\n", size, data.length));
        res.append('[');
        for(int i = 0 ; i < size ; i ++){
            res.append(data[i]);
            if(i != size - 1)
                res.append(", ");
        }
        res.append(']');
        return res.toString();
    }
}
```

测试类：`SqListDemo01`

```java
package cn.liner.demo01;
/**
 * 顺序表测试类
 */
public class SqListDemo01 {
    public static void main(String[] args) {
        //1.1 创建顺序表对象
        SqList list = new SqList(20);
        System.out.println("===顺序表添加===");
        for (int i = 0; i < 10; i++){
            list.addLast(i);
        }
        System.out.println(list);
        System.out.println("===删除元素操作====");
        // 从数组中删除index位置的元素
        list.remove(2);
        System.out.println(list);
        // 从数组中删除元素e
        list.removeElement(4);
        System.out.println(list);
         // 删除第一个元素
        list.removeFirst();
        System.out.println(list);
        // 从数组中删除最后一个元素
        list.removeLast();
        System.out.println(list);
    }
}
```

3、执行结果

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211116112059.png" style="zoom: 67%;" />	

#### 3.1.6 泛型技术

使用泛型技术可以让数组更加通用，==可以存放任何数据类型==。

1、代码实现

顺序表：`SqList`

```java
package cn.liner.demo01;

import java.util.Iterator;

public class SqList<E> implements Iterable<E>{
    // 顺序表的元素
    private E[] data;
    // 顺序表元素的数量
    private int size;

    // 定义常量
    private static final int ELEMENT_NOT_FOUND = -1;

 	 // 构造函数，传入数组的容量capacity构造SqList
    public SqList(int capacity){
        data = (E[]) new Object[capacity];
        size = 0;
    }

    // 无参数的构造函数，默认数组的容量capacity=10
    public SqList(){
        this(10);
    }

    // 获取数组的容量
    public int getCapacity(){
        return data.length;
    }

    // 获取数组中的元素个数
    public int getSize(){
        return size;
    }

    // 返回数组是否为空
    public boolean isEmpty(){
        return size == 0;
    }

    // 向所有元素后添加一个新元素
    public void addLast(E e){
        add(size, e);
    }

    // 在所有元素前添加一个新元素
    public void addFirst(E e){
        add(0, e);
    }

    // 在index索引的位置插入一个新元素e
    public void add(int index, E e){

        if(size == data.length){
            throw new IllegalArgumentException("数组已满，添加失败！！");
        }

        for(int i = size - 1; i >= index ; i --){
            data[i + 1] = data[i];
        }

        data[index] = e;
        size ++;
    }

    // 获取index索引位置的元素
    public E get(int index){
        rangeCheck(index);
        return data[index];
    }

    // 查看元素的索引
    public int indexOf(E e){
        if (e == null) {
            for (int i = 0; i < size; i++) {
                if (data[i] == null) return i;
            }
        } else {
            for (int i = 0; i < size; i++) {
                if (e.equals(data[i])) return i;
            }
        }
        return ELEMENT_NOT_FOUND;
    }

    // 修改index索引位置的元素为e
    public void set(int index, E e){
        rangeCheck(index);
        data[index] = e;
    }

    // 查找数组中是否有元素e
    public boolean contains(E e){
       return indexOf(e) != ELEMENT_NOT_FOUND;
    }

    // 查找数组中元素e所在的索引，如果不存在元素e，则返回-1
    public int find(E e){
        for(int i = 0 ; i < size ; i ++){
            if(data[i].equals(e))
                return i;
        }
        return -1;
    }

    // 从数组中删除index位置的元素, 返回删除的元素
    public E remove(int index){
        rangeCheck(index);
        E ret = data[index];
        for(int i = index + 1 ; i < size ; i ++){
            data[i - 1] = data[i];
        }

        size --;
        return ret;
    }

    // 从数组中删除第一个元素, 返回删除的元素
    public E removeFirst(){
        return remove(0);
    }

    // 从数组中删除最后一个元素, 返回删除的元素
    public E removeLast(){
        return remove(size - 1);
    }

    // 从数组中删除元素e
    public void removeElement(E e){
        int index = find(e);
        if(index != -1) {
            remove(index);
        }
    }

    // 数组索引越界处理
    private void outOfBounds(int index){
        throw new IndexOutOfBoundsException("index:" + index + ", Size:" + size);
    }

    // 索引值检查范围方法
    private void rangeCheck(int index){
        if(index < 0 || index >=size){
            // 调用越界处理方法
            outOfBounds(index);
        }
    }

    // 添加方法索引检查范围
    private void rangeCheckAdd(int index){
        if(index < 0 || index >size){
            // 调用越界处理方法
            outOfBounds(index);
        }
    }

    @Override
    public String toString(){
        StringBuilder res = new StringBuilder();
        res.append(String.format("顺序表(SqList)长度:%d, 容器:%d\n", size, data.length));
        res.append('[');
        for(int i = 0 ; i < size ; i ++){
            res.append(data[i]);
            if(i != size - 1)
                res.append(", ");
        }
        res.append(']');
        return res.toString();
    }

    // 遍历方法
    @Override
    public Iterator<E> iterator() {
        return new SIterator();
    }

    private class SIterator implements Iterator{
        // 定义一个指针变量
        private int cur;
        public SIterator(){
            this.cur=0;
        }
        @Override
        public boolean hasNext() {
            return cur< size;
        }
        @Override
        public E next() {
            return data[cur++];
        }
    }
}
```

测试类: `Student`

```java
package cn.liner.demo01;

public class Student implements Comparable<Student>{
    // 成员变量
    private String username;
    private int userage;
    // 构造方法
    public Student(String username, int userage) {
        this.username = username;
        this.userage = userage;
    }

    @Override
    public int compareTo(Student o) {
        return o.userage - this.userage;
    }

    @Override
    public boolean equals(Object student) {
        if(this == student)
            return true;

        if(student == null)
            return false;

        if(this.getClass() != student.getClass())
            return false;

        Student o = (Student)student;
        return this.userage == o.userage;
    }

    @Override
    public String toString() {
        return String.format("Student[姓名:%s, 年龄:%d]", username, userage);
    }

    public static void main(String[] args) {
        // 创建list对象
        SqList<Student> list = new SqList<>();
        // 往数组中添加元素
        list.addLast(new Student("guardwhy", 10));
        list.addLast(new Student("curry", 12));
        list.addLast(new Student("james", 38));
		// 遍历数组
        for(Student s : list){
            System.out.println(s);
        }
    }
}
```

2、执行结果

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211116133715.png" style="zoom:80%;" />	

#### 3.1.6 动态数组

1、数组的扩容操作

当使用`SqList`时，先`new SqList(5)`创建一个对象，创建对象时就需要指定容器的大小，初始化指定大小的数组来存储元素，当插入元素时，如果已经插入了`5`个元素，还要继续插入数据，则会报错，就不能插入了。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211111171708.png" style="zoom:80%;" />	

这种设计不符合容器的设计理念，因此在设计顺序表时，应该考虑它的容量的伸缩性。==考虑容器的容量伸缩性，其实就是改变存储数据元素的数组的大小，需要考虑什么时候需要改变数组的大小？==

添加元素时，==应该检查当前数组的大小是否能容纳新的元素，如果不能容纳，则需要创建新的容量更大的数组==，这里创建一个是原数组<font color = red>**1.5倍容量**</font>的新数组存储元素。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211111173620.png" style="zoom:80%;" />	

2、数组的缩容操作

==移除元素时，应该检查当前数组的大小是否太大==，比如正在用`100`个容量的数组存储`10`个元素，这样就会造成内存空间的浪费，应该创建一个容量更小的数组存储元素。如果发现数据元素的数量不足数组容量的`1/4`，则创建一个是原数组容量的`1/2`的新数组存储元素。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211111175200.png" style="zoom:80%;" />	

3、代码示例

顺序表：`SqList`

```java
package cn.liner.demo01;

import java.util.Iterator;

public class SqList<E> implements Iterable<E>{
    // 顺序表的元素
    private E[] data;
    // 顺序表元素的数量
    private int size;

    // 定义常量
    private static final int ELEMENT_NOT_FOUND = -1;
    private static final int DEFAULT_CAPACITY = 6;

    // 元素的数量
    public int size() {
        return size;
    }

    //清除所有元素
    public void clear() {
        for (int i = 0; i < size; i++) {
            data[i] = null;
        }
        size = 0;
    }


    // 构造函数，传入数组的容量capacity构造SqList
    public SqList(int capacity){
        data = (E[]) new Object[capacity];
        capacity = (capacity < DEFAULT_CAPACITY) ? DEFAULT_CAPACITY : capacity;
    }

    // 无参数的构造函数，默认数组的容量capacity=10
    public SqList(){
        this(DEFAULT_CAPACITY);
    }

    // 获取数组的容量
    public int getCapacity(){
        return data.length;
    }

    // 获取数组中的元素个数
    public int getSize(){
        return size;
    }

    // 返回数组是否为空
    public boolean isEmpty(){
        return size == 0;
    }

    // 向所有元素后添加一个新元素
    public void addLast(E e){
        add(size, e);
    }

    // 在所有元素前添加一个新元素
    public void addFirst(E e){
        add(0, e);
    }

    // 在index索引的位置插入一个新元素e
    public void add(int index, E e){
        // 扩容操作
        if(size == data.length){
           resize(2 * data.length);
        }

        for(int i = size - 1; i >= index ; i --){
            data[i + 1] = data[i];
        }

        data[index] = e;
        size ++;
    }

    // 获取index索引位置的元素
    public E get(int index){
        rangeCheck(index);
        return data[index];
    }

    // 查看元素的索引
    public int indexOf(E e){
        if (e == null) {
            for (int i = 0; i < size; i++) {
                if (data[i] == null) return i;
            }
        } else {
            for (int i = 0; i < size; i++) {
                if (e.equals(data[i])) return i;
            }
        }
        return ELEMENT_NOT_FOUND;
    }

    // 修改index索引位置的元素为e
    public void set(int index, E e){
        rangeCheck(index);
        data[index] = e;
    }

    // 查找数组中是否有元素e
    public boolean contains(E e){
       return indexOf(e) != ELEMENT_NOT_FOUND;
    }

    // 查找数组中元素e所在的索引，如果不存在元素e，则返回-1
    public int find(E e){
        for(int i = 0 ; i < size ; i ++){
            if(data[i].equals(e))
                return i;
        }
        return -1;
    }

    // 从数组中删除index位置的元素, 返回删除的元素
    public E remove(int index){
        rangeCheck(index);
        E ret = data[index];
        for(int i = index + 1 ; i < size ; i ++){
            data[i - 1] = data[i];
        }
        // 置空
        data[--size] = null;
        
        // 缩容操作
        if(size == data.length / 4){
            resize(data.length / 2);
        }
        return ret;
    }

    // 从数组中删除第一个元素, 返回删除的元素
    public E removeFirst(){
        return remove(0);
    }

    // 从数组中删除最后一个元素, 返回删除的元素
    public E removeLast(){
        return remove(size - 1);
    }

    // 从数组中删除元素e
    public void removeElement(E e){
        int index = find(e);
        if(index != -1) {
            remove(index);
        }
    }

    // 数组索引越界处理
    private void outOfBounds(int index){
        throw new IndexOutOfBoundsException("index:" + index + ", Size:" + size);
    }

    // 索引值检查范围方法
    private void rangeCheck(int index){
        if(index < 0 || index >=size){
            // 调用越界处理方法
            outOfBounds(index);
        }
    }

    // 添加方法索引检查范围
    private void rangeCheckAdd(int index){
        if(index < 0 || index >size){
            // 调用越界处理方法
            outOfBounds(index);
        }
    }

    // 扩容capacity方法
    private void resize(int newCapacity){
        E[] newData = (E[])new Object[newCapacity];
        for(int i = 0 ; i < size ; i ++){
            newData[i] = data[i];
        }
        data = newData;
    }

    @Override
    public String toString(){
        StringBuilder res = new StringBuilder();
        res.append(String.format("顺序表(SqList)长度:%d, 容器:%d\n", size, data.length));
        res.append('[');
        for(int i = 0 ; i < size ; i ++){
            res.append(data[i]);
            if(i != size - 1)
                res.append(", ");
        }
        res.append(']');
        return res.toString();
    }

    // 遍历方法
    @Override
    public Iterator<E> iterator() {
        return new SIterator();
    }

    private class SIterator implements Iterator{
        // 定义一个指针变量
        private int cur;
        public SIterator(){
            this.cur=0;
        }
        @Override
        public boolean hasNext() {
            return cur< size;
        }
        @Override
        public E next() {
            return data[cur++];
        }
    }
}
```

测试类：`SqListDemo01`

```java
package cn.liner.demo01;
/**
 * 顺序表测试类
 */
public class SqListDemo01 {
    public static void main(String[] args) {
        //1.1 创建顺序表对象
        SqList<Integer> list = new SqList();
        System.out.println("===顺序表添加===");
        for (int i = 0; i < 10; i++){
            list.addLast(i);
        }

        System.out.println(list);

        System.out.println("===顺序表(修改索引位置的元素)===");
        list.set(3,100);
        System.out.println(list);
    }
}
```

4、执行结果

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211116165020.png" style="zoom:80%;" />	

#### 3.1.5 时间复杂度分析

读取和更新都是随机访问，所以是`O(1)`，插入数组扩容的时间复杂度是`O(n)`，插入并移动元素的时间复杂度也是`O(n)`，综合起来插入操作的时间
复杂度是`O(n)`。删除操作，只涉及元素的移动，时间复杂度也是`O(n)`

顺序表优点

- 数组拥有非常高效的随机访问能力，只要给出下标，就可以用常量时间找到对应元素。

顺序表缺点

- 插入和删除元素方面。由于数组元素连续紧密地存储在内存中，插入、删除元素都会导致大量元素被迫移动，影响效率。` (ArrayList LinkedList )`。
- 申请的空间必须是连续的，也就是说即使有空间也可能因为没有足够的连续空间而创建失败。
- 如果超出范围，需要重新申请内存进行存储，原空间就浪费了。

### 3.2 单向链表

#### 3.2.1 基本介绍

链表`(linked list)`是一种在物理上非连续、非顺序的数据结构，由若干节点（node）所组成。链表中数据元素的逻辑顺序是通过链表中的指针链接次序实现的。链表由一系列结点（链表中每一个元素称为结点）组成，结点可以在运行时动态生成。每个结点包括两个部分：==一个是存储数据元素的数据域(data)==，==另一个是存储下一个结点地址的指针域(next)==。（百度百科）

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211122165939.png" style="zoom:80%;" />	

#### 3.2.2 存储原理

链表的每一个节点分布在内存的不同位置，依靠`next`指针关联起来。这样可以灵活有效地利用零散的碎片空间。链表的第`1`个节点被称为头节点`(3)`，没有任何节点的`next`指针指向它，或者说它的前置节点为空头结点用来记录链表的基地址。有了它就可以遍历得到整条链表链表的最后`1`个节点被称为尾节点`(2)`，它指向的`nex`t为`NULL`。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211112152145.png" style="zoom:80%;" />	

#### 3.2.3 添加操作	

1、思路分析

- 为了让代码更加精简，统一所有节点的处理逻辑，可以在==最前面增加一个虚拟的头结点（不存储数据）==
- 新节点的`next`指针，指向插入位置的节点。插入位置前置节点的`next`指针，指向新节点。
- 只要内存空间允许，能够插入链表的元素是无限的，不需要像数组那样考虑扩容的问题。

> 头部添加

当链表为空时，头部插入

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211122164158.png" style="zoom: 80%;" />	

当链表不为空时，从头部插入。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211122164541.png" style="zoom:80%;" />	

==先让新的节点指向头结点，然后再让头结点指向新节点==！！！

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211122165023.png)

> 尾部添加

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211124210658.png" style="zoom:80%;" />	

先让尾指针指向的节点，指向新节点

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211122171023.png" style="zoom:80%;" />	

然后`tail`从新指向新节点

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211122171427.png" style="zoom:80%;" />	

> 中间添加

​	<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211124212647.png" style="zoom:80%;" />

定义一个指针`prev`，将`prev`的当前下一跳给新节点的下一跳。然后再让`prev`节点重新指向新节点

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211124214511.png)

2、代码示例

接口实现：`List`

```java
package cn.linkedlist.demo01;

/***
 * List接口方法
 * @param <E>
 */
public interface List<E> extends Iterable<E>{
    void add(E element);
    void add(int index, E element) ;
    void remove(E element);
    E remove(int index);
    E get(int index);
    E set(int index, E element) ;
    int size();
    int indexOf(E element) ;
    boolean contains(E element);
    boolean isEmpty();
    void clear();
}
```

链表实现：`LinkedSinglyList`

```java
package cn.linkedlist.demo01;

import java.util.Iterator;

public class LinkedSinglyList<E> implements List<E>{
    // 创建Node节点
    private class Node{
        //数据域 用来存储数据的
        public E data;
        //指针域 用来存储下一个结点对象的地址
        public Node next;

        // 构造方法
        public Node() {
            this(null, null);
        }

        public Node(E data) {
            this(data, null);
        }

        public Node(E data, Node next) {
            this.data = data;
            this.next = next;
        }

        @Override
        public String toString(){
            return data.toString();
        }
    }

    // 链表元素的数量
    private int size;
    //链表当中的头指针指向第一个结点对象
    private Node head;
    //链表当中的头指针指向最后一个结点对象
    private Node tail;

    // 初始化链表
    public LinkedSinglyList(){
        head = null;
        tail = null;
        size = 0;
    }

    public LinkedSinglyList(E[] arr){
        for (E e : arr){
            add(e);
        }
    }

    /***
     * 在链表末尾添加新的元素e
     * @param element
     */
    @Override
    public void add(E element) {
        add(size, element);
    }

    /***
     * 根据链表的index位置添加新的元素e
     * @param index
     * @param element
     */
    @Override
    public void add(int index, E element) {
        if (index < 0|| index > size) {
            throw new ArrayIndexOutOfBoundsException("add index out of bounds");
        }
        // 创建新的结点对象
        Node node = new Node(element);

        if(isEmpty()){
            // 链表为空
            head = node;
            tail = node;
        }else if(index == 0){
            // 在链表头部添加元素
            node.next = head;
            head = node;
        }else if(index == size){
            // 在链表尾部添加元素
            tail.next = node;
            tail = node;
        }else{
            // 在链表中添加元素
            Node prev = head;
            for(int i=0; i < index -1; i++){
                prev = prev.next;
            }
            node.next = prev.next;
            prev.next = node;
        }
        size++;
    }
    
    @Override
    public int size() {
        return size;
    }
    /***
     * 判断链表是否为空
     * @return
     */
    @Override
    public boolean isEmpty() {
        return size == 0 && head == null && tail == null;
    }

    @Override
    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append("size=").append(size).append(", [");
        // 定义一个指针变量
        Node cur = head;
        while(cur != null){
            res.append(cur + "->");
            cur = cur.next;
        }
        res.append("NULL");
        res.append("]");
        return res.toString();
    }

    /***
     * 迭代器实现
      * @return
     */
    @Override
    public Iterator<E> iterator() {
        return new LinkedListIterator();
    }

    class LinkedListIterator implements Iterator<E>{
        // 定义游标
        private Node cur = head;
        @Override
        public boolean hasNext() {
            return cur != null;
        }

        @Override
        public E next() {
            E ret = cur.data;
            cur = cur.next;
            return ret;
        }
    }
}
```

3、测试代码:`LinkedSinglyListDemo`

```java
package cn.linkedlist.demo01;

public class LinkedSinglyListDemo {
    public static void main(String[] args) {
        LinkedSinglyList<Integer> linkedList = new LinkedSinglyList<>();

        System.out.println("===链表头部插入===");
        linkedList.add(0,1);
        linkedList.add(0,3);
        linkedList.add(0,5);
        linkedList.add(0,8);
        System.out.println(linkedList);

        System.out.println("==链表尾部插入==");
        linkedList.add(12);
        System.out.println(linkedList);

        System.out.println("===链表中间插入===");
        linkedList.add(2, 23);
        System.out.println(linkedList);
    }
}

```

4、执行结果

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211215125813.png" style="zoom:80%;" />	

#### 3.2.4 查询和修改

1、查询操作

链表：`SingleLinkedList`

```java
/***
 * 得链表的第index个位置的元素
 * @param index
 * @return
*/
@Override
public E get(int index) {
    if (index < 0|| index > size) {
        throw new ArrayIndexOutOfBoundsException("get index out of bounds");
    }
    // 获取头部
    if(index == 0){
        return head.data;
    }else if(index == size -1){
        // 获取尾部
        return tail.data;
    }else{
        // 获取中间
        Node prev = head;
        for (int i = 0; i < index; i++) {
            prev = prev.next;
        }
        return prev.data;
    }
}

/***
 * 查找元素在链表中第一次出现的索引
 * @param element
 * @return
*/
@Override
public int indexOf(E element) {
    // 判断链表是否为空
    if(isEmpty()){
        return -1;
    }
    // 定义prev指针
    Node prev = head;
    // 定义索引值
    int index = 0;
    while (!prev.data.equals(element)){
        prev = prev.next;
        index++;
        // 如果没有找到，则返回-1
        if(prev == null){
            return -1;
        }
    }
    return index;
}

/***
 * 查找链表中是否有元素element
 * @param element
 * @return
*/
@Override
public boolean contains(E element) {
    return indexOf(element)!= -1;
}
```

测试代码:`LinkedSinglyListDemo`

```java
package cn.linkedlist.demo01;

public class LinkedSinglyListDemo {
    public static void main(String[] args) {
        LinkedSinglyList<Integer> linkedList = new LinkedSinglyList<>();

        System.out.println("===插入元素===");
        linkedList.add(0,1);
        linkedList.add(0,3);
        linkedList.add(0,5);
        linkedList.add(0,8);
    
        linkedList.add(12);
        linkedList.add(2, 23);
        System.out.println(linkedList);

        System.out.println("===查找元素===");
        Integer integer = linkedList.get(2);
        System.out.println("通过索引获取元素:" + integer);
        boolean b = linkedList.contains(23);
        System.out.println("是否存在该元素:" + b);
        int element = linkedList.indexOf(12);
        System.out.println("该元素的索引:" + element);
    }
}
```

2、执行结果

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211215130621.png" style="zoom:80%;" />	

3、修改节点

找到要更新的节点，然后把旧数据替换成新数据。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211112173541.png" style="zoom:80%;" />	

4、代码示例	

链表：`LinkedSinglyList`

```java
/***
 * 修改链表中指定index的元素为element
 * @param index
 * @param element
 * @return
*/
@Override
public E set(int index, E element) {
    if (index < 0|| index > size) {
        throw new ArrayIndexOutOfBoundsException("update index out of bounds");
    }
    // 定义返回值
    E result = null;
    if(index == 0){
        // 修改头部
        result= head.data;
        head.data = element;
    }else if(index == size -1){
        // 修改尾部
        result = tail.data;
        tail.data = element;
    }else{
        // 修改中间的元素
        Node prev = head;
        for (int i = 0; i < index; i++) {
            prev = prev.next;
        }
        result = prev.data;
        prev.data = element;
    }
    return result;
}
```

测试代码:`LinkedSinglyListDemo`

```java
package cn.linkedlist.demo01;

public class LinkedSinglyListDemo {
    public static void main(String[] args) {
        LinkedSinglyList<Integer> linkedList = new LinkedSinglyList<>();

        System.out.println("===插入元素===");
        linkedList.add(0,1);
        linkedList.add(0,3);
        linkedList.add(0,5);
        linkedList.add(0,8);
       
        linkedList.add(12);
       
        linkedList.add(2, 23);
        System.out.println(linkedList);

        System.out.println("===修改节点元素===");
        System.out.println("LinkedSinglyList(修改前)" + linkedList);
        linkedList.set(4, 38);
        System.out.println("LinkedSinglyList(修改后)" + linkedList);
    }
}
```

5、执行结果

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211215131023.png" style="zoom:80%;" />	

#### 3.2.5 删除操作	

1、思路分析

把要删除节点的前置节点的`next`指针，指向要删除元素的下一个节点即可。

> 删除头结点

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211125093152.png" style="zoom:80%;" />	

`head` 指向下一个元素

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211125093405.png" style="zoom:80%;" />	

然后让之前的元素断开

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211125093649.png" style="zoom:80%;" />	

> 删除尾节点

定义一个`prev`指针,直接找到尾节点前面那个元素。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211125094603.png" style="zoom:80%;" />	

让当前`prev`的下一个元素，执行置空操作。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211125094850.png" style="zoom:80%;" />	

然后让尾指针指向该元素

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211125095136.png" style="zoom:80%;" />	

> 删除中间元素

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211125100424.png" style="zoom:80%;" />	

先找到要删除节点的前驱，让删除节点前一个元素指向要删除元素的后继

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211125100843.png" style="zoom:80%;" />	

然后将要删除节点的后继置空

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211125101025.png" style="zoom:80%;" />	

> 链表只有一个元素

直接让`head` 和`tail`置空即可

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211125101901.png" style="zoom: 80%;" />	

2、代码示例	

链表：`LinkedSinglyList`

```java
/***
 * 删除链表中指定的元素element
 * @param element
 */
@Override
public void remove(E element) {
    int index = indexOf(element);
    if(index != -1){
        remove(index);
    }
}
/***
 * 删除链表中指定索引处index的元素
 * @param index
 * @return
*/
@Override
public E remove(int index) {
    if (index < 0|| index > size) {
        throw new ArrayIndexOutOfBoundsException("remove index out of bounds");
    }
    // 定义返回值
    E result = null;
    // 当链表只剩下一个元素
    if(size == 1){
        result = head.data;
        head = null;
        tail = null;
    }else if(index == 0){
        // 删除链表头部
        Node prev = head;
        result = prev.data;
        head = prev.next;
        // 置空操作
        prev.next = null;
    }else if(index == size -1){
        // 删除链表尾部
        Node prev = head;
        while (prev.next != tail){
            prev = prev.next;
        }
        result = tail.data;
        // 置空操作
        prev.next = null;
        tail = prev;
    }else{
        // 删除中间的某个元素
        Node prev = head;
        for (int i = 0; i < index -1; i++) {
            prev = prev.next;
        }
        Node deleteNode = prev.next;
        result = deleteNode.data;
        prev.next = deleteNode.next;
        // 置空
        deleteNode.next = null;
    }
    size --;
    return result;
}
```

测试代码:`LinkedSinglyListDemo`	

```java
package cn.linkedlist.demo01;

public class LinkedSinglyListDemo {
    public static void main(String[] args) {
        LinkedSinglyList<Integer> linkedList = new LinkedSinglyList<>();

        System.out.println("===插入元素===");
        linkedList.add(0,1);
        linkedList.add(0,3);
        linkedList.add(0,5);
        linkedList.add(0,8);
        linkedList.add(12);
        
        linkedList.add(2, 23);
        System.out.println(linkedList);

        System.out.println("===删除链表节点前====");
        System.out.println(linkedList);
        System.out.println("===删除链表节点后====");
        // 根据链表index位置的元素, 返回删除的元素
        linkedList.remove(2);
        System.out.println(linkedList);

        // 删除链表中的元素
        linkedList.remove(0);
        System.out.println(linkedList);
    }
}
```

3、执行结果

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211215131503.png" style="zoom:80%;" />

#### 3.3.6 约瑟夫问题

1、问题描述
传说有这样一个故事，在罗马人占领乔塔帕特后，39 个犹太人与约瑟夫及他的朋友躲到一个洞中，39个犹太人决定宁愿死也不要被敌人抓到，于是决定了一个自杀方式，41个人排成一个圆圈，第一个人从1开始报数，依次往后，如果有人报数到3，那么这个人就必须自杀，然后再由他的下一个人重新从1开始报数，直到所有人都自杀身亡为止。然而约瑟夫和他的朋友并不想遵从。于是，约瑟夫要他的朋友先假装遵从，他将朋友与自己安排在第16个与第31个位置，从而逃过了这场死亡游戏 。

2、问题转换

41个人坐一圈，第一个人编号为1，第二个人编号为2，第`n`个人编号为`n`。编号为1的人开始从1报数，依次向后，报数为3的那个人退出圈。自退出那个人开始的下一个人再次从1开始报数，以此类推，求出最后退出的那个人的编号。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211125192639.png" style="zoom: 67%;" />	

3、代码示例

链表类：`JosephusLinkedList`

```java
package cn.linkedlist.demo07;

public class JosephusLinkedList<E> {
    // 创建Node节点
    private class Node{
        //数据域 用来存储数据的
        public E data;
        //指针域 用来存储下一个结点对象的地址
        public Node next;

        // 构造方法
        public Node() {

        }

        public Node(E data) {
            this.data = data;
        }

        public Node(E data, Node next) {
            this.data = data;
            this.next = next;
        }

        @Override
        public String toString(){
            StringBuilder sb = new StringBuilder();
            sb.append(data);
            return sb.toString();
        }
    }

    // 链表元素的数量
    private int size;
    //链表当中的头指针指向第一个结点对象
    private Node head;
    //链表当中的头指针指向最后一个结点对象
    private Node tail;

    // 初始化结点
    public JosephusLinkedList(){
        head = null;
        tail = null;
        size = 0;
    }

    // 返回链表是否为空
    public boolean isEmpty(){
        return size == 0;
    }

    /***
     * 在链表末尾添加新的元素e
     * @param element
     */
    public void add(E element){
        add(size, element);
    }

    /***
     * 根据链表的index位置添加新的元素e
     * @param index
     * @param element
     */
    public void add(int index, E element){
        if (index < 0|| index > size) {
            throw new ArrayIndexOutOfBoundsException("add index out of bounds");
        }
        // 创建新的结点对象
        Node node = new Node(element);

        if(isEmpty()){
            // 链表为空
            head = node;
            tail = node;
            tail.next = head;
        }else if(index == 0){
            // 在链表头部添加元素
            node.next = head;
            head = node;
            tail.next = head;
        }else if(index == size){
            node.next = tail.next;
            // 在链表尾部添加元素
            tail.next = node;
            tail = node;
        }else{
            // 在链表中添加元素
            Node prev = head;
            for(int i=0; i < index -1; i++){
                prev = prev.next;
            }
            node.next = prev.next;
            prev.next = node;
        }
        size++;
    }

    /***
     * 元素在链表中第一次出现的索引
     * @param element
     * @return
     */
    public int indexOf(E element){
        // 定义prev指针
        Node prev = head;
        // 定义索引值
        int index = 0;
        while (!prev.data.equals(element)){
            prev = prev.next;
            index++;
            if(prev == head){
                return -1;
            }
        }
        return index;
    }

    /***
     * 删除链表中指定的元素element
     * @param element
     */
    public void removeElement(E element){
        int index = indexOf(element);
        if(index != -1){
            remove(index);
        }
    }

    /***
     * 删除链表中指定索引处index的元素
     * @param index
     * @return
     */
    public E remove(int index){
        if (index < 0|| index > size) {
            throw new ArrayIndexOutOfBoundsException("remove index out of bounds");
        }
        // 定义返回值
        E result = null;
        // 当链表只剩下一个元素
        if(size == 1){
            result = head.data;
            head = null;
            tail = null;
        }else if(index == 0){
            // 删除链表头部
            Node prev = head;
            result = prev.data;
            head = prev.next;
            // 置空操作
            prev.next = null;
            tail.next = head;
        }else if(index == size -1){
            // 删除链表尾部
            Node prev = head;
            while (prev.next != tail){
                prev = prev.next;
            }
            result = tail.data;
            // 修改操作
            prev.next = tail.next;
            tail = prev;
        }else{
            // 删除中间的某个元素
            Node prev = head;
            for (int i = 0; i < index -1; i++) {
                prev = prev.next;
            }
            Node deleteNode = prev.next;
            result = deleteNode.data;
            prev.next = deleteNode.next;
            // 置空
            deleteNode.next = null;
        }
        size --;
        return result;
    }

    @Override
    public String toString(){
        StringBuilder res = new StringBuilder();
        res.append("size=").append(size).append(", [");
        Node prev = head;
        for (int i = 0; i < size; i++) {
            if (i != 0) {
                res.append(", ");
            }

            res.append(prev);

            prev = prev.next;
        }
        res.append("]");
        return res.toString();
    }
	
    // 约瑟夫环问题
    public void josephusLoop(){
        if(size <= 2){
            return;
        }
        // 定义prev指针
        Node prev = head;
        while (size != 2){
            prev = prev.next;
            // 定义删除的结点
            Node deleteNode = prev.next;
            if(deleteNode == head){
                head = head.next;
            }else if(deleteNode == tail){
                tail = prev;
            }
            prev.next = deleteNode.next;
            deleteNode.next = null;
            size--;
            prev = prev.next;
        }
    }
}
```

测试类：`JosephusLinkedListDemo`	

```java
package cn.linkedlist.demo07;

public class JosephusLinkedListDemo {
    public static void main(String[] args) {
        JosephusLinkedList<Integer> list = new JosephusLinkedList<>();
        for (int i = 1; i <= 41; i++) {
            // 添加元素
            list.add(i);
        }

        System.out.println(list);
        // 调用方法
        list.josephusLoop();
        System.out.println(list);
    }
}
```

4、执行结果

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211125204831.png" style="zoom:80%;" />	

### 3.3 双向链表

#### 3.3.1 基本介绍

1、单向链表优缺点

- 单向链表，查找的方向只能是一个方向，而双向链表可以向前或者向后查找。
- 单向链表不能自我删除，需要靠辅助节点 ，而双向链表则可以自我删除。

2、双向链表基本介绍

双向链表也叫双向表，是链表的一种，它由多个结点组成，每个结点都由一个数据域和两个指针域组成，==数据域==`(data)`==用来存储数据==，==其中一个指针域==`(next)`==用来指向其后继结点，另一个指针域用来指向前驱结点==`(prev指针)`。链表的头结点的数据域不存储数据，指向前驱结点的指针域值为`null`，指向后继结点的指针域指向第一个真正存储数据的结点。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211121125618.png" style="zoom:80%;" />	

#### 3.3.2 添加操作

1、思路分析

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211119152313.png" style="zoom: 80%;" />	

> 头部插入

- 新建插入节点`newNode`。

- `first`前驱指向`newNode`。
- `newNode`后驱指向`first`。
- `first`指向`newNode`，这时候`head`只是表示第二个节点，而`head`需要表示第一个节点故改变指向。	

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211119153554.png" style="zoom:80%;" />	

> 尾部插入

- 新建插入节点`newNode`。
- `newNode`前驱指向`last`。
- `last`后驱指向`newNode`。
- `last`指向`newNode`，这时候`last`只是表示倒数第二个节点，而`last`需要表示最后节点故指向`newNode`。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211119155631.png" style="zoom:80%;" />

> 中间插入	
>

新建插入节点`newNode`

找到要插入`newNode`的前一个节点`preNode`。和后一个节点`nextNode`

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211119164056.png" style="zoom: 67%;" />	

 `newNode`后驱指向`nextNode`,`nextNode`前驱指向`newNode`，此时`newNode`和后面与链表已经联立，但是和前面处理分离状态。

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211119170136.png)

`preNode`后驱指向`newNode`，`newNode`前驱指向`preNode`，此时插入完整操作完毕。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211119191301.png" style="zoom:67%;" />	

2、代码示例

链表类：`DoubleLinkedList`

```java
package cn.linkedlist.demo03;

public class DoubleLinkedList<E> {
    // 链表元素的数量
    private int size;
    // 声明头结点
    private Node first;
    // 声明尾节点
    private Node last;

    // 创建Node节点
    private class Node{
        // 存放内容
        public E data;
        // 指向链表的上一个节点
        public Node prev;
        // 指向下一个节点
        public Node next;
        // 构造方法
        
        public Node() {
            
        }
        
        public Node(Node prev, E data, Node next) {
            this.prev = prev;
            this.data = data;
            this.next = next;
        }

        @Override
        public String toString(){
            return data.toString();
        }
    }

    // 初始化头结点
    public DoubleLinkedList(){
        first = null;
        last = null;
        size = 0;
    }

    /***
     * 获取链表中的元素个数
     * @return
     */
    public int getSize(){
        return size;
    }

    /***
     * 返回链表是否为空
     * @return
     */
    public boolean isEmpty(){
        return size == 0;
    }

    /***
     * 根据链表的index位置添加新的元素e
     * @param index
     * @param data
     */
    public void add(int index, E data){
        // 调用方法
        rangeCheckAdd(index);

        if (index == size) { // 往最后面添加元素
            addLast(data);
        } else if(index == 0){
            addLast(data);
        } else {
            // 新添加节点下一个元素
            Node nextNode = node(index);
            // 新添加节点的上一个元素
            Node prevNode = nextNode.prev;
            // 新添加节点
            Node newNode = new Node (prevNode, data, nextNode);
            // next节点的上一个prev指向新节点
            nextNode.prev = newNode;
            // prevNode节点的下一个next指向新节点
            prevNode.next = newNode;
        }
        size++;
    }

    /***
     * 在链表头添加新的元素e
     * @param data
     */
    public void addFirst(E data){
        // 创建一个新节点
       Node newNode = new Node(null, data, null);
       if(isEmpty()){
           last = newNode; // last -> newNode
       }else {
           first.prev = newNode; // first.prev->newNode
       }
       newNode.next = first; // newNode.next -> first;
       first = newNode;
       size++;
    }

    /***
     * 在链表末尾添加新的元素e
     * @param data
     */
    public void addLast(E data){
        // 创建一个新节点
        Node newNode = new Node(null, data, null);
        if(isEmpty()){
            first = newNode; // first->newNode
        }else{
            last.next = newNode; // last指向的节点指向新节点
            newNode.prev = last; // 新节点的前驱指向last指针
        }
        last = newNode; // last指针指向新节点
        size++;
    }
	
    /**
     * 获取index位置对应的节点对象
     * @param index
     * @return
     */
    private Node node(int index) {
        rangeCheck(index);
        Node node;
        if (index < (size >> 1)) {
            node = first;
            for (int i = 0; i < index; i++) {
                node = node.next;
            }
        } else {
            node = last;
            for (int i = size - 1; i > index; i--) {
                node = node.prev;
            }
        }
        return node;
    }

    @Override
    public String toString(){
        StringBuilder res = new StringBuilder();
        res.append("size=").append(size).append(", [");
        // 定义一个指针变量
        Node cur = first;
        while(cur != null){
            res.append(cur + "->");
            cur = cur.next;
        }
        res.append("NULL");
        res.append("]");
        return res.toString();
    }

    // 索引值检查范围方法
    private void rangeCheck(int index){
        if(index < 0 || index >=size){
            // 调用越界处理方法
            outOfBounds(index);
        }
    }

    // 添加方法索引检查范围
    private void rangeCheckAdd(int index){
        if(index < 0 || index >size){
            // 调用越界处理方法
            outOfBounds(index);
        }
    }
    // 数组索引越界处理
    private void outOfBounds(int index){
        throw new IndexOutOfBoundsException("index:" + index + ", Size:" + size);
    }
}
```

测试类：`DoubleLikedListTest`

```java
package cn.linkedlist.demo03;

public class DoubleLinkedListDemo01 {
    public static void main(String[] args) {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        System.out.println("===链表头部插入===");
        for(int i=0; i<5; i++){
            list.addFirst(i);
            System.out.println(list);
        }

        System.out.println("===链表尾部插入===");
        list.addLast(12);
        list.addLast(111);
        list.addLast(123);
        list.addLast(15);
        System.out.println(list);

        System.out.println("===链表中间插入===");
        list.add(2, 23);
        list.add(7, 66);
        list.add(8, 39);

        System.out.println(list);
    }
}

```

3、代码示例

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211119203838.png) 

#### 3.3.3 修改和查询操作

1、查询操作

链表类：`DoubleLinkedList`

```java
/***
 * 得链表的第index个位置的元素
 * @param index
 * @return
*/
public E get(int index){
    return node(index).data;
}

/***
  * 获得链表的第一个元素
  * @return
 */
public E getFirst(){
    return get(0);
}

/***
  * 获得链表的最后一个元素
  * @return
 */
public E getLast(){
    return get(size - 1);
}

/***
 * 查找链表中是否有元素e
 * @param data
 * @return
*/
public boolean contains(E data){
    Node cur = first.next;
    while(cur != null){
        if(cur.data.equals(data))
            return true;
        cur = cur.next;
    }
    return false;
}

```

测试类：`DoubleLikedListTest`

```java
package cn.linkedlist.demo03;

public class DoubleLinkedListDemo01 {
    public static void main(String[] args) {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        for(int i=0; i<5; i++){
            list.addFirst(i);
        }
        list.addLast(12);
        list.addLast(111);
        list.addLast(123);
        list.addLast(15);
       
        list.add(2, 23);
        list.add(7, 66);
        list.add(8, 39);
        
        System.out.println("===查找元素===");
        Integer integer = list.get(2);
        System.out.println("通过索引获取元素:" + integer);
        Integer first = list.getFirst();
        System.out.println("第一个链表元素:" + first);
        Integer last = list.getLast();
        System.out.println("最后链表元素:" + last);
        boolean b = list.contains(23);
        System.out.println("是否存在该元素:" + b);
    }
}
```

2、执行结果

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211120134019.png" style="zoom:80%;" />	

3、修改操作

链表类：`DoubleLinkedList`

```java
/***
     * 修改链表的第index(0-based)个位置的元素为e
     * @param index
     * @param data
     */
public void update(int index, E data){
    // 调用索引检测方法
    rangeCheck(index);
    // 创建cur指针，指向虚拟头结点
    Node cur = first;
    for(int i = 0 ; i < index ; i ++) {
        cur = cur.next;
    }
    cur.data = data;
}
```

测试类：`DoubleLikedListTest`

```java
package cn.linkedlist.demo03;

public class DoubleLinkedListDemo01 {
    public static void main(String[] args) {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        for(int i=0; i<5; i++){
            list.addFirst(i);
        }
        list.addLast(12);
        list.addLast(111);
        list.addLast(123);
        list.addLast(15);
       
        list.add(2, 23);
        list.add(7, 66);
        list.add(8, 39);

        System.out.println("===修改节点元素===");
        System.out.println("linkedList(修改前)" + list);
        list.update(4, 38);
        System.out.println("linkedList(修改后)" + list);
    }
}
```

4、执行结果

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211120134402.png" style="zoom:80%;" />	

#### 3.3.3 删除操作

1、思路分析

因为是双向链表，因此可以实现自我删除某个节点，直接找到要删除的这个节点。

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211120093812.png)

> 头结点删除

`first`节点的后驱节点的前指针`prev`改为`null`。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211120095157.png" style="zoom:80%;" />

`first`节点指向`first.next`，这样`first`就指向需要的第一个节点。

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211120110145.png)

> 尾节点删除

尾删除就是删除双向链表中的最后一个节点，也就是尾指针所指向的那个节点，思想和头删除的思想一致。

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211120093812.png)

`last.prev.next=null`尾节点的前一个节点`(prev)`的后驱节点等于`null`。

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211120105310.png)

`last = last.prev`尾节点指向它的前驱节点，此时尾节点由于步骤1`next`已经为`null`，完成删除。

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211120110014.png)

> 中间删除

找到待删除节点`deleteNode`的前驱节点`preNode`，`preNode.next`是要删除的节点

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211120115331.png)

`preNode.next.next.pre=preNode`，将待删除`deleteNode`的后驱节点`nextNode`的`prev`指针指向`preNode`，等价于`nextNode.pre=preNode`。

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211120120903.png)

`preNode.next=preNode.next.next;`，此时`deleteNode`被跳过成功删除。

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211120121324.png)

2、代码示例

链表类：`DoubleLinkedList`

```java
/***
 * 从链表中删除index位置的元素, 返回删除的元素
 * @param index
*/
public void remove(int index){
    // 调用索引检测方法
    rangeCheck(index);
    // 条件判断
    if(index == 0){
        removeFirst();
    }else if(index == size -1 ){
        removeLast();
    }else {

        //删除位置的前一个元素
        Node preNode = first;
        for(int i=0; i < index-1; i++) {
            preNode = preNode.next;
        }
        //要删除位置的元素
        Node deleteNode = preNode.next;
        //要删除元素的下一个元素
        Node nextNode = deleteNode.next;
        
        preNode.next = nextNode;
        nextNode.prev = preNode;

        size--;
    }
}

/***
 * 从链表中删除第一个元素, 返回删除的元素
*/
public void removeFirst(){
    if (size == 1)
    {
        first = null;
        last = null;
    } else {
        first =first.next;
    }
    size--;
}

/***
 * 从链表中删除最后一个元素, 返回删除的元素
*/
public void removeLast(){
    if (size == 1)
    {
        first = null;
        last = null;
    } else {
        last.prev.next = null;
        last = last.prev;
    }
    size--;
}

/***
 * 从链表中删除元素e
 * @param data
 */
public void removeElement(E data){
    // 创建头结点
    Node prev = first;
    while(prev.next != null){
        if(prev.next.data.equals(data))
            break;
        prev = prev.next;
    }

    if(prev.next != null){
        Node delNode = prev.next;
        prev.next = delNode.next;
        delNode.next = null;
        size --;
    }
}
```

测试类：`DoubleLikedListTest`

```java
package cn.linkedlist.demo03;

public class DoubleLinkedListDemo01 {
    public static void main(String[] args) {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        for(int i=0; i<5; i++){
            list.addFirst(i);
        }
        
        list.addLast(12);
        list.addLast(111);
        list.addLast(123);
        list.addLast(15);
        
        list.add(2, 23);
        list.add(7, 66);
        list.add(8, 39);

        System.out.println("===删除链表节点前====");
        System.out.println(list);
        System.out.println("===删除链表节点后====");

        // 删除链表第一个节点
        list.removeFirst();
        System.out.println(list);
        // 根据链表index位置的元素, 返回删除的元素
        list.remove(2);
        System.out.println(list);

        // 删除链表最后一个节点
        list.removeLast();
        System.out.println(list);

        // 删除链表中的元素
        list.removeElement(39);
        System.out.println(list);
    }
}
```

3、执行结果

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211120145818.png" style="zoom:80%;" />	

### 3.4 快慢指针

快慢指针指的是定义两个指针，这两个指针的移动速度一块一慢，以此来制造出想要的差值，这个差值可以找到链表上相应的结点。==一般情况下，快指针的移动步长为慢指针的两倍==。

#### 3.4.1 链表中间值

找出链表的中间元素值并返回。

1、需求分析

如下图，把一个链表看成一个跑道，利用快慢指针假设`a`的速度是`b`的两倍，那么当`a`跑完全程后，`b`刚好跑一半，以此来达到找到中间节点的目的。

最开始，`slow`与`fast`指针都指向链表第一个节点，然后`slow`每次移动一个指针，`fast`每次移动两个指针。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211115095341.png" style="zoom:80%;" />

2、代码实现

```java
package cn.linkedlist.demo03;

public class LinkedListCentreValue {
    public static void main(String[] args) {
        //创建结点
        Node<String> first = new Node<String>("a", null);
        Node<String> second = new Node<String>("b", null);
        Node<String> third = new Node<String>("c", null);
        Node<String> fourth = new Node<String>("d", null);
        Node<String> fifth = new Node<String>("e", null);
        Node<String> six = new Node<String>("f", null);
        Node<String> seven = new Node<String>("g", null);

        //所有结点之间的指向
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = six;
        six.next = seven;

        //查找中间值
        String mid = getMid(first);
        System.out.println("中间值元素为："+mid);
    }

    private static class Node<T>{
        //存储数据
        T data;
        //下一个结点
        Node next;

        public Node(T data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    /**
     * @param first 链表的首结点
     * @return 链表的中间结点的值
     */
    public static String getMid(Node<String> first) {
        //定义两个指针
        Node<String> fast = first;
        Node<String> slow = first;
        //使用两个指针遍历链表，当快指针指向的结点没有下一个结点了，就可以结束了，结束之后慢指针指向的结点就是中间值
        while(fast!=null &&fast.next!=null){
            //fast的值和slow的值
            fast = fast.next.next;
            slow=slow.next;
        }
        // 返回慢指针数据
        return slow.data;
    }
}
```

3、执行结果

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211115102430.png" style="zoom:80%;" />	

#### 3.4.2 单向链表是否有环

判断链表中是否有环。

1、思路分析

使用快慢指针的思想，还是把链表比作一条跑道，链表中有环，那么这条跑道就是一条圆环跑道，在一条圆环跑道中，两个人有速度差，那么迟早两个人会相遇，==只要相遇那么就说明有环==。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211115103237.png" style="zoom:80%;" />	

两个指针开始移动

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211115103641.png" style="zoom:80%;" />	

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211115104930.png" style="zoom:80%;" />	

两个指针继续移动

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211115105541.png" style="zoom: 67%;" />	

两个指针最终相遇

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211115110620.png" style="zoom:80%;" />	

2、代码示例

```java
package cn.linkedlist.demo03;

public class CircleListCheckDemo01 {
    public static void main(String[] args) throws Exception {
        //创建结点
        Node<String> first = new Node<String>("A", null);
        Node<String> second = new Node<String>("B", null);
        Node<String> third = new Node<String>("C", null);
        Node<String> fourth = new Node<String>("D", null);
        Node<String> fifth = new Node<String>("E", null);
        Node<String> six = new Node<String>("F", null);
        Node<String> seven = new Node<String>("G", null);

        //创建结点之间的指向
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = six;
        six.next = seven;
        //产生环
        seven.next = third;

        //判断链表是否有环
        boolean circle = isCircle(first);
        System.out.println("链表是否有环存在：" + circle);
    }

    /**
     * 判断链表中是否有环
     * @param first 链表首结点
     * @return ture为有环，false为无环
     */
    public static boolean isCircle(Node<String> first) {
        //定义快慢指
        Node<String> fast = first;
        Node<String> slow = first;

        //遍历链表，如果快慢指针指向了同一个结点，那么证明有环
        while (fast != null && fast.next != null) {
            //变换fast指针和slow指针
            fast = fast.next.next;
            slow = slow.next;

            // 判断两个指针是否相遇
            if (fast.equals(slow)) {
                return true;
            }
        }
        return false;
    }

    //结点类
    private static class Node<T> {
        //存储数据
        T data;
        //下一个结点
        Node next;
        // 构造方法
        public Node(T data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
}
```

3、执行结果

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211115113129.png" style="zoom:80%;" />	

#### 3.4.3 有环链表入口

需求:寻找有环链表入口

1、需求分析

当快慢指针相遇时，可以判断到链表中有环，这时定义一个新指针指向链表的起点，且步长与慢指针一样为`1`，==则慢指针与“新”指针相遇的地方就是环的入口==。

指针开始移动

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211115122034.png" style="zoom:80%;" />	

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211115122340.png" style="zoom:80%;" />	

找的环的入口

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211115123946.png" style="zoom:80%;" />	

2、代码示例

```java
package cn.linkedlist;

public class CircleListInDemo01 {
    public static void main(String[] args){
        // 创建节点对象
        Node<String> first = new Node<String>("A", null);
        Node<String> second = new Node<String>("B", null);
        Node<String> third = new Node<String>("C", null);
        Node<String> fourth = new Node<String>("D", null);
        Node<String> fifth = new Node<String>("E", null);
        Node<String> six = new Node<String>("F", null);
        Node<String> seven = new Node<String>("G", null);

        //结点之间的相互指向
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = six;
        six.next = seven;
        //产生环
        seven.next = third;
        
        //查找环的入口结点，调用getEntrance()方法
        Node<String> entrance = getEntrance(first);
        System.out.println("链表环的入口结点元素："+entrance.data);
    }

    /**
     * 查找有环链表中环的入口结点
     * @param first 链表首结点
     * @return 环的入口结点
     */
    public static Node getEntrance(Node<String> first) {
        //定义快慢指针
        Node<String> fast = first;
        Node<String> slow = first;
        Node<String> temp = null;

        //遍历链表，先找到环(快慢指针相遇),准备一个临时指针，指向链表的首结点，继续遍历，直到慢指针和临时指针相遇，那么相遇时所指向的结点就是环的入口
        while(fast!=null && fast.next!=null){
            //变换快慢指针
            fast = fast.next.next;
            slow = slow.next;

            //判断快慢指针是否相遇
            if (fast.equals(slow)){
                temp = first;
                continue;
            }

            //让临时结点变换
            if (temp!=null){
                temp = temp.next;
                //判断临时指针是否和慢指针相遇
                if (temp.equals(slow)){
                    break;
                }
            }
        }
        return temp;
    }
    //结点类
    private static class Node<T> {
        //存储数据
        T data;
        //下一个结点
        Node next;

        public Node(T data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
}
```

3、执行结果

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211115133901.png" style="zoom:80%;" />	

### 3.5 单向循环链表

#### 3.5.1 基本介绍

循环链表，顾名思义，链表整体要形成一个圆环状。在单向链表中，最后一个节点的指针为`null`，不指向任何结点，因为没有下一个元素了。==要实现循环链表，只需要让单向链表的最后一个节点的指针指向头结点即可==。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211125144242.png" style="zoom:80%;" />

#### 3.5.2 添加操作

1、思路分析

> 链表为空的时候

让`head`和`tail`同时指向这个结点，让尾结点的下一跳指向头结点。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211125150051.png" style="zoom:80%;" />	

> 头部添加

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211125151140.png" style="zoom:80%;" />	

先让要添加的元素指向`head`,然后再将`head`指针指向新结点。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211125151656.png" style="zoom:80%;" />	

最后让`tail`指针下一跳重新指向头结点

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211125152203.png" style="zoom:80%;" />	

> 尾部添加

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211125152651.png" style="zoom:80%;" />	

直接让新结点的下一跳指向头结点

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211125152905.png" style="zoom:80%;" />	

当前尾节点指向新节点

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211125153350.png" style="zoom:80%;" />	

最后`tail`指针移动到新节点

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211125153946.png" style="zoom:80%;" />	

2、代码示例

接口类：`List`

```java
package cn.linkedlist.demo02;

/***
 * List接口
 * @param <E>
 */
public interface List<E> extends Iterable<E>{
    void add(E element);
    void add(int index, E element) ;
    void remove(E element);
    E remove(int index);
    E get(int index);
    E set(int index, E element) ;
    int size();
    int indexOf(E element) ;
    boolean contains(E element);
    boolean isEmpty();
    void clear();
}
```

链表类：`LinkedSinglyCircularList`

```java
package cn.linkedlist.demo02;

import java.util.Iterator;

// 单向循环链表
public class LinkedSinglyCircularList<E> implements List<E>{
    // 创建Node节点
    private class Node{
        //数据域 用来存储数据的
        public E data;
        //指针域 用来存储下一个结点对象的地址
        public Node next;

        // 构造方法
        public Node() {
            this(null, null);
        }

        public Node(E data) {
            this(data, null);
        }

        public Node(E data, Node next) {
            this.data = data;
            this.next = next;
        }

        @Override
        public String toString(){
            StringBuilder sb = new StringBuilder();
            sb.append(data).append("->").append(next.data);
            return sb.toString();
        }
    }
    // 链表元素的数量
    private int size;
    //链表当中的头指针指向第一个结点对象
    private Node head;
    //链表当中的头指针指向最后一个结点对象
    private Node tail;

    // 初始化链表
    public LinkedSinglyCircularList(){
        head = null;
        tail = null;
        size = 0;
    }

    public LinkedSinglyCircularList(E[] arr){
        for (E e : arr){
            add(e);
        }
    }

    /***
     * 在链表末尾添加新的元素e
     * @param element
     */
    @Override
    public void add(E element) {
        add(size, element);
    }

    /***
     * 根据链表的index位置添加新的元素e
     * @param index
     * @param element
     */
    @Override
    public void add(int index, E element) {
        if (index < 0|| index > size) {
            throw new ArrayIndexOutOfBoundsException("add index out of bounds");
        }
        // 创建新的结点对象
        Node node = new Node(element);
        if(isEmpty()){
            // 链表为空
            head = node;
            tail = node;
            tail.next = head;
        }else if(index == 0){
            // 在链表头部添加元素
            node.next = head;
            head = node;
            tail.next = head;
        }else if(index == size){
            node.next = tail.next;
            // 在链表尾部添加元素
            tail.next = node;
            tail = node;
        }else{
            // 在链表中添加元素
            Node prev = head;
            for(int i=0; i < index -1; i++){
                prev = prev.next;
            }
            node.next = prev.next;
            prev.next = node;
        }
        size++;
    }

    /***
     * 得链表的第index个位置的元素
     * @param index
     * @return
     */
    @Override
    public E get(int index) {
        if (index < 0|| index > size) {
            throw new ArrayIndexOutOfBoundsException("get index out of bounds");
        }
        // 获取头部
        if(index == 0){
            return head.data;
        }else if(index == size -1){
            // 获取尾部
            return tail.data;
        }else{
            // 获取中间
            Node prev = head;
            for (int i = 0; i < index; i++) {
                prev = prev.next;
            }
            return prev.data;
        }
    }

    /***
     * 修改链表中指定index的元素为element
     * @param index
     * @param element
     * @return
     */
    @Override
    public E set(int index, E element) {
        if (index < 0|| index > size) {
            throw new ArrayIndexOutOfBoundsException("update index out of bounds");
        }
        // 定义返回值
        E result = null;
        if(index == 0){
            // 修改头部
            result= head.data;
            head.data = element;
        }else if(index == size -1){
            // 修改尾部
            result = tail.data;
            tail.data = element;
        }else{
            // 修改中间的元素
            Node prev = head;
            for (int i = 0; i < index; i++) {
                prev = prev.next;
            }
            result = prev.data;
            prev.data = element;
        }
        return result;
    }

    @Override
    public int size() {
        return size;
    }

    /***
     * 查找元素在链表中第一次出现的索引
     * @param element
     * @return
     */
    @Override
    public int indexOf(E element) {
        // 判断链表是否为空
        if(isEmpty()){
            return -1;
        }
        // 定义prev指针
        Node prev = head;
        // 定义索引值
        int index = 0;
        while (!prev.data.equals(element)){
            prev = prev.next;
            index++;
            // 如果没有找到，则返回-1
            if(prev == null){
                return -1;
            }
        }
        return index;
    }

    /***
     * 查找链表中是否有元素element
     * @param element
     * @return
     */
    @Override
    public boolean contains(E element) {
        return indexOf(element)!= -1;
    }

    /***
     * 判断链表是否为空
     * @return
     */
    @Override
    public boolean isEmpty() {
        return size == 0 && head == null && tail == null;
    }

    @Override
    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }

    /***
     * 迭代器实现
     * @return
     */
    @Override
    public Iterator<E> iterator() {
        return new LinkedSinglyCircularListIterator();
    }

    class LinkedSinglyCircularListIterator implements Iterator<E>{
        // 定义游标
        private Node cur = head;
        // 创建flag，表示还可以继续循环
        private boolean flag = true;

        @Override
        public boolean hasNext() {
            if(isEmpty()){
                return false;
            }
            return flag;
        }

        @Override
        public E next() {
            E ret = cur.data;
            cur = cur.next;
            // 再次判断，是否已经循环完一圈
            if(cur == head){
                flag = false;
            }
            return ret;
        }
    }

    @Override
    public String toString(){
        StringBuilder res = new StringBuilder();
        res.append("size=").append(size).append(", [");
        Node node = head;
        for (int i = 0; i < size; i++) {
            if (i != 0) {
                res.append(", ");
            }
            res.append(node);

            node = node.next;
        }
        res.append("]");
        return res.toString();
    }
}
```

测试类：`LinkedSinglyCircularListDemo`

```java
package cn.linkedlist.demo02;

public class LinkedSinglyCircularListDemo {
    public static void main(String[] args) {
        LinkedSinglyCircularList<Integer> list1 = new LinkedSinglyCircularList<>();
        System.out.println("===链表头部插入===");
        list1.add(0,1);
        list1.add(0,3);
        list1.add(0,5);
        list1.add(0,8);
        System.out.println(list1);

        System.out.println("==链表尾部插入==");
        list1.add(12);
        System.out.println(list1);

        System.out.println("===链表中间插入===");
        list1.add(2, 23);
        System.out.println(list1);
    }
}
```

2、执行结果

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211215131503.png" style="zoom: 67%;" />	

#### 3.5.3 删除操作

1、思路分析

> 删除头结点

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211125155434.png" style="zoom:80%;" />

`head` 指向下一个结点

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211125155647.png)

原头结点的下一跳置空，让尾指针的下一跳重新指向头结点。

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211125160155.png)

删除成功！！！

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211125160344.png" style="zoom:80%;" />	

> 删除尾节点

定义一个指针`prev`，找到删除尾部节点的前驱。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211125160921.png" style="zoom:80%;" />	

让`prev.next`直接指向头结点

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211125161152.png" style="zoom:80%;" />	

最后让`tail`指向新节点

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211125161303.png" style="zoom:80%;" />	

删除成功！！！

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211125161438.png" style="zoom:80%;" />	

2、代码示例

链表类：`LinkedSinglyCircularList`

```java
/***
 * 删除链表中指定的元素element
 * @param element
*/
@Override
public void remove(E element) {
    int index = indexOf(element);
    if(index != -1){
        remove(index);
    }
}
/***
 * 删除链表中指定索引处index的元素
 * @param index
 * @return
*/
@Override
public E remove(int index){
    if (index < 0|| index > size) {
        throw new ArrayIndexOutOfBoundsException("remove index out of bounds");
    }
    // 定义返回值
    E result = null;
    // 当链表只剩下一个元素
    if(size == 1){
        result = head.data;
        head = null;
        tail = null;
    }else if(index == 0){
        // 删除链表头部
        Node prev = head;
        result = prev.data;
        head = prev.next;
        // 置空操作
        prev.next = null;
        tail.next = head;
    }else if(index == size -1){
        // 删除链表尾部
        Node prev = head;
        while (prev.next != tail){
            prev = prev.next;
        }
        result = tail.data;
        // 修改操作
        prev.next = tail.next;
        tail = prev;
    }else{
        // 删除中间的某个元素
        Node prev = head;
        for (int i = 0; i < index -1; i++) {
            prev = prev.next;
        }
        Node deleteNode = prev.next;
        result = deleteNode.data;
        prev.next = deleteNode.next;
        // 置空
        deleteNode.next = null;
    }
    size --;
    return result;
}
```

测试类：`LinkedSinglyCircularListDemo`

```java
package cn.linkedlist.demo06;

public class SingleCircleLinkedListDemo {
    public static void main(String[] args) {
        SingleCircleLinkedList<Integer> singleLinkedList = new SingleCircleLinkedList<>();
        singleLinkedList.add(0,1);
        singleLinkedList.add(0,3);
        singleLinkedList.add(0,5);
        singleLinkedList.add(0,8);
        
        singleLinkedList.add(12);
        singleLinkedList.add(2, 23);

        System.out.println("===删除链表节点前====");
        System.out.println(singleLinkedList);
        System.out.println("===删除链表节点后====");
        // 根据链表index位置的元素, 返回删除的元素
         singleLinkedList.remove(2);
        System.out.println(singleLinkedList);

        // 删除链表中的元素
        singleLinkedList.removeElement(12);
        System.out.println(singleLinkedList);
    }
}
```

2、执行结果

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211215165115.png" style="zoom: 67%;" />	

### 3.6 双向循环链表

#### 3.6.1 基本介绍

双向循环链表就是在双线链表的基础上首尾相连（==第一个节点的prev指向最后一个节点，最后一个节点的next指向第一个节点==）。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211123160444.png" style="zoom:80%;" />

#### 3.6.2 添加操作

1、思路分析

> 头部插入

当整个链表都为空时，添加操作。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211123162216.png" style="zoom:80%;" />	

头结点和尾节点都指向自己。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211123162917.png" style="zoom: 80%;" />	

当链表不为空时，添加操作

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211123163513.png" style="zoom: 80%;" />	

先把当前头节点的上一跳地址给新元素的上一跳

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211123163728.png" style="zoom: 80%;" />	

然后让新节点的后驱指针指向`head`结点，再让`head`的前驱指针指向新元素。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211123164206.png" style="zoom:67%;" />	

更新`head`结点，让`head`结点指向新结点，更新`tail`结点，让`tail`的下一跳重新指向`head`。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211123165631.png" style="zoom:80%;" />	

> 尾部插入	

将当前`tail`的下一跳给新节点的下一跳

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211123195208.png" style="zoom:80%;" />	

让`tail`的下一跳指向新结点，新结点的上一跳指向`tail`。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211123195830.png" style="zoom:80%;" />	

`tail`重新指向新结点。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211123200044.png" style="zoom:80%;" />	

直接让`head`的上一跳重新指向`tail`。

​	<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211123202701.png" style="zoom:80%;" />

> 中间插入

1、离头部比较近

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211123210250.png)

定义两个指针`p`，`q`，找到要插入节点前驱，让`p`的上一跳指向新节点，让新节点的下一跳指向`p`。

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211123210506.png)

让`q`的上一跳指向新节点，让新节点的下一跳指向`q`。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211123210653.png" style="zoom:80%;" />

2、离尾部比较近

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211123211151.png)

让`q`的下一跳指向新节点，让新节点的上一跳指向`q`。

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211123211430.png)

让`p`的上一跳指向新节点，让新节点的下一跳指向`p`。

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211123212944.png)

2、代码示例

链表类: `DoubleCircleLinkedList`

```java
package cn.linkedlist.demo05;

import java.util.Iterator;

public class DoubleCircleLinkedList<E> implements List<E>{
    // 创建Node节点
    private class Node {
        // 数据域
        E data;
        // 指向直接前驱的指针
        Node prev;
        // 指向直接后继的指针
        Node next;

        public Node() {

        }

        public Node(E data) {
            this.data = data;
        }

        public Node(E data, Node prev, Node next) {
            this.data = data;
            this.prev = prev;
            this.next = next;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            if (prev != null) {
                sb.append(prev.data);
            } else {
                sb.append("null");
            }

            sb.append("->").append(data).append("->");

            if (next != null) {
                sb.append(next.data);
            } else {
                sb.append("null");
            }

            return sb.toString();
        }
    }

    // 链表元素的数量
    private int size;
    // 声明头结点
    private Node head;
    // 声明尾节点
    private Node tail;

    // 初始化头结点
    public DoubleCircleLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    //默认向表尾添加元素
    @Override
    public void add(E element) {
        add(size, element);
    }

    @Override
    public void add(int index, E element) {
        if (index < 0|| index > size) {
            throw new ArrayIndexOutOfBoundsException("add index out of bounds");
        }
        // 创建node对象
        Node node = new Node(element);

        if(isEmpty()){
            head = node;
            tail = node;
            tail.next = head;
            head.prev = tail;
        }else if(index == 0){
            // 头结点的上一跳指向新节点的上一跳
            node.prev = head.prev;
            node.next = head;
            head.prev = node;
            head = node;
            tail.next = head;
        }else if(index == size){
            node.next = tail.next;
            tail.next = node;
            node.prev = tail;
            tail = node;
            head.prev = tail;
        }else{
            // 定义两个指针变量
            Node p,q;
            if(index <= size / 2){
                p = head;
                for(int i =0; i < index -1 ; i++){
                    p = p.next;
                }
                q = p.next;
                p.next = node;
                node.prev = p;
                q.prev = node;
                node.next = q;
            }else{
                p = tail;
                for(int i=size -1; i > index; i--){
                    p = p.prev;
                }
                q = p.prev;
                q.next = node;
                node.prev = q;
                p.prev = node;
                node.next = p;
            }
        }
        size++;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public int index0f(E element) {
        Node p = head;
        int index = 0;
        while (!p.data.equals(element)){
            p = p.next;
            index++;
            if(p == head){
                return -1;
            }
        }
        return index;
    }

    @Override
    public boolean contains(E element) {
        return index0f(element) != -1;
    }

    @Override
    public boolean isEmpty() {
        return size== 0 && head == null && tail == null;
    }

    @Override
    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append("size=").append(size).append(", [");
        Node node = head;
        for (int i = 0; i < size; i++) {
            if (i != 0) {
                res.append(", ");
            }

            res.append(node);

            node = node.next;
        }
        res.append("]");
        return res.toString();
    }
}
```

测试类：`DoubleCircleLinkedListDemo`

```java
package cn.linkedlist.demo05;
public class DoubleCircleLinkedListDemo {
    public static void main(String[] args) {
        DoubleCircleLinkedList<Integer> list = new DoubleCircleLinkedList<>();
        System.out.println("===链表头部插入===");
       
        list.add(0, 1);
        list.add(0, 2);
        list.add(0, 3);
        System.out.println(list);

        System.out.println("===链表尾部插入===");
        list.add(list.size(), 4);
        list.add(list.size(), 5);
        list.add(list.size(), 6);
        System.out.println(list);
    }
}
```

3、执行结果

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211123213900.png" style="zoom:80%;" />	

#### 3.6.3 删除操作

1、思路分析

> 删除头结点

`node`节点为`head.next`，最终`node`是新的头结点。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211124092328.png" style="zoom:80%;" />

`head`的下一跳置空。

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211124092541.png)

`head`的上一跳，给`node`的上一跳。

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211124092930.png)

`head`的上一跳置空！！`head`重新指向`node`。

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211124093432.png)

最后让尾指针下一跳重新指向`head`即可。

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211124094532.png)

> 删除尾节点

`node`为`tail.pre`前驱，最终`node`是新的尾结点。

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211124095427.png)

让`tail`的上一跳置空。

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211124095638.png)

`tail`的下一跳给`node`的下一跳，`tail`的下一跳置空。

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211124095924.png)

`tail`重新指向`node`。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211124100904.png" style="zoom:80%;" />

`head`的上一跳重新指向`tail`。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211124101129.png" style="zoom:80%;" />

> 删除中间节点

1、离头部比较近

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211124145916.png)

定义三个指针，`p`是要删除节点的前驱，`q`是要删除节点，`r`是要删除节点的后继，p指针移动到要删除节点的前驱。

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211124150210.png)

让`p`的下一跳直接指向`r`，让`r`的上一跳重新指向`p`。

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211124151015.png)

让`q`的上一跳和`q`的下一跳直接置空。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211124151151.png" style="zoom:80%;" />

删除成功。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211124151737.png" style="zoom:80%;" />

2、离尾部比较近

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211124152327.png)

定义三个节点指针，`p`是要删除节点的前驱，`q`是要删除节点，`R`是要删除节点的后继。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211124152725.png" style="zoom:80%;" />

让`R`的上一跳指向`p`，让`p`的下一跳指向`R`，让`q`的两边同时置空！！！

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211124153113.png)

最后删除成功！！！

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211124153248.png)

2、代码示例

链表类: `DoubleCircleLinkedList`

```java
//删除链表中指定的元素element
@Override
public void remove(E element) {
    int index = index0f(element);
    if(index != -1){
        remove(index);
    }
}

//删除链表中指定角标处index的元素
@Override
public E remove(int index) {
    if (index < 0|| index > size) {
        throw new ArrayIndexOutOfBoundsException("remove index out of bounds");
    }
    // 定义ret变量
    E ret = null;
    Node node;
    // 当链表只剩一个元素
    if(size ==1){
        ret = head.data;
        head = null;
        tail = null;
        // 删除表头
    }else if(index == 0){
        ret = head.data;
        node = head.next;
        head.next = null;
        node.prev = head.prev;
        head.prev = null;
        head = node;
        tail.next = head;
        // 删除表尾
    }else if(index == size -1){
        ret = tail.data;
        node = tail.prev;
        tail.prev = null;
        node.next = tail.next;
        tail.next = null;
        tail = node;
        head.prev = tail;
    }else{
        // 删除链表中间的某一个元素
        Node p, q, r;
        if(index <= size / 2){
            p = head;
            for(int i=0; i < index-1; i++){
                p = p.next;
            }
            q = p.next;
            ret = q.data;
            r = q.next;
            p.next = r;
            r.prev = p;
            q.next = null;
            q.prev = null;
        }else{
            p = tail;
            for(int i = size -1; i > index + 1; i--){
                p = p.prev;
            }
            q = p.prev;
            ret = q.data;
            r = q.prev;
            r.next = p;
            p.prev = r;
            q.next = null;
            q.prev = null;
        }
    }
    size --;
    return ret;
}
```

测试类：`DoubleCircleLinkedListDemo`

```java
package cn.linkedlist.demo05;
public class DoubleCircleLinkedListDemo {
    public static void main(String[] args) {
        DoubleCircleLinkedList<Integer> list = new DoubleCircleLinkedList<>();
        System.out.println("===链表头部插入===");
        
        list.add(0, 1);
        list.add(0, 2);
        list.add(0, 3);
        System.out.println(list);

        System.out.println("===链表尾部插入===");
        list.add(list.size(), 4);
        list.add(list.size(), 5);
        list.add(list.size(), 6);
        System.out.println(list);

        System.out.println("==删除元素==");
        System.out.println(list.remove(3));
        System.out.println(list);
    }
}
```

3、执行结果

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211124160205.png" style="zoom: 80%;" />	

#### 3.6.4 修改和获取操作

1、代码示例

链表类: `DoubleCircleLinkedList`

```java
//获取链表中指定索引处的元素
@Override
public E get(int index) {
    if (index < 0|| index > size) {
        throw new ArrayIndexOutOfBoundsException("get index out of bounds");
    }
    // 获取头
    if(index == 0){
        return head.data;
    }else if(index == size -1){
        // 获取尾部
        return tail.data;
    }else{
        // 获取中间
        Node p = head;
        for (int i = 0; i < index; i++) {
            p = p.next;
        }
        return p.data;
    }
}

// 修改链表中指定索引index的元素为element
@Override
public E set(int index, E element) {
    if (index < 0|| index > size) {
        throw new ArrayIndexOutOfBoundsException("set index out of bounds");
    }

    E ret = null;
    // 获取头
    if(index == 0){
        // 修改头
        ret = head.data;
        head.data = element;
    }else if(index == size -1){
        // 修改尾部元素
        ret = tail.data;
        tail.data = element;
    }else{
        // 修改中间
        Node p = head;
        for (int i = 0; i < index; i++) {
            p = p.next;
        }
        ret = p.data;
        p.data = element;
    }

    return ret;
}
```

测试类：`DoubleCircleLinkedListDemo`

```java
package cn.linkedlist.demo05;
public class DoubleCircleLinkedListDemo {
    public static void main(String[] args) {
        DoubleCircleLinkedList<Integer> list = new DoubleCircleLinkedList<>();
        
        list.add(0, 1);
        list.add(0, 2);
        list.add(0, 3);
        
        list.add(list.size(), 4);
        list.add(list.size(), 5);
        list.add(list.size(), 6);
        
        System.out.println("===更新元素===");
        System.out.println(list.set(2, 66));
        System.out.println(list);
        System.out.println("===获取元素===");
        System.out.println(list.get(3));
    }
}
```

2、执行结果

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211124161020.png" style="zoom:80%;" />	

## 第4章 栈

### 4.1 栈的基本概念

栈是一种基于==先进后出(FILO)==的数据结构，==是一种只能在一端进行插入和删除操作的特殊线性表==。它按照==先进后出==的原则存储数据，先进入的数据被压入栈底，最后的数据在栈顶，需要读数据的时候从栈顶开始弹出数据(最后一个数据被第一个读出来)。

往栈中添加元素的操作，一般叫做 `push`，入栈操作。
从栈中移除元素的操作，一般叫做`pop`，出栈操作【只能移除栈顶元素，也叫做：弹出栈顶元素】

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211126072546.png" style="zoom:80%;" />	

### 4.2 栈API设计

| 类名     | Stack                                                        |
| -------- | ------------------------------------------------------------ |
| 构造方法 | `Stack()`：创建`Stack`对象                                   |
| 成员方法 | 1.`public boolean isEmpty()`：判断栈是否为空，是返回`true`，否返回`false`。<br/>2.`public int size()`:获取栈中元素的个数<br/>3.`public T pop()`:弹出栈顶元素<br/>4.`public void push(E element)`：向栈中压入元素`element`。<br/>5. `public E peek()`：查看栈顶元素 |
| 成员变量 | `private ArrayList<E> list`：栈的内部由一个线性表实现。      |

### 4.3 栈代码实现

#### 4.3.1 顺序表实现

1、代码实现

Stack接口：`Stack`

```java
package cn.stack.demo01;

public interface Stack<E> extends Iterable<E>{
    // 栈的大小
    int size();
    // 栈是否为空
    boolean isEmpty();
    // 添加栈元素
    void push(E element);
    // 弹出栈顶元素
    E pop();
    // 查看栈顶元素
    E peek();
    // 清空栈
    void clear();
}
```

顺序表: `ArrayList`

```java
package cn.stack.demo01;

import java.util.Iterator;

public class ArrayList<E> implements Iterable<E>{
    // 顺序表的元素
    private E[] data;
    // 顺序表元素的数量
    private int size;

    // 定义常量
    private static final int ELEMENT_NOT_FOUND = -1;
    private static final int DEFAULT_CAPACITY = 6;

    // 元素的数量
    public int size() {
        return size;
    }

    //清除所有元素
    public void clear() {
        for (int i = 0; i < size; i++) {
            data[i] = null;
        }
        size = 0;
    }


    // 构造函数，传入数组的容量capacity构造SqList
    public ArrayList(int capacity){
        data = (E[]) new Object[capacity];
        capacity = (capacity < DEFAULT_CAPACITY) ? DEFAULT_CAPACITY : capacity;
    }

    // 无参数的构造函数，默认数组的容量capacity=10
    public ArrayList(){
        this(DEFAULT_CAPACITY);
    }

    // 获取数组的容量
    public int getCapacity(){
        return data.length;
    }

    // 获取数组中的元素个数
    public int getSize(){
        return size;
    }

    // 返回数组是否为空
    public boolean isEmpty(){
        return size == 0;
    }

    // 向所有元素后添加一个新元素
    public void addLast(E e){
        add(size, e);
    }

    // 在所有元素前添加一个新元素
    public void addFirst(E e){
        add(0, e);
    }

    // 在index索引的位置插入一个新元素e
    public void add(int index, E e){
        // 扩容操作
        if(size == data.length){
           resize(2 * data.length);
        }

        for(int i = size - 1; i >= index ; i --){
            data[i + 1] = data[i];
        }

        data[index] = e;
        size ++;
    }

    // 获取index索引位置的元素
    public E get(int index){
        rangeCheck(index);
        return data[index];
    }

    // 查看元素的索引
    public int indexOf(E e){
        if (e == null) {
            for (int i = 0; i < size; i++) {
                if (data[i] == null) return i;
            }
        } else {
            for (int i = 0; i < size; i++) {
                if (e.equals(data[i])) return i;
            }
        }
        return ELEMENT_NOT_FOUND;
    }

    // 修改index索引位置的元素为e
    public void set(int index, E e){
        rangeCheck(index);
        data[index] = e;
    }

    // 查找数组中是否有元素e
    public boolean contains(E e){
       return indexOf(e) != ELEMENT_NOT_FOUND;
    }

    // 查找数组中元素e所在的索引，如果不存在元素e，则返回-1
    public int find(E e){
        for(int i = 0 ; i < size ; i ++){
            if(data[i].equals(e))
                return i;
        }
        return -1;
    }

    // 从数组中删除index位置的元素, 返回删除的元素
    public E remove(int index){
        rangeCheck(index);
        E ret = data[index];
        for(int i = index + 1 ; i < size ; i ++){
            data[i - 1] = data[i];
        }
        // 置空
        data[--size] = null;

        // 缩容操作
        if(size == data.length / 4){
            resize(data.length / 2);
        }
        return ret;
    }

    // 从数组中删除第一个元素, 返回删除的元素
    public E removeFirst(){
        return remove(0);
    }

    // 从数组中删除最后一个元素, 返回删除的元素
    public E removeLast(){
        return remove(size - 1);
    }

    // 从数组中删除元素e
    public void removeElement(E e){
        int index = find(e);
        if(index != -1) {
            remove(index);
        }
    }

    // 数组索引越界处理
    private void outOfBounds(int index){
        throw new IndexOutOfBoundsException("index:" + index + ", Size:" + size);
    }

    // 索引值检查范围方法
    private void rangeCheck(int index){
        if(index < 0 || index >=size){
            // 调用越界处理方法
            outOfBounds(index);
        }
    }

    // 添加方法索引检查范围
    private void rangeCheckAdd(int index){
        if(index < 0 || index >size){
            // 调用越界处理方法
            outOfBounds(index);
        }
    }

    // 扩容capacity方法
    private void resize(int newCapacity){
        E[] newData = (E[])new Object[newCapacity];
        for(int i = 0 ; i < size ; i ++){
            newData[i] = data[i];
        }
        data = newData;
    }

    @Override
    public String toString(){
        StringBuilder res = new StringBuilder();
        res.append(String.format("顺序表(SqList)长度:%d, 容器:%d\n", size, data.length));
        res.append('[');
        for(int i = 0 ; i < size ; i ++){
            res.append(data[i]);
            if(i != size - 1)
                res.append(", ");
        }
        res.append(']');
        return res.toString();
    }

    // 遍历方法
    @Override
    public Iterator<E> iterator() {
        return new SIterator();
    }


    private class SIterator implements Iterator{
        // 定义一个指针变量
        private int cur;
        public SIterator(){
            this.cur=0;
        }
        @Override
        public boolean hasNext() {
            return cur< size;
        }
        @Override
        public E next() {
            return data[cur++];
        }
    }
}
```

数组栈：`ArrayStack`

```java
package cn.stack.demo01;

public class ArrayStack<E> implements Stack<E>{
    // 栈内部其实就是一个线性表来实现
    private ArrayList<E> list;

    // 创建一个默认容器的栈[默认容量的线性表]
    public ArrayStack(){
        list = new ArrayList<E>();
    }
    //创建一个指定容量的栈(指定容量的线性表)
    public ArrayStack(int capacity){
        list = new ArrayList<>(capacity);
    }

    // 获取栈中有效元素的个数
    @Override
    public int size() {
        return list.size();
    }

    // 判断栈是否为空
    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    // 入栈一个元素[在线性表的表尾添加一个元素]
    @Override
    public void push(E element) {
        list.addLast(element);
    }

    // 弹栈一个元素并返回[在线性表的表尾删除一个元素]
    @Override
    public E pop() {
        return list.remove(list.size() - 1);
    }

    //查看当前的栈项元素(不删除)
    @Override
    public E peek() {
        return list.get(list.size()-1);
    }

    @Override
    public String toString(){
        StringBuilder res = new StringBuilder();
        res.append("Stack: ");
        res.append('[');
        for(int i = 0 ; i < list.size() ; i ++){
            res.append(list.get(i));
            if(i != list.size() - 1)
                res.append(", ");
        }
        res.append("]");
        return res.toString();
    }
}
```

测试代码：`ArrayStackDemo`

```java
package cn.stack.demo01;

public class ArrayStackDemo {
    public static void main(String[] args) {
        // 创建stack对象
        ArrayStack<Integer> stack = new ArrayStack<>();
        System.out.println("===入栈操作===");
        for(int i=1; i <=12; i++){
            stack.push(i);
        }
        System.out.println(stack);

        System.out.println("===弹栈操作===");
        System.out.print("[");
        for(int i=0; i < 7; i++){
            System.out.print(stack.pop() + " ");
        }
        System.out.println("]");
        System.out.println("===最后栈内元素===");
        System.out.println(stack);
    }
}
```

2、执行结果

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211128155350.png" style="zoom:80%;" />	

#### 4.3.2 链表实现

1、代码实现

链表类：`LinkedList`

```java
package cn.stack.demo01;

public class LinkedList<E>{
    // 创建Node节点
    private class Node{
        //数据域 用来存储数据的
        public E data;
        //指针域 用来存储下一个结点对象的地址
        public Node next;

        // 构造方法
        public Node() {

        }

        public Node(E data) {
            this.data = data;
        }

        public Node(E data, Node next) {
            this.data = data;
            this.next = next;
        }

        @Override
        public String toString(){
            return data.toString();
        }
    }

    // 链表元素的数量
    private int size;
    //链表当中的头指针指向第一个结点对象
    private Node head;
    //链表当中的头指针指向最后一个结点对象
    private Node tail;

    // 初始化结点
    public LinkedList(){
        head = null;
        tail = null;
        size = 0;
    }

    // 获取链表中的元素个数
    public int getSize(){
        return size;
    }

    // 返回链表是否为空
    public boolean isEmpty(){
        return size == 0;
    }

    /***
     * 在链表末尾添加新的元素e
     * @param element
     */
    public void add(E element){
        add(size, element);
    }

    /***
     * 根据链表的index位置添加新的元素e
     * @param index
     * @param element
     */
    public void add(int index, E element){
        if (index < 0|| index > size) {
            throw new ArrayIndexOutOfBoundsException("add index out of bounds");
        }
        // 创建新的结点对象
        Node node = new Node(element);

        if(isEmpty()){
            // 链表为空
            head = node;
            tail = node;
        }else if(index == 0){
            // 在链表头部添加元素
            node.next = head;
            head = node;
        }else if(index == size){
            // 在链表尾部添加元素
            tail.next = node;
            tail = node;
        }else{
            // 在链表中添加元素
            Node prev = head;
            for(int i=0; i < index -1; i++){
                prev = prev.next;
            }
            node.next = prev.next;
            prev.next = node;
        }
        size++;
    }

    /***
     * 得链表的第index个位置的元素
     * @param index
     * @return
     */
    public E get(int index) {
        if (index < 0|| index > size) {
            throw new ArrayIndexOutOfBoundsException("get index out of bounds");
        }
        // 获取头部
        if(index == 0){
            return head.data;
        }else if(index == size -1){
            // 获取尾部
            return tail.data;
        }else{
            // 获取中间
            Node prev = head;
            for (int i = 0; i < index; i++) {
                prev = prev.next;
            }
            return prev.data;
        }
    }

    /***
     * 元素在链表中第一次出现的索引
     * @param element
     * @return
     */
    public int indexOf(E element){
        // 定义prev指针
        Node prev = head;
        // 定义索引值
        int index = 0;
        while (!prev.data.equals(element)){
            prev = prev.next;
            index++;
            if(prev == head){
                return -1;
            }
        }
        return index;
    }

    /***
     * 查找链表中是否有元素element
     * @param element
     * @return
     */
    public boolean contains(E element){
        return indexOf(element)!= -1;
    }

    /***
     * 修改链表中指定index的元素为element
     * @param index
     * @param element
     */
    public E update(int index, E element){
        if (index < 0|| index > size) {
            throw new ArrayIndexOutOfBoundsException("update index out of bounds");
        }
        // 定义返回值
        E result = null;
        if(index == 0){
            // 修改头部
            result= head.data;
            head.data = element;
        }else if(index == size -1){
            // 修改尾部
            result = tail.data;
            tail.data = element;
        }else{
            // 修改中间的元素
            Node prev = head;
            for (int i = 0; i < index; i++) {
                prev = prev.next;
            }
            result = prev.data;
            prev.data = element;
        }
        return result;
    }

    /***
     * 删除链表中指定的元素element
     * @param element
     */
    public void removeLast(E element){
        int index = indexOf(element);
        if(index != -1){
            remove(index);
        }
    }

    /***
     * 删除链表中指定索引处index的元素
     * @param index
     * @return
     */
    public E remove(int index){
        if (index < 0|| index > size) {
            throw new ArrayIndexOutOfBoundsException("remove index out of bounds");
        }
        // 定义返回值
        E result = null;
        // 当链表只剩下一个元素
        if(size == 1){
            result = head.data;
            head = null;
            tail = null;
        }else if(index == 0){
            // 删除链表头部
            Node prev = head;
            result = prev.data;
            head = prev.next;
            // 置空操作
            prev.next = null;
        }else if(index == size -1){
            // 删除链表尾部
            Node prev = head;
            while (prev.next != tail){
                prev = prev.next;
            }
            result = tail.data;
            // 置空操作
            prev.next = null;
            tail = prev;
        }else{
            // 删除中间的某个元素
            Node prev = head;
            for (int i = 0; i < index -1; i++) {
                prev = prev.next;
            }
            Node deleteNode = prev.next;
            result = deleteNode.data;
            prev.next = deleteNode.next;
            // 置空
            deleteNode.next = null;
        }
        size --;
        return result;
    }

    @Override
    public String toString(){
        StringBuilder res = new StringBuilder();
        res.append("size=").append(size).append(", [");
        // 定义一个指针变量
        Node cur = head;
        while(cur != null){
            res.append(cur + "->");
            cur = cur.next;
        }
        res.append("NULL");
        res.append("]");
        return res.toString();
    }
}
```

Stack接口：`Stack`

```java
package cn.stack.demo01;

public interface Stack<E> extends Iterable<E>{
    // 栈的大小
    int size();
    // 栈是否为空
    boolean isEmpty();
    // 添加栈元素
    void push(E element);
    // 弹出栈顶元素
    E pop();
    // 查看栈顶元素
    E peek();
    // 清空栈
    void clear();
}
```

链表类：`LinkedListStack`

```java
package cn.stack.demo01;

public class LinkedListStack<E> implements Stack<E>{
    // 栈内部其实就是一个链表表来实现
    private LinkedList<E> list;

    // 创建一个默认容器的栈
    public LinkedListStack(){
        list = new LinkedList<>();
    }
	
     // 栈的大小
    @Override
    public int size() {
        return list.getSize();
    }
	
     // 栈是否为空
    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }
	
    // 添加栈元素
    @Override
    public void push(E element) {
        list.add(0, element);
    }

    @Override
    public E pop() {
        return list.remove(0);
    }

    @Override
    public E peek() {
        return list.get(0);
    }

    @Override
    public String toString(){
        StringBuilder res = new StringBuilder();
        res.append("Stack:");
        res.append(list);
        return res.toString();
    }
}
```

测试类：`LinkedListStackDemo`

```java
package cn.stack.demo01;

public class LinkedListStackDemo {
    public static void main(String[] args) {
        LinkedListStack<Integer> list = new LinkedListStack<>();
        System.out.println("===入栈操作===");
        for(int i = 0 ; i < 5 ; i ++){
            list.push(i);
        }
        System.out.println(list);
        System.out.println("===出栈操作===");
        list.pop();
        System.out.println(list);

        System.out.println("===当前栈顶元素===");
        System.out.println(list.peek());
    }
}
```

2、执行结果

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211126191014.png" style="zoom:80%;" />	

### 4.4 双端栈实现

#### 4.4.1 基本定义

指将一个线性表的==两端当做栈底==分别进行入栈和出栈操作，主要利用了栈=="栈底位置不变，而栈顶位置动态变化"==的特性。

双端栈是<font color = red>线性表的一种</font>，更是栈的一个特殊分类，所以可以用==动态数组和栈==的思想来实现双端栈。毕竟由于其操作过于特殊，并不能借助`ArrayList`或`ArrayStack`实现。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211127121141.png" style="zoom:80%;" />	

#### 4.4.2 思路分析

1、左栈为空：`ltop = -1`， 左栈元素的个数：`lotp + 1;`

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211127121854.png" style="zoom:80%;" />	

2、右栈为空：`rtop = length`， 右栈元素的个数：`length - rtop;`

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211127122601.png" style="zoom:80%;" />

3、双端栈栈满：`ltop + 1 = rtop`

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211127123611.png" style="zoom:80%;" />	

4、入栈操作

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211127124117.png" style="zoom:80%;" />

5、弹栈操作

左端栈弹栈：定义`result`变量，用来存放`ltop`指针地址，然后执行`ltop--`操作。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211127134447.png" style="zoom:80%;" />

右端栈弹栈：定义`result`变量，用来存放`rtop`指针地址，然后执行`rtop++`操作。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211127142235.png" style="zoom:80%;" />	

6、扩容操作

当双端栈出现`ltop + 1 = rtop`这种情况时，说明双端栈栈满了。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211127183003.png" style="zoom:80%;" />	

1、左端栈扩容

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211127183839.png" style="zoom:80%;" />	

2、右端栈扩容

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211127205957.png" style="zoom:80%;" />	

定义两个游标，`cur`和`i`，将`cur`的值赋值给`i`处即可。

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211127211109.png)

一直不停的往下操作

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211127214653.png" style="zoom:80%;" />	

最后将`rtop`的值更新成`newLen-size(1)`

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211127221708.png" style="zoom:80%;" />

#### 4.4.3 代码示例

链表类：`ArrayDoubleEndStack`

```java
package cn.stack.demo02;
/**
 * 双端栈
 */
public class ArrayDoubleEndStack<E> {
    private E[] data; // 存放元素的容器
    private int ltop; //左端栈的栈顶[ltop ==-1]，左端栈为空[ltop + 1], 左端栈中元素的个数。
    private int rtop; //右端栈的栈顶[rtop==len],右端栈为空[len-rtop],右端栈中元素的个数。
    public static int DEFAULT_SIZE = 10; // 双端栈的默认容量

    public ArrayDoubleEndStack(){
        data = (E[]) new Object[DEFAULT_SIZE];
        // 初始化左端栈
        ltop = -1;
        // 初始化右端栈
        rtop = data.length;
    }

    /***
     * 入栈操作
     * @param element
     * @param stackId
     */
    public void push(E element, int stackId){
        // 栈已满，双端栈需要扩容
        if(ltop + 1 == rtop){
            // 调用扩容操作
            resize(data.length * 2);
        }
        switch (stackId){
            case 0:
                // 向左端栈，入栈元素
                data[++ltop] = element;
                break;
            case 1:
                // 向右端栈，入栈元素
                data[--rtop] = element;
                break;
        }
    }


    public E pop(int stackId){
        if(isEmpty(stackId)){
            throw new NullPointerException("stack is null");
        }
        // 定义ret变量
        E result = null;
        switch (stackId){
            case 0:
                // 左端栈弹栈
                result = data[ltop--];
                break;
            case 1:
                // 右端栈弹栈
                result = data[rtop++];
        }

        // 如果元素个数 <= len/4 && len > DEFAULT_SIZE 缩容
        if(size(0) + size(1) == data.length / 4 && data.length > DEFAULT_SIZE){
            resize(data.length / 2);
        }
        // 返回结果
        return result;
    }

    /***
     * 扩容函数
     * @param newLength
     */
    private void resize(int newLength) {
        // 创建新数组
        E[] newData = (E[]) new Object[newLength];
        // 先处理左端栈
        for(int i=0; i <= ltop; i++){
            newData[i] = data[i];
        }
        // 处理右端栈
        int cur = rtop;
        for (int i = newLength - size(1); i < newLength; i++) {
            newData[i] = data[cur++];
        }
        rtop = newLength - size(1);
        data = newData;
    }

    /***
     * 查看当前的栈项元素(不删除)
     * @param stackId
     * @return
     */
    public E peek(int stackId){
        if(isEmpty(stackId)){
            throw new NullPointerException("stack is null");
        }
        switch (stackId){
            case 0:
                return data[ltop];
            case 1:
                return data[rtop];
        }
        return null;
    }

    /***
     * 判断某一端的栈是否为空
     * @param stackId
     * @return
     */
    private boolean isEmpty(int stackId){
        switch (stackId){
            case 0:
                // 左端栈为空
                return ltop == -1;
            case 1:
                // 右端栈为空
                return rtop == data.length;
        }
        return false;
    }

    /***
     * 获取有效元素的个数
     * @param stackId
     * @return
     */
    public int size(int stackId){
        switch (stackId){
            case 0:
                return ltop + 1;
            case 1:
                return data.length - rtop;
        }
        return -1;
    }

    /***
     *
     * @param stackId
     * @return
     */

    /***
     * 清空双端栈
     * @param stackId
     */
    public void clear(int stackId){
        switch (stackId){
            case 0:
                ltop = -1;
                break;
            case 1:
                rtop = data.length;
        }
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder(String.format("双端栈容量:%d/%d\n", size(0) +size(1), data.length));
        // 条件判断
        if(isEmpty(0)){
            sb.append("leftStack:[]\n");
        }else {
            sb.append("leftStack:[");
            for(int i=0; i <= ltop; i++){
                sb.append(data[i]);
                if(i == ltop){
                    sb.append(']');
                    sb.append('\n');
                }else {
                    sb.append(',');
                }
            }
        }

        if(isEmpty(1)){
            sb.append("rightStack:[]");
        }else {
            sb.append("rightStack:[");
            for(int i=data.length -1; i >= rtop; i--){
                sb.append(data[i]);
                if(i == rtop){
                    sb.append(']');
                    sb.append('\n');
                }else {
                    sb.append(',');
                }
            }
        }

        return sb.toString();
    }
}
```

测试类：`ArrayDoubleEndStackDemo`

```java
package cn.stack.demo02;

public class ArrayDoubleEndStackDemo {
    public static void main(String[] args) {
        ArrayDoubleEndStack<Integer> stack = new ArrayDoubleEndStack<>();
        // 左边入栈操作
        System.out.println("==向左端栈，入栈==");
        for (int i = 0; i < 6; i++) {
            stack.push(i, 0);
        }
        System.out.println(stack);

        // 往右端进栈
        System.out.println("==向右端栈，入栈==");
        for (int i = 7; i <= 12; i++) {
            stack.push(i, 1);
        }
        System.out.print(stack);

        // 从左边和右边分别弹栈
        System.out.println("===从左边和右边分别弹栈===");
        for(int i=0; i < 4; i++){
            stack.pop(0);
            stack.pop(1);
        }
        System.out.println(stack);
    }
}
```

执行结果

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211128010230.png" style="zoom: 67%;" />	

## 第5章 队列

### 5.1 基本概念

队列是一种特殊的线性表，==基于先进先出的原则，First In First Out【FIFO】==。队列只能在头尾两端进行操作，队列的顺序存储结构本身是由`ArrayList`实现的，在数据元素入队的时候，相当于在`ArrayList`表尾添加元素，在数据元素出队的时候，相当于在`ArrayList`表头删除元素。
队尾`(rear)`：只能从队尾添加元素，一般叫做`enQueue`，入队操作。队头`(front)`：只能从队头移除元素，一般叫做 `deQueue`，出队操作。

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211128110156.png)

### 5.2 队列实现

#### 5.2.1 思路分析

1、入队操作

定义两个指针变量，`front`为对头指针，`rear`为队尾指针。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211128111124.png" style="zoom:80%;" />	

添加元素成功，`rear`指针向后移动。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211128111310.png" style="zoom:80%;" />	

2、出队操作

定义两个指针变量，`front`为对头指针，`rear`为队尾指针。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211128111310.png" style="zoom:80%;" />	

队列表头删除元素

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211128111701.png" style="zoom:80%;" />	

删除成功！！！

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211128111813.png" style="zoom:80%;" />	

#### 5.2.2 顺序表实现

1、代码示例

顺序表：`ArrayList`

```java
package cn.queue.demo01;

import java.util.Iterator;

public class ArrayList<E> implements Iterable<E>{
    // 顺序表的元素
    private E[] data;
    // 顺序表元素的数量
    private int size;

    // 定义常量
    private static final int ELEMENT_NOT_FOUND = -1;
    private static final int DEFAULT_CAPACITY = 6;

    // 元素的数量
    public int size() {
        return size;
    }

    //清除所有元素
    public void clear() {
        for (int i = 0; i < size; i++) {
            data[i] = null;
        }
        size = 0;
    }


    // 构造函数，传入数组的容量capacity构造SqList
    public ArrayList(int capacity){
        data = (E[]) new Object[capacity];
        capacity = (capacity < DEFAULT_CAPACITY) ? DEFAULT_CAPACITY : capacity;
    }

    // 无参数的构造函数，默认数组的容量capacity=10
    public ArrayList(){
        this(DEFAULT_CAPACITY);
    }

    // 获取数组的容量
    public int getCapacity(){
        return data.length;
    }

    // 获取数组中的元素个数
    public int getSize(){
        return size;
    }

    // 返回数组是否为空
    public boolean isEmpty(){
        return size == 0;
    }

    // 向所有元素后添加一个新元素
    public void addLast(E e){
        add(size, e);
    }

    // 在所有元素前添加一个新元素
    public void addFirst(E e){
        add(0, e);
    }

    // 在index索引的位置插入一个新元素e
    public void add(int index, E e){
        // 扩容操作
        if(size == data.length){
           resize(2 * data.length);
        }

        for(int i = size - 1; i >= index ; i --){
            data[i + 1] = data[i];
        }

        data[index] = e;
        size ++;
    }

    // 获取index索引位置的元素
    public E get(int index){
        rangeCheck(index);
        return data[index];
    }

    // 查看元素的索引
    public int indexOf(E e){
        if (e == null) {
            for (int i = 0; i < size; i++) {
                if (data[i] == null) return i;
            }
        } else {
            for (int i = 0; i < size; i++) {
                if (e.equals(data[i])) return i;
            }
        }
        return ELEMENT_NOT_FOUND;
    }

    // 修改index索引位置的元素为e
    public void set(int index, E e){
        rangeCheck(index);
        data[index] = e;
    }

    // 查找数组中是否有元素e
    public boolean contains(E e){
       return indexOf(e) != ELEMENT_NOT_FOUND;
    }

    // 查找数组中元素e所在的索引，如果不存在元素e，则返回-1
    public int find(E e){
        for(int i = 0 ; i < size ; i ++){
            if(data[i].equals(e))
                return i;
        }
        return -1;
    }

    // 从数组中删除index位置的元素, 返回删除的元素
    public E remove(int index){
        rangeCheck(index);
        E ret = data[index];
        for(int i = index + 1 ; i < size ; i ++){
            data[i - 1] = data[i];
        }
        // 置空
        data[--size] = null;

        // 缩容操作
        if(size == data.length / 4){
            resize(data.length / 2);
        }
        return ret;
    }

    // 从数组中删除第一个元素, 返回删除的元素
    public E removeFirst(){
        return remove(0);
    }

    // 从数组中删除最后一个元素, 返回删除的元素
    public E removeLast(){
        return remove(size - 1);
    }

    // 从数组中删除元素e
    public void removeElement(E e){
        int index = find(e);
        if(index != -1) {
            remove(index);
        }
    }

    // 数组索引越界处理
    private void outOfBounds(int index){
        throw new IndexOutOfBoundsException("index:" + index + ", Size:" + size);
    }

    // 索引值检查范围方法
    private void rangeCheck(int index){
        if(index < 0 || index >=size){
            // 调用越界处理方法
            outOfBounds(index);
        }
    }

    // 添加方法索引检查范围
    private void rangeCheckAdd(int index){
        if(index < 0 || index >size){
            // 调用越界处理方法
            outOfBounds(index);
        }
    }

    // 扩容capacity方法
    private void resize(int newCapacity){
        E[] newData = (E[])new Object[newCapacity];
        for(int i = 0 ; i < size ; i ++){
            newData[i] = data[i];
        }
        data = newData;
    }

    @Override
    public String toString(){
        StringBuilder res = new StringBuilder();
        res.append(String.format("顺序表(ArrayList)长度:%d, 容器:%d\n", size, data.length));
        res.append('[');
        for(int i = 0 ; i < size ; i ++){
            res.append(data[i]);
            if(i != size - 1)
                res.append(", ");
        }
        res.append(']');
        return res.toString();
    }

    // 遍历方法
    @Override
    public Iterator<E> iterator() {
        return new SIterator();
    }

    private class SIterator implements Iterator{
        // 定义一个指针变量
        private int cur;
        public SIterator(){
            this.cur=0;
        }
        @Override
        public boolean hasNext() {
            return cur< size;
        }
        @Override
        public E next() {
            return data[cur++];
        }
    }
}
```

接口类：`Queue`

```java
package cn.queue.demo01;

public interface Queue<E> extends Iterable<E>{
    int size();
    boolean isEmpty();
    // 入队操作
    void enqueue(E element);
    // 出队操作
    E dequeue();
    // 查看当前队首的元素
    E getFront();
    // 清空队列
    void clear();
}
```

实现类：`ArrayQueue`

```java
package cn.queue.demo01;

import java.util.Iterator;

public class ArrayQueue<E> implements Queue<E>{
    // 队列内部其实就是一个线性表来实现
    private ArrayList<E> array;

    // 构造方法
    public ArrayQueue(int capacity){
        array = new ArrayList<>(capacity);
    }

    public ArrayQueue(){
        array = new ArrayList<>();
    }

    // 获取队列中的有效元素的个数
    @Override
    public int size() {
        return array.size();
    }

    // 判断队列是否为空
    @Override
    public boolean isEmpty() {
        return array.isEmpty();
    }

    /***
     * 入队一个元素
     * @param element
     */
    @Override
    public void enqueue(E element) {
        array.addLast(element);
    }

    /***
     * 出队一个元素
     * @return
     */
    @Override
    public E dequeue() {
        return array.removeFirst();
    }

    /***
     * 获取队首元素
     * @return
     */
    @Override
    public E getFront() {
        return array.get(0);
    }

    // 清空队列
    @Override
    public void clear() {
        array.clear();
    }

    @Override
    public Iterator<E> iterator() {
        return array.iterator();
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder(String.format("队列容量:%d/%d[", size(), array.getCapacity()));
        if(isEmpty()){
            sb.append(']');
        }else {
            for(int i=0; i < size(); i++){
                sb.append(array.get(i));
                if(i != size()-1){
                    sb.append(',');
                }else {
                    sb.append(']');
                }
            }
        }

        return sb.toString();
    }
}
```

测试类：`ArrayQueueDemo`

```java
package cn.queue.demo01;

public class ArrayQueueDemo {
    public static void main(String[] args){
        // 创建queue对象
        ArrayQueue<Integer> queue = new ArrayQueue<>();
        System.out.println("===入队操作===");
        for(int i = 0 ; i < 10 ; i ++){
            // 入队操作
            queue.enqueue(i);
        }
        System.out.println(queue);

        // 出队操作
        System.out.println("===出队操作===");
        for (int i = 0; i < 6; i++) {
            queue.dequeue();
        }
        System.out.println(queue);

        System.out.println("===获取队首元素===");
        System.out.println(queue.getFront());
    }
}
```

2、执行结果

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211128125746.png" style="zoom:80%;" />	

#### 5.2.3 链表实现

1、代码示例
接口类：`Queue`

```java
package cn.queue.demo04;

public interface Queue<E>{
    int size();
    boolean isEmpty();
    // 入队操作
    void enqueue(E element);
    // 出队操作
    E dequeue();
    // 查看当前队首的元素
    E getFront();
    // 清空队列
    void clear();
}
```

链表实现队列：`LinkedListQueue`

```java
package cn.queue.demo04;

public class LinkedListQueue<E>  implements Queue<E>{
    private class Node{
        public E e;
        public Node next;

        public Node(E e, Node next){
            this.e = e;
            this.next = next;
        }

        public Node(E e){
            this(e, null);
        }

        public Node(){
            this(null, null);
        }

        @Override
        public String toString(){
            return e.toString();
        }
    }

    private Node head, tail;
    private int size;

    public LinkedListQueue(){
        head = null;
        tail = null;
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    // 入队操作
    @Override
    public void enqueue(E element) {
        if(tail == null){
            tail = new Node(element);
            head = tail;
        }else {
            tail.next = new Node(element);
            tail = tail.next;
        }
        // 队列元素长度
        size ++;
    }

    // 出队操作
    @Override
    public E dequeue() {
        // 判断是否为空
        if(isEmpty()){
            throw new NullPointerException("Deque is empty!!!");
        }
        // 要删除的元素
        Node deleteNode = head;
        head = head.next;
        // 置空操作
        deleteNode.next = null;
        if(head == null){
            tail = null;
        }
        size --;
        return deleteNode.e;
    }

    // 拿到队首元素
    @Override
    public E getFront() {
        // 判断条件
        if(isEmpty()){
            throw new NullPointerException("Queue is NULL!!!");
        }
        return head.e;
    }

    @Override
    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }

    @Override
    public String toString(){
        StringBuilder res = new StringBuilder();
        res.append("size=").append(size).append(", [");
        // 定义一个指针变量
        Node cur = head;
        while(cur != null){
            res.append(cur + "->");
            cur = cur.next;
        }
        res.append("NULL");
        res.append("]");
        return res.toString();
    }
}
```

测试类：`LinkedListQueueDemo`

```java
package cn.queue.demo04;

public class LinkedListQueueDemo {
    public static void main(String[] args) {
        System.out.println("==入队操作==");
        LinkedListQueue<Integer> queue = new LinkedListQueue<>();
        for(int i = 1 ; i <= 10 ; i ++){
            queue.enqueue(i);
        }
        System.out.println(queue);

        System.out.println("===出队操作===");
        for(int i = 1 ; i <= 4 ; i ++){
            queue.dequeue();
        }
        System.out.println(queue);

        System.out.println("===队首元素===");
        System.out.println(queue.getFront());
    }
}
```

2、执行结果

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211130162311.png" style="zoom:80%;" />	

### 5.3 栈实现队列

#### 5.3.1 思路分析

1、出队操作

栈的本质是==先进后出==，往栈中添加元素和往队列中添加元素操作本质是一样的。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211128131227.png" style="zoom:80%;" />	

新创建一个`stackB`新栈，然后将元素`2`，`3`弹出来，临时存入`stackB`。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211128132009.png" style="zoom:80%;" />	

最后将`stackA`中的元素`1`，弹出栈。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211128132247.png" style="zoom:80%;" />	

2、入队操作

添加元素的过程中，将栈`stackB`元素`3`,`2`弹回栈`stackA`A中，然后在执行添加操作。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211128132732.png" style="zoom:80%;" />	

最后将元素`4`添加到`stackA`中。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211128133616.png" style="zoom:80%;" />	

#### 5.3.2 代码示例

顺序表：`ArrayList`

```java
package cn.stack.demo03;

import java.util.Iterator;

public class ArrayList<E> implements Iterable<E>{
    // 顺序表的元素
    private E[] data;
    // 顺序表元素的数量
    private int size;

    // 定义常量
    private static final int ELEMENT_NOT_FOUND = -1;
    private static final int DEFAULT_CAPACITY = 6;

    // 元素的数量
    public int size() {
        return size;
    }

    //清除所有元素
    public void clear() {
        for (int i = 0; i < size; i++) {
            data[i] = null;
        }
        size = 0;
    }


    // 构造函数，传入数组的容量capacity构造SqList
    public ArrayList(int capacity){
        data = (E[]) new Object[capacity];
        capacity = (capacity < DEFAULT_CAPACITY) ? DEFAULT_CAPACITY : capacity;
    }

    // 无参数的构造函数，默认数组的容量capacity=10
    public ArrayList(){
        this(DEFAULT_CAPACITY);
    }

    // 获取数组的容量
    public int getCapacity(){
        return data.length;
    }

    // 获取数组中的元素个数
    public int getSize(){
        return size;
    }

    // 返回数组是否为空
    public boolean isEmpty(){
        return size == 0;
    }

    // 向所有元素后添加一个新元素
    public void addLast(E e){
        add(size, e);
    }

    // 在所有元素前添加一个新元素
    public void addFirst(E e){
        add(0, e);
    }

    // 在index索引的位置插入一个新元素e
    public void add(int index, E e){
        // 扩容操作
        if(size == data.length){
           resize(2 * data.length);
        }

        for(int i = size - 1; i >= index ; i --){
            data[i + 1] = data[i];
        }

        data[index] = e;
        size ++;
    }

    // 获取index索引位置的元素
    public E get(int index){
        rangeCheck(index);
        return data[index];
    }

    // 查看元素的索引
    public int indexOf(E e){
        if (e == null) {
            for (int i = 0; i < size; i++) {
                if (data[i] == null) return i;
            }
        } else {
            for (int i = 0; i < size; i++) {
                if (e.equals(data[i])) return i;
            }
        }
        return ELEMENT_NOT_FOUND;
    }

    // 修改index索引位置的元素为e
    public void set(int index, E e){
        rangeCheck(index);
        data[index] = e;
    }

    // 查找数组中是否有元素e
    public boolean contains(E e){
       return indexOf(e) != ELEMENT_NOT_FOUND;
    }

    // 查找数组中元素e所在的索引，如果不存在元素e，则返回-1
    public int find(E e){
        for(int i = 0 ; i < size ; i ++){
            if(data[i].equals(e))
                return i;
        }
        return -1;
    }

    // 从数组中删除index位置的元素, 返回删除的元素
    public E remove(int index){
        rangeCheck(index);
        E ret = data[index];
        for(int i = index + 1 ; i < size ; i ++){
            data[i - 1] = data[i];
        }
        // 置空
        data[--size] = null;

        // 缩容操作
        if(size == data.length / 4){
            resize(data.length / 2);
        }
        return ret;
    }

    // 从数组中删除第一个元素, 返回删除的元素
    public E removeFirst(){
        return remove(0);
    }

    // 从数组中删除最后一个元素, 返回删除的元素
    public E removeLast(){
        return remove(size - 1);
    }

    // 从数组中删除元素e
    public void removeElement(E e){
        int index = find(e);
        if(index != -1) {
            remove(index);
        }
    }

    // 数组索引越界处理
    private void outOfBounds(int index){
        throw new IndexOutOfBoundsException("index:" + index + ", Size:" + size);
    }

    // 索引值检查范围方法
    private void rangeCheck(int index){
        if(index < 0 || index >=size){
            // 调用越界处理方法
            outOfBounds(index);
        }
    }

    // 添加方法索引检查范围
    private void rangeCheckAdd(int index){
        if(index < 0 || index >size){
            // 调用越界处理方法
            outOfBounds(index);
        }
    }

    // 扩容capacity方法
    private void resize(int newCapacity){
        E[] newData = (E[])new Object[newCapacity];
        for(int i = 0 ; i < size ; i ++){
            newData[i] = data[i];
        }
        data = newData;
    }

    @Override
    public String toString(){
        StringBuilder res = new StringBuilder();
        res.append(String.format("顺序表(SqList)长度:%d, 容器:%d\n", size, data.length));
        res.append('[');
        for(int i = 0 ; i < size ; i ++){
            res.append(data[i]);
            if(i != size - 1)
                res.append(", ");
        }
        res.append(']');
        return res.toString();
    }

    // 遍历方法
    @Override
    public Iterator<E> iterator() {
        return new SIterator();
    }


    private class SIterator implements Iterator{
        // 定义一个指针变量
        private int cur;
        public SIterator(){
            this.cur=0;
        }
        @Override
        public boolean hasNext() {
            return cur< size;
        }
        @Override
        public E next() {
            return data[cur++];
        }
    }
}
```

接口类：`Stack`

```java
package cn.stack.demo03;

public interface Stack<E>{
    // 栈的大小
    int size();
    // 栈是否为空
    boolean isEmpty();
    // 添加栈元素
    void push(E element);
    // 弹出栈顶元素
    E pop();
    // 查看栈顶元素
    E peek();
}
```

顺序栈：`ArrayStack`

```java
package cn.stack.demo03;

public class ArrayStack<E> implements Stack<E> {
    // 栈内部其实就是一个线性表来实现
    private ArrayList<E> list;

    // 创建一个默认容器的栈[默认容量的线性表]
    public ArrayStack(){
        list = new ArrayList<E>();
    }
    //创建一个指定容量的栈(指定容量的线性表)
    public ArrayStack(int capacity){
        list = new ArrayList<>(capacity);
    }

    // 获取栈中有效元素的个数
    @Override
    public int size() {
        return list.size();
    }

    // 判断栈是否为空
    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    // 入栈一个元素[在线性表的表尾添加一个元素]
    @Override
    public void push(E element) {
        list.addLast(element);
    }

    // 弹栈一个元素并返回[在线性表的表尾删除一个元素]
    @Override
    public E pop() {
        return list.remove(list.size() - 1);
    }

    //查看当前的栈项元素(不删除)
    @Override
    public E peek() {
        return list.get(list.size()-1);
    }

    @Override
    public String toString(){
        StringBuilder res = new StringBuilder();
        res.append("Stack: ");
        res.append('[');
        for(int i = 0 ; i < list.size() ; i ++){
            res.append(list.get(i));
            if(i != list.size() - 1)
                res.append(", ");
        }
        res.append("]");
        return res.toString();
    }
}
```

栈实现队列：`QueueImplByStack`

```java
package cn.stack.demo03;

// 用栈实现队列
public class QueueImplByStack<E> {
    // 创建两个栈
    private ArrayStack<E> stackA;
    private ArrayStack<E> stackB;

    // 构造函数
    public QueueImplByStack(){
        stackA = new ArrayStack<>();
        stackB = new ArrayStack<>();
    }

    // 入队操作
    public void enqueue(E element){
        stackA.push(element);
    }

    // 出队操作
    public E dequeue(){
        // 判断stackA是否为空
        if(stackA.isEmpty()){
            throw new NullPointerException("queue is null");
        }
        while (stackA.size() !=1){
            // 从A栈中弹出元素往栈B存放
            stackB.push(stackA.pop());
        }
        // 拿到要删除的元素
        E ret = stackA.pop();
        while (!stackB.isEmpty()){
            // 从B栈中弹出元素往栈A存放
            stackA.push(stackB.pop());
        }
        return ret;
    }

    // 查看当前队首的元素
    public E element(){
        // 判断stackA是否为空
        if(stackA.isEmpty()){
            throw new NullPointerException("queue is null");
        }
        while (stackA.size() !=1){
            stackB.push(stackA.pop());
        }
        // 拿到队首元素
        E ret = stackA.peek();
        while (stackB.isEmpty()){
            stackA.push(stackB.pop());
        }
        return ret;
    }

    @Override
    public String toString(){
        if(stackA.isEmpty()){
            return "[]";
        }else {
            return stackA.toString();
        }
    }
}
```

测试类：`QueueImplByStackDemo`

```java
package cn.stack.demo03;

public class QueueImplByStackDemo {
    public static void main(String[] args) {
        // 创建queue对象
        QueueImplByStack<Integer> queue = new QueueImplByStack<>();
        System.out.println("===入队操作===");
        // 插入元素
        for (int i = 1; i <=10 ; i++) {
            queue.enqueue(i);
        }
        System.out.println(queue);

        System.out.println("===出队操作===");
        for (int i = 1; i <=3 ; i++) {
            queue.dequeue();
        }
        System.out.println(queue);

        System.out.println("===拿到队首元素===");
        System.out.println(queue.element());
    }
}
```

#### 5.3.3 执行结果

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211128161124.png" style="zoom:80%;" />	

### 5.4 队列实现栈

#### 5.4.1 思路分析

1、出队操作

队列是基于==先进先出==的原则，往队列中添加元素和往栈中添加元素操作本质是一样的。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211128163715.png" style="zoom:80%;" />	

创建一个`queueB`队列，然后将元素`1`，`2`弹出来，临时存入`queueB`。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211128164716.png" style="zoom:80%;" />	

最后将元素`3`出队

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211128164948.png" style="zoom:80%;" />	

2、入队操作

直接在队列`queue`B中添加元素。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211128195206.png" style="zoom:80%;" />	

3、获取队首元素

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211128201942.png" style="zoom:80%;" />	

先将`queueA`中的元素`1`,`2 `弹到`queueB`队列中，然后获取`queueA`元素`4`。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211128202306.png" style="zoom:80%;" />	

最后将`queueA`中的元素`4`放到`queueB`队列中。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211128202540.png" style="zoom:80%;" />	

#### 5.4.2 代码示例

顺序表：`ArrayList`

```java
package cn.queue.demo01;

import java.util.Iterator;

public class ArrayList<E> implements Iterable<E>{
    // 顺序表的元素
    private E[] data;
    // 顺序表元素的数量
    private int size;

    // 定义常量
    private static final int ELEMENT_NOT_FOUND = -1;
    private static final int DEFAULT_CAPACITY = 6;

    // 元素的数量
    public int size() {
        return size;
    }

    //清除所有元素
    public void clear() {
        for (int i = 0; i < size; i++) {
            data[i] = null;
        }
        size = 0;
    }


    // 构造函数，传入数组的容量capacity构造SqList
    public ArrayList(int capacity){
        data = (E[]) new Object[capacity];
        capacity = (capacity < DEFAULT_CAPACITY) ? DEFAULT_CAPACITY : capacity;
    }

    // 无参数的构造函数，默认数组的容量capacity=10
    public ArrayList(){
        this(DEFAULT_CAPACITY);
    }

    // 获取数组的容量
    public int getCapacity(){
        return data.length;
    }

    // 获取数组中的元素个数
    public int getSize(){
        return size;
    }

    // 返回数组是否为空
    public boolean isEmpty(){
        return size == 0;
    }

    // 向所有元素后添加一个新元素
    public void addLast(E e){
        add(size, e);
    }

    // 在所有元素前添加一个新元素
    public void addFirst(E e){
        add(0, e);
    }

    // 在index索引的位置插入一个新元素e
    public void add(int index, E e){
        // 扩容操作
        if(size == data.length){
           resize(2 * data.length);
        }

        for(int i = size - 1; i >= index ; i --){
            data[i + 1] = data[i];
        }

        data[index] = e;
        size ++;
    }

    // 获取index索引位置的元素
    public E get(int index){
        rangeCheck(index);
        return data[index];
    }

    // 查看元素的索引
    public int indexOf(E e){
        if (e == null) {
            for (int i = 0; i < size; i++) {
                if (data[i] == null) return i;
            }
        } else {
            for (int i = 0; i < size; i++) {
                if (e.equals(data[i])) return i;
            }
        }
        return ELEMENT_NOT_FOUND;
    }

    // 修改index索引位置的元素为e
    public void set(int index, E e){
        rangeCheck(index);
        data[index] = e;
    }

    // 查找数组中是否有元素e
    public boolean contains(E e){
       return indexOf(e) != ELEMENT_NOT_FOUND;
    }

    // 查找数组中元素e所在的索引，如果不存在元素e，则返回-1
    public int find(E e){
        for(int i = 0 ; i < size ; i ++){
            if(data[i].equals(e))
                return i;
        }
        return -1;
    }

    // 从数组中删除index位置的元素, 返回删除的元素
    public E remove(int index){
        rangeCheck(index);
        E ret = data[index];
        for(int i = index + 1 ; i < size ; i ++){
            data[i - 1] = data[i];
        }
        // 置空
        data[--size] = null;

        // 缩容操作
        if(size == data.length / 4){
            resize(data.length / 2);
        }
        return ret;
    }

    // 从数组中删除第一个元素, 返回删除的元素
    public E removeFirst(){
        return remove(0);
    }

    // 从数组中删除最后一个元素, 返回删除的元素
    public E removeLast(){
        return remove(size - 1);
    }

    // 从数组中删除元素e
    public void removeElement(E e){
        int index = find(e);
        if(index != -1) {
            remove(index);
        }
    }

    // 数组索引越界处理
    private void outOfBounds(int index){
        throw new IndexOutOfBoundsException("index:" + index + ", Size:" + size);
    }

    // 索引值检查范围方法
    private void rangeCheck(int index){
        if(index < 0 || index >=size){
            // 调用越界处理方法
            outOfBounds(index);
        }
    }

    // 添加方法索引检查范围
    private void rangeCheckAdd(int index){
        if(index < 0 || index >size){
            // 调用越界处理方法
            outOfBounds(index);
        }
    }

    // 扩容capacity方法
    private void resize(int newCapacity){
        E[] newData = (E[])new Object[newCapacity];
        for(int i = 0 ; i < size ; i ++){
            newData[i] = data[i];
        }
        data = newData;
    }

    @Override
    public String toString(){
        StringBuilder res = new StringBuilder();
        res.append(String.format("顺序表(ArrayList)长度:%d, 容器:%d\n", size, data.length));
        res.append('[');
        for(int i = 0 ; i < size ; i ++){
            res.append(data[i]);
            if(i != size - 1)
                res.append(", ");
        }
        res.append(']');
        return res.toString();
    }

    // 遍历方法
    @Override
    public Iterator<E> iterator() {
        return new SIterator();
    }

    private class SIterator implements Iterator{
        // 定义一个指针变量
        private int cur;
        public SIterator(){
            this.cur=0;
        }
        @Override
        public boolean hasNext() {
            return cur< size;
        }
        @Override
        public E next() {
            return data[cur++];
        }
    }
}
```

接口类：`Queue`

```java
package cn.queue.demo01;

public interface Queue<E> extends Iterable<E>{
    int size();
    boolean isEmpty();
    // 入队操作
    void enqueue(E element);
    // 出队操作
    E dequeue();
    // 查看当前队首的元素
    E getFront();
    // 清空队列
    void clear();
}
```

数组队列：`ArrayQueue`

```java
package cn.queue.demo01;

import java.util.Iterator;

public class ArrayQueue<E> implements Queue<E>{
    // 队列内部其实就是一个线性表来实现
    private ArrayList<E> array;

    // 构造方法
    public ArrayQueue(int capacity){
        array = new ArrayList<>(capacity);
    }

    public ArrayQueue(){
        array = new ArrayList<>();
    }

    // 获取队列中的有效元素的个数
    @Override
    public int size() {
        return array.size();
    }

    // 判断队列是否为空
    @Override
    public boolean isEmpty() {
        return array.isEmpty();
    }

    /***
     * 入队一个元素
     * @param element
     */
    @Override
    public void enqueue(E element) {
        array.addLast(element);
    }

    /***
     * 出队一个元素
     * @return
     */
    @Override
    public E dequeue() {
        return array.removeFirst();
    }

    /***
     * 获取队首元素
     * @return
     */
    @Override
    public E getFront() {
        return array.get(0);
    }

    // 清空队列
    @Override
    public void clear() {
        array.clear();
    }

    @Override
    public Iterator<E> iterator() {
        return array.iterator();
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder(String.format("队列容量:%d/%d[", size(), array.getCapacity()));
        if(isEmpty()){
            sb.append(']');
        }else {
            for(int i=0; i < size(); i++){
                sb.append(array.get(i));
                if(i != size()-1){
                    sb.append(',');
                }else {
                    sb.append(']');
                }
            }
        }

        return sb.toString();
    }
}
```

队列实现栈：`StackImplByQueue`

```java
package cn.queue.demo01;

public class StackImplByQueue<E> {
    // 创建两个栈
    private ArrayQueue<E> queueA;
    private ArrayQueue<E> queueB;

    // 构造函数
    public StackImplByQueue(){
        queueA = new ArrayQueue<>();
        queueB = new ArrayQueue<>();
    }

    // 入栈操作
    public void push(E element){
       // 判断两个队列是否为空
        if(queueA.isEmpty() && queueB.isEmpty()){
            // 往队列A中插入元素
            queueA.enqueue(element);
        }else if(queueA.isEmpty()){
            // 往队列B中添加
            queueB.enqueue(element);
        }else {
            queueA.enqueue(element);
        }
    }

    // 弹栈操作
    public E pop(){
        // 元素值范围
        if(queueA.isEmpty() && queueB.isEmpty()){
            throw new NullPointerException("stack is NULL!!!");
        }else if(!queueA.isEmpty()){
            while (queueA.size() != 1){
                // 从A队列中弹出元素往队列B存放
                queueB.enqueue(queueA.dequeue());
            }
            return queueA.dequeue();
        }else {
            while (queueB.size() != 1){
                // 从B队列中弹出元素往队列A存放
                queueA.enqueue(queueB.dequeue());
            }
            return queueB.dequeue();
        }
    }

    // 查看当前栈的栈顶
    public E peek(){
        if(queueA.isEmpty() && queueB.isEmpty()){
            throw new NullPointerException("stack is null");
        }else if(!queueA.isEmpty()){
            while (queueA.size() !=1){
                // 从A队列中弹出元素往队列B存放
                queueB.enqueue(queueA.dequeue());
            }
            // 拿到栈顶元素
            E ret = queueA.getFront();
            queueB.enqueue(queueA.dequeue());
            return ret;
        }else {
            while (queueB.size() !=1){
                // 从B队列中弹出元素往队列A存放
                queueA.enqueue(queueB.dequeue());
            }
            // 拿到栈顶元素
            E ret = queueB.getFront();
            queueA.enqueue(queueB.dequeue());
            return ret;
        }
    }

    @Override
    public String toString(){
        if(queueA.isEmpty() && queueB.isEmpty()){
            return "[]";
        }else if(!queueA.isEmpty()){
            return queueA.toString();
        }else {
            return queueB.toString();
        }
    }
}
```

测试类：`StackImplByQueueDemo`

```java
package cn.queue.demo01;

public class StackImplByQueueDemo {
    public static void main(String[] args) {
        StackImplByQueue<Integer> stack = new StackImplByQueue<>();
        System.out.println("===入队元素===");
        for (int i = 1; i <=12 ; i++) {
            stack.push(i);
        }
        System.out.println(stack);
        System.out.println("===出队元素===");
        for (int i=1; i<=5; i++){
            stack.pop();
        }
        System.out.println(stack);
        System.out.println("===获取队首元素===");
        System.out.println(stack.peek());
    }
}
```

#### 5.4.3 执行结果

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211129090155.png" style="zoom:80%;" />	

### 5.5 循环队列

#### 5.5.1 基本概念

1、问题出现

队列的顺序存储结构本身是由`ArrayList`实现的，在数据元素入队的时候，相当于在`ArrayList`表尾添加元素，在数据元素出队的时候，相当于在`ArrayList`表头删除元素，很明显，入队的时间复杂度`0(1)`,出队的时间复杂度`O(n)`。线性表增删数据元素时间复杂符都是`O(n)`,但是这个是按平均算的，队列的出队时间复杂度`0(n)`，可不是按平均算的，因为每次出队都是`0(n)`

2、解决问题

能否让队头指针和队尾指针一样随着数据元素的变化而移动?当队尾或队头指针到达尾部时，如需后移可重新指向表头，==从而引出循环队列==

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211129142931.png" style="zoom:80%;" />	

当队列条件满足<font color = red>**(Rear+1 )%n==Frort**</font>的时候，证明队列已经是满的了。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211129150021.png" style="zoom:80%;" />	

队列满足<font color = red>**Rear==Front**</font>的时候，该队列已经是`null`。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211129150554.png" style="zoom:80%;" />	

#### 5.5.2 思路分析

1、入队操作

将一个空间预留出来不存任何元素，尾指针始终指向这个`null`空间。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211129151002.png" style="zoom:80%;" />	

先放到`Rear`指向的空间，然后将`Real`向后移动。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211129151436.png" style="zoom:80%;" />	

2、出队操作

现将`Front`指针指向的元素拿出来

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211129160658.png" style="zoom:80%;" />	

然后将`Front`指针向后移动。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211129160855.png" style="zoom:80%;" />	

3、扩容操作

定义两个变量指针`cur`和`index`，分别指向原队列和新队列。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211129163817.png" style="zoom: 67%;" />	

两个指针不停的向后移动。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211129164451.png" style="zoom:80%;" />	

当`cur`指针等于`Rear`时候，则扩容成功！！

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211129165131.png" style="zoom:80%;" />	

这时候头指针在`Front`等于0时，尾指针在`Rear`的位置

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211129165653.png" style="zoom:80%;" />	

#### 5.5.3 代码实现

1、代码示例

接口类：`Queue`

```java
package cn.queue.demo02;

public interface Queue<E> extends Iterable<E>{
    int size();
    boolean isEmpty();
    // 入队操作
    void enqueue(E element);
    // 出队操作
    E dequeue();
    // 查看当前队首的元素
    E getFront();
    // 清空队列
    void clear();
}
```

队列类：`ArrayLoopQueue`

```java
package cn.queue.demo02;

import java.util.Iterator;

public class ArrayLoopQueue<E> implements Queue<E>{
    // 存储元素的容器
    private E[] data;
    // 队首指针front
    private int front;
    // 队尾指针rear
    private int rear;
    // 有效元素
    private int size;

    // 定义默认队列的大小
    private static int DEFAULT_SIZE = 7;
    // 构造函数
    public ArrayLoopQueue() {
        this(DEFAULT_SIZE);
    }
    //capacity容量存储元素的最大容量是10,10->11 10是可用的，1是虚元素
    public ArrayLoopQueue(int capacity){
        data = (E[]) new Object[capacity + 1];
        front = 0;
        rear = 0;
        size = 0;
    }

    //获取循环队列的有效元素的个数
    @Override
    public int size() {
        return size;
    }

    //判断循环队列是否为空
    @Override
    public boolean isEmpty() {
        return size == 0 && front == rear;
    }

    // 向循环队列入队一个元素
    @Override
    public void enqueue(E element) {
        /**
         * 队列空:front == rear
         * 队列满:(rear + 1) % data.length == front
         */
        // 判断队列是否需要扩容
        if((rear + 1) % data.length == front){
            resize(data.length * 2 -1);
        }
        // 将元素存放到当前rear对应的地址
        data[rear] = element;
        // 队尾指针rear向前移动
        rear = (rear + 1) % data.length;
        size++;
    }

    // 循环队列出队一个元素
    @Override
    public E dequeue() {
        // 判断是否为空
        if(isEmpty()){
            throw new NullPointerException("queue is NULL!!!");
        }
        // 定义临时变量用来存放出队元素
        E ret = data[front];
        // 队头指针front向前移动
        front = (front + 1) % data.length;
        size--;
        // 判断队列是否需要缩容
        if (size ==(data.length - 1) / 4 && data.length - 1 > DEFAULT_SIZE) {
            resize(data.length / 2+1);
        }
        return ret;
    }

    // 创建扩容方法
    private void resize(int newLength) {
        // 创建newData对象
        E[] newData = (E[]) new Object[newLength];
        int index = 0;
        for(int cur = front; cur != rear; cur=(cur + 1) % data.length){
            // 将原队列的元素赋值给新队列
            newData[index++] = data[cur];
        }
        front = 0;
        rear = index;
        data = newData;
    }

    // 获取队首元素
    @Override
    public E getFront() {
        if(isEmpty()){
            throw new NullPointerException("queue is null!!!");
        }
        return data[front];
    }
	
    // 清空队列
    @Override
    public void clear() {
        data = (E[]) new Object[DEFAULT_SIZE + 1];
        front = 0;
        rear = 0;
        size = 0;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder(String.format("循环队列容量:%d/%d[", size, data.length-1));
        if(isEmpty()){
            sb.append(']');
        }else {
            for(int i = front; i != rear; i=(i+1) % data.length){
                sb.append(data[i]);
                if((i+1) % data.length == rear){
                    sb.append(']');
                }else {
                    sb.append(", ");
                }
            }
        }
        return sb.toString();
    }

    @Override
    public Iterator<E> iterator() {
        return new ArrayLoopQueueIterator();
    }

    class ArrayLoopQueueIterator implements Iterator<E>{
        // 定义指针变量
        private int cur;
        @Override
        public boolean hasNext() {
            return cur != rear;
        }

        @Override
        public E next() {
            E ret = data[cur];
            cur = (cur + 1) % data.length;
            return ret;
        }
    }
}
```

测试类：`ArrayLoopQueueDemo`

```java
package cn.queue.demo02;

public class ArrayLoopQueueDemo {
    public static void main(String[] args) {
        ArrayLoopQueue<Integer> queue = new ArrayLoopQueue<>();
        System.out.println("===入队操作===");
        for (int i = 1; i <=12 ; i++) {
            queue.enqueue(i);
        }

        System.out.println(queue);

        System.out.println("===出队操作===");
        for (int i = 1; i <= 4; i++){
            queue.dequeue();
        }
        System.out.println(queue);

        System.out.println("===队首元素===");
        System.out.println(queue.getFront());
    }
}
```

2、执行结果

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211129213410.png" style="zoom:80%;" />	

### 5.6 双端队列

#### 5.6.1 基本概念

双端队列(double enqueue , deque)是==限定插入==和==删除==操作在表的两端进行的==线性表==，是一种具有==队列==和==栈==的性质的数据结构。

双端队列大致思想与循环队列一样，==无非在队首可添加，在队尾可删除==。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211130035942.png" style="zoom:80%;" />	

队列满足<font color = red>**(Rear+1)%length==Front**</font>的时候，该队列已经是满了。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211129150021.png" style="zoom:80%;" />	

队列满足<font color = red>**Rear==Front**</font>的时候，该队列已经是`null`。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211129150554.png" style="zoom:80%;" />	

#### 5.6.2 思路分析

1、队尾添加元素

将一个空间预留出来不存任何元素，尾指针始终指向这个`null`空间。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211129151002.png" style="zoom:80%;" />	

先放到`Rear`指向的空间，然后将`Real`向后移动。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211129151436.png" style="zoom:80%;" />	

2、对头添加元素

要在`Front`前面添加元素。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211130041354.png" style="zoom:80%;" />	

然后将`Front`指针向前移动，`Front`执行`--`操作。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211130041721.png" style="zoom:80%;" />	

3、删除队尾元素

现将元素出队，然后将`Rear`指针向前移动。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211130043001.png" style="zoom:80%;" />

4、删除队首元素 

移出当前元素，然后`Front`指针向后移动。

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211130052216.png)

#### 5.6.3 代码示例

接口类：`Queue`

```java
package cn.queue.demo03;

public interface Queue<E> extends Iterable<E>{
    int size();
    boolean isEmpty();
    // 入队操作
    void enqueue(E element);
    // 出队操作
    E dequeue();
    // 查看当前队首的元素
    E getFront();
    // 清空队列
    void clear();
}
```

接口类：`Deque`

```java
package cn.queue.demo03;

public interface Deque<E> extends Queue<E> {
    // 从队列中添加第一个元素
    void addFirst(E element);
    // 从队列中添加最后一个元素
    void addLast(E element);
    // 从队列中删除第一个元素
    E removeFirst();
    // 从队列中删除最后一个元素
    E removeLast();
    // 从队列中拿到第一个元素
    E getFirst();
    // 从队列中拿到最后一个元素
    E getLast();
    // 队列中有效元素
    int size();
    // 判断队列是否为空
    boolean isEmpty();
}
```

双端实现：`ArrayDeque`

```java
package cn.queue.demo03;

import java.util.Iterator;

public class ArrayDeque<E> implements Deque<E> {
    // 存储元素的容器
    private E[] data;
    // 队首指针front
    private int front;
    // 队尾指针rear
    private int rear;
    // 有效元素
    private int size;

    // 定义默认队列的大小
    private static int DEFAULT_SIZE = 7;
    // 构造函数
    public ArrayDeque() {
        this(DEFAULT_SIZE);
    }
    //capacity容量存储元素的最大容量是7,7->8 7是可用的，1是虚元素
    public ArrayDeque(int capacity){
        data = (E[]) new Object[capacity + 1];
        front = 0;
        rear = 0;
        size = 0;
    }

    // 在Deque队首中添加一个元素
    @Override
    public void addFirst(E element) {
        // 先判断Deque队列是否已满
        if(isExpansion()){
            // 扩容操作
            resize(data.length * 2 - 1);
        }
        // front指向要添加元素的索引
        front = (front -1 + data.length) % data.length;
        data[front] = element;
        size++;
    }

    // 在Deque对尾中添加元素
    @Override
    public void addLast(E element) {
        // 先判断Deque队列是否已满
        if(isExpansion()){
            // 扩容操作
            resize(data.length * 2 - 1);
        }
        data[rear] = element;
        // front指向要添加元素的索引
        rear = (rear + 1) % data.length;
        size++;
    }

    // 判断Deque是否已满
    private boolean isExpansion() {
        return (rear + 1) % data.length == front;
    }

    // 调用Deque扩容方法
    private void resize(int newLength) {
        // 创建newData对象
        E[] newData = (E[]) new Object[newLength];
        int index = 0;
        for(int cur = front; cur != rear; cur=(cur + 1) % data.length){
            // 将原队列的元素赋值给新队列
            newData[index++] = data[cur];
        }
        front = 0;
        rear = index;
        data = newData;
    }

    // 在Deque队首删除一个元素
    @Override
    public E removeFirst() {
        // 判断对列是否为空
        if(isEmpty()){
            throw new NullPointerException("Deque is empty!!!");
        }
        // 拿到要删除的元素
        E ret = data[front];
        // 移动front指针
        front = (front +1) % data.length;
        size --;
        // 判断对列是否需要缩容
        if(isShrink()){
            resize(data.length / 2 + 1);
        }
        return ret;
    }

    // 在Deque队尾删除一个元素
    @Override
    public E removeLast() {
        // 判断对列是否为空
        if(isEmpty()){
            throw new NullPointerException("Deque is empty!!!");
        }
        // 移动rear指针
        rear = (rear -1 + data.length) % data.length;
        // 拿到要删除的元素
        E ret = data[rear];
        size --;
        // 判断对列是否需要缩容
        if(isShrink()){
            resize(data.length / 2 + 1);
        }
        return ret;
    }

    // 缩容方法
    private boolean isShrink() {
        return size == (data.length - 1) / 4 && data.length - 1 > DEFAULT_SIZE;
    }

    // 获取队首元素
    @Override
    public E getFirst() {
        return data[front];
    }

    // 获取队尾元素
    @Override
    public E getLast() {
        return data[(rear -1 + data.length) % data.length];
    }

    // 获取队列元素
    @Override
    public int size() {
        return size;
    }

    // 判断对列是否为空
    @Override
    public boolean isEmpty() {
        return size == 0 && front == rear;
    }
    // 入队操作
    @Override
    public void enqueue(E element) {
        addLast(element);
    }

    // 出队操作
    @Override
    public E dequeue() {
        return removeFirst();
    }

    // 拿到队首元素
    @Override
    public E getFront() {
        return getFirst();
    }

    // 清空队列
    @Override
    public void clear() {
        data = (E[]) new Object[DEFAULT_SIZE + 1];
        front = 0;
        rear = 0;
        size = 0;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder(String.format("双端队列容量:%d/%d[", size, data.length-1));
        if(isEmpty()){
            sb.append(']');
        }else {
            for(int i = front; i != rear; i=(i+1) % data.length){
                sb.append(data[i]);
                if((i+1) % data.length == rear){
                    sb.append(']');
                }else {
                    sb.append(", ");
                }
            }
        }
        return sb.toString();
    }

    @Override
    public Iterator<E> iterator() {
        return new ArrayDequeIterator();
    }

    class ArrayDequeIterator implements Iterator<E>{
        // 定义指针变量
        private int cur = front;
        @Override
        public boolean hasNext() {
            return cur != rear;
        }

        @Override
        public E next() {
            E ret = data[cur];
            cur = (cur + 1) % data.length;
            return ret;
        }
    }
}
```

测试类：`ArrayDequeDemo`

```java
package cn.queue.demo03;

public class ArrayDequeDemo {
    public static void main(String[] args) {
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        // 插入元素
        System.out.println("===队头插入===");
        for (int i = 1; i <=3 ; i++) {
            deque.addFirst(i);
        }
        System.out.println(deque);

        System.out.println("===队尾插入===");
        for (int i = 4; i <=6 ; i++) {
            deque.addLast(i);
        }
        System.out.println(deque);

        System.out.println("===队头删除===");
        System.out.println(deque.removeFirst());

        System.out.println("===队尾删除===");
        System.out.println(deque.removeLast());
    }
}
```

执行结果

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211130144444.png" style="zoom:80%;" />	

## 第6章 递归和分治回溯

### 6.1 递归

#### 6.1.1 基本介绍

递归指的是在定义方法时，在方法内部调用方法本身。程序调用自身的编程技巧称为递归`(recursion)`

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211108195455.png" style="zoom: 67%;" />	

```java
public void show(){
    System.out.println("递归调用！！！！");
    // 调用show()方法
    show();
}
```

#### 6.1.2 递归作用

它通常把一个大型复杂的问题层层转化为一个与原问题相似的规模较小的问题来求解，递归策略只需少量的程序就可描述出解题过程所需要的多次重复计算，大大地减少了程序的代码量。==一般来说，递归需要有边界条件、递归前进段和递归返回段。当边界条件不满足时，递归前进;当边界条件满足时，递归返回。==

6.1.3 注意事项

在递归中，不能无限制的调用自己，必须要有边界条件，能够让递归结束，因为每一次递归调用都会在栈内存开辟新的空间，重新执行方法，==如果递归的层级太深，很容易造成栈内存溢出==。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211202121329.png" style="zoom:67%;" />	

一般来说，递归需要有边界条件、递归前进段和递归返回段。当边界条件不满足时，递归前进，当边界条件满足时，递归返回。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211202122159.png" style="zoom: 67%;" />

最后阶段

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211202135439.png" style="zoom: 67%;" />	

#### 6.1.3 案例实现

请定义一个方法，使用递归完成求`N`的阶乘。

```java
分析：
1!: 1
2!: 2*1=2*1!
3!: 3*2*1=3*2!
4!: 4*3*2*1=4*3!
...
n!: n*(n-1)*(n-2)...*2*1=n*(n-1)!
所以，假设有一个方法factorial(n)用来求n的阶乘，那么n的阶乘还可以表示为n*factorial(n-1)
```

代码示例

```java
package cn.recursion.demo01;

public class RecursionDemo01 {
    public static void main(String[] args) {
        int result = factorial(5);
        System.out.println("5的阶乘:" + result); // 5的阶乘:120
    }

    public static int factorial(int n){
        if (n == 1){
            return 1;
        }
        return n * factorial(n-1);
    }
}
```

### 6.2 分治算法

#### 6.2.1 基本概念

分治算法就是将原问题划分成n个规模较小，并且结构与原问题相似的子问题，递归地解决这些子问题，然后再合并其结果，就得到原问题的解。

分治算法的递归实现中，每一层递归都会涉及这样三个操作:

- 分解:将原问题分解成一系列子问题。
- 解决:递归地求解各个子问题，若子问题足够小，则直接求解。
- 合并:将子问题的结果合并成原问题。

分治算法能解决的问题，一般需要满足下面这几个条件:

- 原问题与分解成的小问题具有相同的模式。
- 原问题分解成的子问题可以独立求解，子问题之间没有相关性。
- 具有分解终止条件，也就是说，当问题足够小，可以直接求解。
- 可以将子问题合并成原问题，而这个合并操作的复杂度不能太高，否则就起不到减小算法总体复杂度的效果了。

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211202164313.png)

#### 6.2.2 案例分析

1、前`n`项求和问题

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211202200301.png)

代码示例

```java
package cn.recursion.demo01;

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
```

执行结果

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211202200517.png" style="zoom:80%;" />	

2、`n`的阶乘问题

思路分析

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211202201411.png" style="zoom:80%;" />	

代码示例

```java
package cn.recursion.demo01;

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
```

执行结果

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211202203822.png" style="zoom:80%;" />	

3、斐波那契数列问题

斐波那契数列为`1,1,2,3, 5,8,13,21......`，第一项和第二项均为`1`,其余项为前两项之和，假设`f(x)`为斐波那契数列中的第`x`项，则:

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211202205828.png" style="zoom:80%;" />	

代码示例

```java
package cn.recursion.demo01;

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
```

执行结果

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211202212346.png" style="zoom:80%;" />	

## 第7章 树

### 7.1 树的基本介绍

#### 7.1.1基本定义

树是计算机中非常重要的一种数据结构，同时使用树这种数据结构，可以描述现实生活中的很多事物，例如家谱、单位的组织架构、等。

树`(Tree) `是`n (n≥0)`个结点的有限集。当`n=0`时称为空树，在任意一颗非空树中: 

- 有且仅有一个特定的称为根`(root) `的结点。
- 当`n>1`时， 其余结点可分为`m (m>0)`个互不相交的有限集`T1`、`T2`、... `Tm`,其中每一个集合本身又是一颗树，并且称为根的子树`(SubTree)`

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211205154455.png)

#### 7.1.2 树结点分类

结点拥有的子树数称为结点的度`(Degree)` ，度为`0`的结点称为叶节点`(Leaf) `或终端结点。度不为`0`的结点称为非终端结点或分支结点。除根节点外，分支结点也成为内部节点，==树的度是树内各结点的度的最大值==。

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211205155717.png)

#### 7.1.3 树结点的关系

结点的子树的根称为该结点的孩子`(Child)` ,相应地该结点称为孩子的双亲`(Parent) `。同一个双亲的孩子之间互称兄弟`(Sibling)` 。结点的祖先是从根到该结点所经分支上的所有结点。以某结点为根的子树中任一结点都称为该结点的子孙。

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211205184823.png)

结点的层次`(Level)`从根结点开始定义起，根为第一层，根的孩子为第二层。若某结点在第`i`层，则其子树的根就在`i+1`层。其双亲在同一层的结点互为堂兄弟。树中结点的最大层次称为树的深度`(Depth)`或高度。

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211205205406.png)

### 7.2 二叉树

#### 7.2.1 基本介绍

二叉树`(Binary Tree)`是`n(n≥0)`个结点的有限集合，该集合或者空集(称为空二叉树)，或者由一个根节点和两棵互不相交的、分别称为根节点的左子树和右子树的二叉树组成。

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211205212513.png)

#### 7.2.2 二叉树的形态

1、空二叉树

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211205220447.png" style="zoom:80%;" />	

2、只有一个根节点

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211205221148.png" style="zoom:80%;" />	

3、根节点只有左子树

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211205221527.png" style="zoom:80%;" />	

4、根节点只有右子树

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211205221941.png" style="zoom:80%;" />

5、根节点既有右子树又有左子树

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211205222310.png" style="zoom: 80%;" />	

#### 7.2.3 二叉树的性质

- 在二叉树的第`i`层上至多有`2^i-1`个结点`(i≥1)`。
- 深度为`k`的二叉树至多有`2^k-1`个结点`(k≥1)`。
- 对任何一棵二叉树，如果终端结点数为`n0`，度为`2`的结点数为`n2`，则`n0= n2+1`。
- 具有`n`个结点的完全二叉树的深度为`[log2 n] +1`。
- 如果对于一棵有`n`个结点的完全二叉树的结点按层序编号，如果`i= 1`,结点无双亲。如果`i>1`,则双亲是`[i/2]`。如果`2i> n`,则结点`i`无左孩子;否则其左孩子为`2i`，如果`2i+1> n`，则结点`i`无右孩子，否则有孩子为`2i + 1`。

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211205224450.png)

#### 7.2.4 斜树

所有的结点都只有左子树的二叉树叫==左斜树==。所有结点都只有右子树的二叉树叫==右斜树==，所以在极端情况下二叉树会退化成线性表(线性表是树的特殊表现形式) ,这种情况也称之为非平衡树。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211205231216.png" style="zoom:80%;" />	

#### 7.2.5 满二叉树

在一棵二叉树中，如果所有分支结点都存在左子树和右子树，并且所有叶子都在同一层上，这样的二叉树称为满二叉树，满二叉树是一种平衡二叉树。

满二叉树所有节点的度都要么为`0`,要么为`2`，且所有的叶子节点都在最后一层。

在同样高度的二叉树中，满二叉树的叶子节点数量最多、总节点数量最多。

满二叉树一定是真二叉树，真二叉树不一定是满二叉树。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211205224450.png" style="zoom:80%;" />

#### 7.2.6 完全二叉树

1、真二叉树

真二叉树所有节点的度都要么为`0`,要么为`2`。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211205233808.png" style="zoom:80%;" />

2、完全二叉树基本介绍

对一棵具有`n`个结点的二叉树按层序编号，如果编号为`i (1 ≤i≤ n)`的结点与同样深度的满二叉树中编号为`i`的结点在二叉树中位置完全相同，则这颗二叉树称为完全二叉树，完全二叉树也是一种平衡二叉树。

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211205235204.png)

2、完全二叉树特点

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211206091618.png)

叶子节点只会出现最后`2`层，且最后`1`层的叶子结点都靠左对齐。

倒数二层，若有叶子结点，一定都在右部连续位置。

度为`1`的节点只有左子树，度为`1`的节点要么是`1`个，要么是`0`个，同样节点数量的二叉树，完全二叉树的高度最小。

假设完全二叉树的高度为`h(h ≥ 1)`

- 那么至少有`2^h-1`个节点`( 2^0 + 2^1 +2^2 +..+ 2^h-2 +1)`，
- 最多有`2^h - 1`个节点( `2^0 + 2^1 + 2^2 +...+ 2^h-1`，满二叉树)，
- 总节点数量为`n`。

```java
2^h-1 ≤n < 2^h
h-1 ≤ log2n < h
h= floor(log2n) + 1
```

3、完全二叉树的性质

一棵有`n`个节点的完全二叉树`(n> 0) `, 从上到下、从左到右对节点从`0`开始进行编号，对任意第`i`个节点

如果`i = 0`，它是==根节点==，如果`i > 0`，它的父节点编号为`floor(i- 1)/2)`。

如果`2i+ 1 ≤ n-1`，它的==左==子节点编号为`2i + 1`，如果`2i+ 1> n-1`，它无左子节点，如果`2i+ 2≤ n-1`，它的右子节点编号为`2i+ 2`。

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211206100207.png)

如果一棵完全二叉树有768个节点，求叶子节点的个数?

> 解决方案

假设叶子节点个数为`n0`，度为`1`的节点个数为`n1`，度为`2`的节点个数为·n2·，节点个数`n= n0+ n1 + n2`,而且`n0 = n2 + 1`得出结论`n = 2n0 + n1 - 1`

完全二叉树的`n1`要么为`0`，要么为`1`。

- `n1`为`1`时，`n = 2n0`, `n`必然是偶数。
- 叶子节点个数`n0=(n + 1)/2`，非叶子节点个数`n1 + n2= (n- 1)/2`。
- `n1`为`0`时，`n= 2n0- 1`, `n`必然是奇数。
- 叶子节点个数`n0 = (n + 1)/2`，非叶子节点个数`n1 + n2 = (n- 1)/ 2`。

> 结论

叶子节点个数：`n0 = floor((n+ 1)/2)= ceiling(n/2)`。

非叶子节点个数：`n1 + n2= floor(n/2)= ceiling((n- 1)/ 2)`

因此子节点个数为`384`。

### 7.3 二叉搜索树

#### 7.3.1 基本介绍

二叉搜索树是二叉树的一种，是应用非常广泛的一种二叉树，英文简称为BST又被称为:二叉查找树、二叉排序树，==任意一个节点的值都大于其左子树所有节点的值，任意一个节点的值都小于其右子树所有节点的值==，它的左右子树也是一棵二叉搜索树。二叉搜索树可以大大提高搜索数据的效率，二叉搜索树存储的元素必须具备可比较性。

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211206111205.png)

#### 7.3.2 存储结构

1、顺序存储

二叉树的顺序存储结构就是用一维数组存储二叉树中的结点，并且结点的存储位置,也就是数组的下标要能体现出之间的逻辑关系。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211206115532.png" style="zoom:80%;" />

顺序存储结构在极端情况下浪费空间，只适合平衡树的存储。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211206121612.png" style="zoom:80%;" />

2、链式存储

既然顺序表存储适用性性不强，则考虑链式存储结构，二叉树每个结点最多有两个孩子，所以为它设计一个数据域和两个指针域，这种链表也叫作二叉链表。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211206172728.png" style="zoom:80%;" />	

其中`data`是数据域，`lchild`和`rchild`都是指针域，分别存放指向左孩子和右孩子的指针。二叉链表示意图如下：

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211206173332.png" style="zoom:80%;" />

#### 7.3.3 添加结点

1、思路分析

如果当前二分搜索树一个元素都没有，添加一个新元素【`43`】，则当前元素为根结点。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211212121433.png" style="zoom:80%;" />

二次添加新元素比如添加【`23`】和【`59`】，==直接让它跟根节点进行比较，大于插入根节点右边，小于插入根节点左边==。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211211215841.png" style="zoom:80%;" />	

依次添加元素

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211211221757.png" style="zoom:80%;" />

再次添加元素，添加【`60`】这个新节点，先跟根结点【`41`】比较，发现【`60`】比根结点大，插入根节点的右边，继续跟右边结点【59】比较，发现大于【59】，则插入到【59】的右边。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211211222039.png" style="zoom:80%;" />

再次插入【`28`】这个新节点，先跟根结点【`41`】进行比较，发现小于根结点，往左边插入。一直比较，最终插入到结点【`35`】的左边。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211211223025.png" style="zoom:80%;" />

#### 7.3.4 删除结点

> 删除二分搜索树最小值

所谓二分搜索树的最小值，一定是一颗二叉树从根节点开始，不停的向左走，直到走不动为止，==那个最左的节点一定是最小值==。

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211211224153.png)

对于上面这颗二叉搜索树来说，删除最小节点，直接删除就好了。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211211224441.png" style="zoom:80%;" />

特殊情况，此时二分搜索树最小节点是【`23`】，该节点存在叶子数。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211211225306.png" style="zoom:80%;" />

此时只需要将【`23`】这个节点删除，然后将【`23`】整个右子树直接接上根结点的左子树就好了。

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211211225909.png)

> 删除二分搜索树最大值

对于下面这颗二叉搜索树来说，删除最大节点【如果是叶子节点】，直接删除就好了。

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211212122127.png)

删除叶子结点成功

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211212122315.png" style="zoom:80%;" />

如果不是叶子节点，存在左子树。先将结点【`59`】删除，然后将`58`的左子树整体当成`41`的右子树，接上即可。

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211212122650.png)

> 删除二分搜索树任意节点

比如删除58这个节点，该节点左右都有孩子的节点，假设删除的结点为`d`。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211212150615.png" style="zoom:80%;" />

==先找到删除节点的右子树的相应最小值的结点==，`s = min(d->min)`，`s` 节点是`d`的后继，然后在`d`的右子树中，删除最小的值。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211212150725.png" style="zoom:80%;" />

让S的右子树等于被删除节点的右子树，`s->right = removeMin(d->right)`。

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211212152408.png)

最后让`s`的左子树等价于`d`的左子树，最后删除`d`，`S`是新的子树的根，`s->left = d->left`。

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211212152759.png)

#### 7.3.5 深度优先遍历

深度优先遍历主要包括:先序遍历，中序遍历，后序遍历

1、先序遍历

规则是若二叉树为空，则空操作返回，==否则先访问根节点，然后前序遍历左子树，再前序遍历右子树==。

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211206165444.png)

2、中序遍历

规则是若树为空，则空操作返回，否则从根节点开始【注意并不是先访问根节点】，==中序遍历根结点的左子树，然后是访问根结点，最后中序遍历右子树==。

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211206191956.png)

3、后序遍历

规则是若树为空，则空操作返回，否则从根结点开始，==后序遍历根节点的左子树，然后后序遍历右子树，最后访问根节点==。

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211206201544.png)

#### 7.3.6 广度优先遍历

1、层序遍历

规则是若树为空，则空操作返回，否则从树的第一层，也就是==根结点开始访问，从上而下逐层遍历，在同一层中，按从左到右的顺序对结点逐个访问==。

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211207072713.png)

#### 7.3.7 代码实现

接口类：`List`

```java
package cn.binarysearch.demo;

public interface List<E> extends Iterable<E>{
    void add(E element);
    void add(int index, E element) ;
    void remove(E element);
    E remove(int index);
    E get(int index);
    E set(int index, E element) ;
    int size();
    int indexOf(E element) ;
    boolean contains(E element);
    boolean isEmpty();
    void clear();
}
```

链表类实现：`LinkedList`

```java
package cn.binarysearch.demo;

import cn.set.demo.List;

import java.util.Iterator;

// 链表
public class LinkedList<E> implements List<E> {
    // 创建Node节点
    private class Node {
        // 数据域
        E data;
        // 指向直接前驱的指针
        Node prev;
        // 指向直接后继的指针
        Node next;

        // 构造函数
        public Node() {
            this(null, null, null);
        }

        public Node(E data) {
            this(data, null, null);
        }

        public Node(E data, Node prev, Node next) {
            this.data = data;
            this.prev = prev;
            this.next = next;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            if (prev != null) {
                sb.append(prev.data);
            } else {
                sb.append("null");
            }

            sb.append("->").append(data).append("->");

            if (next != null) {
                sb.append(next.data);
            } else {
                sb.append("null");
            }
            return sb.toString();
        }
    }

    // 链表元素的数量
    private int size;
    // 声明头结点
    private Node head;
    // 声明尾节点
    private Node tail;

    // 初始化头结点
    public LinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public LinkedList(E[] arr) {
        for (E e : arr) {
            add(e);
        }
    }

    //默认向表尾添加元素
    @Override
    public void add(E element) {
        add(size, element);
    }

    //在链表当中指定索引index处添加一个元素
    @Override
    public void add(int index, E element) {
        if (index < 0|| index > size) {
            throw new ArrayIndexOutOfBoundsException("add index out of bounds");
        }
        // 创建新的结点对象
        Node node = new Node(element);

        // 链表为空
        if(isEmpty()){
            head = node;
            tail = node;
            tail.next = head;
            head.prev = tail;

        }else if(index == 0){ // 在链表头部添加元素
            // 头结点的上一跳指向新节点的上一跳
            node.prev = head.prev;
            node.next = head;
            head.prev = node;
            head = node;
            tail.next = head;
        }else if(index == size){ // 在链表尾部添加元素
            node.next = tail.next;
            tail.next = node;
            node.prev = tail;
            tail = node;
            head.prev = tail;
        }else{
            // 在链表中添加元素
            Node p,q; // 定义两个指针变量
            if(index <= size / 2){
                p = head;
                for(int i =0; i < index -1 ; i++){
                    p = p.next;
                }
                q = p.next;
                p.next = node;
                node.prev = p;
                q.prev = node;
                node.next = q;
            }else{
                p = tail;
                for(int i=size -1; i > index; i--){
                    p = p.prev;
                }
                q = p.prev;
                q.next = node;
                node.prev = q;
                p.prev = node;
                node.next = p;
            }
        }
        size++;
    }

    //删除链表中指定的元素element
    @Override
    public void remove(E element) {
        int index = indexOf(element);
        if(index != -1){
            remove(index);
        }
    }

    //删除链表中指定角标处index的元素
    @Override
    public E remove(int index) {
        if (index < 0|| index > size) {
            throw new ArrayIndexOutOfBoundsException("remove index out of bounds");
        }
        // 定义ret变量
        E ret = null;
        Node node;
        // 当链表只剩一个元素
        if(size ==1){
            ret = head.data;
            head = null;
            tail = null;
            // 删除表头
        }else if(index == 0){
            ret = head.data;
            node = head.next;
            head.next = null;
            node.prev = head.prev;
            head.prev = null;
            head = node;
            tail.next = head;
            // 删除表尾
        }else if(index == size -1){
            ret = tail.data;
            node = tail.prev;
            tail.prev = null;
            node.next = tail.next;
            tail.next = null;
            tail = node;
            head.prev = tail;
        }else{
            // 删除链表中间的某一个元素
            Node p, q, r;
            if(index <= size / 2){
                p = head;
                for(int i=0; i < index-1; i++){
                    p = p.next;
                }
                q = p.next;
                ret = q.data;
                r = q.next;
                p.next = r;
                r.prev = p;
                q.next = null;
                q.prev = null;
            }else{
               p = tail;
               for(int i = size -1; i > index + 1; i--){
                   p = p.prev;
               }
               q = p.prev;
               ret = q.data;
               r = q.prev;
               r.next = p;
               p.prev = r;
               q.next = null;
               q.prev = null;
            }
        }
        size --;
        return ret;
    }

    //获取链表中指定索引处的元素
    @Override
    public E get(int index) {
        if (index < 0|| index > size) {
            throw new ArrayIndexOutOfBoundsException("get index out of bounds");
        }
        // 获取头
        if(index == 0){
            return head.data;
        }else if(index == size -1){
            // 获取尾部
            return tail.data;
        }else{
            // 获取中间
            Node p = head;
            for (int i = 0; i < index; i++) {
                p = p.next;
            }
            return p.data;
        }
    }

    // 修改链表中指定索引index的元素为element
    @Override
    public E set(int index, E element) {
        if (index < 0|| index > size) {
            throw new ArrayIndexOutOfBoundsException("set index out of bounds");
        }

        E ret = null;
        // 获取头
        if(index == 0){
           // 修改头
            ret = head.data;
            head.data = element;
        }else if(index == size -1){
            // 修改尾部元素
            ret = tail.data;
            tail.data = element;
        }else{
            // 修改中间
            Node p = head;
            for (int i = 0; i < index; i++) {
                p = p.next;
            }
            ret = p.data;
            p.data = element;
        }

        return ret;
    }

    @Override
    public int size() {
        return size;
    }

    //查找元素在链表中第一次出现的索引
    @Override
    public int indexOf(E element) {
        if(isEmpty()){
            return -1;
        }
        Node p = head;
        int index = 0;
        while (!p.data.equals(element)){
            p = p.next;
            index++;
            if(p == head){
                return -1;
            }
        }
        return index;
    }

    //在链表中判断是否包含元素element
    @Override
    public boolean contains(E element) {
        return indexOf(element) != -1;
    }

    @Override
    public boolean isEmpty() {
        return size== 0 && head == null && tail == null;
    }

    @Override
    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append("size=").append(size).append(", [");
        Node node = head;
        for (int i = 0; i < size; i++) {
            if (i != 0) {
                res.append(", ");
            }
            res.append(node);
            node = node.next;
        }
        res.append("]");
        return res.toString();
    }

    @Override
    public Iterator<E> iterator() {
        return new DoubleCircleLinkedListIterator();
    }

    class  DoubleCircleLinkedListIterator implements Iterator<E>{
        private Node cur = head;
        private boolean flag = true;

        @Override
        public boolean hasNext() {
            if(isEmpty()){
                return false;
            }
            return flag;
        }

        @Override
        public E next() {
            E ret = cur.data;
            cur = cur.next;
            if(cur == head){
                flag = false;
            }
            return ret;
        }
    }
}
```

二分搜索树实现：`BinarySearchTree`

```java
package cn.binarysearch.demo;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

// 二分搜索树
public class BinarySearchTree<E extends Comparable<E>> implements Iterable<E>{
    // 二分搜索树结点定义
    private class Node {
        // 数据域
        public E e;
        // 左右指针域
        public Node left, right;
        // 构造方法
        public Node (E e){
            this.e = e;
            left = null;
            right = null;
        }
    }

    // 二分搜索树的根节点的指针
    private Node root;
    // 二分搜索树的元素的个数
    private int size;

    // 创建一颗空的二分搜索树
    public BinarySearchTree(){
        root = null;
        size = 0;
    }
    // 获取二分搜索树的元素个数
    public int size(){
        return size;
    }

    // 判断二分搜索树是否为空
    public boolean isEmpty(){
        return size == 0 && root == null;
    }

    /***
     * 向二分搜索树中添加一个元素e
     * @param e
     */
    public void add(E e){
        root = add(root, e);
    }

    /***
     * 向以node为根的二分搜索树中添加元素e
     * 并且返回新结点插入之后的二分搜索树新的根
     * @param node
     * @param e
     * @return
     */
    private Node add(Node node, E e){
        if(node == null){
            size ++;
            return new Node(e);
        }

        if(e.compareTo(node.e) < 0){
            // 以node左子树为根节点，再添加一个元素
            node.left = add(node.left, e);
        }else if(e.compareTo(node.e) > 0){
            // 以node右子树为根节点，再添加一个元素
            node.right = add(node.right, e);
        }

        return node;
    }

    /***
     * 判断二分搜索树中是否包含元素e
     * @param e
     * @return
     */
    public boolean contains(E e){
        return contains(root, e);
    }

    /***
     * 以node为根节点的树中，判断e是否存在
     * @param node
     * @param e
     * @return
     */
    private boolean contains(Node node, E e){
        if(node == null){
            return false;
        }
        if(e.compareTo(node.e) == 0){
            return true;
        }
        // 以当前节点的左孩子为根的左子树,去寻找元素e
        if(e.compareTo(node.e) < 0){
            return contains(node.left, e);
        }else {
            // 以当前节点的右孩子为根的右子树,去寻找元素e
            return contains(node.right, e);
        }
    }

    // 前序遍历
    public void preOrder(){
        preOrder(root);
    }

    /***
     * 前序遍历递归实现
     * @param node
     */
    public void preOrder(Node node){
        if(node == null){
            return;
        }

        System.out.println(node.e);
        preOrder(node.left);
        preOrder(node.right);
    }

    // 前序遍历的非递归实现方式
    public void preOrderNR(){
        // 先访问根节点，然后前序遍历左子树，再前序遍历右子树
        LinkedList<Node> stack = new LinkedList<>();
        // 入栈根节点
        stack.push(root);
        while (!stack.isEmpty()){
            // 先弹出一个元素
            Node cur = stack.pop();
            System.out.println(cur.e);
            // 判断左右孩子是否为空，然后执行入栈操作
            if(cur.right != null){
                stack.push(cur.right);
            }
            if(cur.left != null){
                stack.push(cur.left);
            }
        }
    }

    // 中序遍历
    public void inOrder(){
        inOrder(root);
    }

    /***
     * 中序遍历递归实现
     * @param node
     */
    private void inOrder(Node node){
        if(node == null){
            return;
        }
        inOrder(node.left);
        System.out.println(node.e);
        inOrder(node.right);
    }


    // 中序遍历非递归实现
    public void inOrderNR(){
        // 中序遍历根结点的左子树，然后是访问根结点，最后中序遍历右子树
        LinkedList<Node> stack = new LinkedList<>();
        // 创建pre指针
        Node prev = root;
        // 将现将根节点和根节点的左边全部入栈
       while (prev != null){
           stack.push(prev);
           prev = prev.left;
       }
       while (!stack.isEmpty()){
           // 先弹出元素
           Node cur = stack.pop();
           System.out.println(cur.e);
           // 判断该结点右边是否为空
           if(cur.right != null){
               // 如果右孩子不为空，继续执行入栈操作
               prev = cur.right;
               while (prev != null){
                   // 将左孩子执行入栈操作
                   stack.push(prev);
                   prev = prev.left;
               }
           }
       }
    }

    // 后序遍历
    public void postOrder(){
        postOrder(root);
    }

    /***
     * 后序遍历递归实现
     * @param node
     */
    private void postOrder(Node node){
        if(node == null){
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node.e + " ");
    }

    // 后序遍历非递归实现
    public void postOrderNR(){
        if(root == null){
            return;
        }
        // 申请两个栈s1，s2，头节点入栈s1
        LinkedList<Node> s1 = new LinkedList<>();
        LinkedList<Node> s2 = new LinkedList<>(); // 辅助栈，存储根 -> 右节点 ->左节点 的结果

        // 先插入根节点
        s1.push(root);
        // 如果栈s1不为空，执行以下操作：弹出一个元素，入栈s2
        while (!s1.isEmpty()){
            Node cur = s1.pop();
            s2.push(cur);
            // 如果该节点左孩子不空入栈s1，如果该节点右孩子不空入栈s1.
            if(cur.left != null){
                s1.push(cur.left);
            }
            if(cur.right != null){
                s1.push(cur.right);
            }
        }

        // 将栈s2中的节点一次出栈，打印
        while (!s2.isEmpty()){
            Node cur = s2.pop();
            System.out.println(cur.e + " ");
        }
    }

    // 层序遍历
    public void levelOrder(){
        // 创建队列
        Queue<Node> queue = new LinkedList<>();
        // 先入队根节点
        queue.offer(root);
        while (!queue.isEmpty()){
            // 先出队一个元素
            Node cur = queue.poll();
            System.out.println(cur.e);
            // 分别入队左右子树
            if(cur.left != null){
                queue.offer(cur.left);
            }
            if(cur.right != null){
                queue.offer(cur.right);
            }
        }
    }

    // 返回二分搜索树的最小值【迭代实现】
    public E minimum2(){
        if (isEmpty()){
            throw new IllegalArgumentException("BST is empty!!!");
        }
        // 定义指针prev指向根节点
        Node prev = root;
        while (prev.left != null){
            prev = prev.left;
        }

        return prev.e;
    }

    // 返回二分搜索树的最小值【递归实现】
    public E minimum(){
        if(isEmpty()){
            throw new IllegalArgumentException("BST is empty!!!");
        }
        Node minNode = minimum(root);
        return minNode.e;
    }

    /***
     * 返回以node为根的二分 搜索树的最小值所在的节点
     * @param node
     * @return
     */
    private Node minimum(Node node){
        if(node.left == null){
            return node;
        }
        return minimum(node.left);
    }

    // 返回二分搜索树的最大值【递归实现】
    public E maximum(){
        if(isEmpty()){
            throw new IllegalArgumentException("BST is empty!!!");
        }
        Node maxNode = maximum(root);
        return maxNode.e;
    }

    /***
     * 返回以node为根的二分 搜索树的最大值所在的节点
     * @param node
     * @return
     */
    private Node maximum(Node node){
        if(node.right == null){
            return node;
        }
        return maximum(node.right);
    }

    // 从二分搜索树中删除最小值所在节点, 返回最小值
    public E removeMin(){
        // 调用函数
        E ret = minimum();
        root = removeMin(root);
        return ret;
    }

    /***
     * 删除掉以node为根的二分搜索树中的最小节点
     * 返回删除节点后新的二分搜索树的根
     * @param node
     * @return
     */
    private Node removeMin(Node node){
        // 向左走再也走不动了
        if(node.left == null){
            // 定义变量保存当前结点的右子树
            Node rightNode = node.right;
            node.right = null;
            size --;
            return rightNode;
        }
        // 以node的左边为根节点，删除当前左子树的最小值，然后返回给左边接上
        node.left = removeMin(node.left);
        return node;
    }

    // 从二分搜索树中删除最大值所在节点, 返回最大值
    public E removeMax(){
        // 调用函数
        E ret = maximum();
        root = removeMax(root);
        return ret;
    }

    /***
     * 删除掉以node为根的二分搜索树中的最大节点
     * 返回删除节点后新的二分搜索树的根
     * @param node
     * @return
     */
    private Node removeMax(Node node){
        if(node.right == null){
            // 定义变量保存当前结点的左子树
            Node leftNode = node.left;
            node.left = null;
            size --;
            return leftNode;
        }
        // 以node的右边为根节点，删除当前右子树的最大值，然后返回给右边接上
        node.right = removeMax(node.right);
        return node;
    }

    // 从二分搜索树中删除元素为e的节点
    public void remove(E e){
        root = remove(root, e);
    }

    /***
     * 删除掉以node为根的二分搜索树中值为e的节点,递归算法
     * 返回删除节点后新的二分搜索树的根
     * @param node
     * @param e
     * @return
     */
    private Node remove(Node node, E e){
        if(node == null){
            return null;
        }
        if(e.compareTo(node.e) < 0){
            node.left = remove(node.left, e);
            return node;
        }else if(e.compareTo(node.e) > 0){
            node.right = remove(node.right, e);
            return node;
        }else { // e.compareTo(node.e) == 0
            // 如果左子树为空
            if(node.left == null){
                Node rightNode = node.right;
                // 置空操作
                node.right = null;
                size --;
                return rightNode;
            }
            // 待删除节点右子树为空的情况
            if(node.right == null){
                Node leftNode = node.left;
                // 置空操作
                node.left = null;
                size --;
                return leftNode;
            }

            // 待删除节点左右子树均不为空的情况
            // 找到node结点的后继
            Node successor = minimum(node.right);
            // 找到比待删除节点大的最小节点, 即待删除节点右子树的最小节点
            successor.right = removeMin(node.right);
            // 用这个节点顶替待删除节点的位置
            successor.left = node.left;
            // 置空操作
            node.left = node.right = null;
            return successor;
        }
    }
    
   @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        // 前序遍历实现
        generateBST(root, 0, sb);
        return sb.toString();
    }

    // 生成以node为根节点，深度为depth的描述二叉树的字符串
    private void generateBST(Node node, int depth, StringBuilder sb){
        if(node == null){
            sb.append(generateDepth(depth) + "null\n");
            return;
        }

        // 当前结点存储的元素
        sb.append(generateDepth(depth) + node.e + "\n");
        // 访问当前结点的左子树
        generateBST(node.left, depth + 1, sb);
        // 访问当前结点的右子树
        generateBST(node.right, depth + 1, sb);
    }

    private String generateDepth(int depth){
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < depth ; i ++)
            sb.append("--");
        return sb.toString();
    }

    @Override
    public Iterator<E> iterator() {
        return new BinarySearchTreeIterator();
    }

    private class BinarySearchTreeIterator implements Iterator<E>{
        private LinkedList<E> list = new LinkedList<>();
        public BinarySearchTreeIterator(){
            LinkedList<Node> stack = new LinkedList<>();
            // 创建pre指针
            Node prev = root;
            // 将现将根节点和根节点的左边全部入栈
            while (prev != null){
                stack.push(prev);
                prev = prev.left;
            }
            while (!stack.isEmpty()){
                // 先弹出元素
                Node cur = stack.pop();
                list.add(cur.e);
                // 判断该结点右边是否为空
                if(cur.right != null){
                    // 如果右孩子不为空，继续执行入栈操作
                    prev = cur.right;
                    while (prev != null){
                        // 将左孩子执行入栈操作
                        stack.push(prev);
                        prev = prev.left;
                    }
                }
            }
        }
        @Override
        public boolean hasNext() {
            return !list.isEmpty();
        }

        @Override
        public E next() {
            return list.removeFirst();
        }
    }
}
```

测试类：`BinarySearchTreeDemo`

```java
package cn.binarysearch.demo;

public class BinarySearchTreeDemo {
    public static void main(String[] args) {
        BinarySearchTree<Integer> tree = new BinarySearchTree<>();
        // 向二叉树中添加节点
        tree.add(6);
        tree.add(9);
        tree.add(1);
        tree.add(3);
        tree.add(11);
        tree.add(5);
        // 判断元素是否存在
        System.out.println(tree.contains(11));
        System.out.println(tree.contains(10));

        // 调用前序遍历
        System.out.println("===前序遍历【递归】===");
        tree.preOrder();
        System.out.println("===前序遍历【非递归】===");
        tree.preOrderNR();

        System.out.println("==========");
        System.out.println(tree);
        // 调用中序遍历
        /*
        System.out.println("===中序遍历【递归】===");
        tree.inOrder();
        System.out.println("===中序遍历【非递归】===");
        tree.inOrderNR();

        */
        // 调用后序遍历
        /*System.out.println("===后序遍历【递归】===");
        tree.postOrder();
        System.out.println("===后序遍历【非递归】===");
        tree.postOrderNR();*/

        // 层序遍历
       /* System.out.println("===层序遍历===");
        tree.levelOrder();*/

        // 返回最小值
        /*System.out.println("二叉搜索树最小节点:" + tree.minimum1());
        System.out.println("二叉搜索树最小节点:" + tree.minimum2());
        System.out.println("二叉搜索树最大节点:" + tree.maximum());*/

        // 删除二叉搜索树中的最小值
        /*System.out.println("二叉树最小节点[删除前]:" + tree.minimum());
        System.out.println(tree.removeMin());
        System.out.println("二叉树最小节点[删除后]:" + tree.minimum());
        System.out.println("===========");
        // 删除二叉搜索树中的最大值
        System.out.println("二叉树最大节点[删除前]:" + tree.maximum());
        System.out.println(tree.removeMax());
        System.out.println("二叉树最大节点[删除后]:" + tree.maximum());*/

        // 中序遍历
        // tree.inOrderNR();
        //tree.remove(3);
        //System.out.println(tree);
    }
}
```



### 7.4 集合和映射

#### 7.4.1 集合基本介绍

集合是一个容器，容器中的每个数据称为元素，存储不重复元素的容器，可以动态保存任意多个对象，使用比较方便。

由链表实现`LinkedSet`有序，由二分搜索树实现`TreeSet`有序自然排序，由哈希表实现`HashSet`无序的。

#### 7.4.2 LinkedSet实现

1、`Set`接口

```java
package cn.set.demo;

// 创建Set接口
public interface Set<E>{
    void add(E e);
    boolean contains(E e);
    void remove(E e);
    int size();
    boolean isEmpty();
}
```

2、`List`接口

```java
package cn.set.demo;

public interface List<E> extends Iterable<E>{
    void add(E element);
    void add(int index, E element) ;
    void remove(E element);
    E remove(int index);
    E get(int index);
    E set(int index, E element) ;
    int size();
    int indexOf(E element) ;
    boolean contains(E element);
    boolean isEmpty();
    void clear();
}
```

3、链表`LinkedList`

```java
package cn.set.demo;

import java.util.Iterator;
// 链表实现
public class LinkedList<E> implements List<E>{

    // 创建Node节点
    private class Node {
        // 数据域
        E data;
        // 指向直接前驱的指针
        Node prev;
        // 指向直接后继的指针
        Node next;

        // 构造函数
        public Node() {
            this(null, null, null);
        }

        public Node(E data) {
            this(data, null, null);
        }

        public Node(E data, Node prev, Node next) {
            this.data = data;
            this.prev = prev;
            this.next = next;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            if (prev != null) {
                sb.append(prev.data);
            } else {
                sb.append("null");
            }

            sb.append("->").append(data).append("->");

            if (next != null) {
                sb.append(next.data);
            } else {
                sb.append("null");
            }
            return sb.toString();
        }
    }

    // 链表元素的数量
    private int size;
    // 声明头结点
    private Node head;
    // 声明尾节点
    private Node tail;

    // 初始化头结点
    public LinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public LinkedList(E[] arr) {
        for (E e : arr) {
            add(e);
        }
    }

    //默认向表尾添加元素
    @Override
    public void add(E element) {
        add(size, element);
    }

    //在链表当中指定索引index处添加一个元素
    @Override
    public void add(int index, E element) {
        if (index < 0|| index > size) {
            throw new ArrayIndexOutOfBoundsException("add index out of bounds");
        }
        // 创建新的结点对象
        Node node = new Node(element);

        // 链表为空
        if(isEmpty()){
            head = node;
            tail = node;
            tail.next = head;
            head.prev = tail;

        }else if(index == 0){ // 在链表头部添加元素
            // 头结点的上一跳指向新节点的上一跳
            node.prev = head.prev;
            node.next = head;
            head.prev = node;
            head = node;
            tail.next = head;
        }else if(index == size){ // 在链表尾部添加元素
            node.next = tail.next;
            tail.next = node;
            node.prev = tail;
            tail = node;
            head.prev = tail;
        }else{
            // 在链表中添加元素
            Node p,q; // 定义两个指针变量
            if(index <= size / 2){
                p = head;
                for(int i =0; i < index -1 ; i++){
                    p = p.next;
                }
                q = p.next;
                p.next = node;
                node.prev = p;
                q.prev = node;
                node.next = q;
            }else{
                p = tail;
                for(int i=size -1; i > index; i--){
                    p = p.prev;
                }
                q = p.prev;
                q.next = node;
                node.prev = q;
                p.prev = node;
                node.next = p;
            }
        }
        size++;
    }

    //删除链表中指定的元素element
    @Override
    public void remove(E element) {
        int index = indexOf(element);
        if(index != -1){
            remove(index);
        }
    }

    //删除链表中指定角标处index的元素
    @Override
    public E remove(int index) {
        if (index < 0|| index > size) {
            throw new ArrayIndexOutOfBoundsException("remove index out of bounds");
        }
        // 定义ret变量
        E ret = null;
        Node node;
        // 当链表只剩一个元素
        if(size ==1){
            ret = head.data;
            head = null;
            tail = null;
            // 删除表头
        }else if(index == 0){
            ret = head.data;
            node = head.next;
            head.next = null;
            node.prev = head.prev;
            head.prev = null;
            head = node;
            tail.next = head;
            // 删除表尾
        }else if(index == size -1){
            ret = tail.data;
            node = tail.prev;
            tail.prev = null;
            node.next = tail.next;
            tail.next = null;
            tail = node;
            head.prev = tail;
        }else{
            // 删除链表中间的某一个元素
            Node p, q, r;
            if(index <= size / 2){
                p = head;
                for(int i=0; i < index-1; i++){
                    p = p.next;
                }
                q = p.next;
                ret = q.data;
                r = q.next;
                p.next = r;
                r.prev = p;
                q.next = null;
                q.prev = null;
            }else{
               p = tail;
               for(int i = size -1; i > index + 1; i--){
                   p = p.prev;
               }
               q = p.prev;
               ret = q.data;
               r = q.prev;
               r.next = p;
               p.prev = r;
               q.next = null;
               q.prev = null;
            }
        }
        size --;
        return ret;
    }

    //获取链表中指定索引处的元素
    @Override
    public E get(int index) {
        if (index < 0|| index > size) {
            throw new ArrayIndexOutOfBoundsException("get index out of bounds");
        }
        // 获取头
        if(index == 0){
            return head.data;
        }else if(index == size -1){
            // 获取尾部
            return tail.data;
        }else{
            // 获取中间
            Node p = head;
            for (int i = 0; i < index; i++) {
                p = p.next;
            }
            return p.data;
        }
    }

    // 修改链表中指定索引index的元素为element
    @Override
    public E set(int index, E element) {
        if (index < 0|| index > size) {
            throw new ArrayIndexOutOfBoundsException("set index out of bounds");
        }

        E ret = null;
        // 获取头
        if(index == 0){
           // 修改头
            ret = head.data;
            head.data = element;
        }else if(index == size -1){
            // 修改尾部元素
            ret = tail.data;
            tail.data = element;
        }else{
            // 修改中间
            Node p = head;
            for (int i = 0; i < index; i++) {
                p = p.next;
            }
            ret = p.data;
            p.data = element;
        }

        return ret;
    }

    @Override
    public int size() {
        return size;
    }

    //查找元素在链表中第一次出现的索引
    @Override
    public int indexOf(E element) {
        if(isEmpty()){
            return -1;
        }
        Node p = head;
        int index = 0;
        while (!p.data.equals(element)){
            p = p.next;
            index++;
            if(p == head){
                return -1;
            }
        }
        return index;
    }

    //在链表中判断是否包含元素element
    @Override
    public boolean contains(E element) {
        return indexOf(element) != -1;
    }

    @Override
    public boolean isEmpty() {
        return size== 0 && head == null && tail == null;
    }

    @Override
    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append("size=").append(size).append(", [");
        Node node = head;
        for (int i = 0; i < size; i++) {
            if (i != 0) {
                res.append(", ");
            }
            res.append(node);
            node = node.next;
        }
        res.append("]");
        return res.toString();
    }

    @Override
    public Iterator<E> iterator() {
        return new DoubleCircleLinkedListIterator();
    }

    class  DoubleCircleLinkedListIterator implements Iterator<E>{
        private Node cur = head;
        private boolean flag = true;

        @Override
        public boolean hasNext() {
            if(isEmpty()){
                return false;
            }
            return flag;
        }

        @Override
        public E next() {
            E ret = cur.data;
            cur = cur.next;
            if(cur == head){
                flag = false;
            }
            return ret;
        }
    }
}
```

4、`LinkedSet`实现

```java
package cn.set.demo;

// 底层由链表实现的集合
public class LinkedSet<E> implements Set<E>{
    private LinkedList<E> list;
    // 创建LinkedSet对象
    public LinkedSet(){
        list = new LinkedList<>();
    }

    /***
     * 向集合中添加一个元素element 如果元素已存在则不添加
     * @param element
     */
    @Override
    public void add(E element) {
        if(!list.contains(element)){
            list.add(element);
        }
    }

    @Override
    public void remove(E element) {
        list.remove(element);
    }

    @Override
    public boolean contains(E element) {
        return list.contains(element);
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }
    

    @Override
    public String toString() {
        return list.toString();
    }
}
```

#### 7.4.3 TreeSet实现

1、二分搜索树：`BinarySearchTree`

```java
package cn.set.demo;
import java.util.LinkedList;
import java.util.Queue;

// 二分搜索树
public class BinarySearchTree<E extends Comparable<E>>{
    // 二分搜索树结点定义
    private class Node {
        // 数据域
        public E e;
        // 左右指针域
        public Node left, right;
        // 构造方法
        public Node (E e){
            this.e = e;
            left = null;
            right = null;
        }
    }

    // 二分搜索树的根节点的指针
    private Node root;
    // 二分搜索树的元素的个数
    private int size;

    // 创建一颗空的二分搜索树
    public BinarySearchTree(){
        root = null;
        size = 0;
    }
    // 获取二分搜索树的元素个数
    public int size(){
        return size;
    }

    // 判断二分搜索树是否为空
    public boolean isEmpty(){
        return size == 0 && root == null;
    }

    /***
     * 向二分搜索树中添加一个元素e
     * @param e
     */
    public void add(E e){
        root = add(root, e);
    }

    /***
     * 向以node为根的二分搜索树中添加元素e
     * 并且返回新结点插入之后的二分搜索树新的根
     * @param node
     * @param e
     * @return
     */
    private Node add(Node node, E e){
        if(node == null){
            size ++;
            return new Node(e);
        }

        if(e.compareTo(node.e) < 0){
            // 以node左子树为根节点，再添加一个元素
            node.left = add(node.left, e);
        }else if(e.compareTo(node.e) > 0){
            // 以node右子树为根节点，再添加一个元素
            node.right = add(node.right, e);
        }

        return node;
    }

    /***
     * 判断二分搜索树中是否包含元素e
     * @param e
     * @return
     */
    public boolean contains(E e){
        return contains(root, e);
    }

    /***
     * 以node为根节点的树中，判断e是否存在
     * @param node
     * @param e
     * @return
     */
    private boolean contains(Node node, E e){
        if(node == null){
            return false;
        }
        if(e.compareTo(node.e) == 0){
            return true;
        }
        // 以当前节点的左孩子为根的左子树,去寻找元素e
        if(e.compareTo(node.e) < 0){
            return contains(node.left, e);
        }else {
            // 以当前节点的右孩子为根的右子树,去寻找元素e
            return contains(node.right, e);
        }
    }

    // 前序遍历
    public void preOrder(){
        preOrder(root);
    }

    /***
     * 前序遍历递归实现
     * @param node
     */
    public void preOrder(Node node){
        if(node == null){
            return;
        }

        System.out.println(node.e);
        preOrder(node.left);
        preOrder(node.right);
    }

    // 前序遍历的非递归实现方式
    public void preOrderNR(){
        // 先访问根节点，然后前序遍历左子树，再前序遍历右子树
        LinkedList<Node> stack = new LinkedList<>();
        // 入栈根节点
        stack.push(root);
        while (!stack.isEmpty()){
            // 先弹出一个元素
            Node cur = stack.pop();
            System.out.println(cur.e);
            // 判断左右孩子是否为空，然后执行入栈操作
            if(cur.right != null){
                stack.push(cur.right);
            }
            if(cur.left != null){
                stack.push(cur.left);
            }
        }
    }

    // 中序遍历
    public void inOrder(){
        inOrder(root);
    }

    /***
     * 中序遍历递归实现
     * @param node
     */
    private void inOrder(Node node){
        if(node == null){
            return;
        }
        inOrder(node.left);
        System.out.println(node.e);
        inOrder(node.right);
    }


    // 中序遍历非递归实现
    public void inOrderNR(){
        // 中序遍历根结点的左子树，然后是访问根结点，最后中序遍历右子树
        LinkedList<Node> stack = new LinkedList<>();
        // 创建pre指针
        Node prev = root;
        // 将现将根节点和根节点的左边全部入栈
       while (prev != null){
           stack.push(prev);
           prev = prev.left;
       }
       while (!stack.isEmpty()){
           // 先弹出元素
           Node cur = stack.pop();
           System.out.println(cur.e);
           // 判断该结点右边是否为空
           if(cur.right != null){
               // 如果右孩子不为空，继续执行入栈操作
               prev = cur.right;
               while (prev != null){
                   // 将左孩子执行入栈操作
                   stack.push(prev);
                   prev = prev.left;
               }
           }
       }
    }

    // 后序遍历
    public void postOrder(){
        postOrder(root);
    }

    /***
     * 后序遍历递归实现
     * @param node
     */
    private void postOrder(Node node){
        if(node == null){
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node.e + " ");
    }

    // 后序遍历非递归实现
    public void postOrderNR(){
        if(root == null){
            return;
        }
        // 申请两个栈s1，s2，头节点入栈s1
        LinkedList<Node> s1 = new LinkedList<>();
        LinkedList<Node> s2 = new LinkedList<>(); // 辅助栈，存储根 -> 右节点 ->左节点 的结果

        // 先插入根节点
        s1.push(root);
        // 如果栈s1不为空，执行以下操作：弹出一个元素，入栈s2
        while (!s1.isEmpty()){
            Node cur = s1.pop();
            s2.push(cur);
            // 如果该节点左孩子不空入栈s1，如果该节点右孩子不空入栈s1.
            if(cur.left != null){
                s1.push(cur.left);
            }
            if(cur.right != null){
                s1.push(cur.right);
            }
        }

        // 将栈s2中的节点一次出栈，打印
        while (!s2.isEmpty()){
            Node cur = s2.pop();
            System.out.println(cur.e + " ");
        }
    }

    // 层序遍历
    public void levelOrder(){
        // 创建队列
        Queue<Node> queue = new LinkedList<>();
        // 先入队根节点
        queue.offer(root);
        while (!queue.isEmpty()){
            // 先出队一个元素
            Node cur = queue.poll();
            System.out.println(cur.e);
            // 分别入队左右子树
            if(cur.left != null){
                queue.offer(cur.left);
            }
            if(cur.right != null){
                queue.offer(cur.right);
            }
        }
    }

    // 返回二分搜索树的最小值【迭代实现】
    public E minimum2(){
        if (isEmpty()){
            throw new IllegalArgumentException("BST is empty!!!");
        }
        // 定义指针prev指向根节点
        Node prev = root;
        while (prev.left != null){
            prev = prev.left;
        }

        return prev.e;
    }

    // 返回二分搜索树的最小值【递归实现】
    public E minimum(){
        if(isEmpty()){
            throw new IllegalArgumentException("BST is empty!!!");
        }
        Node minNode = minimum(root);
        return minNode.e;
    }

    /***
     * 返回以node为根的二分 搜索树的最小值所在的节点
     * @param node
     * @return
     */
    private Node minimum(Node node){
        if(node.left == null){
            return node;
        }
        return minimum(node.left);
    }

    // 返回二分搜索树的最大值【递归实现】
    public E maximum(){
        if(isEmpty()){
            throw new IllegalArgumentException("BST is empty!!!");
        }
        Node maxNode = maximum(root);
        return maxNode.e;
    }

    /***
     * 返回以node为根的二分 搜索树的最大值所在的节点
     * @param node
     * @return
     */
    private Node maximum(Node node){
        if(node.right == null){
            return node;
        }
        return maximum(node.right);
    }

    // 从二分搜索树中删除最小值所在节点, 返回最小值
    public E removeMin(){
        // 调用函数
        E ret = minimum();
        root = removeMin(root);
        return ret;
    }

    /***
     * 删除掉以node为根的二分搜索树中的最小节点
     * 返回删除节点后新的二分搜索树的根
     * @param node
     * @return
     */
    private Node removeMin(Node node){
        // 向左走再也走不动了
        if(node.left == null){
            // 定义变量保存当前结点的右子树
            Node rightNode = node.right;
            node.right = null;
            size --;
            return rightNode;
        }
        // 以node的左边为根节点，删除当前左子树的最小值，然后返回给左边接上
        node.left = removeMin(node.left);
        return node;
    }

    // 从二分搜索树中删除最大值所在节点, 返回最大值
    public E removeMax(){
        // 调用函数
        E ret = maximum();
        root = removeMax(root);
        return ret;
    }

    /***
     * 删除掉以node为根的二分搜索树中的最大节点
     * 返回删除节点后新的二分搜索树的根
     * @param node
     * @return
     */
    private Node removeMax(Node node){
        if(node.right == null){
            // 定义变量保存当前结点的左子树
            Node leftNode = node.left;
            node.left = null;
            size --;
            return leftNode;
        }
        // 以node的右边为根节点，删除当前右子树的最大值，然后返回给右边接上
        node.right = removeMax(node.right);
        return node;
    }

    // 从二分搜索树中删除元素为e的节点
    public void remove(E e){
        root = remove(root, e);
    }

    /***
     * 删除掉以node为根的二分搜索树中值为e的节点,递归算法
     * 返回删除节点后新的二分搜索树的根
     * @param node
     * @param e
     * @return
     */
    private Node remove(Node node, E e){
        if(node == null){
            return null;
        }
        if(e.compareTo(node.e) < 0){
            node.left = remove(node.left, e);
            return node;
        }else if(e.compareTo(node.e) > 0){
            node.right = remove(node.right, e);
            return node;
        }else { // e.compareTo(node.e) == 0
            // 如果左子树为空
            if(node.left == null){
                Node rightNode = node.right;
                // 置空操作
                node.right = null;
                size --;
                return rightNode;
            }
            // 待删除节点右子树为空的情况
            if(node.right == null){
                Node leftNode = node.left;
                // 置空操作
                node.left = null;
                size --;
                return leftNode;
            }

            // 待删除节点左右子树均不为空的情况
            // 找到node结点的后继
            Node successor = minimum(node.right);
            // 找到比待删除节点大的最小节点, 即待删除节点右子树的最小节点
            successor.right = removeMin(node.right);
            // 用这个节点顶替待删除节点的位置
            successor.left = node.left;
            // 置空操作
            node.left = node.right = null;
            return successor;
        }
    }
    
   @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        // 前序遍历实现
        generateBST(root, 0, sb);
        return sb.toString();
    }

    // 生成以node为根节点，深度为depth的描述二叉树的字符串
    private void generateBST(Node node, int depth, StringBuilder sb){
        if(node == null){
            sb.append(generateDepth(depth) + "null\n");
            return;
        }

        // 当前结点存储的元素
        sb.append(generateDepth(depth) + node.e + "\n");
        // 访问当前结点的左子树
        generateBST(node.left, depth + 1, sb);
        // 访问当前结点的右子树
        generateBST(node.right, depth + 1, sb);
    }

    private String generateDepth(int depth){
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < depth ; i ++)
            sb.append("--");
        return sb.toString();
    }
}
```

2、`TreeSet`实现

```java
package cn.set.demo;

//底层由二分搜索树来实现的集合 有序 自然排序
public class TreeSet<E extends Comparable<E>> implements Set<E>{

    private BinarySearchTree<E> tree;

    TreeSet(){
        tree = new BinarySearchTree<>();
    }
    @Override
    public void add(E element) {
        tree.add(element);
    }

    @Override
    public boolean contains(E element) {
        return tree.contains(element);
    }

    @Override
    public void remove(E element) {
        tree.remove(element);
    }

    @Override
    public int size() {
        return tree.size();
    }

    @Override
    public boolean isEmpty() {
        return tree.isEmpty();
    }

    @Override
    public String toString() {
       return tree.toString();
    }
}
```

#### 7.4.4 TreeSet和LinkedSet比较

1、工具类：`FileOperation`

```java
package cn.set.demo;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

// 文件相关操作
public class FileOperation {

    // 读取文件名称为filename中的内容，并将其中包含的所有词语放进words中
    public static boolean readFile(String filename, ArrayList<String> words){

        if (filename == null || words == null){
            System.out.println("filename is null or words is null");
            return false;
        }

        // 文件读取
        Scanner scanner;

        try {
            File file = new File(filename);
            if(file.exists()){
                FileInputStream fis = new FileInputStream(file);
                scanner = new Scanner(new BufferedInputStream(fis), "UTF-8");
                scanner.useLocale(Locale.ENGLISH);
            }
            else
                return false;
        }
        catch(IOException ioe){
            System.out.println("Cannot open " + filename);
            return false;
        }

        // 简单分词
        // 这个分词方式相对简陋, 没有考虑很多文本处理中的特殊问题
        // 在这里只做demo展示用
        if (scanner.hasNextLine()) {

            String contents = scanner.useDelimiter("\\A").next();

            int start = firstCharacterIndex(contents, 0);
            for (int i = start + 1; i <= contents.length(); )
                if (i == contents.length() || !Character.isLetter(contents.charAt(i))) {
                    String word = contents.substring(start, i).toLowerCase();
                    words.add(word);
                    start = firstCharacterIndex(contents, i);
                    i = start + 1;
                } else
                    i++;
        }

        return true;
    }

    // 寻找字符串s中，从start的位置开始的第一个字母字符的位置
    private static int firstCharacterIndex(String s, int start){

        for( int i = start ; i < s.length() ; i ++ )
            if( Character.isLetter(s.charAt(i)) )
                return i;
        return s.length();
    }
}
```

2、测试类：`TestSet`

```java
package cn.set.demo;

import java.util.ArrayList;

public class TestSet {
    static ArrayList<String> words;
    public static void main(String[] args) {
        words = new ArrayList<>();
        FileOperation.readFile("src/pride-and-prejudice.txt", words);
        LinkedSet<String> ls = new LinkedSet<>();
        System.out.println("LinkedSet:");
        countingWords(ls);
        System.out.println(ls.size());
        System.out.println("======");
        TreeSet<String> ts = new TreeSet<>();
        System.out.println("TreeSet:");
        countingWords(ts);
        System.out.println(ts.size());
    }

    private static void countingWords(Set<String> set) {
        long startTime = System.currentTimeMillis();
        for(String word : words){
            set.add(word);
        }
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime + "ms");
    }
}
```

3、执行结果

`LinkedSet`的效率比`TreeSet`差太多了！！！！

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211212162119.png" style="zoom:80%;" />	

#### 7.4.5 映射基本介绍

映射就是==存储(键，值)数据对的数据结构(Key, Value)，根据键(Key) ，寻找值(Value)==。

由链表实现`LinkedMap`有序，由二分搜索树实现`TreeMap`有序键自然排序，由哈希表实现`HashMap`无序。

#### 7.4.6 LinkedListMap实现

1、接口类：`Map`

```java
package cn.map.demo;
// Map接口
public interface Map<K, V> {
    void put(K key, V value);
    V remove(K key);
    boolean contains(K key);
    V get(K key);
    void update(K key, V value);
    int size();
    boolean isEmpty();
}
```

2、实现类：`LinkedListMap`

```java
package cn.map.demo;

/***
 * 底层由链表实现的映射(map)
 * @param <K>
 * @param <V>
 */
public class LinkedListMap<K,V> implements Map<K,V>{
    // 创建Node节点
    private class Node{
        public K key;
        public V value;
        //指针域 用来存储下一个结点对象的地址
        public Node next;

        // 构造方法
        public Node(){
            this(null, null, null);
        }

        public Node(K key, V value){
            this(key, value, null);
        }

        public Node(K key, V value, Node next){
            this.key = key;
            this.value = value;
            this.next = next;
        }

        @Override
        public String toString() {
           return key.toString() + ":" + value.toString();
        }
    }

    // 链表元素的数量
    private int size;
    //链表当中的虚拟头结点
    private Node dummyHead;

    // 链表初始化
    public LinkedListMap(){
        dummyHead = new Node();
        size = 0;
    }

    /***
     * 定义辅助方法，传个key值返回key值对应的节点
     * @param key
     * @return
     */
    private Node getNode(K key){
        Node prev = dummyHead.next;
        while (prev != null){
            if(prev.key.equals(key)){
                return prev;
            }
            prev = prev.next;
        }
        return null;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    /***
     * 通过key，添加节点.
     * @param key
     * @param value
     */
    @Override
    public void put(K key, V value) {
        Node node = getNode(key);
        if(node == null){
            dummyHead.next = new Node(key, value, dummyHead.next);
            size++;
        }else{
            node.value = value;
        }
    }

    /***
     * 通过key，删除节点
     * @param key
     * @return
     */
    @Override
    public V remove(K key) {
        Node prev = dummyHead;
        while (prev.next != null){
            if(prev.next.key.equals(key)){
                break;
            }
            prev = prev.next;
        }

        if(prev.next != null){
            Node delNode = prev.next;
            prev.next = delNode.next;
            delNode.next = null;
            size --;
            return delNode.value;
        }
        return null;
    }

    @Override
    public boolean contains(K key) {
        return getNode(key) != null;
    }

    @Override
    public V get(K key) {
        Node node = getNode(key);
        return node == null ? null:node.value;
    }

    @Override
    public void update(K key, V value) {
        Node node = getNode(key);
        if(node == null){
            throw new IllegalArgumentException(key + "update key out of bounds");
        }
        node.value = value;
    }
}
```

#### 7.4.7 TreeMap实现

1、实现类：`TreeMap`

```java
package cn.map.demo;

/***
 * 底层由二分搜索树实现映射
 * @param <K>
 * @param <V>
 */
public class TreeMap<K extends Comparable<K>,V> implements Map<K, V> {
    // 创建Node节点
    private class Node {
        public K key;
        public V value;
        // 左右指针域
        public Node left, right;

        // 构造方法
        public Node(K key, V value) {
            this.key = key;
            this.value = value;
            left = null;
            right = null;
        }
    }

    // 二分搜索树的根节点的指针
    private Node root;
    // 二分搜索树的元素的个数
    private int size;

    // TreeMap初始化
    public TreeMap(){
        root = null;
        size = 0;
    }

    /***
     * 向TreeMap添加新的元素(key, value)
     * @param key
     * @param value
     */
    @Override
    public void put(K key, V value) {
        root = put(root, key, value);
    }

    /***
     * 向以node为根的TreeMap中插入元素(key, value)，递归算法
     * 返回插入新节点后TreeMap的根
     * @param node
     * @param key
     * @param value
     * @return
     */
    private Node put(Node node, K key, V value) {
        if(node == null){
            size ++;
            return new Node(key, value);
        }
        if(key.compareTo(node.key) < 0){
            // 以node左子树为根节点，再添加一个元素
            node.left = put(node.left, key, value);
        }else if(key.compareTo(node.key) > 0){
            // 以node右子树为根节点，再添加一个元素
            node.right = put(node.right, key, value);
        }else {
            // 当key相等时，value直接覆盖
            node.value = value;
        }
        return node;
    }

    /***
     * 返回以node为根节点的二分搜索树中，key所在的节点
     * @param node
     * @param key
     * @return
     */
    private Node getNode(Node node, K key){
        if(node == null){
            return null;
        }
        if(key.equals(node.key)){
            return node;
        }else if(key.compareTo(node.key) < 0){
            return getNode(node.left, key);
        }else {
            return getNode(node.right, key);
        }
    }

    /***
     * 判断TreeMap中是否包含元素e
     * @param key
     * @return
     */
    @Override
    public boolean contains(K key) {
        return getNode(root, key) != null;
    }

    /***
     * 通过键获取值
     * @param key
     * @return
     */
    @Override
    public V get(K key) {
        Node node = getNode(root, key);
        return node == null ? null: node.value;
    }

    /***
     * 通过key，修改值
     * @param key
     * @param value
     */
    @Override
    public void update(K key, V value) {
        Node node = getNode(root, key);
        if(node == null){
            throw new IllegalArgumentException(key + "update key out of bounds");
        }
        node.value = value;
    }

    /***
     * 从二分搜索树中删除键为key的节点
     * @param key
     * @return
     */
    @Override
    public V remove(K key) {
        Node node = getNode(root, key);
        if(node != null){
            root = remove(root, key);
            return node.value;
        }
        return null;
    }

    /***
     * 删除掉以node为根的二分搜索树的元素(key, value),递归算法
     * 返回删除节点后新的二分搜索树的根
     * @param node
     * @param key
     * @return
     */
    private Node remove(Node node, K key) {
        if(node == null){
            return null;
        }
        if(key.compareTo(node.key) < 0){
            node.left = remove(node.left, key);
            return node;
        }else if(key.compareTo(node.key) > 0){
            node.right = remove(node.right, key);
            return node;
        }else { // e.compareTo(node.e) == 0
            // 如果左子树为空
            if(node.left == null){
                Node rightNode = node.right;
                // 置空操作
                node.right = null;
                size --;
                return rightNode;
            }
            // 待删除节点右子树为空的情况
            if(node.right == null){
                Node leftNode = node.left;
                // 置空操作
                node.left = null;
                size --;
                return leftNode;
            }

            // 待删除节点左右子树均不为空的情况
            // 找到node结点的后继
            Node successor = minimum(node.right);
            // 找到比待删除节点大的最小节点, 即待删除节点右子树的最小节点
            successor.right = removeMin(node.right);
            // 用这个节点顶替待删除节点的位置
            successor.left = node.left;
            // 置空操作
            node.left = node.right = null;
            return successor;
        }
    }

    /***
     * 返回以node为根的二分搜索树的最小值所在的节点
     * @param node
     * @return
     */
    private Node minimum(Node node){
        if(node.left == null){
            return node;
        }
        return minimum(node.left);
    }

    /***
     * 删除掉以node为根的二分搜索树中的最小节点
     * 返回删除节点后新的二分搜索树的根
     * @param node
     * @return
     */
    private Node removeMin(Node node){
        // 向左走再也走不动了
        if(node.left == null){
            // 定义变量保存当前结点的右子树
            Node rightNode = node.right;
            node.right = null;
            size --;
            return rightNode;
        }
        // 以node的左边为根节点，删除当前左子树的最小值，然后返回给左边接上
        node.left = removeMin(node.left);
        return node;
    }

    /***
     * 获取TreeMap的元素个数
     * @return
     */
    @Override
    public int size() {
        return size;
    }

    /***
     * 判断TreeMap是否为空
     * @return
     */
    @Override
    public boolean isEmpty() {
        return size == 0 && root == null;
    }
}
```

#### 7.4.8 LinkedListMap和TreeMap比较

1、工具类：`FileOperation`

```java
package cn.map.demo;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

// 文件相关操作
public class FileOperation {

    // 读取文件名称为filename中的内容，并将其中包含的所有词语放进words中
    public static boolean readFile(String filename, ArrayList<String> words){

        if (filename == null || words == null){
            System.out.println("filename is null or words is null");
            return false;
        }

        // 文件读取
        Scanner scanner;

        try {
            File file = new File(filename);
            if(file.exists()){
                FileInputStream fis = new FileInputStream(file);
                scanner = new Scanner(new BufferedInputStream(fis), "UTF-8");
                scanner.useLocale(Locale.ENGLISH);
            }
            else
                return false;
        }
        catch(IOException ioe){
            System.out.println("Cannot open " + filename);
            return false;
        }

        // 简单分词
        // 这个分词方式相对简陋, 没有考虑很多文本处理中的特殊问题
        // 在这里只做demo展示用
        if (scanner.hasNextLine()) {

            String contents = scanner.useDelimiter("\\A").next();

            int start = firstCharacterIndex(contents, 0);
            for (int i = start + 1; i <= contents.length(); )
                if (i == contents.length() || !Character.isLetter(contents.charAt(i))) {
                    String word = contents.substring(start, i).toLowerCase();
                    words.add(word);
                    start = firstCharacterIndex(contents, i);
                    i = start + 1;
                } else
                    i++;
        }

        return true;
    }

    // 寻找字符串s中，从start的位置开始的第一个字母字符的位置
    private static int firstCharacterIndex(String s, int start){

        for( int i = start ; i < s.length() ; i ++ )
            if( Character.isLetter(s.charAt(i)) )
                return i;
        return s.length();
    }
}
```

2、测试类：`TestMap`

```java
package cn.map.demo;

import cn.set.demo.FileOperation;

import java.util.ArrayList;

public class TestMap {
    static ArrayList<String> words;
    public static void main(String[] args) {
        words = new ArrayList<>();
        FileOperation.readFile("src/pride-and-prejudice.txt", words);
        LinkedListMap<String, Integer> ls = new LinkedListMap();
        System.out.println("LinkedListMap:");
        countingWords(ls);
        System.out.println(ls.size());
        System.out.println("======");
        TreeMap<String, Integer> ts = new TreeMap<>();
        System.out.println("TreeMap:");
        countingWords(ts);
        System.out.println(ts.size());
    }

    private static void countingWords(Map<String, Integer> map) {
        long startTime = System.currentTimeMillis();
        for(String word : words){
            map.put(word, 1);
        }
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime + "ms");
    }
}
```

3、执行结果

`LinkedListMap`的效率比`TreeMap`差太多了！！！！

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211212201441.png" style="zoom:80%;" />	

### 7.5 ALV平衡树

#### 7.5.1 基本介绍

平衡二叉树又称AVL树，是一种最早的自平衡二分搜索树结构，它是具有如下性质的二叉树:

- 左、右子树是平衡二叉树;
- ==所有结点的左、右子树深度之差的绝对值≤1==。
- 满二叉树一定是平衡二叉树，高度最低。
- 完全二叉树也是平衡二叉树，叶子节点深度相差不为1

为了方便起见，给每个结点附加一个<font color = blue>**数字 = 该结点左子树与右子树的深度差**</font>。这个数字称为结点的<font color = red>**平衡因子**</font>。这样，可以得到AVL树的其它性质(可以证明) :

任一结点的平衡因子只能取`: -1、0、1`，==如果树中任意一个结点的平衡因子的绝对值大于1,则这棵二叉树就失去平衡==。

#### 7.5.2 LL平衡旋转

1、思路分析

插入的元素在不平衡的节点的左侧。

节点大小：`T1` < `z `< `T2` < `x` < `T3` < `y `< `T4`

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211214141554.png" style="zoom:80%;" />	

先让`X`的右子树变成以`Y`为根的子树，再让`Y`的左子树变成`x`的右子树。然后让`X`变成新的二叉树的根节点。

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211214142533.png)

2、案例实现

以`B`为轴，对`A`做了一次<font color= blue>**单向右旋平衡旋转**</font>。

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211212210953.png)

#### 7.5.3 RR平衡旋转

1、思路分析

插入的元素在不平衡的节点的右侧的右侧。

节点大小：`T4` < `Y `< `T3` < `x` < `T1` < `Z `< `T2`

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211214144317.png" style="zoom:80%;" />	

先让`X`的左子树变成以`Y`为根的子树，再让`Y`的右子树变成`x`的左子树

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211214145905.png" style="zoom:80%;" />

2、案例实现

以`B`为轴，对`A`做了一次<font color = blue>**单向左旋平衡旋转**</font>。

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211213071115.png)

#### 7.5.4 LR平衡旋转

1、思路分析

插入的元素在不平衡的节点的左侧的右侧。

节点大小：`T1` < `x `< `T2` < `z` < `T3` <` y` < `T4`

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211214211731.png" style="zoom:80%;" />	

先对`X`进行左旋转，变成`LL`模式，然后继续右旋转

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211214213557.png)

2、案例实现

对B做了一次逆时针旋转，对A做了一次顺时针旋转。( 先左后右)

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211213110325.png)

#### 7.5.5  RL平衡旋转

1、思路分析

插入的元素在不平衡的节点的右侧的左侧。

节点大小：`T1` < `Y `< `T2` < `z` < `T3` <` X` < `T4`

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211214215241.png" style="zoom:80%;" />	

先对`X`进行右旋转，变成`RR`模式，然后继续左旋转

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211214220541.png)

2、案例实现

对`B`做了一次顺时针旋转，对`A`做了 一次逆时针旋转。(先右后左)

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211213180626.png)

#### 7.5.6 代码实现

1、接口类：`Map`

```java
package cn.alvtree.demo01;
// Map接口
public interface Map<K, V> {
    void put(K key, V value);
    V remove(K key);
    boolean contains(K key);
    V get(K key);
    void update(K key, V value);
    int size();
    boolean isEmpty();
}
```

2、工具类：`FileOperation`

```java
package cn.alvtree.demo01;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

// 文件相关操作
public class FileOperation {

    // 读取文件名称为filename中的内容，并将其中包含的所有词语放进words中
    public static boolean readFile(String filename, ArrayList<String> words){

        if (filename == null || words == null){
            System.out.println("filename is null or words is null");
            return false;
        }

        // 文件读取
        Scanner scanner;

        try {
            File file = new File(filename);
            if(file.exists()){
                FileInputStream fis = new FileInputStream(file);
                scanner = new Scanner(new BufferedInputStream(fis), "UTF-8");
                scanner.useLocale(Locale.ENGLISH);
            }
            else
                return false;
        }
        catch(IOException ioe){
            System.out.println("Cannot open " + filename);
            return false;
        }

        // 简单分词
        // 这个分词方式相对简陋, 没有考虑很多文本处理中的特殊问题
        // 在这里只做demo展示用
        if (scanner.hasNextLine()) {

            String contents = scanner.useDelimiter("\\A").next();

            int start = firstCharacterIndex(contents, 0);
            for (int i = start + 1; i <= contents.length(); )
                if (i == contents.length() || !Character.isLetter(contents.charAt(i))) {
                    String word = contents.substring(start, i).toLowerCase();
                    words.add(word);
                    start = firstCharacterIndex(contents, i);
                    i = start + 1;
                } else
                    i++;
        }

        return true;
    }

    // 寻找字符串s中，从start的位置开始的第一个字母字符的位置
    private static int firstCharacterIndex(String s, int start){

        for( int i = start ; i < s.length() ; i ++ )
            if( Character.isLetter(s.charAt(i)) )
                return i;
        return s.length();
    }
}
```

3、ALV实现类：`AVLTree`

```java
package cn.alvtree.demo01;

import cn.map.demo.Map;

import java.util.ArrayList;

/***
 * 二叉平衡树实现
 * @param <K>
 * @param <V>
 */
public class AVLTree<K extends Comparable<K>,V> implements Map<K, V> {
    // 创建Node节点
    private class Node {
        public K key;
        public V value;
        // 左右指针域
        public Node left, right;
        // 当前节点所处的高度,默认为1
        public int height;

        // 构造方法
        public Node(K key, V value) {
            this.key = key;
            this.value = value;
            left = null;
            right = null;
            height = 1;
        }

        @Override
        public String toString() {
            return "(" + key +"," +value + ")";
        }
    }

    // 二分搜索树的根节点的指针
    private Node root;
    // 二分搜索树的元素的个数
    private int size;

    // TreeMap初始化
    public AVLTree(){
        root = null;
        size = 0;
    }

    /***
     * 返回以node为根节点的二分搜索树中，key所在的节点
     * @param node
     * @param key
     * @return
     */
    private Node getNode(Node node, K key){
        if(node == null){
            return null;
        }
        if(key.equals(node.key)){
            return node;
        }else if(key.compareTo(node.key) < 0){
            return getNode(node.left, key);
        }else {
            return getNode(node.right, key);
        }
    }

    /***
     * 获得节点Node的高度,如果节点为空，则高度为0
     * @param node
     * @return
     */
    private int getHeight(Node node){
        if(node == null){
            return 0;
        }
        return node.height;
    }

    /***
     * 获得节点node的平衡因子
     * 计算平衡因子:左子树的高度-右子树的高度
     * > 0 左边比右边高
     * == 0 左右一样高
     * < 0 右边比左边高
     * @param node
     * @return
     */
    private int getBalanceFactor(Node node) {
        if(node == null){
            return 0;
        }
        return getHeight(node.left) - getHeight(node.right);
    }

    /***
     * 判断该二叉树是不是二分搜索树
     * @return
     */
    public boolean isBinarySearchTree(){
        // 将Map中的key值存放在List中
        ArrayList<K> keys = new ArrayList<>();
        // 使用中序遍历，遍历的结果都是有序的
        inOrder(root, keys);
        // 判断该数组是否升序
        for (int i=1; i < keys.size(); i++){
            if(keys.get(i-1).compareTo(keys.get(i)) > 0){
                return false;
            }
        }
        return true;
    }
    // 中序遍历
    private void inOrder(Node node, ArrayList<K> keys) {
        if(node == null){
            return;
        }
        inOrder(node.left, keys);
        keys.add(node.key);
        inOrder(node.right, keys);
    }

    /***
     * 判断该二叉树是否是一棵平衡二叉树
     * @return
     */
    public boolean isBalanced(){
        return isBalanced(root);
    }
    /***
     * 判断以Node为根的二叉树是否是一棵平衡二叉树
     * @return
     */
    private boolean isBalanced(Node node){
        if(node == null){
            return true;
        }
        // 拿到平衡因子
        int balanceFactor = getBalanceFactor(node);
        if(Math.abs(balanceFactor) > 1){
            return false;
        }
        // 判断当前结点的左右子树是否是平衡二叉树
        return isBalanced(node.left) && isBalanced(node.right);
    }


    /***
     * 对节点y进行向右旋转操作，返回旋转后新的根节点x
     * @param y
     * @return
     */
    private Node rightRotate(Node y){
        Node x = y.left;
        Node T3 = x.right;

        // 向右旋转的过程【LL平衡旋转】
        x.right = y;
        y.left = T3;

        // 更新height
        y.height = Math.max(getHeight(y.left), getHeight(y.right) + 1);
        x.height = Math.max(getHeight(x.left), getHeight(x.right) + 1);

        // 返回该节点
        return x;
    }

    /***
     * 对节点y进行向左旋转操作，返回旋转后新的根节点x
     * @param y
     * @return
     */
    private Node leftRotate(Node y){
        Node x = y.right;
        Node T2 = x.left;

        // 向右旋转的过程【LL平衡旋转】
        x.left = y;
        y.right = T2;

        // 更新height
        y.height = Math.max(getHeight(y.left), getHeight(y.right) + 1);
        x.height = Math.max(getHeight(x.left), getHeight(x.right) + 1);

        // 返回该节点
        return x;
    }


    /***
     * 向TreeMap添加新的元素(key, value)
     * @param key
     * @param value
     */
    @Override
    public void put(K key, V value) {
        root = put(root, key, value);
    }

    /***
     * 向以node为根的AVLTree中插入元素(key, value)，递归算法
     * 返回插入新节点后AVLTree的根
     * @param node
     * @param key
     * @param value
     * @return
     */
    private Node put(Node node, K key, V value) {
        if(node == null){
            size ++;
            return new Node(key, value);
        }
        if(key.compareTo(node.key) < 0){
            // 以node左子树为根节点，再添加一个元素
            node.left = put(node.left, key, value);
        }else if(key.compareTo(node.key) > 0){
            // 以node右子树为根节点，再添加一个元素
            node.right = put(node.right, key, value);
        }else {
            // 当key相等时，value直接覆盖
            node.value = value;
        }

        // 更新节点的高度
        node.height = 1 + Math.max(getHeight(node.left), getHeight(node.right));
        // 计算平衡因子
        int balanceFactor = getBalanceFactor(node);

        // 左侧的左侧不平衡【右旋转LL】
        if(balanceFactor > 1 && getBalanceFactor(node.left) >= 0){
            return rightRotate(node);
        }

        // 左侧的右侧不平衡【先左后右旋转LR】
        if (balanceFactor > 1 && getBalanceFactor(node.left) < 0) {
            // 当前节点的左孩子进行一次左旋转
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }

        // 右侧的右侧不平衡【左旋转RR】
        if(balanceFactor < -1 && getBalanceFactor(node.right) <= 0){
            return leftRotate(node);
        }
        // 右侧的左侧不平衡【先右后左旋转RL】
        if (balanceFactor < -1 && getBalanceFactor(node.right) > 0) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }
        return node;
    }



    /***
     * 判断TreeMap中是否包含元素e
     * @param key
     * @return
     */
    @Override
    public boolean contains(K key) {
        return getNode(root, key) != null;
    }

    /***
     * 通过键获取值
     * @param key
     * @return
     */
    @Override
    public V get(K key) {
        Node node = getNode(root, key);
        return node == null ? null: node.value;
    }

    /***
     * 通过key，修改值
     * @param key
     * @param value
     */
    @Override
    public void update(K key, V value) {
        Node node = getNode(root, key);
        if(node == null){
            throw new IllegalArgumentException(key + "update key out of bounds");
        }
        node.value = value;
    }

    /***
     * 获取TreeMap的元素个数
     * @return
     */
    @Override
    public int size() {
        return size;
    }

    /***
     * 判断TreeMap是否为空
     * @return
     */
    @Override
    public boolean isEmpty() {
        return size == 0 && root == null;
    }

    /***
     * 返回以node为根的二分搜索树的最小值所在的节点
     * @param node
     * @return
     */
    private Node minimum(Node node){
        if(node.left == null){
            return node;
        }
        return minimum(node.left);
    }

    /***
     * 从二分搜索树中删除键为key的节点
     * @param key
     * @return
     */
    @Override
    public V remove(K key) {
        Node node = getNode(root, key);
        if(node != null){
            root = remove(root, key);
            return node.value;
        }
        return null;
    }

    /***
     * 删除掉以node为根的AVLTree的元素(key, value),递归算法
     * 返回删除节点后新的AVLTree的根
     * @param node
     * @param key
     * @return
     */
    private Node remove(Node node, K key) {
        if (node == null) {
            return null;
        }
        // 创建最终要返回的node
        Node retNode;
        if (key.compareTo(node.key) < 0) {
            node.left = remove(node.left, key);
            retNode = node;
        } else if (key.compareTo(node.key) > 0) {
            node.right = remove(node.right, key);
            retNode = node;
        } else {// e.compareTo(node.e) == 0
            // 如果左子树为空
            if(node.left == null){
                Node rightNode = node.right;
                // 置空操作
                node.right = null;
                size --;
                retNode = rightNode;
            // 待删除节点右子树为空的情况
            }else if(node.right == null){
                Node leftNode = node.left;
                // 置空操作
                node.left = null;
                size --;
                retNode = leftNode;
            }else{
                // 待删除节点左右子树均不为空的情况,找到node结点的后继
                Node successor = minimum(node.right);
                // 找到比待删除节点大的最小节点, 即待删除节点右子树的最小节点
                successor.right = remove(node.right, successor.key);
                // 用这个节点顶替待删除节点的位置
                successor.left = node.left;
                // 置空操作
                node.left = node.right = null;
                retNode =  successor;
            }
        }

        // 当retNode为null
        if(retNode == null){
            return null;
        }

        // 更新节点的高度
        retNode.height = 1 + Math.max(getHeight(retNode.left), getHeight(retNode.right));
        // 计算平衡因子
        int balanceFactor = getBalanceFactor(retNode);

        // 左侧的左侧不平衡【右旋转LL】
        if(balanceFactor > 1 && getBalanceFactor(retNode.left) >= 0){
            return rightRotate(retNode);
        }

        // 左侧的右侧不平衡【先左后右旋转LR】
        if (balanceFactor > 1 && getBalanceFactor(retNode.left) < 0) {
            // 当前节点的左孩子进行一次左旋转
            node.left = leftRotate(retNode.left);
            return rightRotate(retNode);
        }

        // 右侧的右侧不平衡【左旋转RR】
        if(balanceFactor < -1 && getBalanceFactor(retNode.right) <= 0){
            return leftRotate(retNode);
        }
        // 右侧的左侧不平衡【先右后左旋转RL】
        if (balanceFactor < -1 && getBalanceFactor(retNode.right) > 0) {
            retNode.right = rightRotate(retNode.right);
            return leftRotate(retNode);
        }
        return retNode;
    }
}
```

4、测试结果

测试类：`AVLTreeDemo `

```java
package cn.alvtree.demo01;

import java.util.ArrayList;

public class AVLTreeDemo {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        if(FileOperation.readFile("src/pride-and-prejudice.txt", words)) {
            // 创建map对象
            AVLTree<String, Integer> map = new AVLTree<>();
            for (String word : words) {
                if (map.contains(word))
                    map.update(word, map.get(word) + 1);
                else
                    map.put(word, 1);
            }

            System.out.println("总单词个数: " + map.size());
            System.out.println("是否是二分搜索树:" + map.isBinarySearchTree());
            System.out.println("是否是平衡树(ALV): " + map.isBalanced());

            // 删除元素
            for (String word : words){
                map.remove(word);
                if(!map.isBinarySearchTree() || !map.isBalanced()){
                    throw new RuntimeException("该树非BinarySearchTree OR AVLTree");
                }
            }
        }
    }
}
```

执行结果

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211215123029.png" style="zoom:80%;" />	

### 7.6 多路查找树

#### 7.6.1  2-3树

为了保证查找树的平衡性，需要一些灵活性，因此在这里允许树中的一个结点保存多个键。确切的说，将一棵标准的二叉查找树中的结点称为2-结点(含有一个键和两条链)，而现在引入3-结点，它含有两个键和三条链。==2-结点和3-结点中的每条链都对应着其中保存的键所分割产生的一个区间==，2- 3树是一棵绝对平衡的树。

##### 7.6.1.1 基本介绍

2-3树是这样的一棵多路查找树其中的每个结点都具有两个孩子 (我们称它为`2`结点）或者`3`个孩子(我们称它为`3`结点)

==一个2结点包含一个元素和两个孩子(或没有孩子)==，且与二叉排序树类似，树包含的元素小于该元素，右子树包含的元素大于该元素。不过，与二又排序树不同的是，这个2结点要么没有孩子，要有就有两个孩子，不能只有一个孩子。

==一个3结点包含一小一大两个元素和三个孩子(或没有孩子)==，一个3结点要么没有孩子，要么具有3个孩子。 如果某个3结点有孩子的话，左子树包含小于较小元素的元素，右子树包含大于较大元素的元素，中间子树包含介于两元素之间的元素。

注意：2-3树满足二分搜索树的基本性质，并且2-3树中所有的叶子都在同一层次上。事实上，2-3树复杂的地方就在于新结点的插入和已有结点的删除。毕竟，每个结点可能是2结点也可能是3结点，要保证所有叶子都在同一层次，是需要进行一番复杂操作的。

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211215215613.png)

##### 7.6.1.2 查找结点

1、思路分析

将二叉查找树的查找算法一般化我们就能够直接得到2-3树的查找算法。要判断一个键是否在树中，我们先将它和根结点中的键比较。如果它和其中任意一个相等，查找命中；否则我们就根据比较的结果找到指向相应区间的连接，并在其指向的子树中递归地继续查找。如果这个是空链接，查找未命中。

2、具体步骤

在2-3树中查找元素【5】，先跟根节点比较，发现【5】小于【8】，在左子树中继续查找.

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211215221805.png" style="zoom:80%;" />·

元素【5】大于元素【1】小于元素【6】，在中子树中继续查找。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211215222755.png" style="zoom:80%;" />	

查找命中。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211215223720.png" style="zoom:80%;" />

##### 7.6.1.3 添加结点

1、思路分析

对于一个空的`2-3`树来说，直接添加节点即可，该节点作为根节点。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211216131109.png" style="zoom:80%;" />	

添加【结点】`37`对于2-3树来说，==添加结点将永远不会添加到空的位置==，对于根结点【`43`】来说由于`37`比`43`要小，==此时新节点将融合到在添加过程中所找到最后一个叶子结点上==，而这个叶子结点就是根结点这个元素，所以就会产生结点的融合，本来根结点是一个`2`结点，通过融合变成了`3`结点。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211216131223.png" style="zoom:80%;" />	

再次给2-3树添加一个新结点【`12`】，由于【结点】`12`比【结点】`37`要小，照理来说【结点】`12`应该添加到【结点】`37`的左边，由于【结点】`37`左边为空，在2-3树添加节点，添加结点将永远不会添加到空的位置，只会和最后找到的叶子结点做融合，==先进行融合，暂时形成所谓的4结点==。但是对于2-3树来说，它不能有`4`结点，它只能最多有`3`个结点，对于四结点需要分解成一颗子树。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211216141828.png" style="zoom:80%;" />	

在上面这颗2-3的基础上再次添加新结点【18】，该结点比根节点是`37`要小，所以要将`18`添加到根结点的左子树中去，18比12大，将18与12这个结点先进行融合，此时结点【12】是个2节点，通过融合变成了`3`结点。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211216142457.png" style="zoom:80%;" />	

再次添加结点【6】，该节点跟根节点进行比较，小于根节点，向根节点的左边进行插入，发现小于节点【12】，跟这个叶子结点做融合，先进行融合，暂时形成所谓的`4`结点。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211216142730.png" style="zoom:80%;" />	

对于2-3树来说，如果叶子结点本身是3结点了，添加一个新的结点变成`4`结点，对于新的4节点，拆解成以上形式以后，这颗子树有新的根结点点，这个子树根结点要和上面的根节点做融合，节点【12】和【37】可以直接融合成一个`3`节点。

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211216144707.png)

再次添加新结点【11】，该节点跟根节点进行比较，小于根节点，向根节点的左边进行插入，发现大于节点【`6`】和6这个叶子结点做融合，形成一个`3`结点。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211216152808.png" style="zoom:80%;" />

再次添加新节点【5】，该节点跟根节点进行比较小于根节点，向根节点的左边进行插入，发现小于6这个节点，和6这个叶子结点做融合，暂时生成一个4结点。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211216153121.png" style="zoom:80%;" />

然后继续拆解成以下节点形式，然后将子节点的根节点融合到父节点的根节点中去，此时根节点是4结点，最终拆解成三个二节点。

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211216154537.png)

2、插入结点总结

2-3树添加元素，不会像二分搜索树一样添加到一个空的节点的位置，==一定是添加到最后搜索到的叶子节点和该元素进行融合==。

插入2-结点

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211216155251.png" style="zoom:80%;" />	

插入3-结点

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211216162426.png" style="zoom:80%;" />

插入3-结点，父亲节点为2-结点

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211216163414.png)

插入3-结点，父亲节点为3-结点

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211216171501.png)

#### 7.6.2 2-3-4 树

### 7.7 红黑树

#### 7.7.1 基本介绍

1、红黑树的引出

`2-3`树能保证在插入元素之后，树依然保持平衡状态，它的最坏情况下所有子结点都是【2-结点】，树的高度为`lgN`，相比于我们普通的二叉查找树，最坏情况下树的高度为`N`，确实保证了最坏情况下的时间复杂度，但是【2-3树】实现起来过于复杂，从而引出一种【2-3树】思想的简单实现：==红黑树==。

2、基本概念

红黑树和【2-3树】之间是一个等价的关系，红黑树主要是对【2-3树】进行编码，==红黑树背后的基本思想是用标准的二叉查找树(完全由【2-结点】构成)和一些额外的信息(替换【3-结点】)来表示【2-3树】==。因此我们将树中的链接分为两种类型：

**红链接**：将两个【2-结点】连接起来构成一个【3-结点】。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211216184504.png" style="zoom:80%;" />	

**黑链接**：则是【2-3树】中的普通链接。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211216173845.png" style="zoom:80%;" />	

#### 7.7.2 红黑树特点

1、红黑树是含有红黑链接并满足下列条件的二叉查找树

- 每个结点或者是==红色的==，或者是==黑色的==，==根结点是黑色的==。
- 每一个叶子结点(最后的空结点)是黑色的，如果一个结点是红色的，那么他的孩子结点都是黑色的。
- 从任意一个结点到叶子结点，经过的黑色结点是一样的。

2、红黑树与2-3树的对应关系

红黑树

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211216201048.png)

把红色链接水平绘制

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211216201938.png)

#### 7.7.3 思路分析

1、添加结点

红黑树添加节点永远都是<font color = red>**红色结点**</font>。整个红黑树为空的时候，直接添加即可，添加结点元素【43】，此时红黑树的根节点为43。

==对于红黑树来说，根节点必须是黑色的==，然后让根节点变成黑色的。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211217101639.png" style="zoom:80%;" />	

继续插入结点元素【37】这个元素，跟根结点进行比较，发现比根结点小，插入根节点的左边。这样刚好对应了【2-3】树中的3节点。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211217102156.png" style="zoom:80%;" />	

当新添加的元素在红黑树的右侧时，假设根节点元素【37】，新添加的结点元素【43】，根据二分搜索树树的添加原则，新插入的元素跟根结点比较，发现比根结点大，则插入其右边。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211217102928.png" style="zoom:80%;" />	

这样子不满足红黑树的基本性质，==在红黑树中，所有的红色结点要向左倾斜==。此时需要进行向左旋转。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211217103215.png" style="zoom: 80%;" />	

2、结点左旋转

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211217103956.png" style="zoom:80%;" />	

先让`node`结点的右孩子等于`X`结点的左子树，也就是说让`node`右孩子跟`X`结点断开，然后让`X`的左子树变成`node`的右子树。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211217104431.png" style="zoom:80%;" />	

然后让`X`的左子树连接上`node`结点

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211217105022.png" style="zoom:80%;" />

由于是红黑树，还需对元素结点进行维护，此时`X`的颜色应该等于`node`的颜色。这是因为在左旋转之前的时候，`node`是根节点现在`X`变成了根节点，所以根节点的颜色要保持一致，原来`node`是什么颜色，此时`X`就是什么颜色。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211217105344.png" style="zoom:80%;" />

然后将`node`节点标记成红色，根据红黑树的性质，为了表示37和42它是【2-3】树中的3结点，此时37这个3结点要标记成红色。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211217114655.png" style="zoom: 67%;" />	

### 7.8 堆树

#### 7.8.1 基本概念

二叉堆是一颗完全二叉树(区别于满二叉树)，堆中某个结点的值总是不大于其父节点的值，通常这种堆称为最大堆(相应的可以定义最小堆)，下层的某一元素不一定小于上层的某一元素。

1、大顶堆(最大堆)

最大堆的任何一个父节点的值，都大于或等于它左、右孩子节点的值。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211218093140.png" style="zoom:80%;" />

2、小顶堆(最小堆)

最小堆的任何一个父节点的值，都小于或等于它左、右孩子节点的值。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211218093433.png" style="zoom:80%;" />

二叉堆的根节点叫作堆顶

最大堆和最小堆的特点决定了：==最大堆的堆顶是整个堆中的最大元素，最小堆的堆顶是整个堆中的最小元素==。

#### 7.8.2 存储原理

完全二叉树比较适合用数组来存储。用数组来存储完全二叉树是非常节省存储空间的。因为我们不需要存储左右子节点的指针，单纯地通过数组的下标，就可以找到一个节点的左右孩子节点和父节点。

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211219111442.png)

从图中我们可以看到，数组中下标为 i 的节点的左子节点，就是下标为` left child(i) = i∗2 +1 `的节点，右子节点就是下标为`right child(i) = i∗2 +2`的节点，父节点就是下标为`parent(i) = (i-1) /2`取整的节点。

#### 7.8.3 思路分析

1、添加元素

堆中的元素是使用数组的样式排列的，添加元素相当于是层序遍历的最右边，也就是最下面一层的最右添加元素，从数组的表示角度就是在索引为【10】的位置添加了元素【52】这个值。

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211219120955.png)

这显然不满足堆的性质，==所有要拿添加的元素跟父节点进行比较==，发现元素【52】比【16】大，所以需要交换两个元素的位置。

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211219121326.png)

以【52】为根的二叉树满足了堆的性质，但是这样明显不够的，【52】这个节点比它的父节点【41】还要大，所以两者之间还要进行元素交换。

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211219122401.png)

此时【52】是小于【62】这个元素节点的，满足堆的性质。所以在这个位置上没有破坏堆的性质。

2、删除元素

从堆中取出元素，只拿出最大的元素，堆顶元素，取出堆顶元素。

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211219123121.png)

将堆中的最后元素【16】顶到堆顶去，这样操作完以后，索引为0的元素为【16】，最后一个元素也是16，然后将最后一个元素删除。从元素的个数上成功的减少了一个元素，并且就是堆顶的那个元素。

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211219123419.png)

不过现在堆顶的元素打破了堆的性质，此时应该执行下沉操作，让下沉元素跟它的左右孩子进行比较。选择孩子中最大的那个元素，如果小于最大的那个元素，那么就进行交换。

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211219123800.png)

然后继续比较，继续交换。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211219124037.png" style="zoom:80%;" />

此时下沉节点比15要大，满足堆的基本性质，此时下沉操作已经结束了。

#### 7.8.4 代码实现

1、顺序表：`ArrayList`

```java
package cn.heap.demo01;

import java.util.Iterator;

public class ArrayList<E> implements Iterable<E>{
    // 顺序表的元素
    private E[] data;
    // 顺序表元素的数量
    private int size;

    // 定义常量
    private static final int ELEMENT_NOT_FOUND = -1;
    private static final int DEFAULT_CAPACITY = 6;

    // 元素的数量
    public int size() {
        return size;
    }

    //清除所有元素
    public void clear() {
        for (int i = 0; i < size; i++) {
            data[i] = null;
        }
        size = 0;
    }


    // 构造函数，传入数组的容量capacity构造SqList
    public ArrayList(int capacity){
        data = (E[]) new Object[capacity];
        capacity = (capacity < DEFAULT_CAPACITY) ? DEFAULT_CAPACITY : capacity;
    }

    // 无参数的构造函数，默认数组的容量capacity=10
    public ArrayList(){
        this(DEFAULT_CAPACITY);
    }

    // 获取数组的容量
    public int getCapacity(){
        return data.length;
    }

    // 获取数组中的元素个数
    public int getSize(){
        return size;
    }

    // 返回数组是否为空
    public boolean isEmpty(){
        return size == 0;
    }

    // 向所有元素后添加一个新元素
    public void addLast(E e){
        add(size, e);
    }

    // 在所有元素前添加一个新元素
    public void addFirst(E e){
        add(0, e);
    }

    // 在index索引的位置插入一个新元素e
    public void add(int index, E e){
        // 扩容操作
        if(size == data.length){
           resize(2 * data.length);
        }

        for(int i = size - 1; i >= index ; i --){
            data[i + 1] = data[i];
        }

        data[index] = e;
        size ++;
    }

    // 获取index索引位置的元素
    public E get(int index){
        rangeCheck(index);
        return data[index];
    }

    // 查看元素的索引
    public int indexOf(E e){
        if (e == null) {
            for (int i = 0; i < size; i++) {
                if (data[i] == null) return i;
            }
        } else {
            for (int i = 0; i < size; i++) {
                if (e.equals(data[i])) return i;
            }
        }
        return ELEMENT_NOT_FOUND;
    }

    // 修改index索引位置的元素为e
    public void set(int index, E e){
        rangeCheck(index);
        data[index] = e;
    }

    // 查找数组中是否有元素e
    public boolean contains(E e){
       return indexOf(e) != ELEMENT_NOT_FOUND;
    }

    // 查找数组中元素e所在的索引，如果不存在元素e，则返回-1
    public int find(E e){
        for(int i = 0 ; i < size ; i ++){
            if(data[i].equals(e))
                return i;
        }
        return -1;
    }

    // 从数组中删除index位置的元素, 返回删除的元素
    public E remove(int index){
        rangeCheck(index);
        E ret = data[index];
        for(int i = index + 1 ; i < size ; i ++){
            data[i - 1] = data[i];
        }
        // 置空
        data[--size] = null;

        // 缩容操作
        if(size == data.length / 4){
            resize(data.length / 2);
        }
        return ret;
    }

    // 从数组中删除第一个元素, 返回删除的元素
    public E removeFirst(){
        return remove(0);
    }

    // 从数组中删除最后一个元素, 返回删除的元素
    public E removeLast(){
        return remove(size - 1);
    }

    // 从数组中删除元素e
    public void removeElement(E e){
        int index = find(e);
        if(index != -1) {
            remove(index);
        }
    }

    // 数组索引越界处理
    private void outOfBounds(int index){
        throw new IndexOutOfBoundsException("index:" + index + ", Size:" + size);
    }

    // 索引值检查范围方法
    private void rangeCheck(int index){
        if(index < 0 || index >=size){
            // 调用越界处理方法
            outOfBounds(index);
        }
    }

    // 添加方法索引检查范围
    private void rangeCheckAdd(int index){
        if(index < 0 || index >size){
            // 调用越界处理方法
            outOfBounds(index);
        }
    }

    // 扩容capacity方法
    private void resize(int newCapacity){
        E[] newData = (E[])new Object[newCapacity];
        for(int i = 0 ; i < size ; i ++){
            newData[i] = data[i];
        }
        data = newData;
    }

    @Override
    public String toString(){
        StringBuilder res = new StringBuilder();
        res.append(String.format("顺序表(ArrayList)长度:%d, 容器:%d\n", size, data.length));
        res.append('[');
        for(int i = 0 ; i < size ; i ++){
            res.append(data[i]);
            if(i != size - 1)
                res.append(", ");
        }
        res.append(']');
        return res.toString();
    }

    // 交换方法
    public void swap(int i, int j){
        E temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }

    // 遍历方法
    @Override
    public Iterator<E> iterator() {
        return new SIterator();
    }

    private class SIterator implements Iterator{
        // 定义一个指针变量
        private int cur;
        public SIterator(){
            this.cur=0;
        }
        @Override
        public boolean hasNext() {
            return cur< size;
        }
        @Override
        public E next() {
            return data[cur++];
        }
    }
}
```

2、最大堆：`MaxHeap`

```java
package cn.heap.demo01;

import java.util.Iterator;

/***
 * 最大堆实现
 * @param <E>
 */
public class MaxHeap<E extends Comparable<E>> implements Iterable<E>{
    // 用ArrayList当做最大堆的存储容器
    private ArrayList<E> data;
    // 堆空间
    public MaxHeap(){
        data = new ArrayList<>();
    }

    // 获取父节点的索引
    private int parent(int k){
        if(k <= 0){
            throw new IllegalArgumentException("没有父节点!");
        }
        return (k -1 ) / 2;
    }

    // 获取左孩子结点的索引
    private int leftChild(int k){
        return 2 * k + 1;
    }

    // 获取右孩子结点的索引
    private int rightChild(int k){
        return 2 * k + 2;
    }

    // 返回最大堆有效元素的个数
    public int size(){
        return data.size();
    }

    // 判断二叉堆是否为空
    public boolean isEmpty(){
        return data.isEmpty();
    }

    // 清空二叉堆
    public void clear(){
        data.clear();
    }

    // 向最大堆中添加一个元素e
    public void add(E e){
        data.addLast(e);
        // 上浮元素对应的索引
        siftUp(data.size() -1);
    }

    // 将角标K所对应的元素进行上浮
    private void siftUp(int k){
        // 父亲节点比自己还要小的话，交换元素
        while (k > 0 && data.get(k).compareTo(data.get(parent(k))) < 0){
            data.swap(k, parent(k));
            k = parent(k);
        }
    }

    // 找到最大堆
    public E findMax(){
        if (data.isEmpty()){
            throw new IllegalArgumentException("最大堆为空!!!!");
        }
        return data.get(0);
    }

    // 最小堆
    public E findMin(){
        if(data.isEmpty()){
            throw new IllegalArgumentException("最大堆为空!!!");
        }
        E min = data.get(0);
        for (int i=1; i< data.size(); i++){
            if(data.get(i).compareTo(min) < 0){
                min = data.get(i);
            }
        }
        // 返回最小堆
        return min;
    }

    // 删除最大值
    public E extractMax(){
        // 拿到最大值
        E max = findMax();
        // 将索引为0和最后一个元素交换位置
        data.swap(0, data.size() - 1);
        // 将最后一个元素删除
        data.remove(data.size() - 1);

        // 调用函数
        siftDown(0);
        return max;
    }

    // 下浮
    private void siftDown(int k) {
        while (leftChild(k) < data.size()){
            // 拿到左右孩子的最大值
            int j = leftChild(k);
            if(j + 1 < data.size() && data.get(j+1).compareTo(data.get(j)) > 0){
                // data[j] 是leftChild和rightChild中的最大值
                j = rightChild(k);
            }
            if(data.get(k).compareTo(data.get(j)) < 0){
                data.swap(k,j);
                k = j;
            }else {
                break;
            }
        }
    }

    // 取出最大元素后，放入一个新元素
    public E replace(E e){
        E ret = findMax();
        data.set(0, e);
        siftDown(0);
        return ret;
    }

    @Override
    public Iterator<E> iterator() {
        return data.iterator();
    }

    @Override
    public String toString(){
        return data.toString();
    }
}
```

3、测试类：`TestMaxHeap `

```java
package cn.heap.demo01;

import java.util.Random;

public class TestMaxHeap {
    public static void main(String[] args) {
        MaxHeap<Integer> heap = new MaxHeap<>();
        Random random = new Random();
        // 遍历添加
        for (int i=0; i<10; i++){
            heap.add(random.nextInt(20));
        }

        System.out.println(heap);

        for (int i=0; i<4; i++){
            System.out.println(heap.extractMax());
        }
    }
}
```

4、执行结果

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211219190052.png" style="zoom:80%;" />	

#### 7.8.5 优先队列

1、基本介绍

普通队列：先进先出，后进后出。

优先队列：出队顺序和入队顺序无关，和优先级相关，本质还是队列。

应用：任务管理器中:动态选择优先级最高的任务执行，游戏中:塔防优先攻击(距离,威胁，先后)。

2、案例实现

接口：`Queue`

```java
package cn.heap.demo02;

public interface Queue<E> extends Iterable<E>{
    int size();
    boolean isEmpty();
    // 入队操作
    void enqueue(E element);
    // 出队操作
    E dequeue();
    // 查看当前队首的元素
    E getFront();
    // 清空队列
    void clear();
}
```

优先队列：`PriorityQueue`

```java
package cn.heap.demo02;

import java.util.Iterator;

public class PriorityQueue<E extends Comparable<E>> implements Queue<E>{
    // 堆对象
    private MaxHeap<E> heap;
    // 构造器
    public PriorityQueue(){
        heap = new MaxHeap<>();
    }

    @Override
    public int size() {
        return heap.size();
    }

    @Override
    public boolean isEmpty() {
        return heap.isEmpty();
    }

    @Override
    public void enqueue(E element) {
        // 入队操作
        heap.add(element);
    }

    @Override
    public E dequeue() {
        return heap.extractMax();
    }

    @Override
    public E getFront() {
        return heap.findMax();
    }

    @Override
    public void clear() {
        heap.clear();
    }

    @Override
    public Iterator<E> iterator() {
        return heap.iterator();
    }

    @Override
    public String toString() {
        return heap.toString();
    }
}
```

测试类：`TestPriorityQueue`

```java
package cn.heap.demo02;

import java.util.Random;

public class TestPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        Random random = new Random();
        // 遍历添加
        for (int i=0; i<10; i++){
            queue.enqueue(random.nextInt(20));
        }

        System.out.println(queue);

        for (int i=0; i<4; i++){
            System.out.println(queue.dequeue());
        }
    }
}
```

执行结果

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211219191146.png" style="zoom:80%;" />	

## 第8章 查找

### 8.1 线性查找

#### 8.1.1 基本介绍

顺序查找`( Sequential Search)`又叫线性查找，是最基本的查找技术，它的查找过程是:从表中第一个( 或最后一个 )记录开始，逐个进行记录的关键字和给定值比较，若某个记录的关键字和给定值相等，则查找成功，找到所查的记录;如果直到最后一个(或第 一个)记录，其关键字和给定值比较都不等时， 则表中没有所查的记录，查找不成功。顺序查找适合于存储结构为==顺序存储==或==链接存储==的线性表。顺序查找的时间复杂度为0(n)

#### 8.1.2 代码示例

创建一个数组arr有序数组`{1,16,2,35,47,59,62,73,88,99}`，查找`key=47`是否存在。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211203162656.png" style="zoom:80%;" />	

传统方式

```java
package cn.sequential.demo01;
// 顺序查找
public class SequentialDemo01 {
    public static void main(String[] args) {
        // 创建数组
        int[] arr = {1,16,2,35,47,59,62,73,88,99};
        // 查找key
        int key = 47;
        // 索引值
        int index = sequentialSearch(arr, key);
        if(index == -1){
            System.out.println("没有找到该元素！！！");
        }else {
            System.out.println("该元素的索引:" + index);
        }

    }

    // 调用查找方法
    private static int sequentialSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }
}
```

执行结果

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211203163024.png" style="zoom:80%;" />	

#### 8.1.3 查找优化

1、思路分析

上面代码并非足够完美，因为==每次循环时都需要对是否越界==，即是否小于等于`len`作判断，事实上，还可以有更好一点的办法， ==设置一个哨兵==， 可以解决不需要每次让`i`与`len`作比较。代码是从尾部开始查找，由于`arr[0]=key`, 也就是说，如果在`arr[i]`中有`key`则返回`i`值，查找成功。否则一定在最终的`arr[0]`处等于`key`, 此时返回的是`0`，即说明`arr[1]~arr[len]`中没有关键字`key`, 查找失败。

2、代码实现

```java
package cn.sequential.demo01;
// 哨兵方式
public class SequentialDemo02 {
    public static void main(String[] args) {
        // 创建数组
        int[] array = {16,2,35,47,59,62,73,88,99};
        // 要查找的元素
        int key = 59;
        // 新数组
        int[] newArray = new int[array.length+1];
        newArray[0] = key;
        for (int i = 0; i < array.length; i++) {
            newArray[i+1] = array[i];
        }
        // 创建查找方法
        int index = sequentialSearch(newArray, key)-1;
        // 条件判断
        if(index != -1){
            System.out.println("查找的元素的索引是:" + index);
        }else {
            System.out.println("要查找的元素不存在！！");
        }
    }

    private static int sequentialSearch(int[] arr, int key) {
        // 数组长度
        int len = arr.length -1;
        // 哨兵
        arr[0] = key;
        // 从数组尾部开始遍历
        while (arr[len] != key){
            len--;
        }
        return len;
    }
}
```

3、执行结果

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211203170426.png" style="zoom:80%;" />	

### 8.2 二分查找

#### 8.2.1 基本介绍

二分查找也称为==折半查找==，属于==有序查找==算法。用给定值k先与中间结点的关键字比较，中间结点把线形表分成两个子表，若相等则查找成功;若不相等，再根据k与该中间结点关键字的比较结果确定下一步查找哪个子表，这样递归进行，直到查找到或查找结束发现表中没有这样的结点。元素必须是有序的，如果是无序的则要先进行排序操作，时间复杂度为`0(log2n)`。

折半查找的前提条件是需要有序表顺序存储，对于静态查找表，一次排序后不再变化，折半查找能得到不错的效率。但对于需要频繁执行插入或删除操作的数据集来说，维护有序的排序会带来不小的工作量，那就不建议使用。

#### 8.2.2 思路分析

创建一个数组`array`有序数组`{1,2,3,4,5,6,7,8}`，查找`key=5`是否存在,先定义三个指针变量`low`,`high`,`mid`。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211203185435.png" style="zoom:80%;" />	

跟`mid`中间值比较，左边值比`mid`都小，重新确定`mid`值。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211203185950.png" style="zoom:80%;" />	

`mid`值右边的都比5大，无需比较了。移动`high`指针，当`low,high`指针指向同一元素时，证明寻找成功！！！

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211203190444.png" style="zoom:80%;" />	

当`low`指针在`high`指针的右边时，这说明寻找失败！！！

#### 8.2.3 代码示例

```java
package cn.binarysearch.demo01;

public class BinarySearchDemo01 {
    public static void main(String[] args) {
        // 创建数组
        int[] array = {1,2,3,4,5,6,7,8};
        // 查找的key值
        int key = 5;
		
        // 迭代法
        int index1 = binarySearch1(array, key);
        System.out.println("该元素的索引:" + index1);

		// 递归法
        int index2 = binarySearch2(array, key, 0, array.length-1);
        System.out.println("该元素的索引:" + index2);
    }


    // 迭代法实现
    private static int binarySearch1(int[] array, int key) {
        // 定义low值
        int low = 0;
        // 定义high值
        int high = array.length - 1;
        // 定义mid值
        int mid = (low + high) / 2;
        // 循环遍历
        while (array[mid] != key){
            if(array[mid] > key){
                high = mid - 1;
            }else if(array[mid] < key){
                low = mid + 1;
            }
            // 查找失败
            if(low > high){
                return -1;
            }
            // 重新更新mid值
            mid = (low + high) / 2;
        }

        return mid;
    }

    // 递归方法实现
    private static int binarySearch2(int[] array, int key, int low, int high) {
        if(low > high){
            return -1;
        }
        // 中间值
        int mid = (low + high) / 2;
        if(array[mid] == key){
            return mid;
        }

        if(key < array[mid]){
            return binarySearch2(array, key, low, mid-1);
        }else {
            return binarySearch2(array, key, mid + 1, high);
        }
    }
}
```

执行结果

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211203201504.png" style="zoom:80%;" />	

### 8.3 插值查找

#### 8.3.1 基本介绍

1、插值查找的引出

在介绍插值查找之前，首先考虑一个新问题，为什么上述算法一定要是折半，而不是折四分之一或者折更多呢?打个比方，在英文字典里面查`apple`,你下意识翻开字典是翻前面的书页还是后面的书页呢?如果再让你查`zoo`,你又怎么查?很显然，这里你绝对不会是从中间开始查起，而是有一定目的的往前或往后翻。同样的，比如要在取值范围`1 ~ 10000`之间`100`个元素从小到大均匀分布的数组中查找`5`，自然会考虑从数组下标较小的开始查找。

折半查找这种查找方式，不是自适应的，二分查找中查找点计算如下:` mid=(low+ high)/2`，即`mid=low+1/2+(high-low);`。

2、插值查找实现

通过类比，可以将查找的点改进为如下: <font color = red>**mid = low + (key- a[low]) / (a[high]-a[low]) * (high-low)**</font>，==对于表长较大，而关键字分布又比较均匀的查找表来说，插值查找算法的平均性能比折半查找要好的多。反之，数组中如果分布非常不均匀，那么插值查找未必是很合适的选择==。

#### 8.3.2 思路分析

创建一个数组`array`有序数组`{1,5,12,21,30,32,55,68,80,89,90,99}`，查找`key=30`是否存在,先定义三个指针变量`low`,`high`,`mid`。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211203220016.png" style="zoom:80%;" />	

当前`mid`值比`30`小，则区间`[1, 21]`直接不考虑，直接移动`low`指针`(mid+1)`重新获取新区间，重新计算`mid`值大小。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211204084952.png" style="zoom:80%;" />

#### 8.3.3 代码示例

1、插值查找实现

```java
package cn.InterpolationSearch.demo01;
// 插值查找
public class InterpolationSearchDemo01 {
    public static void main(String[] args) {
        // 创建数组
        int[] arr = {1, 5, 12, 21, 30, 32, 55, 68, 80, 89, 90, 99};
        // 查找值
        int key = 30;
        // 创建插入查找方法
        int index = interpolationSearch(arr, key, 0, arr.length-1);
        // 索引值
        if(index == -1){
            System.out.println("没有找到该元素！！！");
        }else {
            System.out.println("该元素的索引:" + index);
        }
    }
    //插入查找方法
    private static int interpolationSearch(int[] arr, int key, int low, int high) {
        // 条件判断,查找失败
        if(low > high){
            return -1;
        }
        // 计算中间值
        int mid = low + (int)(1.0 *(key -arr[low]) / (arr[high] - arr[low]) * (high - low));
        if(mid < low || mid > high){
            return -1;
        }

        // 当中间值等于要查找的key时，寻找成功
        if(arr[mid] == key){
            return mid;
        }else if(arr[mid] > key){
            return interpolationSearch(arr, key, low, mid-1);
        }else {
            return interpolationSearch(arr, key, mid + 1, high);
        }
    }
}
```

2、执行结果

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211204103902.png" style="zoom:80%;" />	

### 8.4 斐波那契查找

#### 8.4.1 基本介绍

斐波那契搜索就是在二分查找的基础上根据斐波那契数列进行分割的，是区间中单峰函数的搜索技术。黄金比例又称黄金分割，是指事物各部分间一定的数学比例关系，即将整体一分为二，较大部分与较小部分之比等于整体与较大部分之比，其比值约为`1:0.618`或`1.618:1`，随着斐波那契数列的递增，前后两个数的比值会越来越接近`0.618`，利用这个特性，可以将黄金比例运用到查找技术中。

#### 8.4.2 思路分析

创建一个数组`array`有序数组`{5,12,21,32,35,40,44,50,51,52}`，查找`key=32`是否存在。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211204105828.png" style="zoom:80%;" />	

该数组元素不存在斐波那契数列中。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211204110509.png" style="zoom:80%;" />	

定义一个`k`值，找到一个合适的斐波那契值，用来表示数组的长度，给数组补上三个元素

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211204130046.png" style="zoom:80%;" />

定义`low`指针和`high`指针，找到黄金分割点【`F(K-1)-1`】，黄金分割点是`mid`指针。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211204131322.png" style="zoom:80%;" />寻找`key = 32`，元素32是在`mid`的左边 ，然后将`high`移动到`mid`的左边。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211204131622.png" style="zoom:80%;" />

将`k`值往前移动，拿到新的黄金分割点。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211204134652.png" style="zoom: 67%;" />	

继续比较，继续将`high`指针移动到`mid`指针的左边.拿到新的黄金分割点。

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211204135010.png" style="zoom:80%;" />

左边值比`32`小,移动`low`指针`(mid + 1)`，最终找到该元素【F(K-2)-1】。

![](https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211204135513.png)

#### 8.4.3 代码示例

1、代码实现

```java
package cn.fibonaccisearch.demo01;

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
```

2、执行结果

<img src="https://guardwhy.oss-cn-beijing.aliyuncs.com/img/javaSE/se4/20211204160640.png" style="zoom:80%;" />	

  
