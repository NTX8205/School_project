//�p���ӥ���ƪ��̤j���]��&�̤p������
//��ޤGB 410918217 �x�\��
//Date: 2022/02/27

import java.util.*;
public class W1_Q3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int s=0;
		int x1=x, y1=y;
		
		while(x%y != 0) {
			s = y;
			y = x%y;
			x = s;
		}
		
		System.out.printf("%d�P%d���̤j���]�Ƭ�%d%n",x1,y1,y);
		System.out.printf("%d�P%d���̤p�����Ƭ�%d",x1,y1,x1*y1/y);
	}
}
