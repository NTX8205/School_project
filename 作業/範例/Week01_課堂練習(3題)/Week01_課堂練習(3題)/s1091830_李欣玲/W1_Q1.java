// Q1: 判斷使用者輸入的正整數是否為質數
// 410918306 資管二A 李欣玲
// 日期 2022/2/23

package DataStructure;

import java.util.*;
public class W1_Q1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		for(int i=1;i<=n;i++) {
			int mod = n%i;
			if(mod==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.print(n + "是質數");
		}else {
			System.out.println(n + "不是質數");
		}
	}
}
