/*
�D��: �p���ӥ���ƪ��̤j���]��&�̤p������(�j��)
�Z��:��ޤGA �m�W:������ �Ǹ�:410903416
 */

import java.util.Scanner;
public class W1_Q4 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int gcd=0;
		int lcm=1;
		while(a>=lcm) {
			if(a%lcm==0 && b%lcm==0)
				gcd=lcm;
			lcm++;
		}
		while(true) {
			if(lcm%a==0 && lcm%b==0)
				break;
			lcm++;
		}
		System.out.println(a+"�P"+b+"���̤j���]�Ƭ�:"+gcd);
		System.out.println(a+"�P"+b+"���̤p�����Ƭ�:"+lcm);
	}

}