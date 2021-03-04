package 接口新特性;

/**
 * @title: testMain
 * @Auther: jzx
 * @Date: 2021/1/14 8:53
 */
public class testMain {
    //
    public static void main(String[] args) {
        interface01 inter = new interImpl();
        inter.test();
        inter.test2();
        inter.test3();
        interface01.test4();
    }
}
