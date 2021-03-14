package 排序算法.直接插入排序;

/**
 * @title: main
 * @Auther: jzx
 * @Date: 2021/3/14 14:07
 */
public class main {

    public static void main(String[] args) {

        int[] arr = {34, 11, 23, 53, 21};


        insertSort(arr);

        for (int i : arr) {
            System.out.println(i);
        }

    }

    private static void insertSort(int[] arr) {

        //外层循环确定待比较数值
        for (int i = 1; i < arr.length; i++) {  //必须i=1，因为开始从第二个数与第一个数进行比较
            int temp = arr[i];  //待比较数值
            int j = i - 1;
            //内层循环为待比较数值确定其最终位置
            for (; j >= 0 && arr[j] > temp; j--) {  //待比较数值比前一位置小，应插往前插一位
                //将大于temp的值整体后移一个单位
                arr[j + 1] = arr[j];
            }
            arr[j + 1] = temp; //待比较数值比前一位置大，最终位置无误
        }
    }
//    例如：int[] values = { 5, 2, 4, 1, 3 };
//    　　排序过程：
//    　　第1次：【2,5】,4,1,3
//    　　第2次：【2,4,5】,1,3
//    　　第3次：【1,2,4,5】,3
//    　　第4次：【1,2,3,4,5】

}
