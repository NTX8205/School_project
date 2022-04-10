//三號出局
//資管二A 410917774 紀若彤
//2022.03.19
import java.util.*;

public class W4_Q1
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int people[]=new int[n];
		int remain=n;//還存活著
		int count=0;//報數
		while(remain>1)
		{
			for(int i=0; i<n; i++)
			{
				if(people[i] != -1)//-1表示為出局
					{
					count++;
					if(count == 3)
					{
						count=0;
					    remain--;
						people[i]=-1;
						}
					}
				}
			}
			for(int i=0; i<n; i++)
			{
				if(people[i] != -1)
				{
					System.out.println("留下來的是:"+(i+1));
				}
			}
			
		}

	}



