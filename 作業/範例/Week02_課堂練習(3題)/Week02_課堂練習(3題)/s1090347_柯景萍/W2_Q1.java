//題目說明:區間質數問題
//資管二A 410903474 柯景萍
//Date:2022/03/03
package test;
import java.util.Scanner;
public class W2_Q1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int m = sc.nextInt();
	    int n = sc.nextInt();
	    int sum;
	    int prime=0;
	    
	    if(m<n) {
	    	for (int i = m; i<=n;i++) { 
		    	sum=0;
		    	for(int j=1;j<=i;j++) {	
		    		if(i%j == 0) {
		    			sum+=1;	
		    		}	
		    	}
		    	if(sum ==2) {				
			    	System.out.print(i+" ");
			    	prime++;
			    }
		    }
	    }
	    
	    if(m>n) {
	    	for (int i = n; i<=m;i++) { 
		    	sum=0;
		    	for(int j=1;j<=i;j++) {	
		    		if(i%j == 0) {
		    			sum+=1;	
		    		}	
		    	}
		    	if(sum ==2) {				
			    	System.out.print(i+" ");
			    	prime++;
			    }
		    }
	    }
	    System.out.println();
	    System.out.printf("質數個數:%d",prime); 
	}
}