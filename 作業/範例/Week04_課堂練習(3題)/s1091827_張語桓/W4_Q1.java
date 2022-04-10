//題目說明：三號出局
//資管二B 410918275 張語桓

import java.util.*;
public class W4_Q1
{
      public static void main(String[] args)
      {
    	  Scanner sc=new Scanner(System.in);
    	  int n=sc.nextInt();
    	  int a []=new int[n];
    	  int allcount=n;
    	  int count=0;
    	  
    	  while(allcount>1) 
    	  {
    		  for(int i=0;i<n;i++) 
    		  {
    			 if(a[i]>-1) 
    			 {
    				 count++;
    				 if(count==3) 
    				 {
    					 count=0;
    					 allcount--;
    					 a[i]=-1;
    				 }
    			 }
    		  }
    	  }
    	  for(int i=0;i<n;i++) 
    	  {
    		  if(a[i]>-1) 
    		  {
    			  System.out.println(i+1);
    		  }
    	  }
      }
}
