//����O�_�����
//��ޤGA 410918241 ����X
//���:2022/02/23
import java.util.Scanner;
public class W1_Q1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int count=0;
		for (int i=1;i<n;i++){
			if(n % i == 0){
				count++;
			}
		}
		if(count==2){
			System.out.printf("%d �O���",n);
		}
		else{
			System.out.printf("%d ���O���",n);
		}
	}
}	