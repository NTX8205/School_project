/*
 	���:2022/02/23
 	�D��:�B�~�m�ߡA�p���ӥ���ƪ��̤j���]��&�̤p������(�j��Ѫk)
	�Z��:��ޤGA
	�Ǹ�:410918209
	�m�W:�B�ʴ@
 */
import java.util.*;
public class W1_Q4 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int max=1;
		int i=2;
		while(i<=n) {
			if(n%i==0 && m%i==0) {
				if(max<i) {
					max=i;
				}
			}
			i++;
		}
		System.out.printf("%d�P%d���̤j���]�Ƭ�%d%n",n,m,max);
		System.out.printf("%d�P%d���̤p�����Ƭ�%d%n",n,m,n*m/max);
	}
}
