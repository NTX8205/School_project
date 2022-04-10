/*
題目:判斷使用者輸入的正整數是否為質數
班級:資管二A 姓名:黃郁喬 學號:410903416
 */

import java.util.Scanner;
public class W1_Q1 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		int count=0;
		
		for(int i=1; i<=n; i++) {
			if(n%i==0) {
				count++;
			}
		}
			if(count>2) {
				System.out.println(n+"不是質數");
			}else{
				System.out.println(n+"是質數");
			}
	}
}
