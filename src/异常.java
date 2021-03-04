import org.junit.Test;

import java.io.FileInputStream;

/**
 * @title: 异常
 * @Auther: jzx
 * @Date: 2020/11/24 13:06
 */
public class 异常 {


    public static void main(String[] args) {
        try {
            int i  = 1/0;
            System.out.println(i);
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("程序执行出现异常");
        }
    }


    @Test
    public void test() {
        String fileName="";
        readFile(fileName);
    }

    private void readFile(String fileName) {
        if (!fileName.endsWith(".txt")){
            System.out.println("文件名不是以.txt结尾");
        }
    }
}
