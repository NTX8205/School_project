//Q2: �N�ϥΪ̿�J������i���]�Ƥ���
//�Z��:��ޤGB
//�Ǹ�:41091817
//�m�W:���䧱
//Date:2022/02/27
import java.util.Scanner;
public class W1_Q2{
	public static void main(String[] args){  
	    Scanner sc = new Scanner(System.in);
	    int N = sc.nextInt();
	    System.out.print(N+"=");
	    
	    for(int i =2;i<=N;i++) {
	    	while(N!=i) {
	    		if(N%i==0){
	    			System.out.print(i+"*");
	    			N/=i;
	    		}else{
	    			break;
	    		}
	    	}
	    }
	    
	    System.out.print(N);
	    
	}
}
