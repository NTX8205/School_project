//Q3: �p���ӥ���ƪ��̤j���]��&�̤p������
//��ޤGB 410921838 �L�ظ�
//Date:2022/02/28
import java.util.*;
public class W1_Q3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		int g=0;
		int a=x,b=y;
		while(x % y!= 0) {
			g=y;
			y=x%y;
			x=g;
		}
		System.out.printf("%d�P%d���̤j���]�Ƭ�%d%n",a,b,y);
		System.out.printf("%d�P%d���̤p�����Ƭ�%d",a,b,a*b/y);
		
	}

}
