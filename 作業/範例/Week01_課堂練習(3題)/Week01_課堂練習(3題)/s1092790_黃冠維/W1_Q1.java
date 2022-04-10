//判斷是否為質數
//資管二A 410927907 黃冠維
//Date:2022/2/23

import java.util.Scanner;
public class W1_Q1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		int k = sc.nextInt();
		
		for(int i = 1 ; i<k ; i++) {
			if(k%i == 0) {
				count++;
			}
		}
		
		if(count == 1) {
			System.out.println(k+"是質數");
		}
		else {
			System.out.println(k+"不是質數");
		}
	}
	
}
