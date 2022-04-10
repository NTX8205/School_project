//410917871 資管2A 莊濬瑋
//質因數分解進階版



import java.util.Scanner;

public class Main {
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