//�D�ػ���:��]�Ƥ��Ѷi����
//��ޤGB 410903424 �ڮѧ�
//Date:2022/3/8
import java.util.*;
public class W1_Q2 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count =0;
		System.out.print(n+"=");
		for(int i=2;i<=n;i++) {
			while(i!=n) {
				if(n%i==0) {
					count++;
					System.out.print(i+"*");
					n/=i;
					System.out.print(i+"^");
				}else {
					break;
				}
				
			}
		}
		System.out.print(n);
	}
}
