/* 
 * W1_0223
 * Q1: �P�_�ϥΪ̿�J������ƬO�_�����
 * 
 * �Z�� : ��ޤGB
 * �Ǹ� : 410917847
 * �m�W : ����ޱ
 * ��� : 110/2/23
 */

import java.io.*;
import java.util.Scanner;

public class W1_Q1
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int count = 0;
		for(int i = 1 ; i <= n ; i++) 
		{
			if(n % i == 0) 
			{
				count ++;
			}
		}
		if(count > 2) 
		{
			System.out.println(n + " ���O���");
		}else {
			System.out.println(n + " �O���");
		}
		
	}
}
