/* Q1: [p,q]跋丁借计拜肈
 * ㄏノ块ㄢタ俱计p, q, тざpqぇ丁┮Τ借计籔借计羆计 
 * 戈恨A 410917685 П琗 */

import java.util.*;
public class W2_Q1 {
	public static void main(String[] args){  
	    Scanner sc = new Scanner(System.in);
	    int p = sc.nextInt();
	    int q = sc.nextInt();
	    int s = 0;		//借计计 
	    int count;		//计计
	    
	    if(p>q) {		//絋玂计玡
	    	int tmp = p;
		    p = q;
		    q = tmp;
		}
	    
	    for(int i=p; i<=q; i++) {
	    	count = 0;
	    	for(int j=1; j<=i; j++){
	    		if(i%j==0){
	    			count++;
	    		}
	    	}
	    	if(count==2){  //计Τ1㎝セō
	    		System.out.print(i+" ");
	    		s++;
	    	}
	    }
	    System.out.println();
	    System.out.println("借计计:"+s);
	}
}
