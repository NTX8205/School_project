//Q2:前段和與後段和
//資管二B/410918178/葉思妤

import java.util.*;

public class W4_Q2 
{
	public static void fill(int front[],int back[],int x[],int n)
	{
		front[0] = x[0];
		
		for(int i = 1 ; i < n ; ++i)
		{
			front[i] = front[i-1] + x[i];
		}
		
		back[n-1] = x[n-1];
		
		for(int j = n-2 ; j >= 0 ; j--)
		{
			back[j]= back[j+1] + x[j];
		}
		
		Arrays.sort(back);
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] x = new int[n];
		int[] front = new int[n];
		int[] back = new int[n];
		
		for(int i = 0 ; i < n ;i++) 
		{
			x[i] = sc.nextInt();
		}

		fill(front, back, x, n);

		Set<Integer> s1 = new HashSet<Integer>();
		Set<Integer> s2 = new HashSet<Integer>();
		
		for(int i = 0 ; i < n ; i++)
		{
			s1.add(front[i]);
			s2.add(back[i]);
		}
		s1.retainAll(s2);
		
		System.out.println(s1.size());
	}
}
