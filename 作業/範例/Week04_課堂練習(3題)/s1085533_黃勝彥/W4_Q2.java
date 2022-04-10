package test;
import java.util.*;
public class W4_Q2 {
	public static void main(String[] args) {
		// Q2:前段和與後段和
		// 資傳三B 410855338   黃勝彥
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入一個整數，此整數為你將比對的資料數");
		int n = sc.nextInt(),PrefixSum=0,SuffixSum=0,count=0;
		int [] arr1 = new int [n];
		int [] arr2 = new int [n];
		int [] arr3 = new int [n];
		System.out.printf("請輸入%d筆整數資料\n",n);
		
		for(int i=0;i<n;i++)
		{
			int a = sc.nextInt();
			arr1[i]=a;
		}
		
		for(int i=0;i<arr1.length;i++) 
		{
			if(i>=1)
				arr2[i]=arr1[i]+arr2[i-1];
			else 
				arr2[i]=arr1[i];		
		}
		System.out.println("前段和 "+Arrays.toString(arr2));
		
		for(int j=arr1.length-1;j>=0;j--) 
		{
			if(j==arr1.length-1)
				arr3[SuffixSum]=arr1[j];
			else 
				arr3[SuffixSum]=arr1[j]+arr3[SuffixSum-1];
			SuffixSum++;
		}
		System.out.println("後段和 "+Arrays.toString(arr3));
		
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr1.length;j++)
			{
				if(arr2[i]==arr3[j])
					count++;
			}
		}
		System.out.printf("共%d組",count);

	}

}
