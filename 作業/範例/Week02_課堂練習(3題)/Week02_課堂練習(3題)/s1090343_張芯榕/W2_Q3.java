// Q3: 質因數分解進階版
// 資管二A/410903432/張芯榕

import java.util.*;

public class W2_Q3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();		// 輸入數字 n
		int count = 0;				// 用來計算因數的次方數
		System.out.print(n+" = ");
		
		for(int i = 2;;) {
			if(n%i == 0) {			// n 如果能被 i 整除
				count++;			// count加一
				n/=i;				// n除以i
			}else {
				if(count > 1) {						// 當因數的次方數 > 1
					System.out.print(i+"^"+count);	// 輸出因數和其次方
				}else if(count == 1) {				// 當因數的次方數為1時
					System.out.print(i);			// 輸出因數
				}else if(count == 0){				// 當i不是n的因數時，i+1
					i++;
					continue;
				}
				count = 0;							// count歸零
				i++;								
				if(n == 1) {
					break;
				}else {
					System.out.print("*");
				}
			}
		}
		
	}
}
