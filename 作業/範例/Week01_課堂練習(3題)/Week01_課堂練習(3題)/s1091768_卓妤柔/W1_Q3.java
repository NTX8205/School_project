/* 璸衡ㄢタ俱计程そ计&程そ计(患癹) */
//戈恨A 410917685 П琗

import java.util.*;

public class W1_Q3 {
	public static int GCD(int m, int n){
		if(n == 0)
			return m;
		else
			return GCD(n, m%n);
	}
	
	public static int LCM(int m,int n){
		return m * n/GCD(n, m%n);
	}
	
	public static void main(String[] args){  
	    Scanner sc = new Scanner(System.in);
	    int a = sc.nextInt();
	    int b = sc.nextInt();
	    
	    System.out.println(a + "籔" + b + "程そ计" + GCD(a,b));
	    System.out.println(a + "籔" + b + "程そ计" + LCM(a,b));
	}
}
