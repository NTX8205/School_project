package hr;
// �N�ϥΪ̿�J������i���]�Ƥ���
// ��ޤGA 410918021 �_�ʿ�
// 2022/2/28
import java.util.*;
public class W1_Q2 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = 2;
	System.out.print(a + " = ");
	
	while(a != b) {
		if(a % b ==0) {
			System.out.print(b + "*");
			a = a / b;
		} else {
			break;
		}
	}
	System.out.print(a);
}
}
