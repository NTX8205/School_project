//Q3:璸衡ㄢタ俱计程そ计&程そ计
//痁:戈恨2A 厩腹:410918186 ﹎:ヲ
//ら戳:2022/2/23
import java.util.*;
public class W1_Q3 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("程そ计:" + GCD(a, b));
		System.out.print("程そ计:" + LCM(a, b));
	}
	public static int GCD(int a, int b) 
	{
		int temp;
		while(a % b !=0) 
		{
			temp = a % b;
			a = b;
			b = temp;
		}
		return b;
	}
	public static int LCM(int a, int b) 
	{
		return a*b/GCD(a, b);
	}
}

