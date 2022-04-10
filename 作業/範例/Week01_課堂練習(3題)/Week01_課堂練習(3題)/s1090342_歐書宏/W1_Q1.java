//題目說明:判斷是否為質數
// 資管二B 410903424 歐書宏
//Date:2022/2/23

import java.util.*;
public class W1_Q1 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=1;i<n;i++) {
			if(n%i==0) {
				System.out.println(n+"不是質數");
				break;
			}else {
				System.out.println(n+"是質數");
				break;
			}
		}
	}
}
