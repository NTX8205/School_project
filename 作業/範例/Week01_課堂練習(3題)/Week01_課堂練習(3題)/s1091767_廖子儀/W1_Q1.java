//�D�ػ���:�P�_�ϥΪ̿�J������ƬO�_�����
//��ޤGB  410917677 ���l��
//Date:2022/02/23
import java.util.Scanner;
public class W1_Q1 {
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				System.out.println(n+"���O���");
				break;
			}else {
				System.out.println(n+"�O���");
				break;
			}
		}
	}
}