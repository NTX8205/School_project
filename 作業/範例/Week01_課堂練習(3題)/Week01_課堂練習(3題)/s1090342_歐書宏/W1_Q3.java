import java.util.*;
public class W1_Q3 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(a+"�P"+b+"�̤j���]�Ƭ�"+gcd(a,b));
		System.out.println(a+"�P"+b+"�̤p�����Ƭ�"+a*b/gcd(a,b));
	}
	public static int gcd(int l,int k) {
		if(k==0)
			return l;
		else {
			return gcd(k,l%k);
		}
	}
}
