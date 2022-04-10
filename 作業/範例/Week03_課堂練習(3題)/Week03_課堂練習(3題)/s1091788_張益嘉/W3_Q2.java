/*班級:資管二B
學號:410917889
姓名:張益嘉
Q2:: 計算2個正整數的最大公因數&最小公倍數*/
package W3;
import java.util.*;
public class W3_Q2 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("請輸入兩個正整數");
	
		int x=sc.nextInt();
		System.out.print(x+"=");

		int i=2;
		while(i<x) 
		{
			/*int a[]=new int[100];
			for(int j=0;j<x;j++)
			{*/
				if(x%i==0) 
				{
					System.out.print(i+"*");
					x=x/i;
					/*a[j]+=i;
					System.out.println(a[j]);*/
				}
				else 
				{
					i++;
				}
					
		}
		System.out.print(x);
		
	}

}
