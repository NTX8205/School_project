import java.util.Scanner;
public class Q2 {
	public static void main (String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=2;i<=n;i++) {
			while(i!=n) {
				if(n%i==0) {
					System.out.print(i+"*");
					n/=i;
				}else{
					break;
				}
			}
		}
		System.out.print(n);
	}
}
