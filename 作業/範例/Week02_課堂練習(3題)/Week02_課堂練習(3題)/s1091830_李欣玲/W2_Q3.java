// Q3: 質因數分解進階版
// 410918306 資管二A 李欣玲
// 日期 2022/3/7

package DataStructure;

import java.util.*;
public class W2_Q3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		System.out.print(n+"=");
		for(int i=2;;) {
			if(n%i==0) {
				count++;
				n/=i;
			}else {
				if(count>1) {
					System.out.print(i+"^"+count);
				}else if(count==1) {
					System.out.print(i);
				}else if(count==0) {
					i++;
					continue;
				}
				count = 0;
				i++;
				if(n==1) {
					break;
				}
				System.out.print("*");
			}
		}
	}
}
