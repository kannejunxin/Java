/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Moment_Sky
 * Date: 2021-05-04
 * Time: 13:16
 */
public class TestDemo {
    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add(0,1);
        myArrayList.add(1,2);
        myArrayList.add(2,3);
        myArrayList.add(3,4);
        myArrayList.add(0,5);
        myArrayList.add(5,6);
        myArrayList.display();
        System.out.println("===========");
        try {
            int ret = myArrayList.getPos(2);
            System.out.println(ret);
        }catch (UnsupportedOperationException e) {
            e.printStackTrace();
        }
        System.out.println("===========");
        int index = myArrayList.search(5);
        System.out.println(index);
        System.out.println("===========");
        System.out.println(myArrayList.contains(5));
        System.out.println("===========");
        myArrayList.remove(5);
        myArrayList.display();
        System.out.println("===========");
        myArrayList.setPos(2,7);
        myArrayList.display();
        System.out.println("===========");
        myArrayList.clear();
    }
}
