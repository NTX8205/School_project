import java.util.*;
// ㄢ计程そ计籔程そ计(癹伴秆猭)
public class W1_Q3_2 {
	public static int gcd(int m, int n) 
	{
		while(n != 0) 
		{
			int temp = n;
			n = m % n;
			m = temp;
		}
		return m;
	}
	
	public static int lcm(int m, int n) 
	{
		int n1, n2;
		if(m > n) {
			n1 = m;
			n2 = n;
		}else {
			n1 = n;
			n2 = m;
		}
		for(int i = 1; i < n2; i++) 
		{
			if((n1*i) % n2 == 0)
				return i*n1;
		}
		return n1*n2;
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		System.out.printf("%d㎝%d程そ计琌%d%n", m, n, gcd(m, n));
		System.out.printf("%d㎝%d程そ计琌%d%n", m, n, lcm(m, n));
	}
}
