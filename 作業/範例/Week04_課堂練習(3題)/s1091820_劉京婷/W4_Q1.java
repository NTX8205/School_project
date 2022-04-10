/*
 	日期:2022/03/16
 	題目:1.三號出局
	班級:資管二A
	學號:410918209
	姓名:劉京婷
 */
import java.util.*;
public class W4_Q1 
{
	public static void main(String args[]) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("請輸入一個整數");
		int n=sc.nextInt();
		int a[]=new int[n];
		int m=n;
		int count=1;
		
		for(int i=0;i<n;i++) 
		{
			a[i]=count;
			count++;
		}
		
		count=1;
		
		for(int i=0;i<n;i++) 
		{
			if(a[i]!=0) 
			{
				if(count==3) 
				{
					a[i]=0;
					count=1;
					m--;
				}
				else 
				{
					count++;
				}
			}
			if(m==1) 
			{
				for(int j=0;j<n;j++) 
				{
					if(a[j]!=0) 
					{
						m=a[j];
					}
				}
				break;
			}
			if(i==n-1) 
			{
				i=-1;
			}
		}
		
		System.out.println(m);
	}
}
