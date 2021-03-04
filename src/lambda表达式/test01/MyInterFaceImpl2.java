package lambda表达式.test01;

import lambda表达式.test01.MyInterFace2;

/**
 * @title: MyInterFaceImpl
 * @Auther: jzx
 * @Date: 2021/1/13 15:07
 */
public class MyInterFaceImpl2 implements MyInterFace2 {


    @Override
    public void test(int a,int b) {
        System.out.println("test2----a="+a+"----------b="+b+"------");
    }
}
