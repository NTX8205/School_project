/* 
 * W2_0302
 * Q3:  ��]�Ƥ��Ѷi����
 * 
 * �Z�� : ��ޤGB
 * �Ǹ� : 410917847
 * �m�W : ����ޱ
 * ��� : 110/3/2
 */
import java.io.*;
import java.util.*;

public class W2_Q3 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.print(n + "=");
		
		int count = 0;
		
		for(int i = 2 ; ; ) 
		{
			if(n % i == 0) 
			{
				count++;
				n /= i;
			}else {
				if(count > 1){
					System.out.print(i + "^" + count);
				}else if(count == 1) {
					System.out.print(i);
				}else if(count == 0) {
					i++;
					continue;
				}
				count = 0;
				i++;
				if(n == 1) 
				{
					break;
				}
				System.out.print("*");
			}
		}
	}
}