import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Moment_Sky
 * Date: 2021-04-27
 * Time: 18:48
 */
public class TestDemo1 {

    // 题目五：将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode newHead = new ListNode();//傀儡结点
        ListNode tmp = newHead;
        while(l1!=null && l2!=null) {
            if(l1.val<l2.val) {
                tmp.next = l1;
                l1 = l1.next;
                tmp = tmp.next;
            } else {
                tmp.next = l2;
                l2 = l2.next;
                tmp = tmp.next;
            }
        }
        if(l1 == null) {
            tmp.next = l2;
        }else if(l2 == null) {
            tmp.next = l1;
        }
        return newHead.next;
    }
    //题目九：输入两个链表，找出它们的第一个公共结点。
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        //让pl ps指向最长的链表  这里一开始是假设的
        ListNode pl = headA;
        ListNode ps = headB;
        //分别求两个链表长度
        int lenA = 0;
        int lenB = 0;
        while(pl != null) {
            lenA++;
            pl = pl.next;
        }
        while(ps != null) {
            lenB++;
            ps = ps.next;
        }
        pl = headA;
        ps = headB;
        int len =  lenA - lenB;
        if(len < 0) {
            len = lenB -lenA;
            pl=headB;
            ps=headA;
        }
        //确保pl指向最长的链表
       //让pl所指向的链表走len步
        while(len != 0) {
            pl = pl.next;
            len--;
        }
        //同时走
        while(pl != ps){
            pl=pl.next;
            ps=ps.next;
        }
//        if(pl==null) {
//            return null;
//        } 可以不用 但要理解这个情况
        return pl;
    }

    //链表的种类 ： 单向的 双向的  带头的 不带头的  循环的  非循环的
    //面试考试默认为   单项不带头非循环的 双向不带头非循环的
    public static void main(String[] args) {
//        MyLinkedList myLinkedList = new MyLinkedList();
//        myLinkedList.createList();
//        myLinkedList.display();
//        System.out.println(myLinkedList.size());
//
        MyLinkedList myLinkedList2 = new MyLinkedList();
        myLinkedList2.addLast(1);
        myLinkedList2.addLast(2);
        myLinkedList2.addLast(3);
        myLinkedList2.addLast(5);
        myLinkedList2.addLast(8);
        myLinkedList2.addLast(12);
        myLinkedList2.display();

        MyLinkedList myLinkedList3 = new MyLinkedList();
        myLinkedList3.addLast(1);
        myLinkedList3.addLast(2);
        myLinkedList3.addLast(3);
        myLinkedList3.addLast(7);
        myLinkedList3.addLast(7);
        myLinkedList3.display();

      //  myLinkedList3.addIndex(1,7);
      //  myLinkedList3.display();

     //   myLinkedList3.reverseList2();
     //   myLinkedList3.display();

     //   System.out.println(myLinkedList3.contains(7));

     //   myLinkedList3.removeAllKey(7);
     //   myLinkedList3.display();
       // ListNode ret = myLinkedList3.middleNode();
        //System.out.println(ret.val);
//        ListNode ret = myLinkedList3.FindkNode(3);
//        myLinkedList3.display2( ret );
      myLinkedList3.deleteDuplication();
        myLinkedList3.display();;
      //  ListNode ret = (new TestDemo1()).mergeTwoLists(myLinkedList2.head,myLinkedList3.head);
        //myLinkedList3.display2(ret);

        myLinkedList3.clear();
        myLinkedList2.clear();
//        myLinkedList.clear();

        TestLinkedList testLinkedList = new TestLinkedList();
        testLinkedList.addLast(1);
        testLinkedList.addLast(2);
        testLinkedList.addLast(3);
        testLinkedList.addLast(4);
        testLinkedList.display();

        TestLinkedList testLinkedList2 = new TestLinkedList();
        testLinkedList2.addFirst(1);
        testLinkedList2.addFirst(2);
        testLinkedList2.addFirst(3);
        testLinkedList2.addFirst(4);
        testLinkedList2.addIndex(2,5);

        testLinkedList2.remove(3);

        testLinkedList2.display();

        TestLinkedList testLinkedList3 = new TestLinkedList();
        testLinkedList3.addFirst(1);
        testLinkedList3.addFirst(1);
        testLinkedList3.addFirst(1);
        testLinkedList3.addFirst(1);

        testLinkedList3.removeallkey(1);
        testLinkedList3.display();

        testLinkedList3.clear();
        testLinkedList2.clear();
        testLinkedList.clear();
    }

}
