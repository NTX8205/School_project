import java.util.Scanner;
//�e�q�M�P��q�M
//��ޤGB 410921812 �E�Z�� 
public class W4_Q2 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int array[] = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}
		int pre = 0;// pre���e�q�M�Apro����q�M�Acount���ռ�
		int count = 0;

		for (int i = 0; i < n; i++) {// �e�q�M
			pre += array[i];
			int post = 0;
			for (int j = n - 1; j >= 0; j--) {// ��q�M
				post += array[j];
				if (pre == post) {// ��Ӭ������ܡA�ռ�+1
					count++;
				}
			}
		}
		System.out.println(count);
	}
}
