//Q2: �N�ϥΪ̿�J������i���]�Ƥ���
//
//�t��:��ޤGA
//�Ǹ�:410928042
//�m�W:���Y��
import java.util.*;
public class W1_Q2 {
	public static void main (String args[]) {
		Scanner sc = new Scanner (System.in);

        int n = sc.nextInt();
        int i=2;
        
        System.out.print(n+"=");
        
        while(i<=n){
        	        	
	        if(n%i==0){
	        	if(i<n){
		            System.out.print(i+"*");
	            }else if(i==n){
		        	System.out.println(i);
		        }
	        	n=n/i;
	            i=2;        
	        }else {
	        	i++;
	        }
        }
    }
}
