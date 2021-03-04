package api;

/**
 * @title: demo01
 * @Auther: jzx
 * @Date: 2021/1/8 16:38
 */
public class demo01 {


    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};//7 length 6
        int k = 3;
        rotate(arr, k);
        for (int i : arr) {
            System.out.println(i);
        }
    }

    public static void rotate(int nums[], int k) {
        int length = nums.length;
        int temp[] = new int[length];
        //把原数组值放到一个临时数组中，
        for (int i = 0; i < length; i++) {
            temp[i] = nums[i];
        }
        //然后在把临时数组的值重新放到原数组，并且往右移动k位
        for (int i = 0; i < length; i++) {
            nums[(i + k) % length] = temp[i];
        }
    }


}
