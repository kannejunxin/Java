/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Moment_Sky
 * Date: 2021-04-27
 * Time: 19:21
 */
// Java集合当中LinkedList 底层是一个双向链表

class ListNode {
    public int val;//数据域 不一定为int
    public ListNode  next;//存储下一个结点的地址，此为引用

    public ListNode() {

    }

    public ListNode(int val){
        this.val = val;
    }
}
public class MyLinkedList {
    public ListNode head = null;
    //头插法
    public void addFirst(int data) {
        ListNode node = new ListNode(data);
        node.next = head;
        head = node;
    }
    //尾插法
    public void addLast(int data) {
        ListNode node = new ListNode(data);
        ListNode cur = this.head;
        if(this.head == null) {
            this.head = node;
        }else {
            while(cur.next!=null) {
                cur=cur.next;
            }
            cur.next = node;
        }
    }
    //任意位置插入  第一个数据为0
    public void addIndex(int index, int data) {
        if(index < 0 || index>size()) {
            System.out.println("index不合法");
            return;
        } else if(index==0) {
            addFirst(data);
            return;
        } else if(index == size() ) {
            addLast(data);
            return;
        } else {

        }
    }
    //释放内存
    public void clear() {
        //cur 为当前需要置空的节点
        ListNode cur = this.head;
        while(cur != null) {
            ListNode curNext = cur.next;
            cur.next=null;
            cur = curNext;
        }
        this.head=null;
    }
    //
    public ListNode findIndexSubOne (int index) {
        ListNode cur = this.head;
        while(cur!=null) {

        }

        return cur;
    }
    //求链表长度
    public int size() {
        ListNode cur = this.head;
        int count = 0;
        while(cur!=null) {
            count++;
            cur=cur.next;
        }
        return count;
    }
     // 以穷举法创建链表 是不是很low
//    public  void createList() {
//        ListNode listNode1 = new ListNode(1);
//        ListNode listNode2 = new ListNode(2);
//        ListNode listNode3 = new ListNode(3);
//        ListNode listNode4 = new ListNode(7);
//        listNode1.next=listNode2;
//        listNode2.next=listNode3;
//        listNode3.next=listNode4;
//        listNode4.next=null;
//        head=listNode1;
//    }
    //遍历链表
    //如果想遍历完整个链表 那么结束时一定是head==null;
    public void display() {
        ListNode cur = this.head;

        while (cur != null) {
            System.out.println(cur.val + " ");
            cur = cur.next;
        }
    }

     public static void main(String[] args) {

//        ListNode listNode1 = new ListNode(1);
//        ListNode listNode2 = new ListNode(2);
//        ListNode listNode3 = new ListNode(3);
//        ListNode listNode4 = new ListNode(7);

     }
}
