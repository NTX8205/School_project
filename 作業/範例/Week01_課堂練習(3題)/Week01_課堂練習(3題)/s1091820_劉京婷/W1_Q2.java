/*
  	日期:2022/02/23
 	題目:2.將使用者輸入的正整數進行質因數分解
	班級:資管二A
	學號:410918209
	姓名:劉京婷
 */

import java.util.*;
public class W1_Q2 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.print(n+"=");
		for(int i=2;i<=n;i++) {
			while(i<n) {
				if(n%i==0) {
					System.out.print(i+"*");
					n=n/i;
				}
				else {
					break;
				}
			}
		}
		System.out.print(n);
	}
}
