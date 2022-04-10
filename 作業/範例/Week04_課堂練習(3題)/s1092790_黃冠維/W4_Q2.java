//Q2:前段和後段和
//資管二A 410927907 黃冠維
//Date:2022/3/18
import java.util.Scanner;
public class W4_Q2 
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		int x[] = new int[n];
		int xB[] = new int[n];
		int sum[] = new int[n];
		
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
		for(int i = n-1 ; i >= 0 ; i--) 
		{
			total += sum[i];
			xB[i] = total;
		}
		
		for(int i = 0 ; i < n ; i++) 
		{
			for(int j = 0 ; j < n ; j++) 
			{
				if(x[i] == xB[j]) 
				{
					count++;
				}
			}
		}
		
		System.out.print(count);
	}
}
