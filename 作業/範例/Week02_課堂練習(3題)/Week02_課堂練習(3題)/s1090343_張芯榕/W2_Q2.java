// Q2: �̱����ư��D�G
// �ϥΪ̿�J�@�ӥ����n, ��X�Pn�̱��񪺽��
// ��ޤGA/410903432/�i��_

import java.util.*;

public class W2_Q2 {
	
	public static boolean isPrimeNumber(int n) {	// �P�_�O�_�����
		if(n % 2 == 0) {
			return n == 2;							// ��n�i�H�Q2�㰣�ɡA�^��false
		}else if(n > 2) {
			for(int i = 3; i < n; i += 2) {
				if(n%i == 0) {						// ��n�i�H�Qi�㰣�ɡA�^��false
					return false;
				}
			}
			return true;							// ��n���i�H�Qi�㰣�ɡA�^��true
		}else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), small = 0, large = 0;
		
		for(int i = n-1; i > 1; i--) {	// �Ѥj���p�M����
			if(isPrimeNumber(i)) {		// �P�_�O�_�����
				small = i;				// �Osmall����ӽ��
				break;					// �����j��
			}
		}
		
		for(int i = n+1; ; i++) {		// �Ѥp���j�M����
			if(isPrimeNumber(i)) {
				large = i;				// �Olarge����ӽ��
				break;
			}
		}
		
		// �p���ӽ�ƻP n ���t���h��
		if((large-n) > (n-small)) {								
			System.out.printf("�̱���%d����Ƭ�%d", n, small);
		}else if((large-n) < (n-small)) {
			System.out.printf("�̱���%d����Ƭ�%d", n, large);
		}else {
			System.out.printf("�̱���%d����Ƭ�%d�B%d", n, small, large);
		}
		
	}
	
}
