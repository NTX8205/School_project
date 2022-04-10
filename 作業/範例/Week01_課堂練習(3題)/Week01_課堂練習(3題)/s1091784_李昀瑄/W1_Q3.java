/* 
 * W1_0223
 * Q3: �p���ӥ���ƪ��̤j���]��&�̤p������
 * 
 * �Z�� : ��ޤGB
 * �Ǹ� : 410917847
 * �m�W : ����ޱ
 * ��� : 110/2/23
 */

import java.io.*;
import java.util.Scanner;

public class W1_Q3
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		//gcd �̤j���]��
		//lcm �̤p������
		System.out.printf("%d�P%d���̤j���]�Ƭ�%d\n",x,y,gcd(x, y));
		System.out.printf("%d�P%d���̤p�����Ƭ�%d",x,y,lcm(x,y));
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
	
	static int lcm(int a,int b) 
	{
		return a * b / gcd(a,b);
	}
}