/* 
 * W2_0302
 * Q2: �̱����ư��D
 * 
 * �Z�� : ��ޤGB
 * �Ǹ� : 410917847
 * �m�W : ����ޱ
 * ��� : 110/3/2
 */
import java.io.*;
import java.util.*;

public class W2_Q2 {
	public static boolean Num(int n) 
	{
		if(n % 2 == 0) 
		{
			return n == 2;
		}else if(n > 2) 
		{
			final int sqrt = (int)Math.floor(Math.sqrt(n));
			for(int i = 3;i <= sqrt;i+=2) 
			{
				if(n % i == 0) 
				{
					return false;
				}
			}
			return true;
		}else
		{
			return false;
		}
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(),small = 0, large = 0;
		
		for(int i = n - 1;i > 1;i--) 
		{
			if(Num(i)) 
			{
				small = i;
				break;
			}
		}
		
		for(int i = n + 1; ;i++) 
		{
			if(Num(i)) 
			{
				large = i;
				break;
			}
		}
		
		if((large - n) > (n - small)) 
		{
			System.out.printf("�̱���%d����ƬO:%d",n,small);
		}else if((large - n) < (n - small)) 
		{
			System.out.printf("�̱���%d����ƬO:%d",n,large);
		}else
		{
			System.out.printf("�̱���%d����ƬO:%d %d",n,small,large);
		}
	}
}
