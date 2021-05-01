import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Moment_Sky
 * Date: 2021-04-20
 * Time: 19:21
 */
//这里是类的实现者
class Person {
    //静态在类加载的时候就有了
    //对于成员字段如果没有初始化就为对应的默认值的0值：这个对于普通or静态都一样
    //                  1.普通成员变量
    //属性 字段 成员变量
    //                  2.静态成员变量（不依赖于对象）
    private String name2;//private 修饰的成员变量只能在该类内使用，类外不可以使用
    private String sex;
    public String name;//堆上
    public int age;//堆上
    public static int count=100;//方法区
    //                  1.普通成员方法
    //行为 成员方法
    //                  2.静态成员方法（不依赖于对象）
    public final int size = 10;//堆上
    public final static int size2 = 10;//方法区 static final 顺序没关系

    public void eat() {
//        System.out.println(age);
//        System.out.println(name);
//        System.out.println(count);
//        staticFunc();
        System.out.println("eat()!!!");
    }
    //静态的成员方法内不可以访问普通成员变量 因为静态成员方法是通过类名访问，此时可能并没有实例化一个对象出来，而普通成员变量是实例化对象后才创建的
    public  static void staticFunc() {
        System.out.println(count);

        //eat(); //err
//        System.out.println(name);
//        System.out.println(age); //err
        System.out.println("statciFunc()");
    }
    //提供公有的方法访问私有的成员变量
    public String getName2() {
        return name2;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    //构造方法
    public Person(){
        this("xxxx");
        System.out.println("不带参数的构造法方法");
    }
    public Person(String name2){
        System.out.println("带一个参数的构造法方法");
        this.name2=name2;
    }
    public Person(String name2,String sex){
        System.out.println("带二个参数的构造法方法");
        this.name2=name2;
        this.sex=sex;
    }
    static {
        //this.age=9999;//err
        count = 99;
        System.out.println("静态代码块");
    }

    {
        this.age=9999;
        count = 99;
        System.out.println("实例代码块或者叫构造代码块");
    }


    @Override
    public String toString() {
        return "Person{" +
                "name2='" + name2 + '\'' +
                ", sex='" + sex + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", size=" + size +
                '}';
    }

}
public class TestDemo1 {

    public static void main(String[] args) {
        Person person = new Person();
        System.out.println("=====");
        Person person2 = new Person();//验证静态代码块只执行一次

    }
    public static void main8(String[] args) {
        Person person = new Person();
        System.out.println(person);
        Person person1 = new Person("caocao");
        Person person2 = new Person("caocao","男");
    }
    //这里是类的调用者
    public static void main7(String[] args) {
        //这里会出现一个问题 如果类的实现者将代码改完了，比如成员变量name 改为 myname 这就导致在类的调用者就不能使用 了
        //这就引出了安全性问题 于是就有了封装

        Person person = new Person();
        person.name = "XXXX";
        System.out.println(person.name);
    }
    //main函数是静态的 也是因为让其在类加载时其执行次序能尽量靠前  如果main是普通的 那么就产生先有蛋还是先有鸡的问题 因为要调用main就得有
    //对象，而对象的建立又要在main函数中
    public static void main6(String[] args) {
        Person person = new Person();
        System.out.println(person.size);//也在堆上
    }
    public static void main5(String[] args) {
        Person person = new Person();
        person.staticFunc();// 会警告
        Person.staticFunc();
    }
    public static void main4(String[] args) {
        Person per = null;
        System.out.println(per.count);//不会空指针异常  因为 静态成员变量不依赖于对象

        Person.count++;
        System.out.println(Person.count);

        Person.count++;
        System.out.println(Person.count);
    }
    public static void main3(String[] args) {
        Person person = new Person();
        person.age++;
        person.count++;
        System.out.println(person.age);
        System.out.println(person.count);

        Person person2 = new Person();
        person2.age++;
        person2.count++;
        System.out.println(person2.age);
        System.out.println(person2.count);

        //说明静态成员变量位于方法区


    }
    public static void main2(String[] args) {
        Person person = new Person();
        System.out.println(person.name);
        System.out.println("=================");
        System.out.println(person.count);//注意会有警告
        System.out.println(Person.count);//通过类名访问 类名.静态成员变量
    }
    public static void main1(String[] args) {
        //实例化一个对象
        Person person = new Person();
        person.name="XXXXX";
        person.age=18;
        System.out.println(person);
        person.eat();


    }
}
