/*班級:資管二B
學號:410917889
姓名:張益嘉
Q1: 三號出局*/
import java.util.*;
public class W4_Q1 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("輸入你要幾個人為一圈");
		int n=sc.nextInt();
		int peo[]=new int[n];
		int remain=n;
		int count=0;
		
		System.out.println("從第一個人開始1~3報數，凡報到3的人出局");
		while(remain>1)
		{
			for(int i=0;i<n;i++)
			{
				if(peo[i]!=-1)
				{
					count++;
					if(count==3)
					{
						count=0;
						remain--;
						peo[i]=-1;
					}
				}
			}
		}
		for(int i=0;i<n;i++)
		{
			if(peo[i]!=-1)
			{
				System.out.println("最後留下的是第"+(i+1)+"號");
			}
		}
	}
}
