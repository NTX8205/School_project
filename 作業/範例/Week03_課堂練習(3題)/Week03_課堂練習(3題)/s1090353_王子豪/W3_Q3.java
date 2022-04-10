//Q3:璸衡3タ俱计程そ计&程そ计
//痁:戈恨2A 厩腹:410903539 ﹎:花
//2022/3/15
package hw2222;
import java.util.*;
public class W3_Q3
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();		
        	int d=2;
        	int lcm=1;
        	int gcd=1;
       	 int A=a;
       	 int B=b;
       	 int C=c;
       	 while(A>=d && B>=d && C>=d) 
        	{
        		if(A%d==0 && B%d==0 && C%d==0)
        		{
        			gcd=d;
        			lcm=d;
        			A/=d;
        			B/=d;
        			C/=d;
        		}
        		else if(A%d==0 && B%d==0)
        		{
        			lcm=d;
        			A/=d;
        			B/=d;
        		}
        	else if(A%d==0 && C%d==0)
        	{
        		lcm=d;
        		A/=d;
        		C/=d;
        	}
        	else if(B%d==0 && C%d==0)
        	{
        		lcm=d;
        		B/=d;
        		C/=d;
        	}
        	else
        	{
        		d++;
        	}
        }
        lcm=lcm*A*B*C;
        System.out.printf("%d籔%d籔%d程そ计%d%n",a,b,c,gcd);
        System.out.printf("%d籔%d籔%d程そ计%d",a,b,c,lcm);
	}
}