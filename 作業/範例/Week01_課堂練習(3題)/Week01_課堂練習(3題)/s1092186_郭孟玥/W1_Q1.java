//������
//��ޤGA 410921862 ���s��
//Date�G2022/02/23
import java.util.*;
public class W1_Q1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		    int n = sc.nextInt();
		    int k = 0;
		    for(int i=1;i<=n;i++){
		    	if(n%i==0){
		        	k++;
		    	}
		    }
		    	if(k==2){
		        	System.out.printf("%d �O���",n);
		        }
				else{
		            System.out.printf("%d ���O���",n );
		  		}
	}
}