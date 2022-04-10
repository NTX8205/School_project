/*
 	ら戳:2022/03/09
 	肈ヘ:Q3:璸衡3タ俱计程そ计&程そ计(ノ皚)
	痁:戈恨A
	厩腹:410918209
	﹎:糂ㄊ碄
 */
import java.util.Scanner;
public class W3_Q3
{
	public static void main(String args[]) 
	{
		Scanner sc=new Scanner(System.in);
		int sum=0,x=sc.nextInt();
		int y=sc.nextInt();
		int z=sc.nextInt();
		int a[]=new int [10];
		int b[]=new int [10];
		int c[]=new int [10];
		
		for(int i=2;i<=x;i++) 
		{
			while(i<=x) 
			{
				if(x%i==0)
				{
					a[++sum]=i;
					x=x/i;
				}
				System.out.print(a[sum]+" ");
			}
		}
		System.out.println(sum);
		sum=0;
		for(int i=2;i<=y;i++) 
		{
			while(i<=y)
			{
				if(y%i==0) 
				{
					b[++sum]=i;
					y=y/i;	
				}
				System.out.print(b[sum]+" ");
			}
		}
		
		System.out.println(sum);
		sum=0;
		for(int i=2;i<=z;i++) 
		{
			while(i<=z)
			{
				if(z%i==0) 
				{
					c[++sum]=i;
					z=z/i;	
				}
				System.out.print(c[sum]+" ");
			}
		}
		
		System.out.println(sum);
		
		int gcd=1,lcm=1;
		for(int i=0,j=0,k=0;i<a.length;i++) 
		{
			for(int l=j;l<b.length;l++) 
			{
				for(int m=k;m<c.length;m++) 
				{
					if(a[i]==b[l]&& a[i]==c[m] && b[l]==c[m]) 
					{
				    j=l+1;
				    k=m+1;
					gcd*=a[i];
					b[l]=1;
					c[m]=1;
					//break;
					//System.out.print(gcd);
					}
				}
				
			}
			
		}
		System.out.print(gcd);
		System.out.printf("%d籔%d程そ计%d%n",x,y,gcd);
		System.out.printf("%d籔%d程そ计%d%n",x,y);
	}
}