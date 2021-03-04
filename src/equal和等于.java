/**
 * @title: equal和等于
 * @Auther: jzx
 * @Date: 2020/11/17 16:33
 */
public class equal和等于 {

    // 等于比较地址   equal比较值

    public static void main(String[] args) {
        String s  = "haha";
        String s1 = new String("haha");
        System.out.print("使用等于比较： ");
        System.out.println(s==s1);// 地址比较
        System.out.println("使用equal比较："+s.equals(s1));// 值比较
    }
}
