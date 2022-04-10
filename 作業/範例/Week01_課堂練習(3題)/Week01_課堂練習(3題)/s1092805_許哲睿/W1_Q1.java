
/**
 * 題目:Q1: 判斷使用者輸入的正整數是否為質數
 * 班級:資管二B
 * 姓名:許哲睿
 * 學號:410928050
 * 日期:2022.02.23
 */

import java.util.Scanner;

public class W1_Q1 {
    

    public static void main(String[] args) {

        System.out.println("判斷正整數是否為質數");
        
        Scanner sc =new Scanner(System.in);


        System.out.print("輸入整數:");
        int n = sc.nextInt();
        int count=0;

        System.out.print("可被"+n+"的因數有: ");

        
        for(int i = 1; i<=n;i++){
            if(n%i==0){
                System.out.print(i);
                count++;
                if(i!=n){
                    System.out.print(",");
                }
            }
            
        }
        System.out.println();


        if(count>2){
            System.out.println(n+"不是質數");
        }
        else{
            System.out.println(n+"是質數");
        }
    }
}
