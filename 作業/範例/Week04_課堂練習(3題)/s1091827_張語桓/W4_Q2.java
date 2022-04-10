//題目說明：前段和與後段和
//資管二B 410918275 張語桓

import java.util.*;
public class W4_Q2
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		int n = sc.nextInt();
		int count = 0;
		int arr [] = new int[n];
		
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		int a = arr[0];
		list.add(a);
		for(int i=1;i<n;i++)
		{
			a+=arr[i];
			list.add(a);
		}
		a = arr[n-1];
		for(int i=n-2;i>=0;i--)
		{
			if(list.contains(a))
			count++;
			a+=arr[i];
		}
		if(list.contains(a))
		{
		  count++;
		  System.out.print(count);
		}

	}
}
