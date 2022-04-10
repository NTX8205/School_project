/* Q3: 借计だ秆秈顶
 * 戈恨A 410917685 П琗 */ 

import java.util.*;
public class W2_Q3 {
	public static void main(String[] args){  
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int count = 0;		//Ωよ计
	    System.out.print(n+" = ");
	    
	    for(int i=2;;){
	    	if(n%i==0) {
	    		count++;
	    		n/=i;
	    	}else {
	    		if(count>1) {	//计Ωよ计>1
	    			System.out.print(i+"^"+count);	//块计㎝ㄤΩよ
	    		}else if(count==1) {	//计Ωよ计=1
	    			System.out.print(i);	//块计
	    		}else if(count==0) {	//iぃ琌n计
	    			i++;	//i+1
	    			continue;
	    		}
	    		count = 0;		//Ωよ计耴箂
	    		i++;
	    		if(n==1) {
	    			break;
	    		}else {
	    			System.out.print("*");
	    		}
	    	}
	    }
	}
}
