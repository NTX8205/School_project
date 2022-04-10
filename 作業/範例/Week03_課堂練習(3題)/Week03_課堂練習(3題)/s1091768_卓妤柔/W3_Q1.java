/* Q1: 排序次序 */
//資管二A 410917685 卓妤柔

import java.util.*;
public class W3_Q1 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
	    
	    System.out.println("請輸入一個介於4~6的正整數:");
	    int n = sc.nextInt();
	    if(4>n || n>6) 
	    {
	    	System.out.println("輸入錯誤");
	    }else 
	    {
	    	int[] arr = new int[n];	//隨機產生的n個正整數
	    	int[] arr1 = arr;	//排序後的索引次序
	    	int big = 1;
	    
	    	Random rand = new Random();
	    	System.out.print("假設隨機產生的"+n+"個正整數分別為");
	    
	    	for(int i=0; i<n; i++) 
	    	{
	    		arr[i] = rand.nextInt(100)+1;
	    		System.out.print(" "+arr[i]);
	    	}
	    	System.out.println();
	    
	    	System.out.print("這"+n+"個整數在排序後的索引次序為");
	    	
	    	for(int num=1; num<100; num++)
	    	{	
	    		for(int i=0; i<n; i++)
	    		{	
	    			if(arr[i] == num)
	    			{
	    				arr1[i] = big;
	    				for(int j=0; j<n; j++)
	    	    		{
	    					if(arr[j] == num)
	    					{
	    						arr1[j] = big;
	    					}
	    	    		}
	    				big++;
	    			}
	    		}
	    	}
	    
	    	for(int i=0; i<n; i++)
	    		System.out.print(" "+arr1[i]);
	    }
	}
}
