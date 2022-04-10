import java.util.*;
public class W2_Q2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		W2_Q1 ip=new W2_Q1();
		int n = sc.nextInt();
		int small = 0;
		int large = 0;
		for(int i=n-1;i>1;i--) {
			if(ip.isPrimeNumber(i)) {
				small=i;
				break;
			}
		}
		for(int i=n+1; ;i++) {
			if(ip.isPrimeNumber(i)) {
				large=i;
				break;
			}
		}
		if((large-n) > (n-small)) {
			System.out.printf("程钡%d借计%d",n,small);
		}
		else if ((large-n) < (n-small)) {
			System.out.printf("程钡 %d 借计 : %d", n ,large);
		}
		else {
			System.out.printf("程钡 %d 借计 : %d %d" , n ,small,large);
		}

	}

}
