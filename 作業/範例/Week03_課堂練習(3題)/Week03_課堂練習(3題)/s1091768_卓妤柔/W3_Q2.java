/* Q2: 璸衡2タ俱计程そ计&程そ计 */
//戈恨A 410917685 П琗

import java.util.*;
public class W3_Q2 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
	    
	    System.out.println("叫块ㄢタ俱计:");
	    int x = sc.nextInt(), xx = x;
	    int xcount = 0;
	    int y = sc.nextInt(), yy = y;
	    int ycount = 0;
	    int num = 2;
	    int gcd = 1;
	    int lcm = 1;
	    
	    if(x==1 || y==1)
	    {
	    	gcd = 1;
	    	lcm = Math.max(x, y);
	    }else
	    {
		    for(int i=1; i<x; i++)  	//xcountx借计だ秆皚
			    while(xx >= num) 
			    	if(xx % num == 0)
			    	{
			    		xcount++;
			    		xx = xx / num;
			    	}else 
			    	{
			    		num++;
			    	}
		    
		    int[] A = new int[xcount];
		    
		    xx = x;
		    num = 2;
		    for(int i=0; i<xcount; i++)
			    if(xx >= num)
			    	if(xx % num == 0)
			    	{
			    		A[i] = num;
			    		xx = xx / num;
			    	}else 
			    	{
			    		num++;
			    		i--;
			    	}
		    
		    System.out.print(x+"=");
		    for(int i=0; i<xcount-1; i++) {
		    	System.out.print(A[i]+"*");
		    }
		    System.out.println(A[xcount-1]);
		    
		    num = 2;
		    for(int i=1; i<y; i++)  	//ycounty借计だ秆皚
			    while(yy >= num) 
			    	if(yy % num == 0)
			    	{
			    		ycount++;
			    		yy = yy / num;
			    	}else 
			    	{
			    		num++;
			    	}
		    
		    int[] B = new int[ycount];
		    
		    yy = y;
		    num = 2;
		    for(int i=0; i<ycount; i++)
			    if(yy >= num)
			    	if(yy % num == 0)
			    	{
			    		B[i] = num;
			    		yy = yy / num;
			    	}else 
			    	{
			    		num++;
			    		i--;
			    	}
		    
		    System.out.print(y+"=");
		    for(int i=0; i<ycount-1; i++)
		    	System.out.print(B[i]+"*");
		    System.out.println(B[ycount-1]);
		    
		    int i=0,j=0;
		    while(i<xcount)
		    {
		    	if(A[i] == B[j])
		    	{
		    		gcd=gcd*A[i];
		    		A[i] = 0;
		    		B[j] = 0;
		    		i++;
		    		j++;
		    	}else
		    	{
		    		j++;
		    	}
		    	
		    	if(j == ycount)
	    		{
	    			j=0;
	    			i++;
	    		}
		    }
		    
		    for(int k=0; k<xcount ; k++)
		    	if(A[k] != 0) 
		    		lcm = lcm*A[k];
		    
		    for(int k=0; k<ycount ; k++)
		    	if(B[k] != 0) 
		    		lcm = lcm*B[k];
		    
		    lcm = lcm*gcd;
	    }
	    
	    System.out.println(x+"籔"+y+"程そ计"+gcd);
	    System.out.println(x+"籔"+y+"程そ计"+lcm);
	}
}

/*
import java.util.*;
public class W3_Q2 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
	    
	    System.out.println("叫块ㄢタ俱计:");
	    int x = sc.nextInt();
	    int xcount = 0;
	    int y = sc.nextInt();
	    int ycount = 0;
	    int gcd = 0;
	    
	    for(int i=1; i<=x; i++) 	//xcountx计计
	    	if(x%i==0)
	    		xcount++;
	    
	    int[] A = new int[xcount];	//x计皚 A
	    System.out.print(x+"计 : ");
	    
	    int j = 1;
	    for(int i=0; i<xcount; i++)
	    	if(j<=x)
	    		if(x%j==0)
	    		{
		    		A[i] = j;
		    		System.out.print(A[i]+" ");
		    		j++;
	    		}else {
	    			j++;
	    			i--;
	    		}
	    
	    System.out.println();
	    
	    for(int i=1; i<=y; i++) 	//ycounty计计
	    	if(y%i==0)
	    		ycount++;
	    
	    int[] B = new int[ycount];	//y计皚 B
	    System.out.print(y+"计 : ");
	    
	    j = 1;
	    for(int i=0; i<ycount; i++)
	    	if(j<=y)
	    		if(y%j==0)
	    		{
		    		B[i] = j;
		    		System.out.print(B[i]+" ");
		    		j++;
	    		}else {
	    			j++;
	    			i--;
	    		}
	    
	    System.out.println();
	    
	    for(int i=0; i<xcount; i++)
	    	for(int k=0; k<ycount; k++)
	    		if(A[i]==B[k])
	    			gcd = A[i];
	    
	    System.out.println(x+"籔"+y+"程そ计"+gcd);
	    System.out.println(x+"籔"+y+"程そ计"+x*y/gcd);
	}
}
*/