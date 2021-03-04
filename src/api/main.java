package api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @title: main
 * @Auther: jzx
 * @Date: 2021/1/8 15:08
 */
public class main {


    public static void main(String[] args) {
        int[] arr ={-1,-9};//7 length 6
        int k = 3;
        rotate(arr,k);
    }

    public static void rotate(int[] arr, int k) {
        List list=new ArrayList();

        if (arr.length<=k){

            k=k%arr.length;
            System.out.println(k);

        }
        int t=k;

            for (int i =arr.length-k; i <arr.length ; i++) {
                if (k>0){
                    list.add(arr[i]);
                    k--;
                }
            }

            for (int i = 0; i <arr.length-t ; i++) {
                list.add(arr[i]);
            }

            for (int i = 0; i <arr.length ; i++) {
                arr[i]=(int)list.get(i);
            }

        List<Integer> collect = Arrays.stream(arr).boxed().collect(Collectors.toList());
        System.out.println(collect);
    }
}
