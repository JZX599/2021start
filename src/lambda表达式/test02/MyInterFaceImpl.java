package lambda表达式.test02;

/**
 * @title: MyInterFaceImpl
 * @Auther: jzx
 * @Date: 2021/1/13 15:07
 */
public class MyInterFaceImpl implements MyInterFace {


    @Override
    public int test(int a) {
        System.out.println("---a=="+a+"--");
        return a;
    }


}
