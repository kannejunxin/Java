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

    public ListNode head = null;//头指针

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

    //任意位置插入  假设第一个数据为下标为0
    public void addIndex(int index, int data) {
        //先判断index是否符合要求
        if(index < 0 || index>size()) {
            System.out.println("index不合法");
            return;
        } else if(index==0) {//若index==0就头插法
            addFirst(data);
            return;
        } else if(index == size() ) {//若index == size() 就尾插
            addLast(data);
            return;
        } else {
            ListNode node = new ListNode(data);
            ListNode cur = this.findIndexSubOne(index);//cur指向index-1的结点位置
            node.next=cur.next;
            cur.next=node;

        }
    }

    //释放内存
    public void clear() {
        //最粗暴的方式是 this.head = null;就可以
        //cur 为当前需要置空的节点
        ListNode cur = this.head;
        while(cur != null) {
            ListNode curNext = cur.next;
            cur.next=null;
            cur = curNext;
        }
        this.head=null;
    }

    //让一个引用从头开始走index-1步
    public ListNode findIndexSubOne (int index) {
        ListNode cur = this.head;
        for (int i=0;i!=index-1;i++) {
            cur=cur.next;
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

    //查找是否包含某个元素
    public boolean contains(int key) {
        ListNode cur = this.head;
        while(cur != null) {
            if(cur.val == key) {
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

    public  ListNode searchPrev(int key) {
        ListNode prev = this.head;
        ListNode cur = this.head;
        while(prev.next != null) {
            if(prev.next.val==key) {
                return prev;
            }
            prev=prev.next;
        }
        return null;
    }

    //删除第一次出现key的结点
    public void remove(int key) {
        //0.确定该结点是不是头结点
        if(key == this.head.val) {
            head=head.next;
            return;
        }
        //1.找删除结点的前驱
        ListNode prev = searchPrev(key);
        if (prev==null) {
            System.out.println("链表中无该数");
            return;
        }
        //2.开始删除
        ListNode del = prev.next;
        prev.next=del.next;
        del=null;//可以省略
    }




     // 以穷举法创建链表 是不是很low
    public  void createList() {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(7);
        listNode1.next=listNode2;
        listNode2.next=listNode3;
        listNode3.next=listNode4;
        listNode4.next=null;
        this.head=listNode1;
    }




    //遍历链表
    //如果想遍历完整个链表 那么结束时一定是head==null;
    public void display() {
        ListNode cur = this.head;

        while (cur != null) {
            System.out.print(cur.val + " ");
            cur = cur.next;
        }
        System.out.println();
    }

    public void display2(ListNode ret) {
        ListNode cur = ret;

        while (cur != null) {
            System.out.print(cur.val + " ");
            cur = cur.next;
        }
        System.out.println();
    }


    //以下为经典面试题

    //题目一   删除所有值为key的结点
    public void removeAllKey(int key) {
        if(head==null) return;
        ListNode prev = this.head;
        ListNode cur = this.head.next;
        while(cur != null) {
            if(cur.val == key) {
                prev.next = cur.next;
                cur=cur.next;
            }else {
                prev = cur;
                cur=cur.next;
            }
        }
        //这个if语句尽可能放最后 如果放while前面这这个if必须是个循环
        if(this.head.val == key) {
            this.head=this.head.next;
        }
    }

    //题目二反转链表
    public ListNode reverseList() {
        if(this.head == null) return null;
        ListNode cur = this.head;
        ListNode curNext = cur.next;
        cur.next = null;
        cur = curNext;
        //curNext = curNext.next; 该步骤放到循环里面 为了防止cur是null 报空指针异常
        while(cur != null) {
            curNext = curNext.next;
            //下面两步骤其实就是头插
            cur.next =this.head;
            this.head = cur;
            cur = curNext;
        }
        return this.head;
    }

    //反转链表第二种做法  其实相差不大 就是多填了一个prev 代替了 head 循环
    public ListNode reverseList2() {
        ListNode prev = null;
        ListNode cur = this.head;
        while(cur!=null) {
            ListNode curNext = cur.next;
            cur.next = prev;
            prev = cur;
            cur = curNext;
        }
        head=prev;
        return prev;

    }

    //题目三：取链表的中间结点 要求时间复杂度为O(N)
    public ListNode middleNode() {
        if(this.head == null) return null;
        ListNode fast = this.head;
        ListNode slow = this.head;
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    //题目四： 输入一个链表，输出该链表中倒数第k个结点。 要求时间复杂度为o(n)
    public ListNode FindkNode(int k) {
        if(k<=0 || head == null) {
            return null;
        }
        ListNode fast = this.head;
        ListNode slow = this.head;
        while(k-1!=0) {
            if(fast.next != null) {
                fast = fast.next;
                k--;
            }else {
                System.out.println("k值过大");
                return null;
            }
        }
        while(fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }

    //题目六：编写代码，以给定值x为基准将链表分割成两部分，所有小于x的结点排在大于或等于x的结点之前 。
    public ListNode partition(int x) {
        // write code here
        if(head == null) return null;
        ListNode bs = null;
        ListNode be = null;
        ListNode as = null;
        ListNode ae = null;
        while(this.head != null) {
            if(this.head.val >= x) {
                if( as == null ){
                    //第一次插入
                    as=this.head;
                    ae=this.head;
                } else {
                    ae.next = this.head;
                    ae = ae.next;
                }
            }else {
                if( bs == null ) {
                    //第一次插入
                    bs = this.head;
                    be = this.head;
                }else {
                    be.next = this.head;
                    be = be.next;
                }
            }
            this.head = this.head.next;
        }
        if(bs == null) {
            return as;
        }
        be.next = as;
        if(as != null) {
            ae.next = null;
        }
        return bs;
    }

    //题目七 ：在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，重复的结点不保留，返回链表头指针
    public ListNode deleteDuplication() {
        if(head==null) return null;

        ListNode cur = this.head;
        ListNode newHead = new ListNode();
        ListNode tmp = newHead;


        while(cur != null) {
            if(cur.next!=null && cur.val == cur.next.val) {
                while(cur.next!=null && cur.val == cur.next.val) {
                    cur = cur.next;
                }
                cur = cur.next;
            }else {
                tmp.next = cur;
                tmp = tmp.next;
                cur = cur.next;
            }
        }
        tmp.next = null;//防止结点在最后
        return newHead.next;
    }

    //题目八：链表的回文结构。对于一个链表，请设计一个时间复杂度为O(n),额外空间复杂度为O(1)的算法，判断其是否为回文结构
    public boolean chkPalindrome() {
        //slow到中间结点
        if(this.head == null) return true;
        ListNode fast = this.head;
        ListNode slow = this.head;
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        //反转
        ListNode cur = slow.next;
        while(cur != null) {
            ListNode curNext = cur.next;
            cur.next = slow;
            slow = cur;
            cur = curNext;
        }
        //一个从前往后 一个从后往前 相遇则回文
        ListNode tmp = this.head;
        while(tmp != slow) {
            if(tmp.val != slow.val) {
                return false;
            }
            //这两个if位置不能换
            if(tmp.next == slow) {//偶数结点的情况下
                return true;
            }
            tmp = tmp.next;
            slow = slow.next;
        }
        return true;
    }


    //题目十：判断链表带不带环
    public void createLoop() {//先创建带环的链表
        ListNode cur = this.head;
        while(cur.next!= null) {
            cur=cur.next;
        }
        cur.next = this.head.next;
    }



    public boolean hasCycle() {
        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null  ) {
            fast = fast.next.next;
            slow = slow.next;

            if(fast == slow) {
                return true;
            }
        }
        return false;
    }
    //题目十一： 给定一个链表，返回链表开始入环的第一个节点。 如果链表无环，则返回 null
    public ListNode detectCylcle() {
        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow) {
                break;
            }
        }
        if(fast==null || fast.next == null ) {
            return null;
        }
        slow = head;

        while(slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        return fast;
    }

}
