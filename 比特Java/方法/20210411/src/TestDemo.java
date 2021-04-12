/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Moment_Sky
 * Date: 2021-04-11
 * Time: 9:28
 */
public class TestDemo {

    //斐波那契数
    //栈溢出一般是：1.参数太大 2.终止条件错误
    //求和
    public static int add(int n) {
        if(n==1) {
            return 1;
        }
        return n+add(n-1);
    }

    public static void main(String[] args) {
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
    //递归的优点：代码量少，缺点：可读性差，运行占用空间
    //递归的例子：求阶乘
    //递归
    //方法自己调用自己
    //要有终止条件 没有终止条件会爆栈
    //终止条件对不对取决于你的递推公式
    public static void func() {
        func();
    }
    public static void main3(String[] args) {
        func();
    }
    //可变参数编程
    //方法的重载
    //重载需要满足三个条件 1.方法名相同 2.方法的参数列表不同（类型、个数） 3.方法的返回值不做要求（返回值一样或不一样不影响重载）
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
}
