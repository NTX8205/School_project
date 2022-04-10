//Q1: 排序次序
//班級 資管2A 學號 410918186 姓名 吳仲彥
//2022/3/14
import java.util.*;

public class W3_Q1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a [] = new int [n];
		int cnt [] = new int [n];
		for(int i = 0; i<n; i++) 
		{
			a [i]= (int)(Math.random()*100)+1; 
			cnt [i]= a [i];
			System.out.printf("%4d",a[i]);
			
		}
		
		Arrays.sort(cnt);//10 46 55 60 90 
		System.out.println();

		for(int i = 0; i<n; i++)
		{
			for(int j=0; j<n; j++) 
			{
				if(a[i] == cnt[j])
				{
					
					System.out.printf("%4d",j+1);
					break;
				}
			}
		}
 	}
}
