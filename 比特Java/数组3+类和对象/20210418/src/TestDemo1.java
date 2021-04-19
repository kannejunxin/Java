import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Moment_Sky
 * Date: 2021-04-18
 * Time: 9:13
 */
public class TestDemo1 {
    public static void main(String[] args) {
        int[] array1 = new int[2];//不初始化默认为0
        String[] array2 = new String[2];//不初始化默认为null
        for(int i = 0; i<array1.length;i++) {
            System.out.print(array1[i] + " ");
        }
        for(int i = 0; i<array1.length;i++) {
            System.out.print(array2[i] + " ");
        }
    }
    public static void main7(String[] args) {
        //不规则二维数组
        int[][] array1 = new int[2][];
        for(int i = 0; i<array1.length;i++) {
            for( int j=0;j<array1[i].length;j++) {
                System.out.print(array1[i][j] + " ");
            }
            System.out.println();
        }//会空指针异常  因为array1[0] array1[1]存放的是null

        array1[0] = new int[3];
        array1[1] = new int[2];
        for(int i = 0; i<array1.length;i++) {
            for( int j=0;j<array1[i].length;j++) {
                System.out.print(array1[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main6(String[] args) {
        int[][] array1 = {{1,2,3},{4,5,6}};
        System.out.println(array1[0]);//地址
        System.out.println(array1[1]);
        for(int i = 0; i<array1.length;i++) {
           for( int j=0;j<array1[i].length;j++) {
                 System.out.print(array1[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("================");
        for(int[] arr:array1) {
            for(int x : arr) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
        System.out.println("================");
        System.out.println(Arrays.deepToString(array1));
//        for(int i = 0; i<2;i++) {
//            for( int j=0;j<3;j++) {
//                System.out.println(array1[i][j] + " ");
//            }
//            System.out.println();
//        }
    }

    //二维数组
    public static void main5(String[] args) {
        int[][] array = {{1,2,3},{4},{5,6}};
        int[][] array2 = new int[][]{{1,2,3},{4},{5,6}};
        int[][] array3 = new int[2][];//行号必须指定
        //int[][] array4 = new int[][3];//err
        int[][] array5 = new int[2][3];
    }


    public static void main4(String[] args) {
        int[] array = new int[10];
        System.out.println(Arrays.toString(array));
        //Arrays.fill(array,99);
        Arrays.fill(array,0,3,99);

        System.out.println(Arrays.toString(array));


        int[] array1 = {1,2,3,4,5};
        int[] array2 = {1,2,3,4,5};
        System.out.println(Arrays.equals(array1, array2));

        System.out.println(Arrays.binarySearch(array1, 4));
        System.out.println(Arrays.binarySearch(array1, 0,1,4));
    }
    public static void reverse(int[] array) {
        int i = 0;
        int j = array.length-1;
        while (i<j) {
            int tmp = array[i];
            array[i] = array[j];
            array[j] = tmp;
            i++;
            j--;
        }
    }
    public static void main2(String[] args) {
        int[] array={1,2,3,4,5};
        reverse(array);
        System.out.println(Arrays.toString(array));
    }

    //冒泡排序
    public static void bubbleSort(int[] array) {
        boolean flg =  false;
        for(int i = 0 ; i < array.length-1;i++) {
            flg = false;
            for(int j = 0; j<array.length-1-i; j++) {
                if (array[j]>array[j+1]) {
                    int tmp = array[j];
                    array[j]= array[j+1];
                    array[j+1] = tmp;
                    flg = true;
                }
            }
            if(flg == false) {
                break;
            }
        }
    }
    public static void main1(String[] args) {

    }
}
