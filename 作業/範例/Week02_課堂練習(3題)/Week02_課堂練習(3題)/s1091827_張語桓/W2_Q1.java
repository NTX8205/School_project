//�D�ػ���:[p,q]�϶���ư��D
//��ޤGB 410918275 �i�y��
import java.util.*;
public class W2_Q1 {
	public static boolean isPrimeNumber(int n) {
		if(n%2==0) {
			return n==2;
		} else if(n>2) {
			for(int i=3;i<n;i+=2) {
				if(n%i==0) {
					return false;
				}
			}
			
			return true;
		} else {
			return false;
		}
	}
	
     public static void main(String[] args) {
    	 Scanner sc=new Scanner(System.in);
    	 int p=sc.nextInt(),q=sc.nextInt();
    	 int sum=0;
    	 
    	 if(p>q) {
    		 int tmp=p;
    		 p=q;
    		 q=tmp;
    	 }
    	 for(int i=p;i<q;i++) {
    		 if(isPrimeNumber(i)) {
    			 System.out.print(i+" ");
    			 sum+=1;
    		 }
    	 }
    	 System.out.println("\n��ƭӼ�:"+sum);
    	
     }
}
