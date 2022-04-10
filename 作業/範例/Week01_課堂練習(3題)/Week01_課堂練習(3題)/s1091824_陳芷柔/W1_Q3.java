//計算兩個正整數的最大公因數&最小公倍數
//資管二A 410918241 陳芷柔
//日期:2022/02/26
import java.util.Scanner;
public class w3 {
	
	public static int getGCD(int m,int n) {
		if(n==0) {
			return m;
		}else {
			return getGCD(n,m%n);
		}
	}
	public static int getLCD(int m,int n) {
	return m*n/getGCD(m,n);	
	}
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		System.out.printf("%d與%d的最大公因數為:%d%n",m,n,getGCD(m,n));
		System.out.printf("%d與%d的最小公倍數為:%d%n",m,n,getLCD(m,n));
	}
	}