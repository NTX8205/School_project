//
//Q2: �N�ϥΪ̿�J������i���]�Ƥ���
//�Z��:��ޤGA/�Ǹ�:410927981/�m�W:�i�q�v
//
import java.util.*;
public class W1_Q2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.print(a+"=");
		for(int i=2;i<=a;i++) {
			while(a!=i) {
				if(a%i==0) {
					System.out.print(i+"*");
					a=a/i;
				}else {
					break;
				}
			}
		}
		System.out.print(a);
	}
}
