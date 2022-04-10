import java.util.*;
public class W4_Q1 
{
	public static void main(String[] args) 
	{//資管二A 410917855 陳柏睿
	// 三號出局
		Scanner io=new Scanner (System.in);
		System.out.println("請樹入獄測試的值(不為0的正整數):");
		int a=io.nextInt();
		int arr[]=new int [a+1];
		int i=1,sum=0,count=1;
		while(true) 
		{
			if(i==arr.length) 
				{
					i=1;
				}
			if(count%3==0) 
			{
				if(arr[i]==-1) 
					{
						i++;
						continue;
					}
				arr[i]=-1;
				sum+=arr[i];
				count=1;
			}
			else 
			{
				if(arr[i]==-1) 
				{
					i++;
					continue;
				}
				i++;
				count++;
				continue;
			}
			if(sum==-1*(a-1)) 
			{
				break;
			}
				i++;
		}
		for(int l=1;l<arr.length;l++)
		{
			if(arr[l]==0) 
			{
				System.out.println("最後剩下的:"+l);
			}
		}
	}

}