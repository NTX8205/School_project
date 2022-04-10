//Q3: 璸衡ㄢタ俱计程そ计&程そ计
//
//╰:戈恨A
//厩腹:410928042
//﹎:璝恫
import java.util.*;
public class W1_Q3 {
	public static void main (String args[]) {
		Scanner sc = new Scanner (System.in);
		int n = 18;
		int m = 30;
		System.out.printf("%d 籔%d 程そ计: %d %n",n,m,Gcd(n,m));
		System.out.printf("%d 籔%d 程そ计: %d",n,m,Lcm(n,m));
	}

	static int Gcd(int n,int m) { //程そ计
		int min=2;
		int min2=1;
        while(min<=n || min>=m){
	        if(n%min==0 && m%min==0){	        		        	
	        	min2=min2*min;
	        	n=n/min;
	        	m=m/min;
	        	min=2;
	        }else {
	        	min++;
	        }
        }
		return min2;
	}
	
	static int Lcm(int n,int m) { //程そ计
		int max= (n>m?n:m);
		while(max>0) {
			if(max%n==0 && max%m==0) {
				break;
			}else {
				max++;
			}
		}
		return max;
	}
}