//輸入的正整數質因數分解
//資管二A 410927907 黃冠維
//Date:2022/2/23

import java.util.Scanner;
public class W1_Q2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.print(num + " = ");
		
		for(int i = 2 ; i<=num ; i++) {
			while(num != i ) {
				if(num % i == 0) {
					System.out.print (i + "*");
					num /= i;
				}
				else {
					break;
				}
			}
		}
		System.out.print(num);
	}
	
}
