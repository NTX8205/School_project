/* W4_0316
 * Q3:��A������ Parenthesis Matching
 * �Z��:��ޤGB �Ǹ�:410917847 �m�W:����ޱ
 * ����:111/3/22
 */

import java.util.*;

public class W4_Q3 
{
	public static void main(String []args) 
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int a[] = new int[s.length()], b[] = new int[a.length];
		int count = 0, count1 = 0, count2 =0;

		for(int i = 0;i < s.length();i++) 
		{
			a[i] = i;
			//System.out.print(a[i] + " ");
		}
		//System.out.println();
		System.out.print("����A���P�k��A���t�諸���ޭ�:\n");
		for(int j = 0;j < s.length();j++) 
		{
			if(s.charAt(j) == '(') 
			{
				b[count] = j;
				//System.out.println(b[count] + " ");
				
				count++;
				count1++;
				if(count < count2) 
				{
					System.out.println(a[j] + ",-1");
				}
				
			}
			if(s.charAt(j) == ')') {
				if(count < count1 && count2 == count1) 
				{
					System.out.println("-1," + a[j]);
					count++;
				}else {
					System.out.println(b[count-1] + "," + a[j]);
					count--;
					count2++;
				}
			}
		}
//		System.out.println(count);
//		System.out.println(count1);
//		System.out.println(count2);
	}
}