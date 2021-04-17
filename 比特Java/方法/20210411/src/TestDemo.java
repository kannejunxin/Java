import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Moment_Sky
 * Date: 2021-04-11
 * Time: 9:28
 */
public class TestDemo {
    //作业七：递归求 N 的阶乘
    public static int fac(int n) {
        if(n>1) {
            return fac(n-1)*n;
        } else {
            return 1;
        }
    }
    public static void main_h7(String[] args) {
        int n;
        Scanner scan=new Scanner(System.in);
        n=scan.nextInt();
        int ret = fac(n);
        System.out.println(ret);
    }
    //作业六：递归求 1 + 2 + 3 + ... + 10
    public static int Sum(int n) {
        if(n>1) {
            return n+Sum(n-1);
        } else{
            return 1;
        }
    }
    public static void main_h6(String[] args) {
        int n;
        Scanner scan=new Scanner(System.in);
        n=scan.nextInt();
        int ret = Sum(n);
        System.out.println(ret);
    }
    //作业五：按顺序打印一个数字的每一位(例如 1234 打印出 1 2 3 4) （递归）
    public static void pfac(int x) {
        if(x<=9) {
            System.out.print(x+" ");
        }else {
            pfac(x/10);
            System.out.print(x%10+" ");
        }
    }
    public static void main_h5(String[] args) {
        int n;
        Scanner scan=new Scanner(System.in);
        n=scan.nextInt();
        pfac(n);
    }
    //作业四：写一个递归方法，输入一个非负整数，返回组成它的数字之和
    public static int Sumfac(int x) {
        if(x<=9) {
            return x;
        }else {
            return x%10+Sumfac(x/10);
        }
    }
    public static void main_h4(String[] args) {
        int n;
        Scanner scan=new Scanner(System.in);
        n=scan.nextInt();
        int ret=Sumfac(n);
        System.out.println(ret);
    }
    //作业三：递归求斐波那契数列的第 N 项
    public static int nfib(int n) {
        if(n==1) {
            return 1;
        }else if (n==2) {
            return 1;
        }else {
          return nfib(n-1)+nfib(n-2);
        }
    }
    public static void main_h3(String[] args) {
        int n;
        Scanner scan=new Scanner(System.in);
        n=scan.nextInt();
        int ret = nfib(n);
        System.out.println("斐波那契数列的第" + n + "项值为：" + ret);
    }
    private static int count;
    //作业二：递归求解汉诺塔问题
    public static void move(char x, char y) {
        System.out.println(x + "=====>" + y);
        count++;
    }
    public static void hanoi(int n,char A,char B, char C) {
        if(n==1) {
            move(A,C);
        }
        else{
            hanoi(n-1,A,C,B);
            move(A,C);
            hanoi(n-1,B,A,C);
        }
    }
    public static void main_h2(String[] args) {
        int n;
        Scanner scan=new Scanner(System.in);
        n=scan.nextInt();
        hanoi(n,'A','B','C');
        System.out.println("移动次数："+count);
    }
    //作业一：青蛙跳台阶问题
    public static int fibx(int x) {
        if(x==1) {
            return 1;
        } else if (x==2) {
            return 2;
        } else {
            return fibx(x-1)+fibx(x-2);
        }
    }
    public static void main_h1(String[] args) {
        int i=0;
        Scanner scan=new Scanner(System.in);
        i=scan.nextInt();
        int ret=fibx(i);
        System.out.println(ret);
    }

    //斐波那契数
    public static int fib(int n) {
        if(n==1||n==2) {
            return 1;
        }
        return fib(n-1)+fib(n-2);
    }
    //栈溢出一般是：1.参数太大 2.终止条件错误
    //求和
    public static int add(int n) {
        if(n==1) {
            return 1;
        }
        return n+add(n-1);
    }

    public static void main6(String[] args) {
        System.out.println(add(10));
    }
    //打印每一位
    public static void print(int n) {
        if(n<=9) {
            System.out.println(n % 10);
            return ;
        }
        print(n/10);
        System.out.println(n % 10);
    }

    public static void main5(String[] args) {
        print(123);
    }
    //递归的优点：代码量少，缺点：可读性差，运行占用空间大
    //递归的例子：求阶乘
    //递归
    public static int fac2(int n) {
        if(n==1) {
            return 1;
        }
        return n*fac(n-1);
    }

    public static void main4(String[] args) {
        System.out.println(fac2(5));
    }
    //方法自己调用自己
    //要有终止条件 没有终止条件会爆栈
    //终止条件对不对取决于你的递推公式
    public static void func() {
        func();
    }
    public static void main3(String[] args) {
        func();
    }
    //可变参数编程 👇，这样就可以方便你拓展到任意个相同类型的参数
    public static int sum(int... array) {
        int ret=0;
        for(int x:array) {//foreach循环
            ret+=x;
        }
        return ret;
    }
    public static int sum(int a,int b,int c) {
        return a+b+c;
    }
    public static void main2(String[] args) {
        int ret=sum(1,2,3,5,6,7,8,9);
        System.out.println(ret);
    }
    //方法的重载
    //重载需要满足三个条件 1.方法名相同 2.方法的参数列表不同（类型、个数） 3.方法的返回值不做要求（返回值一样或不一样不影响重载）
    //为什么可以这样？
    //因为这两个方法是不同的，和判断变量不同，判断方法是否相同，看返回值，方法名和参数，统称方法的签名，下面两个sum的签名是不同的
    public static int sum(int a,int b) {
        return a+b;
    }
    public static double sum(double a,double b) {
        return a+b;
    }
    public static void main1(String[] args) {
           int a=10;
           int b=20;
           sum(a,b);
           double c=11.5;
           double d=12.5;
           sum(c,d);
    }
    //实参与形参的关系 以目前知识暂时无法做到，因为我们取不到地址，等学了引用类型就可以啦
    public static void swap(int x,int y) {
        int tmp=x;
        x=y;
        y=tmp;
    }
    public static void main0(String[] args) {
        int a=10;
        int b=20;
        System.out.println("交换前：" + a + " " + b);
        swap(a,b);
        System.out.println("交换前：" + a + " " + b);
        //结果发现没有调换 因为对于基础类型而言，形参只是一份临时拷贝，即传值调用
    }
}
