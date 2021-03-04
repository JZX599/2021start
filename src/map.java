import domain.User;
import sun.security.krb5.internal.ETypeInfo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @title: map
 * @Auther: jzx
 * @Date: 2020/12/29 8:38
 */


/*map  集合对于  键值对   键名为对象 键值为字符串、数字、对象等*/
public class map {


    public static void main(String[] args) {


        ArrayList<String> str = new ArrayList<>();
        for (String s : str) {
            System.out.println(s);
        }

        Map<Object, Object> map = new HashMap<>();


        //键值为字符串   键名为对象
        User user = new User();
        user.setName("haha");
        user.setSex(18);
        map.put(user,"eeeeee");


        //键值为数字   键名为对象
        User user1 = new User();
        user1.setName("haha1");
        user1.setSex(181);
        map.put(user1,181);


        //键值为对象   键名为对象
        User user2 = new User();
        user2.setName("ha");
        user2.setSex(22);

        User user3 = new User();
        user3.setName("h11a");
        user3.setSex(33);
        map.put(user2,user3);



        System.out.println(map);


        if (map instanceof Map){
            System.out.println("该集合对象是map类型");
        }



        String name = "555";

        if (name instanceof String){

            System.out.println("该name是String类型");
        }




        if (user instanceof User){

            System.out.println("该对象是user类型");
        }
    }
}
