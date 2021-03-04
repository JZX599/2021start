package lambda表达式.test01;

import lambda表达式.test01.MyInterFace;

/**
 * @title: MyInterFaceImpl
 * @Auther: jzx
 * @Date: 2021/1/13 15:07
 */
public class MyInterFaceImpl implements MyInterFace {


    @Override
    public int test() {
        System.out.println("test-----");
        return 0;
    }


}
