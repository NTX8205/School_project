/*
題目:最接近質數問題
班級:資管二A 姓名:黃郁喬 學號:410903416
 */

import java.util.*;
public class W2_Q2 {
	public static void main(String[] args){  
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int large=n+1;
	    int small=0;	
	    int count=0;
	    System.out.print("最接近"+n+"的質數: ");
	    
	    for(int i=1; i<n; i++) {
	    	count = 0;		//因數個數歸零
	    	for(int j=1; j<=i; j++){
	    		if(i%j==0){
	    			count++;
	    		}
	    	}
	    	if(count==2){  //因數只有1和本身
	    		small = i;
	    	}
	    }
	    while(large>n) {
	    	count = 0;
	    	for(int i=1; i<=large; i++){
	    		if(large%i==0){
	    			count++;
	    		}
	    	}
	    	if(count==2){  //因數只有1和本身
	    		break;
	    	}
	    	large++;
	    }
	    if(n-small<large-n) {
	    	System.out.println(small);
	    }else if(n-small>large-n){
	    	System.out.println(large);
	    }else if(n-small==large-n){
	    	System.out.println(small+" "+large);
	    }
	}
}