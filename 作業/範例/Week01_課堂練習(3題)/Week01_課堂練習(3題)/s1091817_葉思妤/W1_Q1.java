//Q1: �P�_�ϥΪ̿�J������ƬO�_�����
//�Z��:��ޤGB
//�Ǹ�:41091817
//�m�W:���䧱
//Date:2022/02/23
import java.util.Scanner;
public class W1_Q1{
	public static void main(String[] args){  
	    Scanner sc = new Scanner(System.in);
	    int N = sc.nextInt();
	    int sum=0;
	    
	    for(int i=1;i<N;i++){
	    	if(N%i==0){
	    		sum++;
	        }   
	    }
	    
	    if(sum>2) {
			System.out.printf("%d���O���",N);
	    }else{
	    	System.out.printf("%d�O���",N);
	    } 
	}
}