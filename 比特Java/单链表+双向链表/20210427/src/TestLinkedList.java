/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Moment_Sky
 * Date: 2021-05-14
 * Time: 18:49
 */

class Node {
    public int val;//数据域 不一定为int
    public Node prev;//存储上一个结点的地址
    public Node next;//存储下一个结点的地址，此为引用


    public Node() {

    }

    public Node(int val){
        this.val = val;
    }
}


public class TestLinkedList {
    public Node head;
    public Node last;


    //头插法
    public void addFirst(int data) {
        Node node = new Node(data);
        if(head == null) {
            this.head = node;
            this.last = node;
        }else {
            node.next = this.head;
            this.head.prev = node;
            this.head =node;
        }
    }

    //尾插法
    public void addLast(int data) {

        Node node = new Node(data);

        if(this.head == null) {
            this.head = node;
            this.last = node;
        }else {
            this.last.next = node;
            node.prev=this.last;
            this.last=node;
        }
    }

    //打印双向链表
    public void display() {
        Node cur = this.head;
        while(cur!=null) {
            System.out.print(cur.val + " ");
            cur  = cur.next;
        }
        System.out.println();
    }


    //任意位置插入
    public Node searchIndex(int index) {
        Node cur = this.head;
        while(index!=0) {
            cur = cur.next;
            index--;
        }
        return cur;
    }

    public void addIndex (int index , int data) {
        if(index<0 || index >size()){
            System.out.println("index位置不合法");
            return;
        }
        if(index == 0) {
            //addFirst(data);
            return;
        }

        if (index == size()) {
            //addLast(data);
            return ;
        }
        Node cur = searchIndex(index);

        Node node = new Node(data);

        node.next = cur;
        cur.prev.next = node;
        node.prev = cur.prev;
        cur.prev=node;

    }

    //是否包含关键字key
    public boolean contains(int key) {
        Node cur = this.head;
        while(cur != null) {
            if(cur.val == key) {
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

    //删除第一次出现关键字Key的结点
    public void remove (int key) {
        Node cur = this.head;
        while(cur!=null) {
            if(cur.val == key) {
                //此时cur所指的结点就是要删除的结点
                if(cur == this.head) {
                    //删除头结点
                    this.head=this.head.next;
                    this.head.prev = null;
                }else {
                    if(cur.next != null) {
                        cur.prev.next = cur.next;//这两行代码顺序没影响
                        cur.next.prev = cur.prev;
                    }else {
                        //删除尾巴结点
                        cur.prev.next = cur.next;
                        this.last = cur.prev;
                    }
                }
             return;//必须要return 否则会陷入死循环 因为此时cur.val一直等于key
            }else {
                cur = cur.next;
            }
        }
        if(cur == null) {
            System.out.println("没有该关键字");
        }
    }

    //删除所有关键字Key的结点
    public void removeallkey (int key) {
        Node cur = this.head;
        while(cur!=null) {
            if(cur.val == key) {
                //此时cur所指的结点就是要删除的结点
                if(cur == this.head) {
                    //删除头结点
                    this.head=this.head.next;
                    //假设全部都是要删除的数字
                    if(this.head != null) {
                        this.head.prev = null;
                    }else {
                        this.last = null;
                    }
                }else {
                    if(cur.next != null) {
                        cur.prev.next = cur.next;//这两行代码顺序没影响
                        cur.next.prev = cur.prev;

                    }else {
                        //删除尾巴结点
                        cur.prev.next = cur.next;
                        this.last = cur.prev;
                    }
                }
                cur = cur.next;
            }else {
                cur = cur.next;
            }
        }
    }

    //撤销
    public void clear() {
        Node cur = this.head;
        while(cur!=null) {
            Node curNext = cur.next;
            cur.prev=null;
            cur.next=null;
            cur = curNext;
        }
    }

    //双向链表的大小
    public int size() {
        Node cur = this.head;
        int count = 0;
        while(cur!=null) {
            count++;
            cur=cur.next;
        }
        return count;
    }


}
