package hr;
// �P�_�ϥΪ̿�J������ƬO�_�����
// ��ޤGA 410918021 �_�ʿ�
// 2022/2/28
import java.util.*;
public class W1_Q1 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	
	System.out.printf("�i�㰣%d���]�Ʀ�", a);
	
	for(int i = 1; i < a; i++) {
		if(a % i == 0) {
			System.out.print(i + ",");
		}
	}
	System.out.print(a + "\n");
	
	for(int j = 2; j < a; j++) {
		if(a % j == 0) {
			System.out.print(a + "���O���");
			break;
		}
		System.out.print(a + "�O���");
		break;
	}
}
}