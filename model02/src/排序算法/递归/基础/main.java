package 排序算法.递归.基础;

/**
 * @title: main
 * @Auther: jzx
 * @Date: 2021/3/14 15:43
 */
public class main {


    //递归：方法自己调用自己


    //举例子：1到3之间相乘
    public static void main(String[] args) {

      int a = xiangcheng(1,1);
        System.out.println(a);
    }
    public static int xiangcheng(int start ,int end){
        //递归方法的出口
        if (start==end){
            return end;
        }else {
            //递归方法的调用
//        每次调用都要缩小范围
            return start*xiangcheng(start+1,end);
        }

    }

}
