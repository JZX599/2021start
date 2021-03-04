package api;

import java.util.Scanner;

/**
 * @title: numsc
 * @Auther: jzx
 * @Date: 2021/1/13 11:27
 */
public class numsc {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int num = sc.nextInt();

        int result=0;
        for( ; ;){
            int n = num%10;
            result = result*10 + n;
            num = num/10;//降位
            if(num==0){
                break;
            }
        }
        System.out.println(result);
    }
}
