// Q4(�B�~�m��): �p���ӥ���ƪ��̤j���]��&�̤p������(�j��)
// 410918306 ��ޤGA ���Y��
// ��� 2022/2/23

package DataStructure;

import java.util.*;
public class W1_Q4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int mod = 0;
		int n = a;
		int k = b;
		while(k!=0) {
			mod = n%k;
			n = k;
			k = mod;
		}
		System.out.printf("%d �P %d ���̤j���]�Ƭ� %d\n", a, b, n);
		System.out.printf("%d �P %d ���̤p�����Ƭ� %d", a, b, (a*b)/n);
	}

}
