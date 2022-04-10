//題目說明：計算兩個整數的最大公因數和最小公倍數
//資管二B 410918275 張語桓
//Date:2022/02/27

import java.util.*;
public class W1_Q3 {
     public static void main(String[] args) {
    	 int x=18;
    	 int y=30;
    	 int a=0;
    	 int x1=x,y1=y;
    	 while(x%y!=0) {
    		 a=y;
    		 y=x%y;
    		 x=a;
    	 }
    	 System.out.printf("%d與%d的最大公因數為%d%n",x1,y1,y);
    	 System.out.printf("%d與%d的最小公倍數為%d",x1,y1,x1*y1/y);
     }
}
