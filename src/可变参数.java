/**
 * @title: 可变参数
 * @Auther: jzx
 * @Date: 2020/11/23 21:12
 */
public class 可变参数 {


    public static void main(String[] args) {
        add(10,20,30,40);
    }

    // 可变参数
    private static void add(int...arr) {
        System.out.println("可变参数： ");
        System.out.println(arr.length);
    }



}
