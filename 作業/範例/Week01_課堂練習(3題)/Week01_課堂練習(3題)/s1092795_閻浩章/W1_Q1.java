//
//Q1: �P�_�ϥΪ̿�J������ƬO�_�����
//
//��ޤGB 410927957 �F�E��
//Date:2022/02/23
import java.util.ArrayList;
import java.util.Scanner;
public class W1_Q1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int  n = sc.nextInt();
		ArrayList a = new ArrayList();
		for(int i=1;i<=n;i++) {
			int x = n%i;
			if(x==0) {
				a.add(x);
			}
		}
		if(a.size()>2) {
			System.out.println(n+"���O���");
		}else {
			System.out.println(n+"�O���");
		}
	}

}
