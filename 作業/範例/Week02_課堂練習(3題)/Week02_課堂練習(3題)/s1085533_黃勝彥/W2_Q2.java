package test;
import java.io.*;
import java.util.Scanner;
public class W2_Q2 {
	public static boolean isPrime(int a)
	{
		int i,count=0;
		
		for(i=1;i<=a;i++) 
		{
			if(a%i==0)
				count++;
		}
		
		if(count>2)
			return false;
		else 
			return true;		
	}

	public static void main(String[] args) {
		/*資傳三B 410855338  黃勝彥
		 * 最接近質數問題
			使用者輸入一個正整數n,找出與n最接近的質數*/
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt(),small=0,large=0;
		
		for(int i=n-1;;i--) 
		{
			if(isPrime(i))
			{
				small=i;
				break;
			}
		}
		
		for(int i=n+1;;i++) 
		{
			if(isPrime(i))
			{
				large=i;
				break;
			}
		}
		
		if((large-n)>(n-small))
			System.out.printf("最接近%d的質數: %d",n,small);
		
		else if((n-small)>(large-n))
			System.out.printf("最接近%d的質數: %d",n,large);
		
		else
			System.out.printf("最接近%d的質數:%d %d",n,small,large);

	}

}
