/*
�Z��:��ޤGB
�Ǹ�:410917889
�m�W:�i�q��
Q3: �p���ӥ���ƪ��̤j���]��&�̤p������
 */
package main;
import java.util.*;
public class W1_Q3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt(),y=sc.nextInt();
		int a=x,b=y;
		int gcd=0;
		while(a%b!=0) {
			gcd=b;
			b=a%b;
			a=gcd;
		}
		System.out.println(x+"�P"+y+"���̤j���]�Ƭ�"+b);
		System.out.println(x+"�P"+y+"���̤p�����Ƭ�"+x*y/b);
	}
}