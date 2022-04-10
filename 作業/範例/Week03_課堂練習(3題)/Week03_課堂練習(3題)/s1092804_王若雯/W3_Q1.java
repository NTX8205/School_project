import java.util.*;
public class W3_Q1 
{
	public static void main(String args[]) 
	{
		Scanner sc = new Scanner (System.in);
		int n =sc.nextInt();
		int arr1[] = new int [n];
		int arr2[] = new int [n];
		
		if(n>10 || n<=0) 
		{
			System.out.print("錯誤");
		}
		else
		{
			for(int i=0;i<n;i++) 
			{//0.1.2.3
				int k = (int)(Math.random()*99)+1;  
				arr1[i]=k;//原始順序
				arr2[i]=k;
				System.out.print(k+" ");
			}
			
			Arrays.sort(arr2);//大到小
			System.out.println();
			
			for(int i=0;i<n;i++) 
			{
				for(int j=0;j<n;j++) 
				{
					if(arr1[i]==arr2[j]) 
					{		
						System.out.print((j+1)+" ");
					}
				}	
			}
		}
	}
}