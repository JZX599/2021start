import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @title: test
 * @Auther: jzx
 * @Date: 2020/11/17 12:14
 */
public class test {



    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        while (list.size()<=3){
            int i = s.nextInt();
            list.add(i);
        }
        int temp = 0;
        Object[] o = list.toArray();
        Integer[] copy = Arrays.copyOf(o, o.length, Integer[].class);
        for (int i = 0; i < copy.length; i++) {
            for (int j = copy.length-1; j > i ; j--) {
                if ((int) o[j] < (int) o[j - 1]) {
                    //从后往前进行比较，小数往前，一轮之后最小数就在最前面了
                    temp = (int) o[j - 1];
                    o[j - 1] =  o[j];
                    o[j] = temp;
                }
            }
        }
        System.out.println(temp);
    }

}
