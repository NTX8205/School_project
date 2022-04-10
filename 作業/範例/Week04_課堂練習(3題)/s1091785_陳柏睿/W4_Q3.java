import java.util.Scanner;
public class W4_Q3 
{
	public static void main(String[] args) 
	{
		Scanner io=new Scanner(System.in);
		System.out.println("請輸入欲求的算式:");
		char a[]=io.next().toCharArray();
		int aa[]=new int[a.length];
		int b=0,sum=0;
		for(int i=0;i<a.length;i++) 
		{
			if(a[i]=='(') 
			{
				aa[b]+=i;
				b++;
			}
			if(a[i]==')') 
			{
				b--;
				if(b<0)break;
				a[i]='x';
				System.out.println(aa[b]+","+i);
				aa[b]=0;
			}
			
		}
		for(int i=0;i<a.length;i++) 
		{
			if(a[i]==')'&&isempty(aa)==0) 
			{
				System.out.println("-1,"+i);
				continue;
			}
			else if(isempty(aa)!=0&&a[i]!=')'&&i==a.length-1) 
			{
				for(int h=0;h<a.length;h++)
				{
					if(aa[h]>0) 
					{ 
						System.out.println(aa[h]+",-1");
					}
				}
				break;
			}
			else if(isempty(aa)==0&&i==a.length-1) 
			{
				for(int h=0;h<aa.length;h++) 
				{
					if(a[h]==')') 
					{ 
						System.out.println("-1"+a[h]);
					}
				}
			}		
		}
	}
	static int  isempty(int a[])
	{
		int sum=0;
		for(int i=0;i<a.length;i++) 
		{
			if(a[i]>0) 
			{
				sum++;
			}
		}
		if(sum>1) 
		{
			return sum;
		}else
			return sum;
	}

}

