//
//Q4: �p���ӥ���ƪ��̤j���]��&�̤p������
//
//��ޤGB 410927957 �F�E��
//Date:2022/02/23
import java.util.Scanner;
public class W1_Q4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int i = 2;
		int gcd = 1;
		int lcm = 1;
		int a = n;
		int b = m;
		while(n!=1 || m!=1) {
			if(n%i==0 && m%i==0) {
				gcd*=i;
				lcm*=i;
				n/=i;
				m/=i;
			}else if(n%i==0) {
				lcm*=i;
				n/=i;
			}else if(m%i==0) {
				lcm*=i;
				m/=i;
			}else {
				i++;
			}
		}
		System.out.println(a+"�P"+b+"���̤j���]�Ƭ�"+gcd);
		System.out.println(a+"�P"+b+"���̤p�����Ƭ�"+lcm);
	}
	
}
