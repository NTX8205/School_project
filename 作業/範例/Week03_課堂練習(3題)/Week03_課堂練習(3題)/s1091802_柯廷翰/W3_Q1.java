package a;
import java.util.*;
public class W3_Q1 
{
	public static void main (String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		
		System.out.print("請輸入一個<=10的正整數:");
		
		int n = sc.nextInt();
		int[] arr = new int[9];
		int[] arr1 = new int[9];
		
		for(int i = 0 ;i < n ;i++) 
		{
			int a = (int)(Math.random()*100) + 1;
			arr[i] = a;
			arr1[i] = a;
		}
		
		System.out.printf("假設隨機產生的%d個正整數分別為",n);
		
		for(int j = 0 ;j < n ;j++) 
		{
			System.out.printf("%d ",arr[j]);
		}
		
		int temp = 0;
		for(int i = 0 ;i < arr.length ;i++) 
		{
			for(int j = i + 1 ;j < arr.length ;j++) 
			{
				if(arr1[i] > arr1[j] && arr[i] != 0 && arr[j] != 0)
				{
					temp = arr1[i];
					arr1[i] = arr1[j];
					arr1[j] = temp;
				}
			}
		}
		
		System.out.printf("\n這%d個整數在排序後的索引次序為 ", n);
		
		for(int i =0 ;i<arr1.length;i++) 
		{
			for(int j=0;j<arr.length;j++) 
			{
				if (arr[i] != 0 && arr[i] == arr1[j]) 
				{
					System.out.printf("%d ",j+1);
				}
			}
		}
	}
}
