package hw;
import java.util.*;
public class Q1 {
	public static void main(String []args){
		Scanner sc=new Scanner( System.in);
		int num=sc.nextInt();
		System.out.print("�i�㰣"+num+"���]�Ʀ�");
		for(int i=1; i<num; i++){
			if(num%i==0)
				System.out.print(i+",");
			else
				continue;
		
		}
		System.out.print(num);
		boolean flag = true;
		// �P�_�@�ӼƬO���O��ơA�u�ݧP�_ 2 �� num1 ������ڡA��ְj�馸��
		for (int i = 2; i <= Math.sqrt(num); i++) {
			// �p�G ��J�� ��Q 2 ~~ �ڸ�num1 �������Ⱦ㰣�A�������O���
			if (num % i == 0) {
				flag = false;
				break;
			}
		}
		if (flag) {
			System.out.printf("\r\n%d�O���",num);
		} else {
			System.out.printf("\r\n%d���O���",num);
		}
	}
}

