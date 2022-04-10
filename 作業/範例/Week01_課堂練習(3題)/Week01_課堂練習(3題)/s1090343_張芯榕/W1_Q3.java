
import java.io.*;
import java.util.Scanner;

//璸衡ㄢタ俱计程そ计&程そ计
public class W1_Q3 {
	
	public static int GCD(int m, int n) {
		if(n == 0)
			return m;
		else 
			return GCD(n, m%n);
	}
	
	public static int LCM(int m, int n) {
		return m*n/GCD(m,n);
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
	    int n = sc.nextInt();
	    
	    System.out.println(m+"籔"+n+"程そ计"+GCD(m,n));
	    System.out.println(m+"籔"+n+"程そ计"+LCM(m,n));

	}
	
}
