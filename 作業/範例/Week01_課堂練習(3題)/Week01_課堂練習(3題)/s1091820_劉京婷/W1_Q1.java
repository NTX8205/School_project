/*
  	���:2022/02/23
 	�D��:1.�P�_�ϥΪ̿�J������ƬO�_�����
	�Z��:��ޤGA
	�Ǹ�:410918209
	�m�W:�B�ʴ@
 */

import java.util.*;
public class W1_Q1 {
	public static void main(String args[]) {
	  	Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int count=0;
	    
	    for(int i=1;i<=n;i++){
	    	if(n%i==0){
	            count+=1;
	    	}
	    }
	    if(count==2) {
	    	System.out.println("�O���");
	    }
	    else {
	    	System.out.println("���O���");
	    }
	}
}
