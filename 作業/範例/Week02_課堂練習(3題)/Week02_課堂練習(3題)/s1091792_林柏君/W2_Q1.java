/*
�Z�šG��ޤGB
�Ǹ��G410917928
�m�W�G�L�f�g
�D�ءG�϶���� 
*/

import java.util.*;

public class W2_Q1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int p = sc.nextInt();
		int q = sc.nextInt();
		
		int countsum = 0;
		
		if (p>q) {
			int tmp = p;
			p = q;
			q = tmp;
		}
		
		for (int i=p; i<=q; i++) {
			int count = 0;	
			
			for (int j=1; j<=i; j++) {
				if (i%j==0) {
					count++;	
				}
			}
				
			if (count==2) {
				System.out.print(i + " ");
				countsum++;
			}
				
		}
		
		System.out.print("\n" + "��ƭӼơG" + countsum);
	}

}
