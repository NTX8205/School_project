package W1;
//��ޤG�� �кͫ� 410918089
import java.util.*;
public class W1_Q3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();
		int j=sc.nextInt();
		System.out.println(gcd(i,j));
		System.out.println(lcm(i,j));
	}
//�̤j���]��
	public static int gcd(int i,int j) {
		int min=Integer.min(i,j);
		for(int k=min;k>0;k--) {
			if(i%k==0&&j%k==0) {
				return k;
			}
		}
		return 1;
	}
//�̤p������
	public static int lcm(int i,int j) {
		int max=gcd(i,j);
		return i*j/max;
	}

}
