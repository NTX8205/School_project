/*
  	���:2022/02/23
 	�D��:3.�p���ӥ���ƪ��̤j���]��&�̤p������
	�Z��:��ޤGA
	�Ǹ�:410918209
	�m�W:�B�ʴ@
 */

import java.util.*;
public class W1_Q3 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		System.out.printf("%d�P%d���̤j���]�Ƭ�%d%n",n,m,gcd(n,m));
		System.out.printf("%d�P%d���̤p�����Ƭ�%d",n,m,lcm(n,m));
	}
	static int gcd(int n,int m) {
		if(n%m==0) {
			return m;
		}
		else {
			return gcd(m,n%m);
		}
	}
	static int lcm(int n,int m) {
		return n*m/gcd(n,m);
	}
}
