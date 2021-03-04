import org.junit.Test;

import java.util.ArrayList;
import java.util.Random;

/**
 * @title: Random使用
 * @Auther: jzx
 * @Date: 2020/11/23 8:34
 */
public class Random使用 {

    @Test
    public void test() {

        ArrayList<Integer> list = new ArrayList<>();
        int to=0;
        Random random = new Random();
        for (int i = 0; i < 6; i++) {
            to= random.nextInt(33) + 1;// 随机生成1-33的整数
            list.add(to);
        }

        System.out.println(list.toString());

    }

}
