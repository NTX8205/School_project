/**
 * 題目:Q3: 計算兩個正整數的最大公因數&最小公倍數
 * 班級:資管二B
 * 姓名:許哲睿
 * 學號:410928050
 * 日期:2022.02.23
 */


import java.util.*;

public class W1_Q3 {
    
    public static void main(String[] args) {
        
        System.out.println("計算兩個正整數的最大公因數&最小公倍數");

        Scanner sc = new Scanner(System.in);

        System.out.print("輸入2數:");
        int x=sc.nextInt();
        int y=sc.nextInt();

        int gcd_x=x,gcd_y=y;
        int lcd_x=x,lcd_y=y;
        int gcd=1,lcd=1;

        for(int gcd_i=2 ; gcd_x%gcd_i==0 && gcd_y%gcd_i==0;gcd_i++){
            gcd_x/=gcd_i;
            gcd_y/=gcd_i;
            gcd*=gcd_i;
        }
        
        System.out.println(x+"和"+y+"的最大公因數:"+gcd);
        
        for(int lcd_i=2;lcd_x%lcd_i==0 && lcd_y%lcd_i==0;lcd_i++){
            lcd_x/=lcd_i;
            lcd_y/=lcd_i;
            lcd*=lcd_i;
        }


        lcd=lcd*lcd_x*lcd_y;

        System.out.println(x + "和" + y + "的最小公倍數:" + lcd);

    }
}
