/* Q3: ��]�Ƥ��Ѷi����
 * ��ޤGA 410917685 �����X */ 

import java.util.*;
public class W2_Q3 {
	public static void main(String[] args){  
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int count = 0;		//�����
	    System.out.print(n+" = ");
	    
	    for(int i=2;;){
	    	if(n%i==0) {
	    		count++;
	    		n/=i;
	    	}else {
	    		if(count>1) {	//�]�ƪ������>1
	    			System.out.print(i+"^"+count);	//��X�]�ƩM�䦸��
	    		}else if(count==1) {	//�]�ƪ������=1
	    			System.out.print(i);	//��X�]��
	    		}else if(count==0) {	//i���On���]��
	    			i++;	//i+1
	    			continue;
	    		}
	    		count = 0;		//������k�s
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
