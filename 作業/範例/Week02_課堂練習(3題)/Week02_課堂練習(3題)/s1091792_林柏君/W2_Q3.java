/*
�Z�šG��ޤGB
�Ǹ��G410917928
�m�W�G�L�f�g
�D�ءG��]�Ƥ��Ѷi���� 
*/

import java.util.*;

public class W2_Q3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		System.out.print(n + " = ");
		
		for (int i=2; i<=n-2; i++) {
			while (i!=n) {
				if (n%i==0) {
					//System.out.print(i + "*");
					n/=i;
					count++;
				}else {
					if (count>1) {
						System.out.print(i + "^" + count);
					}else if (count==1) {
						System.out.print(i);
					}else if (count==0) {
						i++;
						continue;
					}
					count = 0;
					i++;
					if (n==1) {
						break;
					}
				}
			}
		}
		
		System.out.print(n);
		

	}
}
