/* Q2: �p��2�ӥ���ƪ��̤j���]��&�̤p������ */
//��ޤGA 410917685 �����X

import java.util.*;
public class W3_Q2 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
	    
	    System.out.println("�п�J��ӥ����:");
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
		    for(int i=1; i<x; i++)  	//xcount��x��]�Ƥ��Ѫ��}�C����
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
		    for(int i=1; i<y; i++)  	//ycount��y��]�Ƥ��Ѫ��}�C����
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
	    
	    System.out.println(x+"�P"+y+"���̤j���]�Ƭ�"+gcd);
	    System.out.println(x+"�P"+y+"���̤p�����Ƭ�"+lcm);
	}
}

/*
import java.util.*;
public class W3_Q2 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
	    
	    System.out.println("�п�J��ӥ����:");
	    int x = sc.nextInt();
	    int xcount = 0;
	    int y = sc.nextInt();
	    int ycount = 0;
	    int gcd = 0;
	    
	    for(int i=1; i<=x; i++) 	//xcount��x���]�ƭӼ�
	    	if(x%i==0)
	    		xcount++;
	    
	    int[] A = new int[xcount];	//x���]�Ʃ��@�Ӱ}�C A
	    System.out.print(x+"���]�� : ");
	    
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
	    
	    for(int i=1; i<=y; i++) 	//ycount��y���]�ƭӼ�
	    	if(y%i==0)
	    		ycount++;
	    
	    int[] B = new int[ycount];	//y���]�Ʃ��@�Ӱ}�C B
	    System.out.print(y+"���]�� : ");
	    
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
	    
	    System.out.println(x+"�P"+y+"���̤j���]�Ƭ�"+gcd);
	    System.out.println(x+"�P"+y+"���̤p�����Ƭ�"+x*y/gcd);
	}
}
*/