package hr;
// �p���ӥ���ƪ��̤j���]��&�̤p������
// ��ޤGA 410918021 �_�ʿ�
// 2022/2/28
import java.util.*;
public class W1_Q3 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
	int temp = 0;
	int a1 = a;
	int b1 = b;
	int temp1 = 0;
	int a2 = a;
	int b2 = b;
	
	System.out.printf("%d�P%d���̤j���]�Ƭ�", a, b);
	
	if(b > a) {
		temp = a;
		a = b;
		b = temp;
	}
	
	while(a % b != 0) {
		temp = b;
		b = a % b;
		a = temp;
	}
	System.out.printf("%d\n", b);
	System.out.printf("%d�P%d���̤p�����Ƭ�", a1, b1);
	
	while(a1 % b1 != 0){
		temp1 = b1;
		b1 = a1 % b1;
		a1 = temp1;
		}
		System.out.print(a2 * b2 / b1);
}
}