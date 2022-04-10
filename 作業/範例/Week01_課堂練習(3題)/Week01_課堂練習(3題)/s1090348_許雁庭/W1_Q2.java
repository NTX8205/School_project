//資管二B-410903482-許雁庭
//Q2：將使用者輸入的正整數進行質因數分解

import java.util.*;
public class Q2 {
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();//宣告一個正整數
		int k = 2;//定義一個最小的質因數
		
		System.out.print(n+"=");
		
		while(k <= n) {//進行循環判斷
			if(n == k) {//如果此正整數等於最小質因數
				System.out.println(n);//輸出本身
				break;
			}else if(n%k == 0){//如果n>k，n能被k整除
				System.out.print(k+"*");//打印出k的值
				n=n/k;//n除以k的商,作為新的正整數n,重復執行第一步
			}else {//如果n不能被k整除
				k++;//k+1作為k的值,重復執行第一步
			}
		}
	}

}
