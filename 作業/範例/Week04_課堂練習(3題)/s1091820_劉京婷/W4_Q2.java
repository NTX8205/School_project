/*
 	日期:2022/03/16
 	題目:2.前段和與後段和
	班級:資管二A
	學號:410918209
	姓名:劉京婷
 */
import java.util.*;
public class W4_Q2 
{
	public static void main(String args[]) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("請輸入一個陣列的大小");
		
		int n=sc.nextInt();
		System.out.printf("請輸入%d個整數%n",n);
		
		int arr[]=new int [n];
		int a[]=new int [n];
		int b[]=new int[n];
		int sum=0,count=0,cnt=0;
		
		for(int i=0;i<n;i++) 
		{
			arr[i]=sc.nextInt();
			sum+=arr[i];
			a[i]=sum;
		}

		for(int j=n-1;j>=0;j--) 
		{	
			count+=arr[j];
			b[j]=count;
		}
		
		for(int i=0;i<n;i++) 
		{
			for(int j=0;j<n;j++) 
			{
				if(a[i]==b[j]) 
				{
					cnt++;
				}
			}
		}
		
		System.out.printf("共有%d組和相同",cnt);
	}
}
