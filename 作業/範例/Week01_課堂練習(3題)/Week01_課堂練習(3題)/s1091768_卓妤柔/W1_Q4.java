/* �p���ӥ���ƪ��̤j���]��&�̤p������(�j��) */
//��ޤGA 410917685 �����X

import java.util.*;

public class W1_Q4 {
	public static void main(String[] args){  
	    Scanner sc = new Scanner(System.in);
	    int a = sc.nextInt();
	    int b = sc.nextInt();
	    int a1 = a;
	    int b1 = b;
	    int c = 0;
	    while(a1 % b1 != 0){
	    	c = b1;
	    	b1 = a1 % b1;
	    	a1 = c;
	    	}
	    
	    System.out.println(a+"�P"+b+"���̤j���]�Ƭ�"+b1);
	    System.out.println(a+"�P"+b+"���̤p�����Ƭ�"+(a*b/b1));
	}
}
