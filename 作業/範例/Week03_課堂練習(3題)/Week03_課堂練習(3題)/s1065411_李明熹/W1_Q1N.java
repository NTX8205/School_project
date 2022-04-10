//判斷使用者輸入的正整數是否為質數
//410654114 資工4B李明熹
//2022/3/15
import java.util.Scanner;

public class W1_Q1N {
	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);

		int num1 = sca.nextInt();	

		int count=0;

			for (int j = 1; j <= num1; j++) {

				if (num1 % j == 0) {
					count++;
				}
			}

			if (count==1) {
				System.out.print(num1+"是質數");
				
			}else{
				System.out.print(num1+"不是質數");
			}
		
	}

}
