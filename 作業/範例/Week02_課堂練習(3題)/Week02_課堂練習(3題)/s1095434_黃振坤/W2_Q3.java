//資管二A 410954344 黃振坤
//質因數分解進階版
//Date:2022/3/5
import java.util.Scanner;

public class W2_Q3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		System.out.print("n = ");
		int i = 2;
		while(n != 1) {
			int count = 0;
			while(n % i == 0) {
				count++;
				n/=i;
			}

			
			if(count > 1) {
				System.out.print(i+"^"+count);
				if(n != 1) {
					System.out.print("*");
				}
			}
			if(count == 1) {
				System.out.print(i);
				if(n != 1) {
					System.out.print("*");
				}
			}
			i++;

		}
	}
}
