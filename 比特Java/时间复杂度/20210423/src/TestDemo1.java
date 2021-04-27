import java.util.Arrays;
import java.util.Calendar;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Moment_Sky
 * Date: 2021-04-23
 * Time: 18:48
 */
//复杂度 的代码都是课件上的  略
class Test {
    public void func() {
        System.out.println("hello");
    }
    public static void hello() {
        System.out.println("hello()!!");
    }

}
class HasStatic {// 1
    private static int x = 100;// 2
    public static void main(String args[]) {// 3
        HasStatic hsl = new HasStatic();// 4
        hsl.x++;// 5
        HasStatic hs2 = new HasStatic();// 6
        hs2.x++;// 7
        hsl = new HasStatic();// 8
        hsl.x++;// 9
        HasStatic.x--;// 10
        System.out.println(" x=" + x);// 11
    }
}
class Calculator {
    private int num1;
    private int num2;
    public Calculator() { }
    public Calculator(int num1,int num2) {
        this.num1=num1;
        this.num2=num2;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int add() {
        return num1+num2;
    }
    public int sub() {
        return num1-num2;
    }
    public int mul() {
        return num1*num2;
    }
    public double dev() {
        return num1*1.0/num2;
    }

}

class MyValue {
    public int val;
}
public class TestDemo1 {
    public static void swap3(MyValue myValue1,MyValue myValue2) {
        int tmp = myValue1.val;
        myValue1.val = myValue2.val;
        myValue2.val = tmp;
    }
    public static void main(String[] args) {
        MyValue myValue1 = new MyValue();
        MyValue myValue2 = new MyValue();
        myValue1.val=10;
        myValue2.val=20;
        swap3(myValue1,myValue2);
        System.out.println(myValue1.val);
        System.out.println(myValue2.val);
    }
    public static void main3(String[] args) {
        Calculator cal = new Calculator();
        cal.setNum1(10);
        cal.setNum2(20);

        System.out.println(cal.add());
        System.out.println(cal.sub());
        System.out.println(cal.mul());
        System.out.println(cal.dev());
    }

    public static void swap2(int[][] array) {
        int[] tmp=array[0];
        array[0]=array[1];
        array[1]=tmp;
    }
    public static void main2(String[] args) {
        int[] array1 = { 1,2,3,4,5,6,7,8,9,10};
        int[] array2 = {6,7,8,9,10};
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        int[][] array = { array1, array2};
        swap2(array);
        System.out.println(Arrays.toString(array[0]));
        System.out.println(Arrays.toString(array[1]));

    }
    public static void main1(String[] args) {
        Test test1 = null;
        test1.hello();//不会报错  因为test1不指向任何对象

    }

}
