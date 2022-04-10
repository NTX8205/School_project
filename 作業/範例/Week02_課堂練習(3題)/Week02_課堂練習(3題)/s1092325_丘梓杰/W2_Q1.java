//系級:資管二B
//學號:410923254
//姓名:丘梓杰 
//題目:[p,q]區間質數問題

package homework;
import java.util.*;
public class W2_Q1 {
	public static boolean isPrimeNumber(int g) {
		if(g%2 == 0) {
			return g == 2;
		}else if (g>2) {
			for(int i=3;i<g; i+=2) {  //單數即可
				if(g%i == 0) {
					return false;
				}
			}
			return true;
		}else {
			return false;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum=0, k=sc.nextInt(), t=sc.nextInt();
		if(k>t) {
			int tp=k;
			k=t;
			t=tp;
		}
		for(int i=k; i<t; i++) {
			if(isPrimeNumber(i)) {
				System.out.print(i+" ");
				sum+=1;
			}
		}
		System.out.println("\n質數個數 : "+sum);
	}
}
