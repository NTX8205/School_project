// Q3: ��]�Ƥ��Ѷi����
// ��ޤGA/410903432/�i��_

import java.util.*;

public class W2_Q3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();		// ��J�Ʀr n
		int count = 0;				// �Ψӭp��]�ƪ������
		System.out.print(n+" = ");
		
		for(int i = 2;;) {
			if(n%i == 0) {			// n �p�G��Q i �㰣
				count++;			// count�[�@
				n/=i;				// n���Hi
			}else {
				if(count > 1) {						// ��]�ƪ������ > 1
					System.out.print(i+"^"+count);	// ��X�]�ƩM�䦸��
				}else if(count == 1) {				// ��]�ƪ�����Ƭ�1��
					System.out.print(i);			// ��X�]��
				}else if(count == 0){				// ��i���On���]�ƮɡAi+1
					i++;
					continue;
				}
				count = 0;							// count�k�s
				i++;								
				if(n == 1) {
					break;
				}else {
					System.out.print("*");
				}
			}
		}
		
	}
}
