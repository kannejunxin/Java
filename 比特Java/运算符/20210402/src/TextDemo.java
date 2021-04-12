/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Moment_Sky
 * Date: 2021-04-02
 * Time: 18:47
 */
import com.sun.deploy.security.SelectableSecurityManager;

import java.math.*;
import java.util.Scanner;

public class TextDemo {
    public static void main19(String[] args) {
        byte a=1;
        System.out.println(a+=2);
      //  System.out.println(a=a+2);//err
    }
    public static void main18(String[] args) {
        int a = 0x10;
        System.out.printf("%x\n",a<<1);
    }
    public static void main17(String[] args) {
        int a;
        Scanner scan = new Scanner(System.in);
        a = scan.nextInt();
        if(a>=56) {
            System.out.println("老年");
        }
        else if(a>=29) {
            System.out.println("中年");
        }
        else if(a>=19) {
            System.out.println("青年");
        }
        else {
            System.out.println("少年");
        }
    }
    //给定一个数字，判定一个数字是否是素数
    public static void main16(String[] args) {
        int a;
        Scanner scan = new Scanner(System.in);
        a = scan.nextInt();
        int j;
        int flag = 0;
        for (j = 2; j <= Math.sqrt(a); j++) {
            if (a % j == 0) {
                flag = 1;
                break;
            }
        }
        if(flag==0) {
            System.out.println(a+"是素数");
        }
        else {
            System.out.println(a+"不是素数");
        }
    }
    //打印 1 - 100 之间所有的素数
    public static void main15(String[] args) {
        int i,j;
        for(i=2;i<=100;i++) {
            int flag=0;
            for (j=2;j<=Math.sqrt(i);j++) {
                if (i%j==0) {
                    flag = 1;
                    break;
                }
            }
            if(flag==0) {
                System.out.print(i+" ");
            }
        }
    }
    //输出 1000 - 2000 之间所有的闰年
    public static void main14(String[] args) {
        int i;
        for(i=1000;i<=2000;i++) {
            if((i%400==0)||(i%100!=0 && i%4==0)) {
                System.out.print(i+" ");
            }
        }
    }
    //1到 100 的所有整数中出现多少个数字9
    public static void main13(String[] args) {
        int i,count=0;
        for (i=0;i<100;i++) {
            if(i%10==9) {
                count++;
            }
            if(i/10==9){
                count++;
            }
        }
        System.out.println(count);
    }

    // 单行注释

    /*   块注释   */

    /**
     * 文档注释
     * @param args
     */

    //逻辑结构
    // 顺序结构 没什么好说
    //分支结构
    public static void main12(String[] args) {
        int a=10;
        if(a==10)
            System.out.println("hello");
        System.out.println("aaa");
      //  else//err 因为aaa那句代码将if else判断截断
        System.out.println("haha");
        //代码风格问题
        int x=20;
        int y=10;
        if(x==10)
            if(y==10)
                System.out.println("aaa");
        else
            System.out.println("bbb");
        //悬空else问题
    }
    public static void main11(String[] args) {
        int a=10;
        if(a>10) {
            System.out.println("a>10");
        } else if(a==10) {
            System.out.println("a==10");
        } else {
            System.out.println("a<10");
        }
    }


    public static void main10(String[] args) {
        System.out.println(false == false?(true==true?false:true):true);
    }

    //位运算符
    //&按位与 |按位或 ^按位异或：相同为0相异为1
    //进阶题目：在1 3 2 3 1 4 中找出现过一次的数字
    public static void main9(String[] args) {
        int[] arr={1,3,2,3,1,4};
        int i=0;
        int j=0,count=0,x=0,y=0;
        for(i=0;i<arr.length;i++) {
            j ^= arr[i];//结果为4^2
        }
        while(j!=0) {
            if((j & 1) == 0 ) {
                j=j>>1;
                count++;
            }
            else {
                break;
            }
        }
        for(i=0;i<arr.length;i++) {
            if(((arr[i]>>count)&1)==1) {
                x^=arr[i];
            }
            else {
                y^=arr[i];
            }
        }
        System.out.println(x);
        System.out.println(y);

    }
    //题目：在1 3 2 3 1 中找出现过一次的数字
    //这里要用到异或^的特性
    //1.相同数异或结果为0
    //2.0异或^其他数结果为该数
    public static void main8(String[] args) {
        int[] arr={1,3,2,3,1};
        int j=0;
        for(int i=0;i<arr.length;i++)
        {
            j^=arr[i];
        }
        System.out.println(j);
    }
    //逻辑运算符
    public static void main7(String[] args) {
        System.out.println(10 > 20 && 10 / 0 == 0);
        //不会出异常 因为短路
        System.out.println(10 < 20 || 10 / 0 == 0);
        //不会出异常 因为短路
        int a=10;
        //System.out.println(!a);//err 因为！逻辑非只能作用于布尔表达式
        System.out.println(!true);
        int b=0xf;
        System.out.println(~b);
    }
    //关系运算符
    public static void main6(String[] args) {
        int a=10;
        int b=20;
        System.out.println(a == b);
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a != b);
        System.out.println(a >= b);
        System.out.println(a <= b);
    }
    //++ --
    public static void main5(String[] args) {
        int a=10;
        int b=++a;
        int c=a++;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        a++;//单独写的情况下: 等价于++a
    }
    //复合运算符
    public static void main4(String[] args) {
        int a=10;
        a+=2;
        System.out.println(a);
        short b=6;
        //b=b+2;//err 因为有整型提升 此时b+2是int
        //但是
        b+=2;//会自动帮我们进行一次强转！
        //+= /= %= -=也一样
    }
    //% /
    public static void main3(String[] args) {
        System.out.println(11.5 % 2.0);
        System.out.println(10 / 0);//err 运行会报异常，但是编译可以通过
    }
    public static void main2(String[] args) {
        System.out.println(5 / 2);//2
        System.out.println((float) 5 / 2);//2.5
        System.out.println(5 / (float) 2);//2.5
        System.out.println((float) (5 / 2));//2.0

        System.out.println(10 % 3);//1
        System.out.println(10 % -3);//1
        System.out.println(-10 % 3);//-1
        System.out.println(-10 % -3);//-1
        System.out.println(Math.floorMod(-10, 3));//2  floorMod表面遵循了欧几里得原则，余数大于0，当然
        System.out.println(Math.floorMod(-10, -3));//-1 之所以说表面 这里就是原因了！！ 如果是负除数也会得到负值
    }
    public static void main1(String[] args) {
        short a=128;
        byte b=(byte)a;
        System.out.println(b);
    }

}
