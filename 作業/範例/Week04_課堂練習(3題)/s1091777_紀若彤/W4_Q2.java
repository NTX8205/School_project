//前段和與後段和
//資管二A 410917774 紀若彤
//2022.03.19
import java.util.*;
public class W4_Q2 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		
		for(int i=0; i<n; i++)
			a[i]=sc.nextInt();
			
		int pre=0;//前段和初始值
		int count=0;//用來數有多少個前段和,後段和
			
		for(int i=0; i<n; i++)
		{
			pre+=a[i];//從第0個索引值加進來
			
			int post=0;//後段和初始值，每一次加進來都要歸零
			for(int j=n-1;j>=0;j--)//從後面加回來
			{
				post+=a[j];
				if(pre==post)
					count++;
				}
		}
		System.out.println(count);
		}
	}

