/* 
 * W1_0223
 * Q2: �N�ϥΪ̿�J������i���]�Ƥ���
 * 
 * �Z�� : ��ޤGB
 * �Ǹ� : 410917847
 * �m�W : ����ޱ
 * ��� : 110/2/23
 */

import java.io.*;
import java.util.Scanner;

public class W1_Q2
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.print(n + " = ");
		
		int k = 2;
		while(n > k) 
		{
			if(n % k == 0) 
			{
				System.out.print(k + "*");
				n = n/k;
			}else {
				k++;
			}
		}
		System.out.print(n); 
	}
}