package test;

import java.util.*;

public class W3_Q3 {

	public static void main(String[] args) {
		//Q3:璸衡2タ俱计程そ计&程そ计
		//戈肚B 410855338 独秤
		Scanner sc = new Scanner(System.in);
		System.out.println("叫块3タ俱计");
		int gcd=1,lcm=1,i=2,x=sc.nextInt(),y=sc.nextInt(),z=sc.nextInt();
		int a=0,b=0,c=0,x2=x,y2=y,z2=z;
		int [] arr1 = new int [50];
		int [] arr2 = new int [50];
		int [] arr3 = new int [50];
	
		while(x*y*z!=1)
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
			if(z%i==0)
			{
				count++;
				z/=i;
				arr3[c++]=i;
			}
			if(count==3)
			{
				gcd*=i;
				lcm*=i;
			}
			else if(count==2)
				lcm*=i;
			else if(count==1)
				lcm*=i;
			else 
				i++;
		}
		
		System.out.print(x2+"=");
		for(int j=0;j<arr3.length-1;j++)
		{
			if(arr1[j]!=0)
				System.out.print(arr1[j]);
			if(arr1[j+1]!=0)
				System.out.print("*");
		}
		System.out.println("");
		
		System.out.print(y2+"=");
		for(int j=0;j<arr3.length-1;j++)
		{
			if(arr2[j]!=0)
				System.out.print(arr2[j]);
			if(arr2[j+1]!=0)
				System.out.print("*");
		}
		System.out.println("");
		
		System.out.print(z2+"=");
		for(int j=0;j<arr3.length-1;j++)
		{
			if(arr3[j]!=0)
				System.out.print(arr3[j]);
			if(arr3[j+1]!=0)
				System.out.print("*");
		}
		System.out.println("");

		System.out.println(x2+"籔"+y2+"籔"+z2+"程そ计 "+gcd);
		System.out.println(x2+"籔"+y2+"籔"+z2+"程そ计 "+lcm);

	}

}
