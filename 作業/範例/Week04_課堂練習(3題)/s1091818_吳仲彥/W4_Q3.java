//Q3: ��A������ Parenthesis Matching
//�Z��:���2A �Ǹ�:410918186 �m�W:�d���
//���:2022/3/20
import java.util.*;
public class W4_Q3 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		char[] a = new char [s.length()];
		boolean b = false, e=false;
		int c=-1, d=-1;
		for(int i=0; i<s.length(); i++) 
		{
			a[i]=s.charAt(i);
			
		}
		for(int i=0; i<s.length(); i++) 
		{
			if(a[i]=='(') 
			{
				c=i;
				e=true;
			}
			if(a[i]==')') 
			{
				d=i;
				b = true;
			}
			if (b && e) 
			{
				System.out.printf("%d, %d%n", c, d);
				i=-1;
				a[c]=' ';
				a[d]=' ';
				b = false;
				e = false;
				c=-1; 
				d=-1;
			}
			
		}
		if(c!=-1 || d!=-1) 
		{
			System.out.printf("%d, %d%n", c, d);
		}
	}
}
