import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Moment_Sky
 * Date: 2021-05-17
 * Time: 15:34
 */


//继承 is-a关系

//提取共性
class Animal {
    static {
        System.out.println("nihao");
    }
    public String name;
    private int age;

    public void eat() {
        System.out.println(this.name + "吃饭！");
    }
}
class Cat extends Animal {
//    public String name;
//
//    public void eat() {
//        System.out.println(this.name + "吃饭！");
//    }
}

//可以多层继承 但不可以多继承 但最好不要超过3层
class A extends Cat {

}

class Bird extends Animal {
//    public String name;
//
//    public void eat() {
//        System.out.println(this.name + "吃饭！");
//    }

    public  void fly() {
        System.out.println(this.name + "飞！");
        //System.out.println(this.age);//err
    }
}
public class TestDemo1 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.name ="大黄";
        cat.eat();

    }
}
