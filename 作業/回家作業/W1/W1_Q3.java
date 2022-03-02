package 作業.回家作業.W1;

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
        sc.close();

        int gcd_x=x,gcd_y=y;
        int gcd=1,lcd=1;

        for(int gcd_i=2 ; gcd_x>1 && gcd_y>1;gcd_i++){
            while(gcd_x % gcd_i == 0 && gcd_y % gcd_i == 0){
                gcd_x/=gcd_i;
                gcd_y/=gcd_i;
                gcd*=gcd_i;
            }
            if(isPrime(gcd_x) == true && isPrime(gcd_y) == true){
                break;
            }
            
        }
        lcd=gcd*gcd_x*gcd_y;

        System.out.println(x+"和"+y+"的最大公因數:"+gcd);
        System.out.println(x + "和" + y + "的最小公倍數:" + lcd);

    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
