//�D�ػ���:�P�_�ϥΪ̿�J������ƬO�_�����
//��ޤGA 410903474 �_����
//Date:2022/02/23
package test;
import java.util.*;
public class W1_Q1{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int sum = 0;
	    for (int i = 1; i<=n;i++){        //�ϥ�FOR�j�骺�t��k           
	    	if(n%i == 0){				//�۰���0�N���]�ơAsum+1
	    		sum++;
	    	}
	    }
	    
	    if(sum ==2){				//�]�ƥu��2�Ӭ����
	    	System.out.printf("%d�O���",n);
	    }else{
	    	System.out.printf("%d���O���",n);
	    }
	}
}