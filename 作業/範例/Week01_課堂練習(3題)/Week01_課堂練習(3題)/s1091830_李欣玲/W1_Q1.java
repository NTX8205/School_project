// Q1: �P�_�ϥΪ̿�J������ƬO�_�����
// 410918306 ��ޤGA ���Y��
// ��� 2022/2/23

package DataStructure;

import java.util.*;
public class W1_Q1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		for(int i=1;i<=n;i++) {
			int mod = n%i;
			if(mod==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.print(n + "�O���");
		}else {
			System.out.println(n + "���O���");
		}
	}
}
