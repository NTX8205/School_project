//
//Q1: �P�_�ϥΪ̿�J������ƬO�_�����
//�Z��:��ޤGA/�Ǹ�:410927981/�m�W:�i�q�v
//
import java.util.*;
public class W1_Q1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int x = 0;
		for(int i=1;i<=a;i++) {
			if(a%i==0) {
				x++;
			}
		}
		if(x==2) {
			System.out.println(a+"�O���");
		}else {
			System.out.println(a+"���O���");
		}
	}
}
