//判斷使用者輸入的正整數是否為質數
//資管二B 410918217 洪珮瑜
//Date: 2022/02/23

import java.util.*;
public class W1_Q1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=2; i<n; i++) {
			if(n%i==0) {
				System.out.println(n+"不是質數");
				return;
			}
		}
		
		System.out.println(n+"是質數");
	}

}
