//�P�_�ϥΪ̿�J������ƬO�_�����
//��ޤGB 410918217 �x�\��
//Date: 2022/02/23

import java.util.*;
public class W1_Q1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=2; i<n; i++) {
			if(n%i==0) {
				System.out.println(n+"���O���");
				return;
			}
		}
		
		System.out.println(n+"�O���");
	}

}
