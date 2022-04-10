//Q2: 最接近質數問題
//班級:資管二A;姓名:黃宣慈;學號:410903458
//日期:3/4 W2_Q2;
import java.util.*;
public class W2_Q2 {
  public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  int n = sc.nextInt();
	    int count;		
	    int a = 0;	
	    int b = (n+1);	
	    
	    System.out.print("最接近"+n+"的質數: ");
	    
	    for(int i=1; i<n; i++) {
	    	count = 0;		
	    	for(int j=1; j<=i; j++){
	    		if(i%j==0){
	    			count++;
	    		}
	    	}
	    	if(count==2){  
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
	    	if(count==2){  
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
