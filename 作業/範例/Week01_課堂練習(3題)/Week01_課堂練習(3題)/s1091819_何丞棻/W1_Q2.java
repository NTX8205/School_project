//Q2: �N�ϥΪ̿�J������i���]�Ƥ���
//��ޤGB ���� 410918194
//Date:2022/02/23
import java.util.*;
public class W1_Q2{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.print(n+"=");
		
	    for(int i=2;i<=n;i++) {
	    	
	    	while(i!=n) {
	    		if(n%i==0) {
	    			System.out.print(i+"*");
	    			n=n/i;
	    		}else {
	    			break;
	    		}
	    	}	
	    }
	    System.out.print(n);    
  }
}
