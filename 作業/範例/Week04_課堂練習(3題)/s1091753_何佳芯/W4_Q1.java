/*三號出局
資管二B 410917538 何佳芯
2022/03/21
*/
import java.util.*;
public class W4_Q1
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("請輸入一個正整數!!");
		int n=sc.nextInt();
		int[] list=new int [n];
		int count=0;
		int m = n;
		
		while(n>1)
		{
			for(int i=0;i<m;i++)
			{
				if(list[i] !=-1)
				{
					count++;
					
					if(count == 3)
					{
						count=0;
						n--;
						list[i]=-1;
					}
				}
			}
		}
		
		for(int i=0;i<list.length;i++)
		{
			if(list[i] !=-1)
			{
				System.out.println(i+1);
			}
		}
	}
}