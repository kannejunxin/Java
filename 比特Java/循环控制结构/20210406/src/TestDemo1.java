import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Moment_Sky
 * Date: 2021-04-08
 * Time: 10:40
 */

/**
 * Java当中的调式
 * 1.打断点  鼠标左键在行号前点击
 * 2.右键-》debug ，图标是个虫子
 * 3.开始时有一行会显示为蓝色背景，代表改行还没开始调式
 * 4.下方框框有一个 Variables （变量表，IDEA自动添加） 变量表上方菜单有两个图标要认识后面比较有
 */
public class TestDemo1 {
    public static void main25(String[] args) {
        //处理循环读入的问题
        //例如OJ题目有要求多组输入的要求
        Scanner scan=new Scanner(System.in);
        while(scan.hasNextInt()) {
            int a= scan.nextInt();
            System.out.println(a);
        }
    }
    public static void main24(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("年龄：");
        int age = scan.nextInt();
        System.out.println(age);
        System.out.println("请输入姓名:");
        String name = scan.nextLine();//会跳过 因为把回车读进去了！！！毕竟回车也是字符  所以建议读取字符串优先放在程序前面！！！
        System.out.println(name);
    }
    public static void main23(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("请输入姓名:");
       // String name = scan.next();//输入ha ha 遇到空格停止
       // System.out.println(name);
        String name2 = scan.nextLine();//输入ha ha 读取一
        System.out.println(name2);
    }
    //System.in.read() 作用读入一个字符
    //但是啰嗦
    public static void main22(String[] args) {
        System.out.print("Enter a Char:");
        char i=0;
        try {
            //System.in代表键盘
            i=(char)System.in.read();//这里直接用会报一个异常
        }catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("you char is:" + i);
    }
    public static void main21(String[] args) {
        int i=0;
        do {
            System.out.println("不管怎么样，肯定会执行一次循环体");
        }while(i>0);
    }
    public static void main20(String[] args) {//for循环的嵌套
        int num=5;
        int sum =0;
        for(int i=1;i<=num;i++) {
            int fac=1;
            for(int j=1;j<=i;j++) {
                fac*=j;
            }
            sum+=fac;
        }
        System.out.println(sum);
        //或
//        int i=1;
//        int fac=1;
//        int sum=0;
//        int num=5;
//        for(;i<=num;i++) {
//            fac=fac*i;
//            sum+=fac;
//        }
//        System.out.println(sum);
    }
    public static void main19(String[] args) {
        int i=1;
        while(i<=100) {
            if(i%15==0) {
                System.out.println(i);
            }
            i++;
        }
    }
    public static void main18(String[] args) {
        int i=1;
        while(i<=10) {
            if(i == 5) {
                break;//1 2 3 4
                //continue;//1 2 3 4 死循环
            }
            System.out.println(i + " ");
            i++;
        }
    }
    //循环 while
    public static void main17(String[] args) {
        int num=1;
        while(num<=10)//死循环 代码风格问题
            System.out.println(num);
            num++;
    }
    public static void main16(String[] args) {
        //求1！+2！+.....+5!
        int i=1;
        int fac=1;
        int sum=0;
        int num=5;
        while(i<=num) {
            fac=fac*i;
            sum+=fac;
            i++;
        }
        System.out.println(sum);
    }
    public static void main15(String[] args) {
        //求5！
        int i=1;
        int fac=1;
        while(i<=5) {
            fac=fac*i;
            i++;
        }
        System.out.println(fac);
    }
    public static void main14(String[] args) {
        int i=1,sum1=0,sum2=0;
        while(i<=100) {
            if(i%2==0) {
                sum2+=i;
            } else {
                sum1+=i;
            }
            i++;
        }
        System.out.println("1-100所有奇数和：");
        System.out.println(sum1);
        System.out.println("1-100所有偶数和：");
        System.out.println(sum2);
    }
    public static void main13(String[] args) {
        int i=1;//1.初始值
        int sum=0;
        while(i<=100) {//2.循环判断条件
            sum=sum+i;
            i++;//3.步进，或者称为条件调整部分
        }
        System.out.println(sum);
    }
    //分支 - switch
    public static void main12(String[] args) {
        //这段代码说明switch 可以嵌套,但是不建议，可读性其实很差
        int x=1;
        int y=1;
        switch (x) {
            case 1:
                switch (y) {
                    case 2:
                        System.out.println("hehe");
                        break;
                }
                break;
            case 2:
                System.out.println("haha");
                break;
        }
    }
    public static void main11(String[] args) {
        int a=10;
        //注意 a 的类型不能为long,boolean,float,double,会报错
        switch (a) {
            case 1:
                System.out.println("1");
            case 2:
                System.out.println("2");
                break;
            default:
                System.out.println("^_^");
                break;
        }
    }
    //作业十：输出n*n的乘法口诀表，n由用户输入。
    public static void main10(String[] args) {
        int n,i,j;
        Scanner scan=new Scanner(System.in);
        n = scan.nextInt();
        for(i=1;i<=n;i++) {
            for(j=1;j<=i;j++) {
                System.out.print(j + "*" + i + "=" + i * j);
                System.out.print("  ");
            }
            System.out.println();
        }
    }
    //作业九：输出一个整数的每一位，如：123的每一位是1 ， 2 ， 3
    public static void main9(String[] args) {
        int a,i=0,j;
        int [] arr = new int[10];
        Scanner scan=new Scanner(System.in);
        a = scan.nextInt();
        while(a!=0) {
            arr[i]=a%10;
            i++;
            a/=10;
        }
        i--;
        while(i>=0){
            System.out.print(arr[i]);
            if(i!=0) {
                System.out.print(", ");
            }
            i--;
        }
    }
    //作业八：模拟登陆
    public static void main8(String[] args) {
        String str1="123456";
        String str2;
        int i;
        for(i=0;i<3;i++) {
            Scanner scan=new Scanner(System.in);
            str2=scan.nextLine();
            if(str1.equals(str2)) {
                System.out.println("登陆成功");
                break;
            } else {
                System.out.println("密码错误");
            }
        }
    }
    //作业七：获取一个数二进制序列中所有的偶数位和奇数位， 分别输出二进制序列
    public static void main7(String[] args) {
        int a,i;
        Scanner scan=new Scanner(System.in);
        a=scan.nextInt();
        System.out.println("打印奇数位");
        for(i=30;i>=0;i=i-2) {
            System.out.print(((a>>>i)&1)+" ");
        }
        System.out.println();
        System.out.println("打印偶数位");
        for(i=31;i>=0;i=i-2) {
            System.out.print(((a>>>i)&1)+" ");
        }
        //同样对于负数有问题
//        int a,i=0;
//        int [] arr = new int[32];
//        Scanner scan=new Scanner(System.in);
//        a=scan.nextInt();
//        for(i=0;i<32;i++) {
//            if(i%2==0) {//偶 0 2 4.....
//                arr[i]=a%2;
//            } else {//奇 1 3 5......
//                arr[i]=a%2;
//            }
//            a=a>>>1;
//        }
//        System.out.println("打印偶数位:");
//        for(i=0;i<32;i+=2) {
//            System.out.print(arr[i]+" ");
//        }
//        System.out.println();
//        System.out.println("打印奇数位:");
//        for(i=1;i<32;i+=2) {
//            System.out.print(arr[i]+" ");
//        }
    }
    //作业六：二进制1的个数。
    public static void main6(String[] args) {
        //若用a%2==1 对于负数有误
        int a,count=0;
        Scanner scan=new Scanner(System.in);
        a=scan.nextInt();
        while(a!=0) {
            if((a & 1)!=0) {
                count++;
            }
            a=a>>>1;
        }
        System.out.println(count);
        //另一个方法！！！这是一个规律，每n&(n-1)都会扣除最靠右边的一个1
        int count2=0,n;
        n=scan.nextInt();
        while(n != 0) {
            count2 ++;
            n=n&(n-1);
        }
        System.out.println(count2);


    }
    //作业五：求两个正整数的最大公约数
    public static void main5(String[] args) {
        int a,b,r=1;
        System.out.println("请输入被除数和除数：");
        Scanner scan=new Scanner(System.in);
        a=scan.nextInt();
        b=scan.nextInt();
        while(r!=0) {
            r=a%b;
            a=b;
            b=r;
        }
        System.out.println("最大公约数为：" + a);
    }
    //作业四：计算1/1-1/2+1/3-1/4+1/5 …… + 1/99 - 1/100 的值 。
    public static void main4(String[] args) {
        double sum=0;
        int i;
        for(i=1;i<=100;i++) {
            if(i%2==1) {
                sum+=(double)1/(double)i;//或者sum+=1.0/i;
            } else {
                sum-=(double)1/(double)i;
            }
        }
        System.out.println(sum);
    }
    //作业三：求出0～999之间的所有“水仙花数”并输出。
    public static void main3(String[] args) {
        int count=0,i,sum=0;
        for(i=0;i<=999;i++) {
            int a=i;
            while (a!=0) {
                count++;
                a/=10;
            }
            a=i;
            while(a!=0) {
                sum+=Math.pow(a%10,count);
                a/=10;
            }
            if(sum==i) {
                System.out.println(i + "为水仙花数");
            }
            sum=0;
            count=0;
        }
    }
    //作业二：猜数字游戏
    public static void main2(String[] args) {
        int i;
        Random ran=new Random();
        Scanner scan=new Scanner(System.in);
        i=ran.nextInt(101);//随机生成0~100
        int a;
        while((a=scan.nextInt())!=i) {
            if(a>i) {
                System.out.println("猜大了");
            } else {
                System.out.println("猜小了");
            }
        }
        System.out.println("猜对了");
    }
    //作业一：打印 X 图形
    public static void main1(String[] args) {
        int n,i,j;
        Scanner scan=new Scanner(System.in);
       while(scan.hasNext()) {
           n=scan.nextInt();
           if(n<2 || n>20 ) {
               System.out.println("输入有误");
               break;
           }
           for(i=0;i<n;i++) {
               for(j=0;j<n;j++) {
                   if(j==i || j==n-1-i) {
                       System.out.print("*");
                   }
                   else {
                       System.out.print(" ");
                   }
               }
               System.out.println();
           }
       }
    }
}
