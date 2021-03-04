package lambda表达式.test02;

import lambda表达式.test01.MyInterFace2;

/**
 * @title: testMain
 * @Auther: jzx
 * @Date: 2021/1/13 15:05
 */
public class testMain {

    public static void main(String[] args) {


        //方法3、使用lambda实现接口
        /*
        * 使用条件： 接口必须只有一个方法需要实现
        * 如果接口中有返回值比如int类型  double类型等   必须要在lambda中使用return·
        *
        *
        * */

        /*
        * 1、lambda
        * */
        userTest((int a)->{
            System.out.println("a-----"+a+"-------");
            return a;
        });

        /*
         * 2、lambda简写int类型
         * */
        userTest((a)->{
            System.out.println("lambda单个参数简写类型int   a-----"+a+"-------");
            return a;
        });
        /*
         * 3、lambda简写括号
         * */
        userTest(a->{
            System.out.println("lambda单个参数简写括号   a-----"+a+"-------");
            return a;
        });
        /*
         * 4、lambda简写表达式的大括号{}
         * 针对只有一条语句时可以简写
         * */

    }




    private static void userTest(MyInterFace myInterFace) {
       myInterFace.test(5);
    }


}
