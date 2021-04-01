import java.time.*;
import java.util.Date;

public class TextDemo {
    //int 与 String 的相互转换
    public static void main(String[] args) {
        String str2="10";//当然前提是必须是一个合法的数字字符串
        int b=Integer.valueOf(str2);
        //或
        int c=Integer.parseInt(str2);

        int a=10;
        String str =a+"";
        System.out.println(str);
        //或
        String ret=String.valueOf(a);
        System.out.println(ret);
    }
    //常量
    public static void main6(String[] args) {
        //int a=10;
        //System.out.println(a);
        final int b=20;
       // b=30;//常量只能初始化一次
        final int c;
        c=20;
        //c=30;//err
    }

    // 局部变量的作用域：定义在方法内部的变量  局部变量在使用前一定要初始化
    public static void main4(String[] args) {
        int a=10;//作用域为整个主函数内
        {
        //    int a=90;//err 重复定义了
            a=90;
            //当前这个a只在当前括号里面是有效的
        }
    }

    //String
    public static void main5(String[] args) {
        String str="envi";
        System.out.println(str);
        String str2="I am \"张三\"";
        System.out.println(str2);
        String str3="abc";
        String str4="def";
        System.out.println(str3 + str4);
        //类似C语言char*p="aaaa"
        int a=10;
        int b=20;
        System.out.println(str3 + a + b);
    }
    //boolean 大小没有规定 有说1位，也有1个字节  short boolean类型不能强转到其他类型
    public static void main3(String[] args) {
        short s=21;
        System.out.println(s);
        boolean flag1=true;

        boolean flag2=false;
//    boolean flag3=1;  //err 在Java当中 布尔类型的值只有2个，要么为true 要么为false,无0为假，非0为真
//    boolean flag4=0;
    }


    //byte   对标C语言的char类型 取值范围-128 - 127
    public static void main2(String[] args) {
        byte b1=10;
        byte b2=20;
        //byte b5=128;//err 赋值时候不能给当前类型所表示范围外的数字
       // byte b3=b1+b2;//error 存在整形提升
        byte b4=10+20;
        byte b6=126+1;
       // System.out.println(b3);
        System.out.println(b4);
        System.out.printf("%tc",new Date());
    }


    //char
    public static void main1(String[] args) {
        char ch='a';
        System.out.println(ch);
        char ch2='高';
        System.out.println(ch2);
        char ch3=97;
        System.out.println(ch3);
        //char ch4=-10;//err Java中字符类型没有负数
    }
    //floatd
    public static void main7(String[] args) {
        //float f=12.5;//会报警告且无法编译，可见java是强类型语言，因为12.5默认double类型
        float f=12.5f;
        System.out.println(f);
    }

    //double int long
    public static void main0(String[] args) {
        double c=1.1;
        double d=1.1;
        System.out.println(c * d);//会存在精度上的误差
        int a=1;
        int b=2;
        String str="123";
        int k=Integer.valueOf(str);
        System.out.println(a / b);
        double e=12.5;
        System.out.println(e);

    }
}

