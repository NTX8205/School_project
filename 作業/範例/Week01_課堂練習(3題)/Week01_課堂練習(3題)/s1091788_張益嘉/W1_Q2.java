/*
�Z��:��ޤGB
�Ǹ�:410917889
�m�W:�i�q��
Q2: �N�ϥΪ̿�J������i���]�Ƥ���
 */
package main;
import java.util.*;
public class W1_Q2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.print(n+"=");

		int i=2;
		while(i<n) {
			if(n%i==0) {
				System.out.print(i+"*");
				n=n/i;
			}else {
				i++;
			}
		}
		System.out.print(n);
	}
}
