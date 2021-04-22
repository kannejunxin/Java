/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Moment_Sky
 * Date: 2021-04-20
 * Time: 19:21
 */
class Person {
    public String name;//堆上
    public int age;//堆上
    public static int count;//方法区
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

}
public class TestDemo1 {
    public static void main(String[] args) {

    }
    public static void main1(String[] args) {
        Person person = new Person();
        person.eat();
        person.staticFunc();//err 会警告
        Person.staticFunc();
    }
}
