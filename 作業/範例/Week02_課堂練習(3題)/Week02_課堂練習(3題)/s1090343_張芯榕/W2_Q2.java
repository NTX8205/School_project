// Q2: 最接近質數問題：
// 使用者輸入一個正整數n, 找出與n最接近的質數
// 資管二A/410903432/張芯榕

import java.util.*;

public class W2_Q2 {
	
	public static boolean isPrimeNumber(int n) {	// 判斷是否為質數
		if(n % 2 == 0) {
			return n == 2;							// 當n可以被2整除時，回傳false
		}else if(n > 2) {
			for(int i = 3; i < n; i += 2) {
				if(n%i == 0) {						// 當n可以被i整除時，回傳false
					return false;
				}
			}
			return true;							// 當n不可以被i整除時，回傳true
		}else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), small = 0, large = 0;
		
		for(int i = n-1; i > 1; i--) {	// 由大往小尋找質數
			if(isPrimeNumber(i)) {		// 判斷是否為質數
				small = i;				// 令small等於該質數
				break;					// 結束迴圈
			}
		}
		
		for(int i = n+1; ; i++) {		// 由小往大尋找質數
			if(isPrimeNumber(i)) {
				large = i;				// 令large等於該質數
				break;
			}
		}
		
		// 計算兩個質數與 n 的差為多少
		if((large-n) > (n-small)) {								
			System.out.printf("最接近%d的質數為%d", n, small);
		}else if((large-n) < (n-small)) {
			System.out.printf("最接近%d的質數為%d", n, large);
		}else {
			System.out.printf("最接近%d的質數為%d、%d", n, small, large);
		}
		
	}
	
}
