/**
 * @title: math的使用
 * @Auther: jzx
 * @Date: 2020/11/23 9:27
 */
public class math的使用 {


    public static void main(String[] args) {

        System.out.println("绝对值 的用法： "+Math.abs(-5));
        System.out.println("向上取整 的用法： "+Math.ceil(3.1));

        Double ceil = Math.ceil(3.1);
        int i = ceil.intValue();
        System.out.println("向上取整 并转int类型的用法： "+i);
        System.out.println(Math.floor(55.5));//math.floor(x)返回小于参数x的最大整数,即对浮点数向下取整
        System.out.println("------------"+(int)(Math.random()*5+1));//一个随机1到5的整数num。
    }
}
