//Q1: 判斷使用者輸入的正整數是否為質數
//資管二B 410921838 林佩萱
//Date:2022/02/28
import java.util.*;
public class W1_Q1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.printf("%d是質數",n);
		}else {
			System.out.printf("%d是不質數",n);
		}
	}
	
}
