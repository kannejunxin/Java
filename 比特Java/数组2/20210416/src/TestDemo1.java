import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Moment_Sky
 * Date: 2021-04-16
 * Time: 19:05
 */
public class TestDemo1 {
    //作业四：数组转字符串
    public static String toString(int[] arr) {
        if(arr==null) {
            return "null";
        }
        String ret ="[";
        for(int i = 0; i<arr.length;i++) {
            if(i!=arr.length-1) {
                ret+=arr[i]+",";
            }else {
                ret+=arr[i];
            }
        }
        return ret+="]";
    }
    public static void main_h4(String[] args) {
        int[] array = {1,2,3,4};
        String ret = toString(array);
        System.out.println(ret);
    }
    //作业三：实现一个方法 copyOf, 对一个整型数组进行拷贝, 得到一个新的数组.  前两个作业就是课程代码，所以就不重复了
    public static int[] copyOf(int[] arr,int length) {
        int[] ret=new int[length];
        for(int i = 0; i<ret.length; i++) {
            if(i<arr.length) {
                ret[i]=arr[i];
            }else {
                ret[i]=0;
            }
        }
        return ret;
    }
    public static void main_h3(String[] args) {
        int[] array = {1,2,3,4};
        int[] copy = copyOf(array,5);
        System.out.println(Arrays.toString(copy));
    }

    //奇数前 偶数后
    public static void func4(int[] arr) {
        int i=0;
        int j=arr.length-1;
        while(i<j){
            while(i<j && arr[i]%2 != 0){
                i++;
            }
            //i遇到偶数 或者数组全为奇
            while(j>i && arr[i]%2 == 0){
                j--;
            }
            //j遇到奇数
            int tmp = arr[i];
            arr[i]=arr[j];
            arr[j]=tmp;
        }
    }

    public static void reverse(int[] arr) {
        int i=0;
        int j=arr.length-1;
        while(i<j) {
            int tmp = arr[i];
            arr[i]=arr[j];
            arr[j]=tmp;
            i++;
            j--;
        }
    }
    public static void main10(String[] args) {
        int[] array = {1,2,3,4};
        reverse(array);
        System.out.println(Arrays.toString(array));
    }


    //判断是否为升序
    public static boolean isSorted(int[] array) {
        if(array == null) {
             return false ;
        }
        for(int i=0;i<array.length-1;i++) {
            if(array[i]>array[i+1]) {
                return false;
            }
        }
        return true;
    }
    public static void main9(String[] args) {
        int[] array = {1,2,3,4};
        System.out.println(isSorted(array));
    }



    /**
     *
     * 数组的拷贝方式：
     * 1. for循环
     * 2. Arrays.copyOf() Arrays.copyOfRange()
     * 3. System.arraycopy
     * 4. 数组名.clone
     *
     * 深拷贝与浅拷贝
     *
     */
    //System.arraycopy
    //arraycopy 是静态的本地方法 之所以称为本地 是因为他可以在栈上开辟空间，其底层为C/C++实现

    //深拷贝与浅拷贝
    public static void main8(String[] args) {
        //深拷贝
        //当拷贝完成之后，通过拷贝而来的引用修改值，原来的引用不发生改变
        int[] array = {1,2,3,4};
        int[] copy = array.clone();
        System.out.println(Arrays.toString(copy));
        copy[0] = 99;
        System.out.println(array[0]);
        //浅拷贝
        //当array的元素是引用（地址）的时候
        //改变copy的元素指向的地址中的值  array也会改变

        //实现深拷贝 对对象本身经行拷贝
    }
    //array.clone();
    public static void main7(String[] args) {
        int[] array = {1,2,3,4};
        int[] copy = array.clone();
        System.out.println(Arrays.toString(copy));
    }
    //System.arraycopy
    public static void main6(String[] args) {
        int[] array = {1,2,3,4};
        int[] copy = new int[array.length];
        System.arraycopy(array,0,copy,0,array.length);//原数组，原数组的起始下标，目的地数组，目的地数组的起始下标，拷贝的长度
        System.out.println(Arrays.toString(copy));
    }
    // Arrays.copyOf() Arrays.copyOfRange()
    //在Java 中 [fome,to)
    public static void main5(String[] args) {
        int[] array = {1,2,3,4};
        int[] copy = Arrays.copyOf(array,array.length);//拷贝的对象，拷贝的长度
        System.out.println(Arrays.toString(copy));
        int[] copy2 = Arrays.copyOfRange(array,1,3);
        System.out.println(Arrays.toString(copy2));
    }
    //for循环
    public static void main4(String[] args) {
        int[] array = {1,2,3,4};
        int[] copy = new int[array.length];
        for(int i=0;i<array.length;i++) {
            copy[i]=array[i];
        }
        System.out.println(Arrays.toString(copy));
    }




    //二分法
    public static int findNumIndex2(int[] arr,int key) {
        int left=0;
        int right=arr.length-1;
        int mid=(left+right);
        while(left<=right) {
            if(key<arr[mid]) {
                right=mid-1;
            } else if(key>arr[mid]) {
                left=mid+1;
            }else {
                return mid;
            }
            mid=(left+right);
        }
        return -1;
    }
    //
    public static int findNumIndex(int[] arr,int key) {
        for(int i=0;i<arr.length;i++) {
            if (arr[i] == key) {
                return i;
            }
        }
                return -1;
    }
    //找元素
    public static void main3(String[] args) {
        int[] arr={1,2,5,12,17};
        //System.out.println(findNumIndex(arr, 7));
        System.out.println(findNumIndex2(arr, 17));
    }

    public static String myToString2(int[] array) {
        assert (array!=null);//Java 也有断言
        if(array==null) {
            return "null";
        }
        //用拼接
        String ret="[";
        for(int i=0;i<array.length;i++) {
            if(i==array.length-1) {
               ret+=array[i];
            } else {
                ret+=array[i]+",";
            }
        }
        ret+="]";
        return ret.toString();
    }
    public static String myToString1(int[] array) {
        StringBuffer ret=new StringBuffer();
        ret.append("[");
        for(int i=0;i<array.length;i++) {
            if(i==array.length-1) {
                ret.append(array[i]);
            } else {
                ret.append(array[i]+",");
            }
        }
        ret.append("]");
        return ret.toString();
    }
    public static void main2(String[] args) {
        int[] arr=null;//会报空指针异常
        String ret = myToString2(arr);
        System.out.println(ret);
    }

    public static int[] func2(int[] array) {
        for(int i=0;i<array.length;i++) {
            array[i]=array[i]*2;
        }
        return array;//函数调用完后，在栈上的tmp销毁，堆上的数组被JVM的垃圾回收器回收
    }
    public static int[] func3(int[] array) {
        int[] tmp=new int[array.length];
        for(int i=0;i<array.length;i++) {
            tmp[i]=array[i]*2;
        }
        return tmp;//函数调用完后，在栈上的tmp销毁，堆上的数组被JVM的垃圾回收器回收
    }
    public static void main1(String[] args) {
        int[] array={1,2,3,4};
        System.out.println(Arrays.toString(array));
        func3(array);
        System.out.println(Arrays.toString(array));
        func2(array);
        //比较func2 与 func3区别
    }
}


