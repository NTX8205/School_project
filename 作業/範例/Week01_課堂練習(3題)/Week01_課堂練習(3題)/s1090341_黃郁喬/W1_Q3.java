/*
�D��: �p���ӥ���ƪ��̤j���]��&�̤p������(���j)
�Z��:��ޤGA �m�W:������ �Ǹ�:410903416
 */

import java.util.*;
public class W1_Q3{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();   
    int x = a;
    int y = b;
    int z;
    while( x%y != 0 ){
    	z = y;
    	y = x%y;
    	x = z;
        }
        
        System.out.println(a+"�P"+b+"���̤j���]�Ƭ�:"+y);
        System.out.println(a+"�P"+b+"���̤p�����Ƭ�:"+a*b/y);

    }
}
