//Q1:�ƧǦ��ǨϥΪ̿�J�@�ӥ����n, �䤤n<=10. �Q�ζü��H������n�Ӥ���1~100������ƨ��x�s��@���}�C��+
//�Z��:��ޤGB /�Ǹ�:410917481/�m�W:���f��
import java.util.*;
public class W3_Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);		
		int n = sc.nextInt();
		int[] num = new int[n];
		int[] num2 = new int[n];
		for(int i = 0 ; i<num.length ; i++ ) { //�쥻
			num[i] = (int)(Math.random()*100);
			num2[i] = num[i];
		}
		System.out.print("�쥻��:");
		for(int i=0 ; i<num.length ; i++) {
			System.out.printf("%d ",num[i]);
		}
		Arrays.sort(num2);
		System.out.print("\n�Ʀn��:");
		for(int i=0 ; i<num.length ; i++) { //�Ʀn��
			System.out.printf("%d ",num2[i]);
		}
		System.out.print("\n����:");
		for(int i = 0;i<num.length;i++) {
			for(int j = 0;j<num.length;j++) {
				if(num[i]==num2[j]) {
					System.out.printf("%d ",j+1);
				}
			}
		}					
	}
}

