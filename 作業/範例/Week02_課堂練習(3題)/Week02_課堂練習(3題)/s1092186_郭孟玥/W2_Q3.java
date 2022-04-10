//質因數分解進階版
//資管二A 410921862 郭孟玥
//Date:2022/03/06
import java.util.*;
public class W2_Q3 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int total=0;
		
		System.out.print(n+" = ");
		for(int i=2;;) {
			if(n%i==0) {
				total++;
				n=n/i;
			}
			else {
				if(total>1) {
					System.out.print(i+"^"+total);
				}
				else if(total==1) {
					System.out.print(i);
				}
				else if(total==0) {
					i++;
					continue;
				}
				total=0;
				i++;
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