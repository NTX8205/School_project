// Q1: [p,q]區間質數問題：
// 使用者輸入兩個正整數p、q,找出介於p到q之間的所有質數與質數總數
// 資管二A/410903432/張芯榕

import java.util.*;

public class W2_Q1 {
	
	public static boolean isPrimeNumber(int n) {	// 判斷是否為質數
		if(n % 2 == 0) {
			return n == 2;							// 當n可以被2整除時，回傳false
		}else if(n > 2) {							// 如果n不可以被2整除，且n大於2
			for(int i = 3; i < n; i += 2) {			// 使用for迴圈，從3開始試可否整除n
				if(n%i == 0) {						
					return false;					// 當n可以被i整除時，回傳false
				}
			}
			return true;							// 當n不可以被i整除時，回傳true
		}else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0, a = sc.nextInt(), b = sc.nextInt();
		
		if(a > b) {			// 令b > a
			int tmp = a;
			a = b;
			b = tmp;
		}
		
		for(int i = a; i < b; i++) {		// 令for迴圈由小到大判斷數字是否為質數
			if(isPrimeNumber(i)) {
				System.out.print(i+" ");	// 是的話將數字列印出來
				sum += 1;					// 質數個數總和加一
			}
		}
		System.out.println("\n質數個數" + sum);
	}
	
}
