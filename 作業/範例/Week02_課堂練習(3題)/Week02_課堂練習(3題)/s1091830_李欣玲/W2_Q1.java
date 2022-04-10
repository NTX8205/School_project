// Q1: [p,q]�϶���ư��D
// 410918306 ��ޤGA ���Y��
// ��� 2022/3/6

package DataStructure;

import java.util.*;
public class W2_Q1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int sum = 0;
		if(a>b) {
			int n = a;
			a = b;
			b = n;
		}
		for(int i=a;i<b;i++) {
			if(isPrimeNumber(i)) {
				sum++;
			}
		}
		System.out.println("��ƭӼ�"+sum);
	}
	
	public static boolean isPrimeNumber(int n) {
		if(n%2==0) {
			return n==2;
		}else if(n>2) {
			for(int i=3;i<n;i+=2) {
				if(n%i==0) {
					return false;
				}
			}
			return true;
		}else {
			return false;
		}
	}

}
