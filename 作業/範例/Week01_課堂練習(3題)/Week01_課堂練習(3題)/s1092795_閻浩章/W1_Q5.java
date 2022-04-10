//
//Q5: 計算三個正整數的最大公因數&最小公倍數
//
//資管二B 410927957 閻浩章
//Date:2022/02/23
import java.util.Scanner;
public class W1_Q5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		int i = 2;
		int gcd = 1;
		int lcm = 1;
		int a = x;
		int b = y;
		int c = z;
		while(x!=1 || y!=1 || z!=1) {
			if(x%i==0 && y%i==0 && z%i==0) {
				gcd*=i;
				lcm*=i;
				x/=i;
				y/=i;
				z/=i;
			}else if(x%i==0 && y%i==0) {
				lcm*=i;
				x/=i;
				y/=i;
			}else if(y%i==0 && z%i==0) {
				lcm*=i;
				y/=i;
				z/=i;
			}else if(x%i==0 && z%i==0) {
				lcm*=i;
				x/=i;
				z/=i;
			}else if(x%i==0) {
				lcm*=i;
				x/=i;
			}else if(y%i==0) {
				lcm*=i;
				y/=i;
			}else if(z%i==0){
				lcm*=i;
				z/=i;
			}else {
				i++;
			}
		}
		System.out.println(a+"與"+b+"與"+c+"的最大公因數為"+gcd);
		System.out.println(a+"與"+b+"與"+c+"的最小公倍數為"+lcm);
	}
	
}
