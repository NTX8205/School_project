/* Q3: �p��3�ӥ���ƪ��̤j���]��&�̤p������ */
//��ޤGA 410917685 �����X

import java.util.*;
public class W3_Q3 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
	    
	    System.out.println("�п�J�T�ӥ����:");
	    
	    int x = sc.nextInt(), xx = x;
	    int xcount = 0;
	    int y = sc.nextInt(), yy = y;
	    int ycount = 0;
	    int z = sc.nextInt(), zz = z;
	    int zcount = 0;
	    int num = 2;
	    int gcd = 1;
	    int lcm = 1;
	    
	    if(x==1 || y==1 || z==1)
	    {
	    	gcd = 1;
	    	lcm = Math.max(x, Math.max(y, z));
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
		    
		    num = 2;
		    for(int i=1; i<z; i++)  	//zcount��z��]�Ƥ��Ѫ��}�C����
			    while(zz >= num) 
			    	if(zz % num == 0)
			    	{
			    		zcount++;
			    		zz = zz / num;
			    	}else 
			    	{
			    		num++;
			    	}
		    
		    int[] C = new int[zcount];
		    
		    zz=z;
		    num = 2;
		    for(int i=0; i<zcount; i++)
			    if(zz >= num)
			    	if(zz % num == 0)
			    	{
			    		C[i] = num;
			    		zz = zz / num;
			    	}else 
			    	{
			    		num++;
			    		i--;
			    	}
		    
		    System.out.print(z+"=");
		    for(int i=0; i<zcount-1; i++)
		    	System.out.print(C[i]+"*");
		    System.out.println(C[zcount-1]);
		    
		    int i=0,j=0,k=0;
		    while(i<xcount)	//�B�z3�ƬҦ�����]��
		    {
		    	if(A[i] == B[j])
		    	{
		    		while(k<zcount)
		    		{
		    			if(A[i] == C[k]) {
		    				gcd=gcd*A[i];
		    				A[i] = 0;
		    				B[j] = 0;
		    				C[k] = 0;
		    			}
		    			k++;
		    		}
		    		i++;
		    		j++;
		    		if(k == zcount) {
		    			k=0;
		    		}
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
		    
		    i=0;
		    j=0;
		    while(i<xcount)	//�B�z�u��x,y���@�P��]��
		    {
		    	if(A[i] == B[j] && A[i] != 0)
		    	{
		    		gcd=gcd*A[i];
		    		A[i] = 1;
		    		B[j] = 1;
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
		    
		    i=0;
		    k=0;
		    while(i<xcount)	//�B�z�u��x,z���@�P��]��
		    {
		    	if(A[i] == C[k] && A[i] != 0)
		    	{
		    		gcd=gcd*A[i];
		    		A[i] = 1;
		    		C[k] = 1;
		    		i++;
		    		k++;
		    	}else
		    	{
		    		k++;
		    	}
		    	
		    	if(k == zcount)
	    		{
	    			k=0;
	    			i++;
	    		}
		    }
		    
	
		    j=0;
		    k=0;
		    while(j<ycount)	//�B�z�u��y,z���@�P��]��
		    {
		    	if(B[j] == C[k] && B[j] != 0 && B[j] != 1)
		    	{
		    		gcd=gcd*B[j];
		    		B[j] = 1;
		    		C[k] = 1;
		    		j++;
		    		k++;
		    	}else
		    	{
		    		k++;
		    	}
		    	
		    	if(k == zcount)
	    		{
	    			k=0;
	    			j++;
	    		}
		    }
		    
		    for(int l=0; l<xcount; l++) {
		    	if(A[l] != 0 && A[l] != 1) 
		    		lcm = lcm*A[l];
		    }
		    
		    for(int l=0; l<ycount; l++) {
		    	if(B[l] != 0 && B[l] != 1) 
		    		lcm = lcm*B[l];
		    }
		    
		    for(int l=0; l<zcount; l++) {
		    	if(C[l] != 0 && C[l] != 1) 
		    		lcm = lcm*C[l];
		    }
		    
		    lcm = lcm*gcd;
	    }
	    
	    System.out.println(x+"�P"+y+"�P"+z+"���̤j���]�Ƭ�"+gcd);
	    System.out.println(x+"�P"+y+"�P"+z+"���̤p�����Ƭ�"+lcm);
	}
}
