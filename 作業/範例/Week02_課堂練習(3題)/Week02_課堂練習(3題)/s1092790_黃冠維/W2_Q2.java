//資管二A 410927907 黃冠維
//使用者輸入一個正整數n, 找出與n最接近的質數
//Date: 2022/3/5

import java.util.Scanner;

public class W2_Q2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int p = 0; //n值向上最近的質數
		int q = 0;//n值向下最近的質數
		
		for(int i = n+1 ; i < 10000 ; i++) {//計算p值,i設定為找尋小於10000的質數
			int count = 0;
			
			for(int j = 2 ; j < i ; j++) {//找質數
				if(i % j == 0)
					count++;
				if(count == 0 && j == i-1) {
					p = i;
					break;
				}
			}
			
			if(p == i) //找到最近的質數就break
				break;
		}
		
		for(int i = n-1 ; i > 1 ; i--) {//計算q值,質數從2開始所以i設定為大於1
			int count = 0;
			
			for(int j = 2 ; j < i ; j++) {
				if(i % j == 0)
					count++;
				if(count == 0 && j == i-1) {
					q = i;
					break;
				}
			}
			
			if(q == i)
				break;
		}
		
		if(p-n > n-q) {
			System.out.print("最接近"+n+"的質數: " + q);
		} 
		else if(p-n < n-q) {
			System.out.print("最接近"+n+"的質數: " + p);
		} 
		else {
			System.out.print("最接近"+n+"的質數: " + q + " " + p);
		}
		
		
	}
}
