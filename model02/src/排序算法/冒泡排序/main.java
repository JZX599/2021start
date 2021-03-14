package 排序算法.冒泡排序;

/**
 * @title: main
 * @Auther: jzx
 * @Date: 2021/3/14 12:56
 */
public class main {

    public static void main(String[] args){
        int[] arr = {21,20,13,41,35,56};
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j]>arr[j+1]){
                    int tem = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tem;
                }
            }
        }
        for (int i = 0; i <arr.length ; i++) {
            if (i==0){
                System.out.print("["+arr[i]+",");
            }else if (i>0&&i<arr.length-1){
                System.out.print(arr[i]+",");
            }else if (i==arr.length-1){
                System.out.println(arr[i]+"]");
            }
        }
    }

    //    {21,20,13,41,35,56} 原来
    //    {20,13,21,35,41,56} 第一次 已找出最大数  排在数组最后的位置
    //    {13,20,21,35,41,56} 第二次 已找出第二最大数  排在数组最后第二的位置
    //    {13,20,21,35,41,56} 第三次
    //    {13,20,21,35,41,56} 第四次
    //    {13,20,21,35,41,56} 第五次 由于数组长度为6  最多排序6-1次就能将数组排序正确


}
