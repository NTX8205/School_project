/* 
 * W1_0223
 * Q3_�B�~�m��: �p��T�ӥ���ƪ��̤j���]��&�̤p������
 * 
 * �Z�� : ��ޤGB
 * �Ǹ� : 410917847
 * �m�W : ����ޱ
 * ��� : 110/3/1
 */

import java.io.*;
import java.util.*;

public class W1_Q3_practice2 
{	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		//gcd �̤j���]��
		//lcm �̤p������
		
		int i = x;
		int j = y;
		int k = z;
		int a = 0,b = 0;
		
		if(x < y) 
		{
			a = y;
			y = x;
			x = a;
		}
		
		int gcd = gcd(i,j);//���Di�Mj��Ӫ��̤j���]��gcd
		int gcd1 = gcd(k,gcd);//�D�e��Ӽƪ��̤j���]��gcd�M�ĤT�Ӽ�k���̤j���]��
		
		int lcm = lcm(i,j,gcd);//�Di�Mj���̤p������lcm
		int gcd2 = gcd(lcm,k);	//�Dlcm�Mk���̤j���]��
	
		int t2 = lcm(lcm,k,gcd2);//�Dlcm�Mk���̤p������
		
		System.out.printf("%d,%d,%d���̤j���]�Ƭ�%d\n",i,j,k,gcd1);
		System.out.printf("%d,%d,%d���̤p�����Ƭ�%d",i,j,k,t2);
	}
	static int gcd(int a,int b) 
	{
		int c;
		c = a % b;
		
		if(c == 0) 
			return b;
		else
			return gcd(b,c);
	}
	
	static int lcm(int a,int b,int gcd) 
	{
		return a / gcd * b;
	}
}
