// タ俱计程そ计籔程そ计
import java.util.Scanner;

public class W1_Q4 
{
	public static void main(String arg[]) 
	{
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();	
		int y = sc.nextInt();	
		int z = sc.nextInt();	
		
		System.out.printf("%d%d㎝%d程そ计琌%d", x, y, z, gcd(z, gcd(x,y)));
		System.out.println();
		System.out.printf("%d%d㎝%d程そ计琌%d", x, y, z, lcm(z, lcm(x,y)));
	}
	
	public static int gcd(int m, int n) {
		while(n != 0) 
		{
			int temp = n;
			n = m % n;
			m = temp;
		}
		return m;
	}
	
	public static int lcm(int m, int n) {
		return m*n/gcd(m,n);
	}
	
}
