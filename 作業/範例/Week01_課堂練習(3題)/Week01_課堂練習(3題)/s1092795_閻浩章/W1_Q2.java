//
//Q2: �N�ϥΪ̿�J������i���]�Ƥ���
//
//��ޤGB 410927957 �F�E��
//Date:2022/02/23
import java.util.ArrayList;
import java.util.Scanner;
public class W1_Q2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int  n = sc.nextInt();
		System.out.print(n + "=");
		for (int i = 2; i <= n; i++) {
            while (n != i) {
                if (n % i == 0) {
                    System.out.print(i + "*");
                    n /= i;
                } else {
                    break;
                }
            }
        }
		System.out.print(n);
	}

}
