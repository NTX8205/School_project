//Q5:三個正整數的最大公因數與最小公倍數
//班級:資管二A;姓名:黃宣慈;學號:410903458
//日期:2/26 W1_Q5;
import java.util.*;
public class W1_Q5 {
  public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int a = sc.nextInt();
     int b = sc.nextInt();
     int c = sc.nextInt();
     
     System.out.print(gcd(gcd(a,b),c)+" ");
     
     int s = a*b/gcd(a,b);
     
     System.out.print(s*c/gcd(s,c));
     
     
     
     
    }
    static int gcd(int a,int b) {
    	if(a%b==0) {
    		return b;
    	}else {
    		return gcd(b,a%b);
    	}
    }
}

