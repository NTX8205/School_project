//�p��3�ӥ���ƪ��̤j���]��&�̤p������
//410654114 ��u5B�����Q
//2022/3/11
import java.util.Scanner;

public class W3_Q3 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("��Jx,y,z�T�Ӿ��");
			int num1 = scanner.nextInt();
			int num2 = scanner.nextInt();
			int num3 = scanner.nextInt();
			int GCD = GCD(num1, num2);
			int GCD1 = GCD(num3, GCD);
			if (GCD1 == 1) {
				System.out.println(num1 + " " + num2 + " " + num3 + "�S���̤j���]��");
			} else {
				System.out.println(num1 + " " + num2 + " " + num3 + "���̤j���]�Ƭ�" + GCD1);
			}
			int LCM = LCM(num1, num2, GCD);
			int GCD2 = GCD(LCM, num3);
			int LCM1 = LCM(LCM, num3, GCD2);
			System.out.println(num1 + " " + num2 + " " + num3 + "���̤p�����Ƭ�" + LCM1);
		}
	}

	public static int GCD(int num1, int num2) {
		PX(num1, num2);
		int num = 0;
		for (int i = num2; i > 0; i--) {
			if (num1 % i == 0 && num2 % i == 0) {
				num = i;
				break;
			}
		}
		return num;
	}

	
	public static int LCM(int num1, int num2, int GCD) {
		return num1 / GCD * num2;
	}

	public static void PX(int num1, int num2) {
		int a;
		if (num1 < num2) {
			a = num1;
			num1 = num2;
			num2 = a;
		}
	}

}
