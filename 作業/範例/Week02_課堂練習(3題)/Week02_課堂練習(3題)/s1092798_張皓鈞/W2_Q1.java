//
//Q1: [p,q]區間質數問題
//班級:資管二A/學號:410927981/姓名:張皓鈞
//
import java.util.*;
public class W2_Q1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("請輸入兩個正整數:");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int x = Math.max(a, b);
		int y = Math.min(a, b);
		int count = 0;
		int sum = 0;
		
		for(int i=y;i<=x;i++){
			count=0;
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
					count++;
				}
			}
			if(count==2) {
				System.out.print(i+" ");
				sum++;
			}
		}
		System.out.printf("%n質數個數:%d",sum);
	}
}
