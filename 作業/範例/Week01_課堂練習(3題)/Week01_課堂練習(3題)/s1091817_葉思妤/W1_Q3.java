//Q3: �p���ӥ���ƪ��̤j���]��&�̤p������
//�Z��:��ޤGB
//�Ǹ�:41091817
//�m�W:���䧱
//Date:2022/02/27
import java.util.Scanner;
public class W1_Q3 {
	public static void main(String[] args) {  
	    int x=18,y=30;
	    System.out.println(x+"�P"+y+"���̤j���]�Ƭ�"+GCD(x,y));
	    System.out.println(x+"�P"+y+"���̤p�����Ƭ�"+LCM(x,y));
	}
	
	static int GCD(int x,int y) {
		int z;
		z=x%y;
		
		if(z==0) {
			return y;
		}else {
			return GCD(y,z);
		}
	}
	
	static int LCM(int x,int y) {
		return x*y/GCD(x,y);
	}
}
