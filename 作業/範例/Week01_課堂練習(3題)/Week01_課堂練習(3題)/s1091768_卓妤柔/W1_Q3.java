/* �p���ӥ���ƪ��̤j���]��&�̤p������(���j) */
//��ޤGA 410917685 �����X

import java.util.*;

public class W1_Q3 {
	public static int GCD(int m, int n){
		if(n == 0)
			return m;
		else
			return GCD(n, m%n);
	}
	
	public static int LCM(int m,int n){
		return m * n/GCD(n, m%n);
	}
	
	public static void main(String[] args){  
	    Scanner sc = new Scanner(System.in);
	    int a = sc.nextInt();
	    int b = sc.nextInt();
	    
	    System.out.println(a + "�P" + b + "���̤j���]�Ƭ�" + GCD(a,b));
	    System.out.println(a + "�P" + b + "���̤p�����Ƭ�" + LCM(a,b));
	}
}
