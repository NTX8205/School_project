import java.util.Scanner;
	
public class W1_Q1 {
	public static void main (String args[]) {
	Scanner io=new Scanner (System.in);
	//��ޤGA 410917855 ���f��
	//�P�_�ϥΪ̿�J������ƬO�_�����
			int n=io.nextInt();
			int sum=1;
			for (int i =2;i<=n;i++) {
				if(n%i==0) {
					sum+=i;
				}
			}
			if(sum==n+1) {
				System.out.println(n+"�O���");
			}
			else {
				System.out.println(n+"���O���");
			}

		}

	}