//�t��:��ޤGB
//�Ǹ�:410923254
//�m�W:�C��N 
//�D��:��]�Ƥ��Ѷi����
package homework;
import java.util.*;
public class W2_Q2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int p =sc.nextInt(), small=0, large=0;
		for(int i=p-1; i>1; i--) {
			if(isPrimeNumber(i)) {
				System.out.print(i+" ");
				small=i;
				break;
			}
	}
		for(int i=p+1; ; i++) {
			if(isPrimeNumber(i)) {
				System.out.print(i+" ");
				large=i;
				break;	
			}
		}
		if((large-p) > (p-small)) {
			System.out.printf("�̱���%d�����:%d", p, small);
		}
		else if((large-p) < (p-small)){
			System.out.printf("�̱���%d�����:%d", p, large);
		}
		else {
			System.out.printf("�̱���%d�����:%d",p, small, large);
		}
	}
	public static boolean isPrimeNumber(int g) {
		if(g%2 == 0) {
			return g == 2;
		}else if (g>2) {
			for(int i=3;i<g; i+=2) {
				if(g%i == 0) {
					return false;
				}
			}
			return true;
		}else {
			return false;
		}
	}
}
