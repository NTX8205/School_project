//�̤j���]��&�̤p������
//��ޤGB 410917693 �\�e޳
//2022/02/23
import java.util.*;
public class W1_Q3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(),b = sc.nextInt();
		System.out.println(a+"�P"+b+"�̤j���]��"+GCD(a, b));
		System.out.println(a+"�P"+b+"�̤p������"+LCM(a, b));
	}
	public static int GCD(int a, int b) {
		if(a%b == 0) {
			return b;
		}else {
			return GCD(b, a%b);	
		}
	}
	public static int LCM(int a, int b) {
		return a*b/GCD(a, b);
	}
}

