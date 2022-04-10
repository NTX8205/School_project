package a;
import java.util.*;
public class W4_Q2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] x = new int[n];
		int[] xb = new int[n];
		int[] sum = new int[n];
		
		int total = 0;
		int count = 0;
		
		for(int i = 0 ; i < n ; i++) 
		{
			sum[i] = sc.nextInt();
		}
		
		for(int i = 0 ; i < n ; i++) 
		{
			total += sum[i];
			x[i] = total;
		}
		
		total = 0;
		for(int i = n - 1 ; i >= 0 ; i--) 
		{
			total += sum[i];
			xb[i] = total;
		}
		
		for(int i = 0 ; i < n ; i++) 
		{
			for(int j = 0 ; j < n ; j++) 
			{
				if(x[i] == xb[j]) 
				{
					count++;
				}
			}
		}
		
		System.out.print(count);
	}
}
