// 410917601 ��ޤGA ���ۧ�
import java.util.*;
public class Main {
	public static int GCD(int m,int n) {
		int r;
		while(n!=0) {
			r = m%n;
			m = n;
			n = r;
		}
		return m;
	}
	
	public static int LCM(int m, int n) {
		return m*n/GCD(m,n);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt(),n = sc.nextInt();
		sc.close();
		System.out.printf("%d�M%d���̤j���]�Ƭ�: %d%n",m,n,GCD(m,n));
		System.out.printf("%d�M%d���̤p�����Ƭ�: %d%n",m,n,LCM(m,n));
	}

}
