package api;

import java.util.ArrayList;

/**
 * @title: demo03
 * @Auther: jzx
 * @Date: 2021/1/14 9:15
 */
public class demo03 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(54);
        list.add(53);
        list.add(52);
        list.add(510);
        list.add(50);
        list.forEach(System.out::println);

    }
}
