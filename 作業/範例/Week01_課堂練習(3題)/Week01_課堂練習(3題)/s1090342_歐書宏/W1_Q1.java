//�D�ػ���:�P�_�O�_�����
// ��ޤGB 410903424 �ڮѧ�
//Date:2022/2/23

import java.util.*;
public class W1_Q1 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=1;i<n;i++) {
			if(n%i==0) {
				System.out.println(n+"���O���");
				break;
			}else {
				System.out.println(n+"�O���");
				break;
			}
		}
	}
}
