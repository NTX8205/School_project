//題目說明:排序次序
//資管二A 410903474 柯景萍
//Date:2022/03/15
package test;
import java.util.*;
public class W3_Q1 {
	public static void main(String[] args) {
		System.out.println("請輸入n個數字會隨機產生n個亂碼");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		if(n<=10){
			for(int i=1;i<=n;i++) {
				int k = (int)(Math.random()*100+1);
				System.out.print(k+" ");
			}
		}else {
			System.out.println("請輸入小於10的數字");
		}
		
		String str=new Scanner(System.in).nextLine();
		ArrayList<Number> list=new ArrayList<>();
		String[] srr=str.split(" ");
		
		System.out.println(" ");
		System.out.println("這n個整數在排序後的索引次序為%d %d %d %d");
	}
}
