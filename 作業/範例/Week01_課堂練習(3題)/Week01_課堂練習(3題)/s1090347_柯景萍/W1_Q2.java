//�D�ػ���:�N�ϥΪ̿�J������i���]�Ƥ���
//��ޤGA 410903474 �_����
//Date:2022/02/24
package test;
import java.util.Scanner;
public class W1_Q2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();	
		int m=2;		//��Ƴ̤p��
		System.out.print(n+ "=" );	
		while(m<n) {			//��while�j��
			if(n%m == 0) {			//����0�Am���]��
				System.out.print(m+"*");		//��Xm
				n=n/m;			//�s��n�A�^�h��
			}else {
				m++;		
			}
		}
		System.out.print(n);		//��X�̫᪺�Ʀr
	}
}