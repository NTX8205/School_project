/* 
 * W1_0223
 * Q3_�B�~�m��: �p���ӥ���ƪ��̤j���]��&�̤p������(�j��Ѫk)
 * 
 * �Z�� : ��ޤGB
 * �Ǹ� : 410917847
 * �m�W : ����ޱ
 * ��� : 110/3/1
 */

import java.io.*;
import java.util.*;

public class  W1_Q3_practice1
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		//gcd �̤j���]��
		//lcm �̤p������
		
		int i = x;	//i = 18 
		int j = y;	//j = 30
		int a = 0,b = 0;
		
		if(x < y) 
		{
			a = y;	//a = 30
			y = x;	//y = 18
			x = a;	//x = 30
		}
		while(y != 0) 	//�p���Ӿ�ƪ��̤j���]��
		{
			b = x % y;
			x = y;	//x = i�Pj���̤j���]��
			y = b;	//y = x ���H y ���l�� 
		}
		
		int t = i * j / x;	//�p���Ӿ�ƪ��̤p������
		
		System.out.printf("%d�P%d���̤j���]�Ƭ�%d\n",i,j,x);
		System.out.printf("%d�P%d���̤p�����Ƭ�%d",i,j,t);
	}
}