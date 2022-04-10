/* 璸衡ㄢタ俱计程そ计&程そ计(癹伴) */
//戈恨A 410917685 П琗

import java.util.*;

public class W1_Q4 {
	public static void main(String[] args){  
	    Scanner sc = new Scanner(System.in);
	    int a = sc.nextInt();
	    int b = sc.nextInt();
	    int a1 = a;
	    int b1 = b;
	    int c = 0;
	    while(a1 % b1 != 0){
	    	c = b1;
	    	b1 = a1 % b1;
	    	a1 = c;
	    	}
	    
	    System.out.println(a+"籔"+b+"程そ计"+b1);
	    System.out.println(a+"籔"+b+"程そ计"+(a*b/b1));
	}
}
