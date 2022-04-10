//質因數分解進階版
//資管二B 410918102 蔡耒易展
//2022/03/08
import java.util.*;
public class W2_Q3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int x = 0;
		System.out.print(n+"=");
		
		for(int i = 2;;) {
			if(n%i==0) {
				x++;
				n = n/i;
			}else {
				if(x > 1) {
					System.out.print(i+"^"+x);
				}else if(x==1) {
					System.out.print(i);
				}
				
				else if(n > 0) {
					i++;
					continue;
				}
				x = 0;
				if(n==1) {
					break;
				}else {
					System.out.print("*");
				}			
				
				}
			
		}
	}
}
