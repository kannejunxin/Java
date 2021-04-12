import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Moment_Sky
 * Date: 2021-04-09
 * Time: 18:55
 *
 * 方法 其实就是把一个重复的东西进行封装，把它封装成一个功能
 *  例如：游戏里英雄的技能
 *  又如 天冷了，妈妈喊你和弟弟妹妹穿秋裤
 */
public class TestDemo {
    //作业五： 求最大值
    public static int max3(int a,int b,int c) {
        return (max2(a,b)>c)?max2(a,b):c;
    }
    public static int max2(int a,int b) {
        return (a>b)?a:b;
    }
    public static void mainmain_h5(String[] args) {
        int a, b ,c;
        Scanner scan=new Scanner(System.in);
        a=scan.nextInt();
        b=scan.nextInt();
        c=scan.nextInt();
        System.out.println(max2(a, b));
        System.out.println(max3(a, b, c));
    }
    //作业四： 求 N 的阶乘 。
    public static int fac(int n) {
        int i=1;
        int x=1;
        for(i=1;i<=n;i++) {
            x = i * x;
        }
        return x;
    }
    public static void main_h4(String[] args) {
        int a;
        Scanner scan=new Scanner(System.in);
        a=scan.nextInt();
        System.out.println(fac(a));
    }
    //作业三：1！+2！+3！+4！+........+n!的和
    public static int facSum(int n) {
        int i=1;
        int sum=0;
        int x=1;
        for(i=1;i<=n;i++) {
            x=i*x;
            sum+=x;
        }
        return sum;
    }
    public static void main_h3(String[] args) {
        int a;
        Scanner scan=new Scanner(System.in);
        a=scan.nextInt();
        System.out.println(facSum(a));
    }
    //作业二：求斐波那契数列的第n项。(迭代实现)
    public static int fib(int n) {
        int a1=1;
        int a2=1;
        int x=1;
        int i;
        for(i=3;i<=n;i++) {
            x=a1+a2;
            a1=a2;
            a2=x;
        }
        return x;
    }
    public static void main_h2(String[] args) {
        int a;
        Scanner scan=new Scanner(System.in);
        a=scan.nextInt();
        System.out.println("斐波那契数列的第"+a+"项为：(n从1开始)");
        System.out.println(fib(a));
    }
    //作业一：有一组数据，只有一个数字是出现一次，其他是两次，请找出这个数字。
    public static int searchOne (int[] arr) {
        int i,sum=0;
        for(i=0;i<arr.length;i++) {
            sum^=arr[i];
        }
        return sum;
    }
    public static void main_h1(String[] args) {
        int[] arr={3,2,4,3,2};
        System.out.println(searchOne(arr));
    }


    public static int facSum1(int n) {
//        int sum=0;
//        for(int i=1;i<=n;i++) {
//            int tmp=1;
//            for(int j=1;j<=i;j++) {
//                tmp*=j;
//            }
//            sum+=tmp;
//        }
        //改进
        int sum=0;
        for(int i=1;i<=n;i++) {
            sum += fac(i);//这样更加模块化的组织代码
        }
        return sum;
    }
    public static void main(String[] args) {
        int ret=facSum1(5);
        System.out.println(ret);
    }


    //Java没有&，在Java中栈上的地址拿不到，堆上地址可以拿到用引用，不过还是哈希加密后的
    //Java实现传址的方法用传引用 因为Java中引用类型本质是地址
    //函数栈帧随函数调用而创建，随调用结束而销毁
    //形参的改变不一定影响实参的改变
    public static  void func(int a) {
        a=200;
        System.out.println("a等于：" + a);//200
    }
    public static void main3(String[] args) {
        int a=10;
        func(a);
        System.out.println("a等于：" + a);//10
        //理解方法栈帧的创建和销毁
    }
    //写一个方法求1-a的和
    public static void main2(String[] args) {
        int a=10;
        System.out.println(add(a));//调用函数
    }
    public static int add(int n) {
        int sum =0;
        for (int i =1;i<=n;i++) {
            sum=sum+i;
        }
        return sum;
    }


    public static void main1(String[] args) {
        穿秋裤("张三");
        穿秋裤("张四");
        String ret = 穿秋裤2("张四");
        System.out.println(ret);
    }
    public  static void 穿秋裤 (String name) {
        System.out.println(name + "穿秋裤!");
    }
    public  static String 穿秋裤2 (String name) {
        System.out.println(name + "穿秋裤!");
        return "我知道了!";
    }
    //可以中文 因为Java是Unicode编码 支持中文

//    public  static 返回值 函数名 (参数列表) {
//        方法的内容
//    }

}
