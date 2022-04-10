package test;

import java.util.*;

public class W3_Q2 {
	
	public static void main(String[] args) {
		//Q2:璸衡2タ俱计程そ计&程そ计
		//戈肚B 410855338 独秤
		Scanner sc = new Scanner(System.in);
		System.out.println("叫块2タ俱计");
		int x=sc.nextInt(),y=sc.nextInt();
		if(x>y)
		{
			int tmp=x;
			x=y;
			y=tmp;
		}
		int a=0,b=0,i=2,gcd=1,lcm=1,x2=x,y2=y;
		int [] arr1 = new int [x];
		int [] arr2 = new int [y];	
		while(x*y!=1)
		{
			int count=0;
			if(x%i==0)
			{
				count++;
				x/=i;
				arr1[a++]=i;
			}
			if(y%i==0)
			{
				count++;
				y/=i;
				arr2[b++]=i;
			}
			if(count==0) 
				i++;
		}
		
		System.out.print(x2+"=");
		for(int j=0;j<arr1.length-1;j++)
		{
			if(arr1[j]!=0)
				System.out.print(arr1[j]);
			if(arr1[j+1]!=0)
				System.out.print("*");
		}
		System.out.println("");
		
		System.out.print(y2+"=");
		for(int j=0;j<arr2.length-1;j++)
		{
			if(arr2[j]!=0)
				System.out.print(arr2[j]);
			if(arr2[j+1]!=0)
				System.out.print("*");
		}
		
		for(int j=0;j<arr1.length-1;j++)
		{
			if(arr1[j]==arr2[j])
			{
				if(arr1[j]!=0)
				{
					gcd*=arr1[j];
					lcm*=arr1[j];	
				}
			}	
			else 
			{
				if(arr1[j]!=0 )
					lcm*=arr1[j];
				if(arr2[j]!=0 )
					lcm*=arr2[j];
			}	
		}
		System.out.println("");
		System.out.println(x2+"籔"+y2+"程そ计"+gcd);
		System.out.print(x2+"籔"+y2+"程そ计"+lcm);
	}

}
