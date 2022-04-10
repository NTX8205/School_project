//Q5: 璸衡タ俱计程そ计&程そ计
//痁:戈恨B
//厩腹:410918233
//﹎:グ稻
import java.util.Scanner;
public class W1_Q5N
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		//ㄏノ块タ俱计
        System.out.println("叫块タ俱计");
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
			if(x%i==0 && y%i==0 && z%i==0) 
			{
				gcd*=i;
				lcm*=i;
				x/=i;
				y/=i;
				z/=i;
			}
			else if(x%i==0 && y%i==0) 
			{
				lcm*=i;
				x/=i;
				y/=i;
			}
			else if(y%i==0 && z%i==0) 
			{
				lcm*=i;
				y/=i;
				z/=i;
			}
			else if(x%i==0 && z%i==0) 
			{
				lcm*=i;
				x/=i;
				z/=i;
			}else if(x%i==0) {
				lcm*=i;
				x/=i;
			}
			else if(y%i==0) 
			{
				lcm*=i;
				y/=i;
			}
			else if(z%i==0)
			{
				lcm*=i;
				z/=i;
			}
			else 
			{
				i++;
			}
		}
		System.out.println(a+"籔"+b+"籔"+c+"程そ计"+gcd);
		System.out.println(a+"籔"+b+"籔"+c+"程そ计"+lcm);
	}
}
