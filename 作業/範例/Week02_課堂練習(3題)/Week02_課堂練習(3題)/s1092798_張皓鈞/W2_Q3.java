//
//Q3: ��]�Ƥ��Ѷi����
//�Z��:��ޤGA/�Ǹ�:410927981/�m�W:�i�q�v
//
import java.util.*;
public class W2_Q3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�п�J�@�ӼƦr:");
		
		int a = sc.nextInt();
		int count = 0;
		
		System.out.print(a+"=");
		
		for(int i=2;;) {
			if(a%i==0) {
				count++;
				a=a/i;
			}else {
				if(a!=1) {
					if(count==0) {
						
					}else {
						System.out.print(i+"^"+count+"*");
					}
				}else {
					if(count!=1) {
						System.out.print(i+"^"+count);
					}else {
						System.out.print(i);
					}
					break;
				}

				i++;
				count=0;
			}
		}
	}
}
