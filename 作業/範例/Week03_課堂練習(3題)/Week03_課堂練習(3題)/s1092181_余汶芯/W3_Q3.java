import java.util.Arrays;
import java.util.Scanner;

public class main {
	public static void main(String[] args) {
//��ޤGB 410921812 �E�Z��
		Scanner sc = new Scanner(System.in);
		System.out.println("�п�J�����n�G");
		int n=sc.nextInt();
		int[] a = new int[n];
		// �j���J�Ʀr
		for (int i = 0; i < n; i++) {
			a[i] = (int)(Math.random()*100);
		}

		System.out.print("���]�H�����ͪ��|�ӥ���Ƥ��O��");

		// �j���X�Ʀn���Ʀr
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "  ");

		}

	}
}
