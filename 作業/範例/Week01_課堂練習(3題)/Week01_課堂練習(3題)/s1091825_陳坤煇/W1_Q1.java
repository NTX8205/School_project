//資管二B
//陳坤煇
//410918259

import java.util.*;

public class W1_Q1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		int a=0;
		int b=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				a=a+1;
				b=i;
				System.out.printf("%d%n",b);	
			}
		}
		if(a==2) {
			System.out.printf("%d是質數",n);
		}
		else {
			System.out.printf("%d不是質數",n);
		}
		
	}

}
