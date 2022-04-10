//痁:戈恨B
//厩腹:410918233
//﹎:グ稻
//Q3: 璸衡ㄢタ俱计程そ计&程そ计
import java.util.Scanner;
public class W1_Q3 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner (System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.printf("%d籔%d程そ计%d%n",a,b,GCD(a,b));
		System.out.printf("%d籔%d程そ计%d%n",a,b,a*b/GCD(a,b));
	}
	
	static int  GCD(int x,int y)
	{
		int tem;
		tem=x%y;
		if(tem==0) 
		{
			return y;
		}else {
			return GCD(y,tem);
		}
	}

}
