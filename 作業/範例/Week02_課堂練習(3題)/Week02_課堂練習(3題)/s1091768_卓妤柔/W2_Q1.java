/* Q1: [p,q]�϶���ư��D
 * �ϥΪ̿�J��ӥ����p, q, ��X����p��q�������Ҧ���ƻP����`�� 
 * ��ޤGA 410917685 �����X */

import java.util.*;
public class W2_Q1 {
	public static void main(String[] args){  
	    Scanner sc = new Scanner(System.in);
	    int p = sc.nextInt();
	    int q = sc.nextInt();
	    int s = 0;		//��ƭӼ� 
	    int count;		//�]�ƭӼ�
	    
	    if(p>q) {		//�T�O�p���Ʀr�b�e
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
	    	if(count==2){  //�]�ƥu��1�M����
	    		System.out.print(i+" ");
	    		s++;
	    	}
	    }
	    System.out.println();
	    System.out.println("��ƭӼ�:"+s);
	}
}
