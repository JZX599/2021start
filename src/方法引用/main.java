package 方法引用;

/**
 * @title: main
 * @Auther: jzx
 * @Date: 2021/1/14 10:01
 */

/*
* ::实现方法引用
*
* */
public class main {
    public static void main(String[] args) {
       IAct iAct =Integer::parseInt;
       IAct iAct1 =Double::parseDouble;
       System.out.println(iAct.test("15"));
       System.out.println(iAct1.test("15"));

        IAct iAct3 = (String a)->{
          return Integer.parseInt(a);
        };
        System.out.println(iAct3.test("19"));
    }
}
