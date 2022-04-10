//Q2: 最接近質數問題
//班級 資管2A 學號 410918186 姓名 吳仲彥
//2022/3/6
import java.util.*;
public class W2_Q2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), small=0, large=0;
		for(int i = n-1; i>1; i--) 
		{
			boolean c = false;
			for(int j=2; j<=i; j++)
			{
				if(i==j)
				{
					small = i;
					c = true;
				}
				else if(i%j==0)
				{
					break;
				}
			}
			if (c) 
			{
				break;
			}
		}
		for(int i = n+1; i>n; i++) 
		{
			boolean c = false;
			for(int j=2; j<=i; j++)
			{
				if(i==j)
				{
					large = i;
					c = true;
				}
				else if(i%j==0)
				{
					break;
				}
			}
			if (c) 
			{
				break;
			}
		}
		if((large-n) > (n-small)) 
		{
			System.out.printf("最接近%d的質數:%d",n , small);
		}
		else if((large-n) < (n-small)) 
		{
			System.out.printf("最接近%d的質數:%d",n , large);
		}
		else 
		{
			System.out.printf("最接近%d的質數:%d %d",n , small, large);
		}
	}
}
