import java.util.Scanner;

//�p���ӥ���ƪ��̤j���]��&�̤p������
//��ޤGB 410917538 ��Ϊ�
//2022/02/23
public class W1_Q3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		
		System.out.println("�̤j���]�Ƭ�="+GCD(m,n));
		System.out.println("�̤p�����Ƭ�="+LCM(m,n));

	}
	static int GCD(int m,int n) {
		int k;
		k=m%n;
		if(k == 0) {
			return n;
		}else {
			return GCD(n,k);
		}
	}
	static int LCM(int m,int n) {
		/*int k;
		k=m%n;
		if(k == 0) {
			return n;
		}else {
			return GCD(n,k);
		}*/
		return ( m/ GCD(m, n)) * n;
	}

}
