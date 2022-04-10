//題目說明:最接近質數問題
//資管二A 410903474 柯景萍
//Date:2022/03/08
package test;
import java.util.Scanner;
public class W2_Q2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int small=0,large=0;
	    boolean isPrime = true;
	    int sum = 0;
	    	                      
	    for (int i = 2;i<=Math.sqrt(n)-1;i++){   
	    	if(n%i == 0){			
	    		isPrime = false;
	    		break;
	    	}
	    }
	    
	    for(int i=n-1;i>1;i--) {
	    	if(isPrime) {
	    		small = i;
	    		break;
	    	}
	    }
		    	
	    for(int i=n+1; ;i++) {
	    	if(isPrime) {
	    		large = i;
	    		break;
	    	}
	    }
	    
	    if((large-n)>(n-small)) {
	    	System.out.printf("最接近%d的質數:%d",n,small);
	    }else if((large-n)<(n-small)) {
	    	System.out.printf("最接近%d的質數:%d",n,large);
	    }else {
	    	System.out.printf("最接近%d的質數:%d %d",n,small,large);	
	    }
	}    
}