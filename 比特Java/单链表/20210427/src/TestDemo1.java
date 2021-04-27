/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Moment_Sky
 * Date: 2021-04-27
 * Time: 18:48
 */
public class TestDemo1 {
    //链表的种类 ： 单向的 双向的  带头的 不带头的  循环的  非循环的
    //面试考试默认为   单项不带头非循环的 双向不带头非循环的
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.createList();
        myLinkedList.display();
        System.out.println(myLinkedList.size());
    }
}
