/*
題目:將使用者輸入的正整進行質因數分解
班級:資管二A 姓名:黃郁喬 學號:410903416
 */

import java.util.Scanner;
public class W1_Q2 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		int count=2;
		System.out.print(n+"=");
		
		while(n>count) {
			if(n%count==0) {
				System.out.print(count+"*");
				n/=count;
			}else {
				count++;
			}
		}
			System.out.println(count);
	}
}