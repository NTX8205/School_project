//Q2: 前段和與後段和
//班級:資管二A;姓名:黃宣慈;學號:410903458
//日期:3/18 W4_Q2;

import java.util.*;
public class W4_Q2 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		int[] c = new int[n];
		
		for(int i=0; i<n; i++) 
		{
			a[i] = sc.nextInt();
		}
		int sum1=0, sum2=0,sum=0;
		
		for(int i=0; i<a.length;i++) 
		{
		sum1 = sum1+a[i];
		b[i] = sum1;
		System.out.print(sum1+" ");
		}
		System.out.println();
		
		
		for(int j=a.length-1; j>=0;j--) 
		{
		sum2 = sum2+ a[j];
		c[j] = sum2;
		System.out.print(sum2+" ");
		}
		
		System.out.println();

		
		for(int i=0; i<a.length;i++) 
		{
		  for(int j=0; j<a.length;j++) 
		  {
            if(b[i]==c[j])
            { 
           	sum=sum+1;
            } 	
		  }	
        }
		 System.out.print(sum);
 
	  }      
}
