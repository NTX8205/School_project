//題目：計算兩個正整數的最大公因數及做小公倍數
//班級：資管二B 學號：410903521 姓名：葉宸甄
//日期：2/23
package text6;
import java.util.*;
public class main1 {
	public static void main(String[] args) {
		
		int n=18;
		int m=30;
		System.out.println("最大公因數為:"+GCD(n,m));
		System.out.println("最小公倍數為:"+LCM(n,m));
	}
	public static int GCD(int n,int m) {
		if(n%m==0)
			return m;
		else
			return GCD(m,n%m);
	}
	public static int LCM(int n,int m) {
		return n*m/GCD(n,m);
	}

}
