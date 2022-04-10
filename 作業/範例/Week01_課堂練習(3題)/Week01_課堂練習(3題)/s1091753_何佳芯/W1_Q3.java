import java.util.Scanner;

//璸衡ㄢタ俱计程そ计&程そ计
//戈恨B 410917538 ㄎ
//2022/02/23
public class W1_Q3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		
		System.out.println("程そ计="+GCD(m,n));
		System.out.println("程そ计="+LCM(m,n));

	}
	static int GCD(int m,int n) {
		int k;
		k=m%n;
		if(k == 0) {
			return n;
		}else {
			return GCD(n,k);
		}
	}
	static int LCM(int m,int n) {
		/*int k;
		k=m%n;
		if(k == 0) {
			return n;
		}else {
			return GCD(n,k);
		}*/
		return ( m/ GCD(m, n)) * n;
	}

}
