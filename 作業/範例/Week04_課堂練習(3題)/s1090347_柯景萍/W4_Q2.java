//題目說明:前段和與後段和
//資管二A 410903474 柯景萍
//Date:2022/03/22
package test;
import java.util.*;
public class W4_Q2 
{
	public static void main(String[] args) 
	{
		System.out.println("輸入一個整數n，再輸入n個整數給 x[0]、x[1]...到x[n-1]");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[]aa = new int [n];		
		
		for(int i=0;i<n;i++)
		{
       		aa[i]=sc.nextInt();
		}
		
		int sum=0;
		int all=0;
		
		for(int i=0;i<n;i++) 
		{			
			sum+=aa[i];		
			int count=0;			
			for(int j=n-1;j>=0;j--) 
			{				
				count+=aa[j];				
				if(sum==count) 
				{	
					all++;
				}
			}			
		}
		System.out.print(all);
	}
}