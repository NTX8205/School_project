package test;
import java.io.*;
import java.util.Scanner;
public class W2_Q3 {

	public static void main(String[] args) {
		/*資傳三B 410855338  黃勝彥
		 * 質因數分解進階版*/
		Scanner sc = new Scanner(System.in);
		int i=2,count=0,n=sc.nextInt();
		System.out.print(n+" = ");
		
		while(true)
		{
			if(n%i==0)
			{
				count++;
				n/=i;
			}
			else 
			{
				if(count>1)
				{
					System.out.print(i+"^"+count);
				}
				else if (count==1) 
				{
					System.out.print(i);
				}
				else if(count==0)
				{
					i++;
					continue;
				}
				
				i++;
				count=0;
				if(n==1)
				{
					break;
				}
				else 
				{
					System.out.print("*");
				}
			}
			
		}
	}
}
