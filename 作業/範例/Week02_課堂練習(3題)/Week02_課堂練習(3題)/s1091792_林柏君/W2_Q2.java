/*
�Z�šG��ޤGB
�Ǹ��G410917928
�m�W�G�L�f�g
�D�ءG�̱����� 
*/

import java.util.*;

public class W2_Q2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ans1 = 0, ans2 = 0, num1 = 0, num2 = 0;
		
		//�[��
		for (int i=n+1; i<=1000000; i++) {
			int count1 = 0;	
			
			for (int j=1; j<=i; j++) {
				if (i%j==0) {
					count1++;	
				}
			}
				
			if (count1==2) {
				//System.out.print("�̱���"+ n + "����ơG"+ i);
				num1 = i;
				ans1 = i - n;
				break;
			}
				
		}
		
		
		//�
		for (int i=n-1; i>=0; i--) {
			int count2 = 0;	
			
			for (int j=1; j<=i; j++) {
				if (i%j==0) {
					count2++;	
				}
			}
				
			if (count2==2) {
				//System.out.print("�̱���"+ n + "����ơG"+ i);
				num2 = i;
				ans2 = n - i;
				break;
			}
				
		}
		
		
		if (ans1 > ans2) {
			System.out.print("�̱���"+ n + "����ơG"+ num2);
		}else if (ans2 > ans1) {
			System.out.print("�̱���"+ n + "����ơG"+ num1);
		}else if (ans1 == ans2) {
			System.out.print("�̱���"+ n + "����ơG"+ num2 + " " + num1);
		}
		
		
		
	}

}
