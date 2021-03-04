import java.util.Random;

/**
 * @title: 使用Random
 * @Auther: jzx
 * @Date: 2020/11/17 14:40
 */
public class 使用Random {


    public static void main(String[] args) {
        Random random = new Random();

        // 获取所有随机整数
        System.out.println("不指定范围生成随机数"+random.nextInt());

        // 指定范围随机数
        System.out.println("指定范围生成随机数："+random.nextInt(3));  // 生成0-2

        // 指定1-5范围之间随机整数
        for (int i = 0; i < 10; i++) {
            System.out.println("随机生成1-5之间的整数"+(random.nextInt(5)+1));  //生成0-4   整体加1生成1-5
        }


    }


}
