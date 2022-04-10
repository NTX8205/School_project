//題目說明:Q1: 排序次序
//班級:資管二B
//學號:410918233
//姓名:邵弘翔

import java.util.Arrays;
import java.util.Scanner;
public class W3_Q1 
{
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("請輸入一個正整數n, 其中 n<=10");
		int n=sc.nextInt();
		
		if(n<=0 || n>10) 
		{
			System.out.println("你輸入錯了");	
		}
		else 
		{
			int a []= new int [n];
			int b []= new int [n];
			for(int i=0;i<n;i++) 
			{
				a[i]=(int)(Math.random()*100)+1;
				System.out.print(a[i]+" ");
				b[i]=a[i];
			}
			System.out.println();
			Arrays.sort(b);
			
			for(int i=0;i<n;i++) 
			{
				for(int k=0;k<n;k++) 
				{
					if(b[i]==a[k]) 
					{
						a[k]=i+1;
						break;
					}
				}
			}
			
			for(int i=0;i<n;i++) 
			{
				System.out.print(a[i]+" ");
			}
		}
	}
}