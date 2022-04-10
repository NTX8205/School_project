//判斷使用者輸入的正整數是否為質數
//410654114 資工5B李明熹
//2022/2/23

import java.util.Scanner;

public class W1_Q1 {

	public static void main(String[] args) {
		Scanner sca=new Scanner(System.in);
		int input=sca.nextInt();
		factor(input);
		Prime(input);

	}
	
	public static void Prime(int input) {
		if(input==1) {
			System.out.print("錯誤");
		}
		for(int i=2;i<input;i++) {
			if(input%i==0) {
				System.out.print(input+"不是質數");
				break;
			}else {
				System.out.print(input+"是質數");
				break;
			}
		}
	}
	
	public static void factor(int input) {
		System.out.print("可整除"+input+"的因數有");
		for(int i=1;i<=input;i++) {
			if(input%i==0) {
				System.out.print(i+",");
			}
		}
		System.out.print("\n");
	}

}