package lambda表达式.test01;

import lambda表达式.test01.MyInterFace;
import lambda表达式.test01.MyInterFace2;

/**
 * @title: testMain
 * @Auther: jzx
 * @Date: 2021/1/13 15:05
 */
public class testMain {

    public static void main(String[] args) {
        //方法1、执行此传入接口实现类  调用userTest静态方法
        /*MyInterFaceImpl myInterFaceimpl = new MyInterFaceImpl();
        userTest(myInterFaceimpl);
*/
        //方法2、使用匿名内部类进行接口实现
        /*userTest(new MyInterFace() {

            @Override
            public void test() {
                System.out.println("test-----------------");
            }
        });*/


        //方法3、使用lambda实现接口
        /*
        * 使用条件： 接口必须只有一个方法需要实现
        * 如果接口中有返回值比如int类型  double类型等   必须要在lambda中使用return·
        *
        *
        * */

        userTest(()->{
            System.out.println("test1------------");
            return 0;
        });


        userTest2((int a ,int b)->{
            System.out.println("test2------------"+"a="+a+"  b="+b);
        });
    }




    private static void userTest(MyInterFace myInterFace) {
       myInterFace.test();
    }

    private static void userTest2(MyInterFace2 myInterFace2) {
        myInterFace2.test(10,20);
    }


}
