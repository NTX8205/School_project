//�̱����ư��D
//��ޤGA 410917774 ���Y��
//2022.03.07
import java.util.*;
public class W2_Q2 {
	public static void main(String[] args){  
	    Scanner sc=new Scanner(System.in);
	    int n = sc.nextInt();
	    int count;		//�]�ƭӼ�
	    int a = 0;	//�p��n�A�Pn�̱��񪺽��
	    int b = (n+1);	//�j��n�A�Pn�̱��񪺽��
	    
	    System.out.print("�̱���"+n+"�����: ");
	    
	    for(int i=1; i<n; i++) {
	    	count = 0;		//�]�ƭӼ��k�s
	    	for(int j=1; j<=i; j++){
	    		if(i%j==0){
	    			count++;
	    		}
	    	}
	    	if(count==2){  //�]�ƥu��1�M����
	    		a = i;
	    	}
	    }
	   
	    while(b>n) {
	    	count = 0;
	    	for(int i=1; i<=b; i++){
	    		if(b%i==0){
	    			count++;
	    		}
	    	}
	    	if(count==2){  //�]�ƥu��1�M����
	    		break;
	    	}
	    	b++;
	    }
	    
	    if(n-a < b-n) {
	    	System.out.println(a);
	    }else if(n-a > b-n){
	    	System.out.println(b);
	    }else {
	    	System.out.println(a+" "+b);
	    }
	}
}
