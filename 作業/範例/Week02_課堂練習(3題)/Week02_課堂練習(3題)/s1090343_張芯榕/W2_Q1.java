// Q1: [p,q]�϶���ư��D�G
// �ϥΪ̿�J��ӥ����p�Bq,��X����p��q�������Ҧ���ƻP����`��
// ��ޤGA/410903432/�i��_

import java.util.*;

public class W2_Q1 {
	
	public static boolean isPrimeNumber(int n) {	// �P�_�O�_�����
		if(n % 2 == 0) {
			return n == 2;							// ��n�i�H�Q2�㰣�ɡA�^��false
		}else if(n > 2) {							// �p�Gn���i�H�Q2�㰣�A�Bn�j��2
			for(int i = 3; i < n; i += 2) {			// �ϥ�for�j��A�q3�}�l�եi�_�㰣n
				if(n%i == 0) {						
					return false;					// ��n�i�H�Qi�㰣�ɡA�^��false
				}
			}
			return true;							// ��n���i�H�Qi�㰣�ɡA�^��true
		}else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0, a = sc.nextInt(), b = sc.nextInt();
		
		if(a > b) {			// �Ob > a
			int tmp = a;
			a = b;
			b = tmp;
		}
		
		for(int i = a; i < b; i++) {		// �Ofor�j��Ѥp��j�P�_�Ʀr�O�_�����
			if(isPrimeNumber(i)) {
				System.out.print(i+" ");	// �O���ܱN�Ʀr�C�L�X��
				sum += 1;					// ��ƭӼ��`�M�[�@
			}
		}
		System.out.println("\n��ƭӼ�" + sum);
	}
	
}
