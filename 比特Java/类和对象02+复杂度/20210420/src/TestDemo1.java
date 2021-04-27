/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Moment_Sky
 * Date: 2021-04-20
 * Time: 19:21
 */
class Person {
    //                  1.普通成员变量
    //属性 字段 成员变量
    //                  2.静态成员变量
    public String name;//堆上
    public int age;//堆上
    public static int count;//方法区
    //行为 成员方法
    public void eat() {
        System.out.println(age);
        System.out.println(name);
        System.out.println(count);
        System.out.println("eat()!!!");
    }
    public  static void staticFunc() {
        System.out.println(count);
        //eat(); //err
//        System.out.println(name);
//        System.out.println(age); //err
        System.out.println("statciFunc()");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}
public class TestDemo1 {
    public static void main(String[] args) {

    }
    public static void main1(String[] args) {
        //实例化一个对象
        Person person = new Person();
        person.name="XXXXX";
        person.age=18;
        System.out.println(person);
        person.eat();

        person.staticFunc();//err 会警告
        Person.staticFunc();
    }
}
