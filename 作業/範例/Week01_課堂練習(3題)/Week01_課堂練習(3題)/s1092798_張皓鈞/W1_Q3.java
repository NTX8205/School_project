//
//Q3: �p���ӥ���ƪ��̤j���]��&�̤p������
//�Z��:��ޤGA/�Ǹ�:410927981/�m�W:�i�q�v
//
import java.util.*;
public class W1_Q3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int GCD = 0;
		int LCM = 0;
		for(int i=1;i<=a;i++) {
			if(a%i==0 && b%i==0) {
				GCD=i;
			}
		}
		LCM= (a*b)/GCD;
		System.out.println(a+"�P"+b+"���̤j���]�Ƭ�"+GCD);
		System.out.println(a+"�P"+b+"���̤p�����Ƭ�"+LCM);
	}
}
