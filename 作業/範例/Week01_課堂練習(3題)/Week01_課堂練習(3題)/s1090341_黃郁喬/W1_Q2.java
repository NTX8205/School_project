/*
�D��:�N�ϥΪ̿�J������i���]�Ƥ���
�Z��:��ޤGA �m�W:������ �Ǹ�:410903416
 */

import java.util.Scanner;
public class W1_Q2 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		int count=2;
		System.out.print(n+"=");
		
		while(n>count) {
			if(n%count==0) {
				System.out.print(count+"*");
				n/=count;
			}else {
				count++;
			}
		}
			System.out.println(count);
	}
}