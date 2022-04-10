package 資料結構0302程式練習;
//資管二B 411092809 吳珮綾
import java.util.Scanner;
public class W2_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		isPrime iP = new isPrime();
		int n = sc.nextInt(), small=0, large=0;
		for(int i=n-1; i<1; i--) {
			if(iP.isPrimeNumber(i)) {
				small=i;
				break;
			}
		}
		for(int i=n+1; ; i++) {
			if(iP.isPrimeNumber(i)) {
				large=i;
				break;
			}
		}
		if((large-n)>(n-small)) {
			System.out.printf("最接近%d的質數%d", n, small);
			
		}
		else if((large-n)<(n-small)) {
			System.out.printf("最接近%d的質數%d", n, large);
		}
		else {
			System.out.printf("最接近%d的質數%d %d", n, small, large);
	}

}
