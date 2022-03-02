

import java.util.Scanner;

/**
 * 題目:Q3: 質因數分解進階版
 * 班級:資管二B
 * 姓名:許哲睿
 * 學號:410928050
 * 日期:2022.03.02
 */

public class W2_Q3 {
    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.print(n+"=");
        for(int i=2;n>1;i++){
            int count=0;
            while(n%i==0){
                n/=i;
                count++;

            }
            System.out.println(i+"^"+count);
            if(n!=1){
                System.out.print("*");
            }
        }
    }
}
