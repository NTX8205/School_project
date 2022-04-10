/* Q2: �e�q�M�P��q�M
 * 
 * ���]���@�Ӱ}�Cx[]�A����n�Ӥ����A�C�@�ӳ��j��s�F
 * �ڭ̻�x[0]+x[1]+...+x[i]�O�ӫe�q�M(Prefix Sum)�A
 * ��x[ j]+x[ j+1]+...+x[n-1]�h�O�ӫ�q�M(Suffix Sum)
 * �мg�@�ӵ{���A�D�Xx[]�����h�ֲլۦP���e�q�M�P��q�M
 * 
 * ��ޤGA / 410903432 / �i��_
 * */

import java.util.*;

public class W4_Q2 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		// �ϥΪ̿�J
		System.out.println("�п�J�@�ӥ���� n �ӨM�w�n��J�X�����");
		int n = sc.nextInt();	
		int[] arr = new int[n];
		System.out.printf("�гs���J%d�ӥ���ơA�åΪŮ�j�}%n", n);
		for(int i = 0; i < arr.length; i++)
			arr[i] = sc.nextInt();
		
		// ��e�q�M
		int[] front = new int[n];
		int sum = 0;
		for(int i = 0; i < arr.length; i++)
		{
			sum += arr[i];
			front[i] = sum;
		}
		
		// ���q�M
		int[] end = new int[n];
		sum = 0;
		for(int i = arr.length-1, j = 0; i >= 0; i--, j++)
		{
			sum += arr[i];
			end[j] = sum;
		}
		
		// �M��}�C�����h�ֲլۦP���e�q�M�P��q�M
		int count = 0;
		for(int i = 0; i < front.length; i++)
			for(int j = 0; j < end.length; j++)
				if(front[i] == end[j])
					count++;
		
		System.out.println(count);
	}
}
