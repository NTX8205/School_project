//�P�_�ϥΪ̿�J������ƬO�_�����
//410654114 ��u5B�����Q
//2022/2/23

import java.util.Scanner;

public class W1_Q1 {

	public static void main(String[] args) {
		Scanner sca=new Scanner(System.in);
		int input=sca.nextInt();
		factor(input);
		Prime(input);

	}
	
	public static void Prime(int input) {
		if(input==1) {
			System.out.print("���~");
		}
		for(int i=2;i<input;i++) {
			if(input%i==0) {
				System.out.print(input+"���O���");
				break;
			}else {
				System.out.print(input+"�O���");
				break;
			}
		}
	}
	
	public static void factor(int input) {
		System.out.print("�i�㰣"+input+"���]�Ʀ�");
		for(int i=1;i<=input;i++) {
			if(input%i==0) {
				System.out.print(i+",");
			}
		}
		System.out.print("\n");
	}

}