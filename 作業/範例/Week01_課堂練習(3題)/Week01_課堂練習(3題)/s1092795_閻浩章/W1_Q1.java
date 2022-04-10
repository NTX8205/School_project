//
//Q1: 判斷使用者輸入的正整數是否為質數
//
//資管二B 410927957 閻浩章
//Date:2022/02/23
import java.util.ArrayList;
import java.util.Scanner;
public class W1_Q1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int  n = sc.nextInt();
		ArrayList a = new ArrayList();
		for(int i=1;i<=n;i++) {
			int x = n%i;
			if(x==0) {
				a.add(x);
			}
		}
		if(a.size()>2) {
			System.out.println(n+"不是質數");
		}else {
			System.out.println(n+"是質數");
		}
	}

}
