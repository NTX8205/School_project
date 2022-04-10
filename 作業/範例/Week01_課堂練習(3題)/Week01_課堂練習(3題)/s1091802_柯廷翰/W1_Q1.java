package hr;
// 判斷使用者輸入的正整數是否為質數
// 資管二A 410918021 柯廷翰
// 2022/2/28
import java.util.*;
public class W1_Q1 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	
	System.out.printf("可整除%d的因數有", a);
	
	for(int i = 1; i < a; i++) {
		if(a % i == 0) {
			System.out.print(i + ",");
		}
	}
	System.out.print(a + "\n");
	
	for(int j = 2; j < a; j++) {
		if(a % j == 0) {
			System.out.print(a + "不是質數");
			break;
		}
		System.out.print(a + "是質數");
		break;
	}
}
}