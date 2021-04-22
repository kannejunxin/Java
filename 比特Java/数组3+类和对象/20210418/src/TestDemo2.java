/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Moment_Sky
 * Date: 2021-04-18
 * Time: 10:41
 */
class  Person {//类名大驼峰写法
    //字段 —— 或者说成员变量 定义在类内部 方法的外部
    //成员变量的默认值是其对应的0值
    //不建议在创建字段时直接初始化 这样写死不太好  最好在类外创建对象的时候初始化
    public String name;
    public int age;
    public String sex;

    //方法 —— 或者说函数，成员方法
    public void eat() {
        System.out.println(name+"eat()");
    }
    public void show() {
        System.out.println("我叫" + name + "，今年" + age + "岁");
    }
    @Override //重写toString的注解
    //加上注解会帮我做一个检测，确保与Object的toString方法签名一致
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }
}
public class TestDemo2 {
    public static void main5(String[] args) {
        System.out.println(new Person());//匿名引用  只能用一次！！
    }
    public static void main4(String[] args) {
        Person p = new Person();
        p.name="张三";
        p.age=18;
        p.sex="男";
        System.out.println(p.name);
        System.out.println(p.age);
        System.out.println(p.sex);
        p.eat();
        p.show();
        System.out.println("p:" + p);//打印地址  因为调用的是Object的toString的方法
        //当然你可以重写toString 写成你想输出的格式  就像上面创建的Person类
        //把一个对象转换成字符串的过程也叫序列化
    }
    //类和对象
    public static void main(String[] args) {
        Person p = new Person();

        Person p2 = p;//代表了p2这个引用，指向了p指向的这个对象
        //没有引用指向引用这种说法

        p = new Person();
        p = new Person();
        p = new Person();//最终p指向最新new出来的Person  一个引用只能指向一个对象

        Person p3 = null;//p3=null 代表这个引用不指向任何对象
        p3.name="xxx";//可以运行但有异常 空指针异常

    }

    public static void main2(String[] args) {
        Person p1 = new Person();
        //对象的引用.属性名 （成员变量名）
        System.out.println(p1.name);//因为name没有初始化，初始化为null
        System.out.println(p1.age);
        //对象的引用.方法名
        p1.eat();

    }
    public static void main1(String[] args) {
        int a = 10;//局部变量
        //实例化
        Person p1 = new Person();
        Person p2 = new Person();
        Person p3 = new Person();
    }


}
