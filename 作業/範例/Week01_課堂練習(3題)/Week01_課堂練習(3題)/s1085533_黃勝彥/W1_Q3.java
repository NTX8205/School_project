package test;
import java.io.*;
import java.util.Scanner;

import org.omg.CORBA.PUBLIC_MEMBER;
public class W1_Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 戈肚B 410855338  独秤
		
		Scanner sc = new Scanner(System.in);
 
		int x=sc.nextInt();
		int y=sc.nextInt();
		System.out.println("程そ计"+GCD(x,y));
		System.out.println("程そ计"+LCM(x,y));
	}
		
		static int GCD(int a,int b) 
		{
			int remainder;
			remainder=a%b;
			
			if(remainder==0) 
				return b;
			else
			{
				return GCD(b,remainder);
			}
							
		}
		
		static int LCM(int a,int b) 
		{
			int a1 = a;
			int b1 = b;
			while(a%b!=0) {
				int remainder = a%b;
				a=b;
				b=remainder;
			}
			return a1*b1/b;

		}
	}



