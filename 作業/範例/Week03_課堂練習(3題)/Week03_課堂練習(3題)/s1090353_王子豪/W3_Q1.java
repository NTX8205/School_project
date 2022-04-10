//Q1: 排序次序
//班級:資管2A 學號:410903539 姓名:王子豪
//2022/3/15
package hw2222;
import java.util.*;
public class W3_Q1
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
			int x = sc.nextInt();
			int a [] = new int[x];
			int b [] = new int[x];
			for(int i=0;i<x;i++)
			{
				a[i]= (int)(Math.random()*100)+1;
				b[i] = a[i];
				System.out.printf("%4d",a[i]);
			}
			
			Arrays.sort(b);
			System.out.println();
			
			for(int i=0;i<x;i++)
			{
				for(int j=0;j<x;j++)
				{
					if(a[i] == b[j])
					{
						System.out.printf("%4d",j+1);					
					}
				}
			}
	}
}