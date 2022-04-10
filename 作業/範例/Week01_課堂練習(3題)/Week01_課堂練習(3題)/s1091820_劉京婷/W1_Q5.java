/*
 	ら戳:2022/02/23
 	肈ヘ:肂絤策璸衡タ俱计程そ计&程そ计
	痁:戈恨A
	厩腹:410918209
	﹎:糂ㄊ碄
 */

import java.util.*;
public class W1_Q5 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int tmp;
		if(a>c) {
			tmp=a;
			a=c;
			c=tmp;
		}
		if(a>b){
			tmp=a;
			a=b;
			b=tmp;
		}
		if(b>c) {
			tmp=b;
			b=c;
			c=tmp;
		}
		int max=1;
		int i=2;
		while(i<=c) {
			if(a%i==0 && b%i==0 && c%i==0) {
				max=i;
			}
			i++;
		}
		int min=a*b*c;
		i=a*b*c;
		while(i>=2) {
			if(i%a==0 && i%b==0 && i%c==0) {	
				min=i;
			}
			i--;
		}
		
		System.out.printf("%d籔%d籔%d程そ计%d%n",a,b,c,max);
		System.out.printf("%d籔%d籔%d程そ计%d%n",a,b,c,min);
	}
}
