import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @title: map的entry对象    键值对  输出键名对应的键值
 * @Auther: jzx
 * @Date: 2020/11/23 21:44
 */
public class map的entry对象 {

    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("11","111");
        map.put("22","222");
        map.put("33","333");
        map.put("44","444");
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry);
        }
    }

}
