//Q2:�̱����ư��D
//��ޤGA 410903539 ���l��
import java.util.*;
public class W2_Q2 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		W2_Q1 iP = new W2_Q1();
		int x = sc.nextInt(),small=0,large=0;
		for(int i=x-1;i>1;i--) {
			if(iP.isPrimeNumber(i)) {
				small = i;
				break;
			}
		}
		
		for(int i=x+1; ; i++) {
			if(iP.isPrimeNumber(i)) {
				large = i;
				break;
			}
		}
		if((large-x) > (x-small)){
			System.out.printf("�̱���%d�����:%d",x,small);
		}
		else if((large-x)<(x-small)) {
			System.out.printf("�̱���%d�����:%d",x,large);
		}
		else {
			System.out.printf("�̱���%d�����:%d %d",x,small,large);
		}
	}
}
