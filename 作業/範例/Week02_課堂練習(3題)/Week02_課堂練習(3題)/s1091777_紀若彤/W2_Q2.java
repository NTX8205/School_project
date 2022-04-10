//程钡借计拜肈
//戈恨A 410917774 璝
//2022.03.07
import java.util.*;
public class W2_Q2 {
	public static void main(String[] args){  
	    Scanner sc=new Scanner(System.in);
	    int n = sc.nextInt();
	    int count;		//计计
	    int a = 0;	//n籔n程钡借计
	    int b = (n+1);	//n籔n程钡借计
	    
	    System.out.print("程钡"+n+"借计: ");
	    
	    for(int i=1; i<n; i++) {
	    	count = 0;		//计计耴箂
	    	for(int j=1; j<=i; j++){
	    		if(i%j==0){
	    			count++;
	    		}
	    	}
	    	if(count==2){  //计Τ1㎝セō
	    		a = i;
	    	}
	    }
	   
	    while(b>n) {
	    	count = 0;
	    	for(int i=1; i<=b; i++){
	    		if(b%i==0){
	    			count++;
	    		}
	    	}
	    	if(count==2){  //计Τ1㎝セō
	    		break;
	    	}
	    	b++;
	    }
	    
	    if(n-a < b-n) {
	    	System.out.println(a);
	    }else if(n-a > b-n){
	    	System.out.println(b);
	    }else {
	    	System.out.println(a+" "+b);
	    }
	}
}
