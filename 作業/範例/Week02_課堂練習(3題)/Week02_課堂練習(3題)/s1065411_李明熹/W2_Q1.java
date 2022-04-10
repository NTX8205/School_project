//[p,q]區間質數問題
//410654114 資工5B李明熹
//2022/3/5
import java.util.Scanner;

public class W2_Q1 {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);

		int num1 = sca.nextInt();
		int num2 = sca.nextInt();
		
		int count=0;

		for (int i = num1+1; i <= num2; i++) {

			boolean flag = true;

			for (int j = 2; j <= Math.sqrt(i); j++) {

				if (i % j == 0) {
					flag = false;
					break;
				}
			}

			if (flag) {
				count++;
				System.out.print(i + " ");
				
			}
		}
		System.out.println();
		System.out.print("質數個數:"+count);
	}

}
