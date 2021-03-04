import org.junit.Test;

import java.util.Scanner;

/**
 * @title: main
 * @Auther: jzx
 * @Date: 2020/12/10 10:36
 */
public class main {


    public static void main(String[] args) {


            Scanner s = new Scanner(System.in); //定义scanner，等待输入
            System.out.println("请输入字符串：");
            while (true) {
                String line = s.next(); //读取输入内容
                if (line.equals("exit")) break; //如果读取到exit，则退出输入
                System.out.println(">>>" + line); //打印输入内容
            }
        }


}
