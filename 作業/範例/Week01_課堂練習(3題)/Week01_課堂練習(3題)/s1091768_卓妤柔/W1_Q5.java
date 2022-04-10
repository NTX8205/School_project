/* 璸衡タ俱计程そ计&程そ计 */
//戈恨A 410917685 П琗

import java.util.*;

public class W1_Q5 {
	public static void main(String[] args){  
	    Scanner sc = new Scanner(System.in);
	    int a[] = new int[3];
	    for(int i=0; i<3; i++) {
	    	a[i] = sc.nextInt();
	    }
	    Arrays.sort(a);
	    
	    int max = 0;
	    int min = 0;
	    for(int i=1; i<=a[0]; i++) {
	    	if(a[0]%i==0 && a[1]%i==0 && a[2]%i==0) {
	    		max = i;
	    	}
	    }
	    
	    for(int i=a[2]; i<=a[0]*a[1]*a[2]; i++) {
	    	if(i%a[0]==0 && i%a[1]==0 && i%a[2]==0) {
	    		min = i;
	    		break;
	    	}
	    }
	    System.out.println("程そ计" + max);
	    System.out.println("程そ计" + min);
	}
}
