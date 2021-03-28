
public class TextDemo {
    public static void main1(String[] args) {
        System.out.println("hello");
        int a=10;
        System.out.println(a);
        int b=20;
        System.out.println(b);
        //字符串拼接任何变量，都会变成字符串  此时+为拼接
        System.out.println("a:"+a+" b:"+b);
        System.out.println("a:"+a+b);
        //如果前面不是首先出现字符串，那么先要运算
        System.out.println(a+b+"haha!");

    }

    public static void main2(String[] args) {
        int a = Integer.MAX_VALUE;//鼠标放在MAX_VALUE 然后按住ctrl+点击可以看到Integer类
        System.out.println(a);
        int b = Integer.MIN_VALUE;
        System.out.println(b);
        System.out.println(a+1);
    }
//Integer 和 Long 是包装类
    public static void main(String[] args) {
        long a = Long.MAX_VALUE;
        System.out.println(a);
        long b = 10L;//不加L，会改成int
        System.out.println(b);
    }
}
