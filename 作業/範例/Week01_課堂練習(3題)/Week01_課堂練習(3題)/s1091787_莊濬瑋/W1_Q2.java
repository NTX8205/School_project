//���2A 410917871 ����޳
// 2022/02/23
//Q2: �N�ϥΪ̿�J������i���]�Ƥ���
import java.util.*;
public class W1_Q2 {

	public aaa() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		System.out.print(num + "=");
		for (int k = 2; k <= num; k++) {
			while (num != k) {
				if (num % k == 0) {
					System.out.print(k + "*");
					num /= k;
	              	}
				else {
	                		break; }
	            }

	        }
	        System.out.print(num);
	        }
	        }

