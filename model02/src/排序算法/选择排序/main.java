package 排序算法.选择排序;

/**
 * @title: main
 * @Auther: jzx
 * @Date: 2021/3/14 15:31
 */
public class main {
    public static void main(String[] args) {
        int[] arr = { 5, 2, 4, 1, 3 };
        for(int i = 0; i < arr.length - 1; i++) {// 做第i趟排序
            int k = i;
            for(int j = k + 1; j < arr.length; j++){// 选最小的记录
                if(arr[j] < arr[k]){
                    k = j; //记下目前找到的最小值所在的位置
                }
            }
            //在内层循环结束，也就是找到本轮循环的最小的数以后，再进行交换
            if(i != k){  //交换a[i]和a[k]
                int temp = arr[i];
                arr[i] = arr[k];
                arr[k] = temp;
            }
        }
        for (int i : arr) {
            System.out.println(i);
        }
    }


    //    例如：int[] values = { 5, 2, 4, 1, 3 };
//    　　排序过程：
//    　　第1次： 1,【5,2,4,3】 从5个元素中取出最小放第1个·
//    　　第2次： 1,2,【5,4,3】 从4个元素中取出最小放第2个·
//    　　第3次： 1,2,3,【5,4】 从3个元素中取出最小放第3个·
//    　　第4次：  1,2,3,4,【5】 从2个元素中取出最小放第4个·
}
