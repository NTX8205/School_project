//��ޤGB-410903482-�\���x
//Q2�G�N�ϥΪ̿�J������ƶi���]�Ƥ���

import java.util.*;
public class Q2 {
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();//�ŧi�@�ӥ����
		int k = 2;//�w�q�@�ӳ̤p����]��
		
		System.out.print(n+"=");
		
		while(k <= n) {//�i��`���P�_
			if(n == k) {//�p�G������Ƶ���̤p��]��
				System.out.println(n);//��X����
				break;
			}else if(n%k == 0){//�p�Gn>k�An��Qk�㰣
				System.out.print(k+"*");//���L�Xk����
				n=n/k;//n���Hk����,�@���s�������n,���_����Ĥ@�B
			}else {//�p�Gn����Qk�㰣
				k++;//k+1�@��k����,���_����Ĥ@�B
			}
		}
	}

}
