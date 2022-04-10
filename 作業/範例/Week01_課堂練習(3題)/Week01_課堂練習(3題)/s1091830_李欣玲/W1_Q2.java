// Q2: 將使用者輸入的正整進行質因數分解
// 410918306 資管二A 李欣玲
// 日期 2022/2/23

package DataStructure;

import java.util.*;
public class W1_Q2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = 2;
		System.out.print(n + "=");
		while(n>k) {
			if(n%k==0){
				System.out.print(k + "*");
				n = n/k;
			}else {
				k++;
			}
		}
		System.out.print(n);
	}

}
