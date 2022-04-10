//質因數分解 進階版
//410654114 資工5B李明熹
//2022/3/4
import java.util.Scanner;

public class W2_Q3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int count=0;
		System.out.print(num + "=");
		for (int k = 2; k <= num; k++) {
			while (num != k) {
				if (num % k == 0) {
					count++;
					num /= k;
				} else {
					if(count>1) {
						System.out.print(k + "^"+count);
					}else if(count==1) {
						System.out.print(k);
					}else if(count==0) {
						k++;
						continue;
					}
					count=0;
					if(num==1) {
						break;
					}else {
						System.out.print("*");
					}
				}
			}
			System.out.print(k+ "^"+count);

		}
		
	}

}
