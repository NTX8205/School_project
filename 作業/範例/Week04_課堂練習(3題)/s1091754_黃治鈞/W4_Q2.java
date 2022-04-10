
//資管二A 410917546 黃治鈞
//Date:2022/3/22
import java.util.*;
public class W4_Q2
{
	public static void main(String []args) 
	{
		Scanner sc=new Scanner(System.in);
		int n =sc.nextInt();
		int A[] = new int[n];
		int B[] = new int[n];
		int sum[] = new int[n];
		
		int total = 0;
		int count = 0;
		for(int i =0 ; i<n ; i++)
		{
			sum[i] = sc.nextInt();
		}
		for(int i = 0 ; i<n ; i++)
		{
			total+=sum[i];
			A[i] = total;
		}
		total = 0;
		for(int i = n-1 ; i>=0 ; i--)
		{
			total+=sum[i];
			B[i] = total;
		}
		for(int i = 0 ; i<n ; i++) 
		{
			for(int j = 0 ; j<n ; j++)
			{
				if(A[i]==B[j])
				{
					count++;
				}
			}
		}
		System.out.println(count);
	}
}
		