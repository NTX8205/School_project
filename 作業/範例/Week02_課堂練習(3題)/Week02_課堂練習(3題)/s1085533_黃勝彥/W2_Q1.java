package test;
import java.io.*;
import java.util.Scanner;
public class W2_Q1 {
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
		 * [p,q]區間質數問題
		      	使用者輸入2個正整數p,q,找出介於p到q之間的所有質數與質數總數*/
		Scanner sc = new Scanner(System.in);
		int i,sum=0,p=sc.nextInt(),q=sc.nextInt();
		
		if(p>q)
		{
			int tmp=p;
			p=q;
			q=tmp;
		}
		
		for(i=p+1;i<q;i++) {
			if(isPrime(i))
			{
				System.out.print(i+" ");
				sum++;
			}		
		}
		
		System.out.print("\n質數個數:"+sum);
	}
}
