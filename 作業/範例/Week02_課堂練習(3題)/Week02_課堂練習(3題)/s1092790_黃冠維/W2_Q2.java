//��ޤGA 410927907 ���a��
//�ϥΪ̿�J�@�ӥ����n, ��X�Pn�̱��񪺽��
//Date: 2022/3/5

import java.util.Scanner;

public class W2_Q2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int p = 0; //n�ȦV�W�̪񪺽��
		int q = 0;//n�ȦV�U�̪񪺽��
		
		for(int i = n+1 ; i < 10000 ; i++) {//�p��p��,i�]�w����M�p��10000�����
			int count = 0;
			
			for(int j = 2 ; j < i ; j++) {//����
				if(i % j == 0)
					count++;
				if(count == 0 && j == i-1) {
					p = i;
					break;
				}
			}
			
			if(p == i) //���̪񪺽�ƴNbreak
				break;
		}
		
		for(int i = n-1 ; i > 1 ; i--) {//�p��q��,��Ʊq2�}�l�ҥHi�]�w���j��1
			int count = 0;
			
			for(int j = 2 ; j < i ; j++) {
				if(i % j == 0)
					count++;
				if(count == 0 && j == i-1) {
					q = i;
					break;
				}
			}
			
			if(q == i)
				break;
		}
		
		if(p-n > n-q) {
			System.out.print("�̱���"+n+"�����: " + q);
		} 
		else if(p-n < n-q) {
			System.out.print("�̱���"+n+"�����: " + p);
		} 
		else {
			System.out.print("�̱���"+n+"�����: " + q + " " + p);
		}
		
		
	}
}
