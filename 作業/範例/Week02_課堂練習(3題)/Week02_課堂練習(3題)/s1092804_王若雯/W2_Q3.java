//Q3: ��]�Ƥ��Ѷi����
//
//�t��:��ޤGA
//�Ǹ�:410928042
//�m�W:���Y��
import java.util.*;
public class W2_Q3 {
	public static void main (String args[]) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int count = 0;
		
		System.out.print(n+"=");
		for(int i=2;;) {
			if(n%i==0) {  //��]�Ƥ���
				count++;
				n/=i;
			}else {
				if(count>1) {
					System.out.print(i+"^"+count);  //�����
				}else if(count == 1){
					System.out.print(i); //�@�����W�ԥX��
				}else if(count == 0) {  // ?
					i++;
					continue;
				}
				count=0;
				i++;
				if(n==1) {
					break;
				}else {
					System.out.print("*");
				}
			}
		}
	}
}