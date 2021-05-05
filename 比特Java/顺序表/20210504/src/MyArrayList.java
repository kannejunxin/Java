import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Moment_Sky
 * Date: 2021-05-04
 * Time: 13:58
 */
//顺序表
public class MyArrayList {
    //最好是改为私有的 private
    public int[] elem;//不建议在在这里初始化 把它弄成固定大小
    public int usedSize;//有效数据个数

    public MyArrayList() {
        this.elem = new int[5];
    }

    //判断是否包含某个元素
    public boolean contains (int toFind) {
        for(int i=0;i<this.usedSize;i++) {
            if(this.elem[i]==toFind) {
                return true;
            }
        }
        return false;
    }

    //查找某个元素对应的位置
    public int search(int toFind) {
        for(int i=0;i<this.usedSize;i++) {
            if (this.elem[i] == toFind) {
                return i;
            }
        }
        return -1;
    }

    //获取pos位置的元素
    public int getPos(int pos) {
//       if(pos<0 || pos>this.usedSize-1) {
//           return -1;//这里返回-1不太妥当  可以抛出异常
//       } else{//可以把else省略
//           return this.elem[pos];
//       }

        if(pos<0 || pos>this.usedSize-1) {
            throw new UnsupportedOperationException("pos位置不合法");
        }
        return this.elem[pos];
    }

    //获取顺序表大小
    public int size() {
        return this.usedSize;
    }

    //更新某下标的元素值
    public void setPos(int pos,int value) {
        if(pos<0 || pos>this.usedSize-1) {
            System.out.println("pos位置不合法");
            return;
        }
        System.out.println("完成更新");
        this.elem[pos] = value;
    }

    //打印顺序表
    public void display() {
        for(int i=0;i<this.usedSize;i++) {
            System.out.print(this.elem[i]);
        }
        System.out.println();
    }

    //判断数组是否满了
    public boolean isFull() {
        if(this.elem.length == this.usedSize ) {
            return true;
        }
        return  false;
    }

    //增加
    public void add(int pos, int data) {
        //pos从0开始
        //0.考虑到数组满
        if(this.isFull()) {
            //扩容
            this.elem = Arrays.copyOf(this.elem,2*this.elem.length);
        }

        //1.检查pos位置是否合法
        if(pos<0||pos>this.usedSize) {
            System.out.printf("pos位置不合法");
            return;
        }
        //2.不能把原来pos位置的元素抹掉
        int i = usedSize;
        for(;i>pos;i--) {
            elem[i] = elem[i-1];
        }
        elem[pos]=data;
        this.usedSize++;
    }

    //删除第一次出现的key
    public void remove(int key) {
        //1.找到要删除元素的下标index(找第一个)
        int index = search(key);
        if(index == -1) {
            System.out.println("不存在key");
            return;
        }

        //2.[i]=[i+1]  i++
        int i = index;
        while (i<this.usedSize-1) {
            this.elem[i] = this.elem[i+1];
            i++;
        }
        //这里最终会存在一个点要理解 实际顺序表有this.usedSize（未--前）的个数 ，
        //最后一个数我们没有管而是让它占着位，因为以后我们在add会覆盖这个数
        //但是如果数组存的是对象的引用，这就存在问题了，这样最后一个位置要设为空null

        //3.usedSize--
        this.usedSize--;

    }

    //清空顺序表
    public void clear() {
        this.usedSize = 0 ;
        //这里如果数组元素是引用类型 则要遍历然后在置空
    }

}
