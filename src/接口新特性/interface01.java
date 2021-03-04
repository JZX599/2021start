package 接口新特性;


///新特性  加default关键字
public interface interface01 {
    void test();
    default void test2(){
        System.out.println("接口默认方法  新特性");
    }
    default void test3(){
        System.out.println("接口默认方法  新特性");
    }

    static void test4(){
        System.out.println("接口静态方法  只能使用接口调用  不能使用实现类调用");

    }



}
