/*
 	ら戳:2022/02/23
 	肈ヘ:肂絤策璸衡ㄢタ俱计程そ计&程そ计(癹伴秆猭)
	痁:戈恨A
	厩腹:410918209
	﹎:糂ㄊ碄
 */
import java.util.*;
public class W1_Q4 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int max=1;
		int i=2;
		while(i<=n) {
			if(n%i==0 && m%i==0) {
				if(max<i) {
					max=i;
				}
			}
			i++;
		}
		System.out.printf("%d籔%d程そ计%d%n",n,m,max);
		System.out.printf("%d籔%d程そ计%d%n",n,m,n*m/max);
	}
}
