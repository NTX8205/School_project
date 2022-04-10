//Q4: 璸衡ㄢタ俱计程そ计&程そ计
//痁:戈恨B
//厩腹:410918233
//﹎:グ稻
import java.util.Scanner;
public class W1_Q4N
 {
	public static void main(String[] args) 
    {
		Scanner sc = new Scanner(System.in);
        //ㄏノ块ㄢタ俱计
        System.out.println("叫块ㄢタ俱计");
		int n = sc.nextInt();
		int m = sc.nextInt();
		int i = 2;
		int gcd = 1;
		int lcm = 1;
		int a = n;
		int b = m;
		while(n!=1 || m!=1) 
        {
			if(n%i==0 && m%i==0) 
            {
				gcd*=i;
				lcm*=i;
				n/=i;
				m/=i;
			 }
             else if(n%i==0) 
             {
				lcm*=i;
				n/=i;
			 }
             else if(m%i==0)
             {
				lcm*=i;
				m/=i;
			}
            else {
				i++;
			}
		}
		System.out.println(a+"籔"+b+"程そ计"+gcd);
		System.out.println(a+"籔"+b+"程そ计"+lcm);
	}
	
}
