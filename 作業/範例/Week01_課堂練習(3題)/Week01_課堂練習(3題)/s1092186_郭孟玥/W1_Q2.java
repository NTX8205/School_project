//�P�_�ϥΪ̿�J���Ʀr��i���]�Ƥ���
//��ޤGA 410921862 ���s��
//Date:2022/02/27

import java.util.Scanner;
public class W1_Q2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int k=2;
		System.out.print(n+"=");
  
		while (k<n){
			if(n%k==0) {
				System.out.print(k+"*");
				n=n/k;
			}
			else {
				k++;
			}
		}
		System.out.print(k);
	}
}