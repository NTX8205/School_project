/*
�D��:�̱����ư��D
�Z��:��ޤGA �m�W:������ �Ǹ�:410903416
 */

import java.util.*;
public class W2_Q2 {
	public static void main(String[] args){  
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int large=n+1;
	    int small=0;	
	    int count=0;
	    System.out.print("�̱���"+n+"�����: ");
	    
	    for(int i=1; i<n; i++) {
	    	count = 0;		//�]�ƭӼ��k�s
	    	for(int j=1; j<=i; j++){
	    		if(i%j==0){
	    			count++;
	    		}
	    	}
	    	if(count==2){  //�]�ƥu��1�M����
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
	    	if(count==2){  //�]�ƥu��1�M����
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