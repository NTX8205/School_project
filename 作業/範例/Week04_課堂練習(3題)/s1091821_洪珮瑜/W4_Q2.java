//前段和與後段和
//資管二B 410918217 洪珮瑜

import java.util.*;
public class W4_Q2
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入一個整數n:");
		int n=sc.nextInt();
		System.out.println("再輸入n個整數:");
        int[] x=new int[n];
        
        for(int i=0;i<n;i++)
        {
        	x[i]=sc.nextInt();
        }
        int pre=0,count=0;
        
        for(int i=0;i<n;i++)
        {
        	pre+=x[i];
        	int post=0;
        	
        	for(int j=n-1;j>=0;j--)
        	{
        		post+=x[j];
        		if(pre==post)
        		count++;
        	}
        }
        
    System.out.print(count);

	}

}
