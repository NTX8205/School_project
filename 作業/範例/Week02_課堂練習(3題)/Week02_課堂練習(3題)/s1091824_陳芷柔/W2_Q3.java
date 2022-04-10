//質因數分解進階
//資管二A 410918241 陳芷柔
//日期:2022/03/06
import java.util.*;
public class W2_Q3 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int total=0;
		
		System.out.print(n+" = ");
		for(int a=2;;) {
			if(n%a==0) {
				total++;
				n=n/a;
			}
			else {
				if(total>1) {
					System.out.print(a+"^"+total);
				}
				else if(total==1) {
					System.out.print(a);
				}
				else if(total==0) {
					a++;
					continue;
				}
				total=0;
				a++;
				if(n==1) {
					break;
				}
				else {
					System.out.print("*");
				}
			}
		}	

	}
}