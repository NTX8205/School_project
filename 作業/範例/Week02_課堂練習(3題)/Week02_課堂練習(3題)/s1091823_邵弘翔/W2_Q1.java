//�D�ػ���:Q1: [p,q]�϶���ư��D
//�ϥΪ̿�J��ӥ����p, q, ��X����p��q�������Ҧ���ƻP����`��
//�Z��:��ޤGB
//�Ǹ�:410918233
//�m�W:�򥰵�
import java.util.Scanner;
public class W2_Q1 {
	public static boolean ip (int n) {
		if(n%2==0) {
			return n==2;
		}else if (n>2) {
			for(int i=3;i<n;i+=2) {
				if(n%i==0) {
					return false;
				}
			}
			return true;
		}else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int sum=0,a=sc.nextInt(),b=sc.nextInt();
		if(a>b) {
			int tem =a;
			a=b;
			b=tem;
		}
		
		for(int i=a;i<b;i++) {
			if(ip(i)) {
				System.out.print(i+" ");
				sum+=1;
			}
		}
		System.out.println("\n��ƭӼ� "+sum);

	}

}
