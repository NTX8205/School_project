//Q2:前段和與後段和
//資管二A 410903539 王子豪 
package hw2222;
import java.util.*;
public class W4_Q2
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int n[] = new int[x];
		for(int i=0;i<x;i++)		
			n[i]=sc.nextInt();
		int a=0,count=0;
		for(int i=0;i<x;i++)
		{
			a+=n[i];
			int post=0;
			for(int j=x-1;j>=0;j--)
			{
				post+=n[j];
				if(a==post)
					count++;	
			}
		}
			System.out.print(count);			
	}
}
