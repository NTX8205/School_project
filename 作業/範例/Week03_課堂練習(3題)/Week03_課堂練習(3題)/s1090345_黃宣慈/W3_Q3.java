//Q3:計算3個正整數的最大公因數&最小公倍數
//班級:資管二A;姓名:黃宣慈;學號:410903458
//日期:3/14 W3_Q3;
import java.util.*;
public class W3_Q3 
{
   public static void main(String[] args)
   {
	   Scanner sc = new Scanner(System.in);
	    int[] arr1 = new int[10]; 
	    int[] arr2 = new int[10]; 
		int n = sc.nextInt();
		int m = sc.nextInt();
		int i=0,num1=0;
		
        int j=2;
		while(j>=n) 
		{
		    if(n%j==0) 
			{
		    n/=j;
			arr1[i]=j;
			System.out.print(i+" ");
			}
			else 
			{
				i++;
			}
		
		}
		System.out.println( );
		
		int k = 2;
		while(k>=m) 
		{
			if(m%k==0) 
			{
			k/=m;
	        arr2[num1]=k;
	        System.out.print(k+" ");
		    }
			else 
		    {
		        	k++;
		    }
			int f = 2;
			while(f>=m) 
			{
				if(m%f==0) 
				{
				f/=m;
		        arr2[num1]=f;
		        System.out.print(f+" ");
			    }
				else 
			    {
			        	f++;
			    }
		}
		}
	}
}


