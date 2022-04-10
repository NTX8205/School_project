/*
班級:資管二B
學號:410917889
姓名:張益嘉
Q2: 將使用者輸入的正整進行質因數分解
 */
package main;
import java.util.*;
public class W1_Q2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.print(n+"=");

		int i=2;
		while(i<n) {
			if(n%i==0) {
				System.out.print(i+"*");
				n=n/i;
			}else {
				i++;
			}
		}
		System.out.print(n);
	}
}
