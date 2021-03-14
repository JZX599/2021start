package 排序算法.递归.实现斐波拉数列;

/**
 * @title: main
 * @Auther: jzx
 * @Date: 2021/3/14 16:19
 */
public class main {
    public static void main(String[] args) {
        //定义数量 查询斐波拉数列  例如输入 1 输出 0,0,1  输入3 输出 0,0,1,2,3  输入6 输出0,0,1,2,3,5,8,13
        String a = feibona(8);
        System.out.println(a);
    }
    //定义用户使用的公共方法
    public static String feibona(int num) {
        if (num<1){
            return "";
        }
        return feibona(1,num,0,1);
    }

    //定义系统内部递归的方法
    private static String feibona(int index, int num, int one, int two) {
        if (index<=num){
            if (index==1){
                System.out.print(one+","+two+",");
            }
            return (one+two)+","+feibona(index+1,num,two,one+two);
        }else {
            return "";
        }
    }
}
