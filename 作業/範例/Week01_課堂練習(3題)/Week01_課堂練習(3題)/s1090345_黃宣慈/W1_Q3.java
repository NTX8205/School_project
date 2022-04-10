//Q3:計算兩個正整數的最大公因數＆最小公倍數 
//班級:資管二A;姓名:黃宣慈;學號:410903458
//日期:2/24 W1_Q3;
import java.util.*;
public class W1_Q3 {
public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("最大公因數是：" + gcd(a,b));
		System.out.println("最小公倍數是：" + (a*b/gcd(a,b)));
}
        static int gcd(int a,int b) {
             if(a%b==0) {
               return b;
             }else {
               return gcd(b,a%b);
      }
   }
}

