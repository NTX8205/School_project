// �P�_�ϥΪ̿�J������ƬO�_�����
// ��ޤGA 410903539 ���l��
// 2022/2/23
package hw;
import java.util.*;
public class W1_Q1 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = 0;
		for(int i = 1;i<=m;i++) {
			if(m%i == 0) {
				n++;
			}
		}
		if(n<=2) {
			System.out.println(m +" �O��� ");
		}else{
			System.out.println(m +" ���O��� ");
		}
	}
}