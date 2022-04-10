import java.util.Scanner;
//資管二B 410917978 陳宛莛
//最接進質數問題
public class W2_Q2 {
	public static void main(String [] args) {
		Scanner sc = new Scanner (System.in);
		W2_Q2 iP = new W2_Q2();
		
		int n  = sc.nextInt(), small = 0,large=0;
		for(int i =n-1; i>1; i--) {
			if(iP.isPrimeNumber(i)) {
				small=i;
				break;
			}
		}
		
		for(int i=n+1 ; ;i++) {
			if(iP.isPrimeNumber(i)) {
				large=i;
				break;
			}
		}
		if((large-n) > (n-small)) {
			System.out.printf("最接近%d的質數%d",n ,small);
		}
		else if((large-n)< (n-small)) {
			System.out.printf("最接近%d的質數%d",n ,large);
		}
		else {
			System.out.printf("最接近%d的質數%d %d",n ,small ,large);
		}
	}

	private boolean isPrimeNumber(int i) {
				return false;
	}
}
