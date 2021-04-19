import com.sun.org.apache.xpath.internal.objects.XObject;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Moment_Sky
 * Date: 2021-04-13
 * Time: 19:42
 */
public class TestDemo1 {
    public static void transform(int[] arr) {
        int i;
        for(i=0;i<arr.length;i++) {
            arr[i]*=2;
        }
    }
    public static void main_h5(String[] args) {
        int[] arr=new int[3];
        int i;
        System.out.println("请输入3个数字：");
        Scanner scan = new Scanner(System.in);
        for(i=0;i<arr.length;i++) {
            arr[i]=scan.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        transform(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void main_h4(String[] args) {
        int[] arr=new int[100];
        int i;
        for(i=0;i<arr.length;i++) {
            arr[i]=i+1;
        }
        //arr.toString() 此为继承自父类object的toString
        System.out.println(Arrays.toString(arr));
    }
    public static void printArray(int[] arr) {
        System.out.print("[ ");
        for(int x:arr) {
            System.out.print(x+" ");
        }
        System.out.print("]");
    }
    public static void main_h3(String[] args) {
        int[] arr=new int[5];
        int i ;
        System.out.println("请输入5个数字：");
        Scanner scan = new Scanner(System.in);
        for(i=0;i<arr.length;i++) {
            arr[i]=scan.nextInt();
        }
        printArray(arr);
    }
    public static int sum(int[] arr) {
        int i;
        int sum=0;
        for(i=0;i<arr.length;i++) {
            sum+=arr[i];
        }
        return sum;
    }
    public static void main_h2(String[] args) {
        int[] arr=new int[5];
        int i;
        System.out.println("请输入5个数字：");
        Scanner scan = new Scanner(System.in);
        for(i=0;i<arr.length;i++) {
            arr[i]=scan.nextInt();
        }
        System.out.println(sum(arr));
    }
    public static double avg(double[] arr) {
        int i;
        double sum=0;
        for(i=0;i<arr.length;i++) {
            sum+=arr[i];
        }
        return sum/arr.length;
    }
    public static void main_h1(String[] args) {
        double[] arr=new double[5];
        int i ;
        System.out.println("请输入5个数字：");
        Scanner scan = new Scanner(System.in);
        for(i=0;i<arr.length;i++) {
            arr[i]=scan.nextDouble();
        }
        double ret = avg(arr);
        System.out.println(ret);
    }
    public static void main9(String[] args) {
        Random random1 = new Random(10);
        Random random2 = new Random(10);
        for(int i=0;i<5;i++){
            System.out.print(random1.nextInt(5));
        }
        System.out.println();
        for(int i=0;i<5;i++){
            System.out.print(random2.nextInt(5));
        }
    }

    public static void swap2(Integer x,Integer y) {
        int tmp=x;
        x=y;
        y=tmp;
    }
    public static void main8(String[] args) {
        Integer a=new Integer(10);
        Integer b=new Integer(30);
        swap2(a,b);
        System.out.println(a + " " + b);
    }
    //交换两个变量的值
    public static void swap(int[] array) {
        int tmp=array[0];
        array[0]=array[1];
        array[1]=tmp;
    }
    public static void main7(String[] args) {
        int[] array={10,20};
        print(array);
        swap(array);
        print(array);
    }



    public static void change(int[] array) {
        int i;
        for(i=0;i<array.length;i++) {
           array[i]=array[i]*2;
        }
    }
    public static void print(int[] array) {//注意和基本数据类型一样传的也是值，不过这个值比较特殊，是地址
        int i;
        for(i=0;i<array.length;i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    public static void main6(String[] args) {
        int[] array={1,2,3,4,5};
        print(array);
        change(array);
        print(array);
    }


    public static void main5(String[] args) {
        //int a;
        //System.out.println(a);//err  a为局部变量，使用前要初始化
        int[] array=null;//null表示不指向任何对象 也可以理解为引用类型的0值就是null
        System.out.println(array);//报异常 因为没有开辟空间

        //int[] array2;//也是局部变量  局部变量是从作用域来考虑的
        //System.out.println(array2);//err array2未开辟空间
        //局部变量对基本类型要初始化才可以使用，对引用类型要开辟空间才可以使用


    }
    public static void main4(String[] args) {
        int[] array={1,2,3,4,5};
        System.out.println(array[12]);
        //会报数组越界异常
    }

    public static void main3(String[] args) {
        //arrary arrary2 arrary3 是临时变量 存放在Java虚拟机栈
        //其实栈里的array里面存的值是数值是堆上数组的地址
        //所以array是引用类型
        int[] array={1,2,3,4,5};
        //array2 array3 存的也是地址
        //”只要“new的就在堆上开内存
        int[] array2=new int[5];
        //array2是一个引用，指向一个对象
        int[] array3=new int[]{1,2,3,4,5};
    }

    public static void main2(String[] args) {
        int[] array = {10,20,30,4,5,6,7};
        //1.遍历数组的方式
        for(int i = 0;i<array.length;i++) {
            System.out.println(array[i] + " ");
        }
        System.out.println();
        System.out.println("===========");
        //2.另一种遍历数组的方式  for-each
        //for(表达式1：表达式2) {}  表达式1：元素数据类型 表达式2：数组名
        for(int x: array) {
            System.out.println(x + " ");
        }
        System.out.println();
        //3.使用操作数组的工具类来进行数组的打印
        System.out.println("===========");
        System.out.println(Arrays.toString(array));

    }
    public static void main1(String[] args) {
        //定义一组数据，这组数据都是相同类型 —— 数组
        int a = 10;
        int a2 = 20;
        int a3 = 30;
        int a4 = 40;
        int[] array = {10,20,30,40};//定义了一个数组且初始化
        //数组类型 数组名 = {一组数据，这组数据中的每个数据用逗号隔开}
        //整形数组

        int[] array2;//定义一个数组 默认大小为0
        int[] array3 = new int[10];//定义一个数组 开辟大小为10*int大小的空间，元素默认为0
        int[] array4 = new int[]{1,2,3};
    }
}
