//判斷使用者輸入的數字後進行質因數分解
//資管二A 410921862 郭孟玥
//Date:2022/02/27

import java.util.Scanner;
public class W1_Q2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int k=2;
		System.out.print(n+"=");
  
		while (k<n){
			if(n%k==0) {
				System.out.print(k+"*");
				n=n/k;
			}
			else {
				k++;
			}
		}
		System.out.print(k);
	}
}