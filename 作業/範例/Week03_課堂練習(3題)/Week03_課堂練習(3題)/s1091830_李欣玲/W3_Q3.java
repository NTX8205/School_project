// Q3: �p��3�ӥ���ƪ��̤j���]��&�̤p������
// 410918306 ��ޤGA ���Y��
// ��� 2022/3/15

package DataStructure;
import java.util.*;
public class W3_Q3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
        int q=2; int GCD=1; int LCM=1;
        int X=a; int Y=b; int Z=c;
        while(X>=q && Y>=q && Z>=q) 
        {
            if(X%q==0 && Y%q==0 && Z%q==0) 
            {
                GCD*=q;
                LCM*=q;
                X/=q;
                Y/=q;
                Z/=q;
            }
            else if(X%q==0 && Y%q==0)
            {
                LCM*=q;
                X/=q;
                Y/=q;
            }
            else if(X%q==0 && Z%q==0)
            {
                LCM*=q;
                X/=q;
                Z/=q;
            }
            else if(Z%q==0 && Y%q==0)
            {
                LCM*=q;
                Z/=q;
                Y/=q;
            }
            else
            {
                q++;
            }
        }
        LCM=LCM*X*Y*Z;
        System.out.printf("%d�B%d �P %d ���̤j���]�Ƭ� %d%n", a, b, c, GCD);
        System.out.printf("%d�B%d �P %d ���̤p�����Ƭ� %d", a, b, c, LCM);
	}
}
