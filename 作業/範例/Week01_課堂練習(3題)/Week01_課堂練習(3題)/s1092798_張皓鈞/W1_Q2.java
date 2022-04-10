//
//Q2: 將使用者輸入的正整進行質因數分解
//班級:資管二A/學號:410927981/姓名:張皓鈞
//
import java.util.*;
public class W1_Q2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.print(a+"=");
		for(int i=2;i<=a;i++) {
			while(a!=i) {
				if(a%i==0) {
					System.out.print(i+"*");
					a=a/i;
				}else {
					break;
				}
			}
		}
		System.out.print(a);
	}
}
