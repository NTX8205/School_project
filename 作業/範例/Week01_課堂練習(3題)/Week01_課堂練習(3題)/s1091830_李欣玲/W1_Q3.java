// Q3: �p���ӥ���ƪ��̤j���]��&�̤p������
// 410918306 ��ޤGA ���Y��
// ��� 2022/2/23

package DataStructure;

import java.util.*;
public class W1_Q3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.printf("%d �P %d ���̤j���]�Ƭ� %d\n", a, b, gcd(a,b));
		System.out.printf("%d �P %d ���̤p�����Ƭ� %d", a, b, (a*b)/gcd(a,b));
	}
	
	public static int gcd(int n, int k) {
		if(k==0) {
			return n;
		}else {
			return gcd(k, n%k);
		}
	}
}