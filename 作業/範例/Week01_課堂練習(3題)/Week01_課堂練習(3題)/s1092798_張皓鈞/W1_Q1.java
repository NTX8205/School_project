//
//Q1: 判斷使用者輸入的正整數是否為質數
//班級:資管二A/學號:410927981/姓名:張皓鈞
//
import java.util.*;
public class W1_Q1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int x = 0;
		for(int i=1;i<=a;i++) {
			if(a%i==0) {
				x++;
			}
		}
		if(x==2) {
			System.out.println(a+"是質數");
		}else {
			System.out.println(a+"不是質數");
		}
	}
}
