package lambda表达式.test03;

import lambda表达式.test01.MyInterFace;
import lambda表达式.test01.MyInterFace2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @title: testMain
 * @Auther: jzx
 * @Date: 2021/1/13 15:05
 */
public class testMain {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(10);
        list.add(22);
        list.add(2);
        list.add(3);
        list.add(6);
        Collections.sort(list);
        System.out.println("使用Collections升序排列"+list);



        Collections.sort(list);//集合升序排列
        Collections.reverse(list);//集合反转
        System.out.println("使用Collections降序排列"+list);

        //简写
        list.sort((a1,a2)->a1.compareTo(a2));
        System.out.println("使用lambda升序排列"+list);
        list.sort((a1,a2) ->{
            return a2.compareTo(a1);
        });
        System.out.println("使用lambda降序排列"+list);
    }
}
