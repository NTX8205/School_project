import java.util.*;
//�T���X��
//��ޤGB 410921812 �E�Z�� 
public class W4_Q1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] people = new int[n];// �H��
		int remain = n;// �d�U�Ӫ�
		int count = 0;

		while (remain > 1) {
			for (int i = 0; i < n; i++) {
				if (people[i] != -1) {// �]-1���X���A�Y�ĬY��������-1�A�h���ݭn�X��
					count++;
					if (count == 3) {
						count = 0;// �k�s
						remain--;// �d�U�Ӫ��H�ƴ��
						people[i] = -1;// �ĬY���X��
					}
				}
			}
		}

		for (int i = 0; i < n; i++) {
			if (people[i] != -1) {
				System.out.println(i + 1);
			}
		}
	}
}