//Q3: �p���ӥ���ƪ��̤j���]��&�̤p������
//
//�t��:��ޤGA
//�Ǹ�:410928042
//�m�W:���Y��
import java.util.*;
public class W1_Q3 {
	public static void main (String args[]) {
		Scanner sc = new Scanner (System.in);
		int n = 18;
		int m = 30;
		System.out.printf("%d �P%d ���̤j���]�Ƭ�: %d %n",n,m,Gcd(n,m));
		System.out.printf("%d �P%d ���̤p�����Ƭ�: %d",n,m,Lcm(n,m));
	}

	static int Gcd(int n,int m) { //�̤j���]��
		int min=2;
		int min2=1;
        while(min<=n || min>=m){
	        if(n%min==0 && m%min==0){	        		        	
	        	min2=min2*min;
	        	n=n/min;
	        	m=m/min;
	        	min=2;
	        }else {
	        	min++;
	        }
        }
		return min2;
	}
	
	static int Lcm(int n,int m) { //�̤p������
		int max= (n>m?n:m);
		while(max>0) {
			if(max%n==0 && max%m==0) {
				break;
			}else {
				max++;
			}
		}
		return max;
	}
}