import java.util.HashSet;
import java.util.Set;

/**
 * @title: 测试set
 * @Auther: jzx
 * @Date: 2020/11/23 22:25
 */
public class 测试set {


    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("eee");
        set.add("aaa");
        set.add("kkk");
        set.add("eee");

        for (String s : set) {
            System.out.println(s);
        }
    }
}
