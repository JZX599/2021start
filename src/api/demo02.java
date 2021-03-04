package api;

/**
 * @title: demo02
 * @Auther: jzx
 * @Date: 2021/1/13 11:05
 */
public class demo02 {


    public static void main(String[] args) {

        double x=-456;
        double init = init(x);
        System.out.println(init);
    }

    private static double init(double x) {
        double pow = Math.pow(-2,31);
        double pow2 = Math.pow(2, 31)-1;
        if (pow2>x&&x>pow){
            System.out.println("执行了");



            return x;

        }else {
            return 0;
        }

    }
}
