//�ھڨϥΪ̿�J���Ʀr�ӭp���ӥ���ƪ��̤j���]�ơB�̤p������
//��ޤGA 410921862 ���s��
//Date:2022/02/28

import java.util.Scanner;
public class W1_Q3 {
	public static int getGCD(int a,int b) {
		if(b==0) {
			return a;
		}
		else {
			return getGCD(b,a%b);
		}
	}
 
	public static int getLCD(int a,int b) {
		return a*b/getGCD(a,b); 
	}
	
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		System.out.printf("%d�P%d���̤j���]�Ƭ�:%d%n",a,b,getGCD(a,b));
		System.out.printf("%d�P%d���̤p�����Ƭ�:%d%n",a,b,getLCD(a,b));
	}
}