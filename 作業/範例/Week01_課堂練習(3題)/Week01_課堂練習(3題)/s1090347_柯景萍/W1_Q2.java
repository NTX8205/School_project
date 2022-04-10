//題目說明:將使用者輸入的正整進行質因數分解
//資管二A 410903474 柯景萍
//Date:2022/02/24
package test;
import java.util.Scanner;
public class W1_Q2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();	
		int m=2;		//質數最小的
		System.out.print(n+ "=" );	
		while(m<n) {			//用while迴圈
			if(n%m == 0) {			//除為0，m為因數
				System.out.print(m+"*");		//輸出m
				n=n/m;			//新的n再回去算
			}else {
				m++;		
			}
		}
		System.out.print(n);		//輸出最後的數字
	}
}